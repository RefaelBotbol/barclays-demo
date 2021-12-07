package up9lib

import (
	. "authentication"
	json "encoding/json"
	fmt "fmt"
	ioutil "io/ioutil"
	rand "math/rand"
	url "net/url"
	os "os"
	filepath "path/filepath"
	regexp "regexp"
	strconv "strconv"
	strings "strings"
	testing "testing"

	goquery "github.com/PuerkitoBio/goquery"
	resty "github.com/go-resty/resty/v2"
	jp "github.com/ohler55/ojg/jp"
	oj "github.com/ohler55/ojg/oj"
	assert "github.com/stretchr/testify/assert"
)

type HttpTargeter interface {
	Get() *resty.Response
	Head() *resty.Response
	Post() *resty.Response
	Put() *resty.Response
	Delete() *resty.Response
	Options() *resty.Response
	Patch() *resty.Response
	GetHeader() string
}

type HttpTarget struct {
	t         *testing.T
	client    *resty.Client
	TargetKey string
	BaseUrl   string
	Headers   map[string]interface{}
}

func ResolveTargetKey(t *testing.T, key string) string {
	var targetKey string

	if strings.Contains(key, "://") {
		r := regexp.MustCompile("\\W|^\\d")
		u, err := url.Parse(key)
		if err != nil {
			assert.Fail(t, fmt.Sprintf("URL parsing error: %s", key))
		}
		targetKey = r.ReplaceAllString(u.Host, "_")
		if len(targetKey) == 0 {
			targetKey = r.ReplaceAllString(key, "_")
		}
		targetKey = "TARGET_" + strings.ToUpper(targetKey)
	} else {
		targetKey = key
	}

	return targetKey
}

func GetHttpClient(t *testing.T, key string, auth interface{ Authenticator }) *HttpTarget {
	var targetKey string = ResolveTargetKey(t, key)

	httpTarget := new(HttpTarget)
	httpTarget.t = t
	httpTarget.client = resty.New()
	httpTarget.TargetKey = targetKey

	var baseAddrOverride string = os.Getenv(targetKey)
	if len(baseAddrOverride) > 0 {
		httpTarget.BaseUrl = baseAddrOverride
	} else {
		path, err := filepath.Abs("target_services.json")
		if err != nil {
			assert.Fail(t, "Error while finding the absolute path.")
		}
		t.Logf("Target services path: %s", path)

		data, err := ioutil.ReadFile(path)
		if err != nil {
			assert.Fail(t, fmt.Sprintf("Error while reading '%s': %s", path, err))
		}

		m := make(map[string]interface{})
		err = json.Unmarshal(data, &m)
		if err != nil {
			assert.Fail(t, fmt.Sprintf("Error while parsing '%s': %s", path, err))
		}

		httpTarget.BaseUrl = m[httpTarget.TargetKey].(string)
	}

	t.Logf("Created a new context: %s", targetKey)

	t.Logf("Triggering authentication callback for context: %s", targetKey)
	// Return an authorization token from the function below
	// e.g. `httpTarget.AuthToken = auth.Authenticate(httpTarget.TargetKey)`
	// then use it in `FillRequest` function to set it as a request parameter
	// e.g. `restyReq = restyReq.SetHeader("Authorization", h.AuthToken)`
	auth.Authenticate(httpTarget.BaseUrl)
	t.Logf("Returned from the authentication callback of %s", targetKey)

	return httpTarget
}

func InterfaceMapToStringMap(in map[string]interface{}) map[string]string {
	out := make(map[string]string)
	for k, v := range in {
		out[k] = v.(string)
	}
	return out
}

func FillRequest(h HttpTarget, req *HttpRequest, httpVerb string, path string) *resty.Request {
	h.t.Logf("%s %s%s", strings.ToUpper(httpVerb), h.BaseUrl, path)

	restyReq := h.client.R()
	// Set query parameters
	queryParams := make(map[string]string)
	for k, v := range req.QueryParameters {
		queryParams[k] = v.(string)
	}
	restyReq = restyReq.SetQueryParams(queryParams)

	// Set headers
	restyReq = restyReq.SetHeader("User-Agent", "Mozilla/5.0 (Macintosh; Intel Mac OS X 10_15_1) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/79.0.3945.130 Safari/537.36")
	restyReq = restyReq.SetHeader("Referer", h.BaseUrl+"/")
	restyReq = restyReq.SetHeader("Accept", "*/*")
	for k, v := range req.Headers {
		restyReq = restyReq.SetHeader(k, v.(string))
	}

	if req.FormDataSetted {
		// Set form data
		restyReq = restyReq.SetFormData(InterfaceMapToStringMap(req.FormData))
	} else if req.MultipartDataSetted {
		// Set multipart data
		restyReq = restyReq.SetFiles(InterfaceMapToStringMap(req.MultipartData))
	} else if len(req.JsonPath) != 0 {
		// Set JSON body
		h.t.Logf("JSON payload path: %s", req.JsonPath)
		data, err := ioutil.ReadFile(req.JsonPath)
		if err != nil {
			fmt.Print(err)
		}
		obj, err := oj.Parse(data)
		if err != nil {
			fmt.Print(err)
		}
		for k, v := range req.JsonApply {
			x, _ := jp.ParseString(k)
			x.Set(obj, v)
		}
		h.t.Logf("JSON body: %s", obj)
		restyReq = restyReq.SetBody(obj)
	} else if req.RawBodySetted {
		// Set raw body
		restyReq = restyReq.SetBody(req.RawBody)
	}

	return restyReq
}

