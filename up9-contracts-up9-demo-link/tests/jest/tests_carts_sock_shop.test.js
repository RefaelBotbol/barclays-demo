const authenticate = require("./authentication");
const {JSONBuild, JSONPath, clearSession, dataset, getHttpClient, urlencode} = require("./up9lib");

describe.each(dataset("data/24/dataset_24.json"))("test_024_post_carts_customerId_items", (customerId, size) => {
    it("test_024_post_carts_customerId_items", () => {
        clearSession();

        // GET http://catalogue.sock-shop/tags (endp 76)
        const catalogue_sock_shop = getHttpClient("http://catalogue.sock-shop", authenticate);
        return catalogue_sock_shop.fetch("/tags")
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
            const tags = JSONPath({
                path: "$.tags[*]",
                json: data
            })[0];

            // GET http://catalogue.sock-shop/catalogue (endp 17)
            return catalogue_sock_shop.fetch("/catalogue" + urlencode([["page", "1"], ["size", size], ["sort", "id"], ["tags", tags]]))
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
                const itemId = JSONPath({
                    path: "$[*].id",
                    json: data
                })[0];
                const id = JSONPath({
                    path: "$[*].id",
                    json: data
                })[0];

                // GET http://catalogue.sock-shop/catalogue/{id} (endp 18)
                return catalogue_sock_shop.fetch("/catalogue/" + id)
                .then((response) => {
                    expect(response.status).toEqual(200);
                    return response.text();
                })
                .then((text) => {
                    return JSON.parse(text);
                })
                .then((data) => {
                    const unitPrice = JSONPath({
                        path: "$.price",
                        json: data
                    })[0];

                    // POST http://carts.sock-shop/carts/{customerId}/items (endp 24)
                    const carts_sock_shop = getHttpClient("http://carts.sock-shop", authenticate);
                    return carts_sock_shop.fetch("/carts/" + customerId + "/items", {
                        method: "POST",
                        headers: {
                            "accept": "application/json",
                            "content-type": "application/json"
                        },
                        body: JSONBuild("data/24/payload_for_endp_24.json", {
                            "$.itemId": itemId,
                            "$.unitPrice": unitPrice
                        })
                    })
                    .then((response) => {
                        expect(response.status).toEqual(201);
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
    });
});

describe.each(dataset("data/31/dataset_31.json"))("test_031_get_carts_customerId_items", (customerId, x_b3_parentspanid, x_b3_spanid, x_b3_traceid, x_span_name) => {
    it("test_031_get_carts_customerId_items", () => {
        clearSession();

        // GET http://carts.sock-shop/carts/{customerId}/items (endp 31)
        const carts_sock_shop = getHttpClient("http://carts.sock-shop", authenticate);
        return carts_sock_shop.fetch("/carts/" + customerId + "/items", {
            headers: {
                "accept": "application/json",
                "x-b3-parentspanid": x_b3_parentspanid,
                "x-b3-sampled": "1",
                "x-b3-spanid": x_b3_spanid,
                "x-b3-traceid": x_b3_traceid,
                "x-span-name": x_span_name
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

describe.each(dataset("data/25/dataset_25.json"))("test_025_get_carts_customerId_merge", (customerId, sessionId) => {
    it("test_025_get_carts_customerId_merge", () => {
        clearSession();

        // GET http://carts.sock-shop/carts/{customerId}/merge (endp 25)
        const carts_sock_shop = getHttpClient("http://carts.sock-shop", authenticate);
        return carts_sock_shop.fetch("/carts/" + customerId + "/merge" + urlencode([["sessionId", sessionId]]))
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

describe.each(dataset("data/123/dataset_123.json"))("test_123_get_carts_customerId_merge", (customerId, sessionId) => {
    it("test_123_get_carts_customerId_merge", () => {
        clearSession();

        // GET http://carts.sock-shop/carts/{customerId}/merge (endp 123)
        const carts_sock_shop = getHttpClient("http://carts.sock-shop", authenticate);
        return carts_sock_shop.fetch("/carts/" + customerId + "/merge" + urlencode([["sessionId", sessionId]]))
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

it("test_251_get_carts_xGsbdrPaoqfokjGLQgckj33LqFFZhSTL_items", () => {
    clearSession();

    // GET http://carts.sock-shop/carts/xGsbdrPaoqfokjGLQgckj33LqFFZhSTL/items (endp 251)
    const carts_sock_shop = getHttpClient("http://carts.sock-shop", authenticate);
    return carts_sock_shop.fetch("/carts/xGsbdrPaoqfokjGLQgckj33LqFFZhSTL/items")
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

describe.each(dataset("data/262/dataset_262.json"))("test_262_post_carts_xGsbdrPaoqfokjGLQgckj33LqFFZhSTL_items", (size) => {
    it("test_262_post_carts_xGsbdrPaoqfokjGLQgckj33LqFFZhSTL_items", () => {
        clearSession();

        // GET http://catalogue.sock-shop/tags (endp 76)
        const catalogue_sock_shop = getHttpClient("http://catalogue.sock-shop", authenticate);
        return catalogue_sock_shop.fetch("/tags")
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
            const tags = JSONPath({
                path: "$.tags[*]",
                json: data
            })[0];

            // GET http://catalogue.sock-shop/catalogue (endp 17)
            return catalogue_sock_shop.fetch("/catalogue" + urlencode([["page", "1"], ["size", size], ["sort", "id"], ["tags", tags]]))
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
                const itemId = JSONPath({
                    path: "$[*].id",
                    json: data
                })[0];
                const id = JSONPath({
                    path: "$[*].id",
                    json: data
                })[0];

                // GET http://catalogue.sock-shop/catalogue/{id} (endp 18)
                return catalogue_sock_shop.fetch("/catalogue/" + id)
                .then((response) => {
                    expect(response.status).toEqual(200);
                    return response.text();
                })
                .then((text) => {
                    return JSON.parse(text);
                })
                .then((data) => {
                    const unitPrice = JSONPath({
                        path: "$.price",
                        json: data
                    })[0];

                    // POST http://carts.sock-shop/carts/xGsbdrPaoqfokjGLQgckj33LqFFZhSTL/items (endp 262)
                    const carts_sock_shop = getHttpClient("http://carts.sock-shop", authenticate);
                    return carts_sock_shop.fetch("/carts/xGsbdrPaoqfokjGLQgckj33LqFFZhSTL/items", {
                        method: "POST",
                        headers: {
                            "accept": "application/json",
                            "content-type": "application/json"
                        },
                        body: JSONBuild("data/262/payload_for_endp_262.json", {
                            "$.itemId": itemId,
                            "$.unitPrice": unitPrice
                        })
                    })
                    .then((response) => {
                        expect(response.status).toEqual(201);
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
    });
});
