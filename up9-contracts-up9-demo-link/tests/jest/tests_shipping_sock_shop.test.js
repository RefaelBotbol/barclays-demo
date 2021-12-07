const authenticate = require("./authentication");
const {JSONBuild, JSONPath, clearSession, dataset, getHttpClient, uuidv4} = require("./up9lib");

describe.each(dataset("data/33/dataset_33.json"))("test_033_post_shipping", (name, x_b3_parentspanid, x_b3_spanid, x_b3_traceid) => {
    it("test_033_post_shipping", () => {
        clearSession();

        // POST http://shipping.sock-shop/shipping (endp 33)
        const shipping_sock_shop = getHttpClient("http://shipping.sock-shop", authenticate);
        return shipping_sock_shop.fetch("/shipping", {
            method: "POST",
            headers: {
                "accept": "application/json",
                "content-type": "application/json",
                "x-b3-parentspanid": x_b3_parentspanid,
                "x-b3-sampled": "1",
                "x-b3-spanid": x_b3_spanid,
                "x-b3-traceid": x_b3_traceid,
                "x-span-name": "http:/shipping"
            },
            body: JSONBuild("data/33/payload_for_endp_33.json", {
                "$.id": String(uuidv4()),
                "$.name": name
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
