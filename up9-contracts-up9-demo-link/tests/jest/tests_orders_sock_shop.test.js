const authenticate = require("./authentication");
const {JSONBuild, JSONPath, clearSession, dataset, getHttpClient, urlencode} = require("./up9lib");

describe.each(dataset("data/88/dataset_88.json"))("test_088_get_orders_search_customerId", (address, card, customerId, items, x_b3_parentspanid, x_b3_spanid, x_b3_traceid, x_span_name) => {
    it("test_088_get_orders_search_customerId", () => {
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
            const customer = JSONPath({
                path: "$._links.self.href",
                json: data
            })[0];

            // POST http://orders.sock-shop/orders (endp 26)
            const orders_sock_shop = getHttpClient("http://orders.sock-shop", authenticate);
            return orders_sock_shop.fetch("/orders", {
                method: "POST",
                headers: {
                    "accept": "application/json",
                    "content-type": "application/json"
                },
                body: JSONBuild("data/88/payload_for_endp_26.json", {
                    "$.address": address,
                    "$.card": card,
                    "$.customer": customer,
                    "$.items": items
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
                    path: "$.card.ccv",
                    json: data
                })).not.toBeNull();
                const custId = JSONPath({
                    path: "$.customerId",
                    json: data
                })[0];

                // GET http://orders.sock-shop/orders/search/customerId (endp 88)
                return orders_sock_shop.fetch("/orders/search/customerId" + urlencode([["custId", custId], ["sort", "date"]]))
                .then((response) => {
                    expect(response.status).toEqual(200);
                    return response.text();
                })
                .then((text) => {
                    return JSON.parse(text);
                })
                .then((data) => {
                    expect(JSONPath({
                        path: "$._embedded.customerOrders[*]._links.self.href",
                        json: data
                    })).not.toBeNull();
                });
            });
        });
    });
});