func (h HttpTarget) Get(req *HttpRequest, path string) *resty.Response {
	restyReq := FillRequest(h, req, "get", path)
	resp, err := restyReq.Get(h.BaseUrl + path)
	assert.Nil(h.t, err)
	return resp
}

func (h HttpTarget) Head(req *HttpRequest, path string) *resty.Response {
	restyReq := FillRequest(h, req, "head", path)
	resp, err := restyReq.Head(h.BaseUrl + path)
	assert.Nil(h.t, err)
	return resp
}

func (h HttpTarget) Post(req *HttpRequest, path string) *resty.Response {
	restyReq := FillRequest(h, req, "post", path)
	resp, err := restyReq.Post(h.BaseUrl + path)
	assert.Nil(h.t, err)
	return resp
}

func (h HttpTarget) Put(req *HttpRequest, path string) *resty.Response {
	restyReq := FillRequest(h, req, "put", path)
	resp, err := restyReq.Put(h.BaseUrl + path)
	assert.Nil(h.t, err)
	return resp
}

func (h HttpTarget) Delete(req *HttpRequest, path string) *resty.Response {
	restyReq := FillRequest(h, req, "delete", path)
	resp, err := restyReq.Delete(h.BaseUrl + path)
	assert.Nil(h.t, err)
	return resp
}

func (h HttpTarget) Options(req *HttpRequest, path string) *resty.Response {
	restyReq := FillRequest(h, req, "options", path)
	resp, err := restyReq.Options(h.BaseUrl + path)
	assert.Nil(h.t, err)
	return resp
}

func (h HttpTarget) Patch(req *HttpRequest, path string) *resty.Response {
	restyReq := FillRequest(h, req, "patch", path)
	resp, err := restyReq.Patch(h.BaseUrl + path)
	assert.Nil(h.t, err)
	return resp
}

func (h HttpTarget) GetHeader(key string) string {
	return h.Headers[key].(string)
}

type HttpRequester interface {
	SetQueryString()
	SetHeaders()
	SetFormData()
	SetMultipartData()
	SetJsonBody()
	SetRawBody()
}

type HttpRequest struct {
	QueryParameters     map[string]interface{}
	Headers             map[string]interface{}
	FormData            map[string]interface{}
	FormDataSetted      bool
	MultipartData       map[string]interface{}
	MultipartDataSetted bool
	JsonPath            string
	JsonApply           map[string]interface{}
	RawBody             string
	RawBodySetted       bool
}

func (h *HttpRequest) SetQueryString(QueryParameters map[string]interface{}) {
	h.QueryParameters = QueryParameters
}

func (h *HttpRequest) SetHeaders(Headers map[string]interface{}) {
	h.Headers = Headers
}

func (h *HttpRequest) SetFormData(FormData map[string]interface{}) {
	h.FormData = FormData
	h.FormDataSetted = true
}

func (h *HttpRequest) SetMultipartData(MultipartData map[string]interface{}) {
	h.MultipartData = MultipartData
	h.MultipartDataSetted = true
}

func (h *HttpRequest) SetJsonBody(JsonPath string, JsonApply map[string]interface{}) {
	h.JsonPath = JsonPath
	h.JsonApply = JsonApply
}

func (h *HttpRequest) SetRawBody(t *testing.T, path string) {
	data, err := ioutil.ReadFile(path)
	if err != nil {
		assert.Fail(t, fmt.Sprintf("Error while reading '%s': %s", path, err))
	}
	h.RawBody = string(data)
	h.RawBodySetted = true
}

func RandomInteger(min int, max int) int {
	return rand.Intn(max-min) + min
}

func RandomFloat(min float64, max float64) float64 {
	return min + rand.Float64()*(max-min)
}

