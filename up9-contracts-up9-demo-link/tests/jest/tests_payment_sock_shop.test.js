const authenticate = require("./authentication");
const {JSONBuild, JSONPath, clearSession, dataset, getHttpClient, randomFloat} = require("./up9lib");

describe.each(dataset("data/15/dataset_15.json"))("test_015_post_paymentAuth", (addresseId, cardId, city, customerId, longNum, number, x_b3_parentspanid, x_b3_parentspanid1, x_b3_parentspanid2, x_b3_parentspanid3, x_b3_spanid, x_b3_spanid1, x_b3_spanid2, x_b3_spanid3, x_b3_traceid, x_b3_traceid1, x_b3_traceid2, x_b3_traceid3, x_span_name, x_span_name1, x_span_name2) => {
    it("test_015_post_paymentAuth", () => {
        clearSession();

        // GET http://user.sock-shop/customers/{customerId} (endp 19)
        const user_sock_shop = getHttpClient("http://user.sock-shop", authenticate);
        return user_sock_shop.fetch("/customers/" + customerId, {
            headers: {
                "accept": "application/hal+json",
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
                path: "$._links.self.href",
                json: data
            })).not.toBeNull();
            const firstName = JSONPath({
                path: "$.firstName",
                json: data
            })[0];
            const lastName = JSONPath({
                path: "$.lastName",
                json: data
            })[0];
            const username = JSONPath({
                path: "$.username",
                json: data
            })[0];

            // GET http://user.sock-shop/addresses/{addresseId} (endp 28)
            return user_sock_shop.fetch("/addresses/" + addresseId, {
                headers: {
                    "accept": "application/hal+json",
                    "x-b3-parentspanid": x_b3_parentspanid1,
                    "x-b3-sampled": "1",
                    "x-b3-spanid": x_b3_spanid1,
                    "x-b3-traceid": x_b3_traceid1,
                    "x-span-name": x_span_name1
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
                const country = JSONPath({
                    path: "$.country",
                    json: data
                })[0];
                const postcode = JSONPath({
                    path: "$.postcode",
                    json: data
                })[0];
                const street = JSONPath({
                    path: "$.street",
                    json: data
                })[0];

                // GET http://user.sock-shop/cards/{cardId} (endp 29)
                return user_sock_shop.fetch("/cards/" + cardId, {
                    headers: {
                        "accept": "application/hal+json",
                        "x-b3-parentspanid": x_b3_parentspanid2,
                        "x-b3-sampled": "1",
                        "x-b3-spanid": x_b3_spanid2,
                        "x-b3-traceid": x_b3_traceid2,
                        "x-span-name": x_span_name2
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
                        path: "$._links.card.href",
                        json: data
                    })).not.toBeNull();
                    const ccv = JSONPath({
                        path: "$.ccv",
                        json: data
                    })[0];
                    const expires = JSONPath({
                        path: "$.expires",
                        json: data
                    })[0];

                    // POST http://payment.sock-shop/paymentAuth (endp 15)
                    const payment_sock_shop = getHttpClient("http://payment.sock-shop", authenticate);
                    return payment_sock_shop.fetch("/paymentAuth", {
                        method: "POST",
                        headers: {
                            "accept": "application/json",
                            "content-type": "application/json",
                            "x-b3-parentspanid": x_b3_parentspanid3,
                            "x-b3-sampled": "1",
                            "x-b3-spanid": x_b3_spanid3,
                            "x-b3-traceid": x_b3_traceid3,
                            "x-span-name": "http:/paymentAuth"
                        },
                        body: JSONBuild("data/15/payload_for_endp_15.json", {
                            "$.address.city": city,
                            "$.address.country": country,
                            "$.address.number": number,
                            "$.address.postcode": postcode,
                            "$.address.street": street,
                            "$.amount": parseFloat(randomFloat(4.99, 414.87)),
                            "$.card.ccv": ccv,
                            "$.card.expires": expires,
                            "$.card.longNum": longNum,
                            "$.customer.firstName": firstName,
                            "$.customer.lastName": lastName,
                            "$.customer.username": username
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
                            path: "$.message",
                            json: data
                        })).not.toBeNull();
                    });
                });
            });
        });
    });
});