func RandomEmail(domain ...string) string {
	names := [...]string{"John", "Peter", "Bob", "David", "Harry"}
	surnames := [...]string{"Black", "Clark", "Duncan", "Gibson", "James"}
	emailDomains := [...]string{"John", "Peter", "Bob", "David", "Harry"}

	username := strings.ToLower(fmt.Sprintf(
		"%s.%s",
		names[RandomInteger(0, len(names)-1)],
		surnames[RandomInteger(0, len(surnames)-1)],
	))

	if len(domain) == 0 {
		return fmt.Sprintf(
			"%s@%s",
			username,
			emailDomains[RandomInteger(0, len(emailDomains)-1)],
		)
	} else {
		return fmt.Sprintf(
			"%s@%s",
			username,
			domain[0],
		)
	}
}

func LoadDataset(t *testing.T, path string) []interface{} {
	data, err := ioutil.ReadFile(path)
	if err != nil {
		assert.Fail(t, fmt.Sprintf("Error while reading '%s': %s", path, err))
	}

	m := make(map[string]interface{})
	err = json.Unmarshal(data, &m)
	if err != nil {
		assert.Fail(t, fmt.Sprintf("Error while parsing '%s': %s", path, err))
	}

	return m["rows"].([]interface{})
}

func JsonPath(t *testing.T, path string, text string) string {
	obj, err := oj.ParseString(text)
	if err != nil {
		assert.Fail(t, fmt.Sprintf("JSONPath: Provided JSON is empty, null or invalid: %s", text))
	}
	x, _ := jp.ParseString(path)
	result := x.Get(obj)
	if len(result) < 1 {
		assert.Fail(t, fmt.Sprintf("JSONPath: No values found for %s", path))
		return ""
	} else {
		switch result[0].(type) {
		case string:
			return result[0].(string)
		case int64:
			return strconv.FormatInt(result[0].(int64), 10)
		case float64:
			return strconv.FormatFloat(result[0].(float64), 'f', 6, 64)
		case bool:
			return strconv.FormatBool(result[0].(bool))
		case nil:
			return "null"
		default:
			assert.Fail(t, fmt.Sprintf("JSONPath: No values found for %s", path))
			return ""
		}
	}
}

func UrlPart(t *testing.T, ospec string, paramURL string) string {
	t.Logf("Extracting %s from %s", ospec, paramURL)

	flag := ospec[0]
	spec := ospec[1:]

	u, err := url.Parse(paramURL)
	if err != nil {
		assert.Fail(t, fmt.Sprintf("URL parsing error: %s", paramURL))
	}

	if flag == '/' {
		ind, err := strconv.Atoi(spec)
		if err != nil {
			assert.Fail(t, fmt.Sprintf("String to integer conversion error: %s", spec))
		}
		path_parts := strings.Split(u.Path, "/")
		if len(path_parts)-1 <= ind {
			assert.Fail(t, fmt.Sprintf("No path element #%s in %r, failed extract", ind, u.Path))
		}
		return path_parts[ind]
	} else {
		q, err := url.ParseQuery(u.RawQuery)
		if err != nil {
			assert.Fail(t, fmt.Sprintf("Query string parsing error: %s", u.RawQuery))
		}
		return q.Get(spec)
	}
}

func UrlDecode(t *testing.T, text string) string {
	result, err := url.PathUnescape(text)
	if err != nil {
		assert.Fail(t, fmt.Sprintf("URL decode error: %s", text))
	}
	return result
}

func FromRegex(t *testing.T, regex string, text string) string {
	r := regexp.MustCompile(regex)
	match := r.FindStringSubmatch(text)
	if len(match) < 1 {
		assert.Fail(t, fmt.Sprintf("No match found in '%s' for regex: ", text, regex))
	}
	return match[0]
}

func CssSelect(t *testing.T, selector string, resp *resty.Response) string {
	if len(resp.String()) == 0 {
		assert.Fail(t, "CSS query on empty HTML!")
		return ""
	}
	doc, err := goquery.NewDocumentFromReader(strings.NewReader(resp.String()))
	if err != nil {
		assert.Fail(t, fmt.Sprintf("HTML parser failure: ", resp.String()))
		return ""
	}
	selection := doc.Find(selector)
	if selection.Size() == 0 {
		assert.Fail(t, fmt.Sprintf("CSS select query '%s' couldn't find in HTML: %s", selector, resp.String()))
	} else {
		return selection.Text()
	}
	return ""
}

func GetCookie(t *testing.T, key string, resp *resty.Response) string {
	cookies := resp.Cookies()
	for _, cookie := range cookies {
		if cookie.Name == key {
			return cookie.Value
		}
	}
	assert.Fail(t, fmt.Sprintf("Key '%s' is not found in the cookies.", key))
	return ""
}

func GetHeader(t *testing.T, key string, resp *resty.Response) string {
	values := resp.Header()[key]
	if len(values) < 1 {
		assert.Fail(t, fmt.Sprintf("Key '%s' is not found in the cookies.", key))
		return ""
	} else {
		return values[0]
	}
}
