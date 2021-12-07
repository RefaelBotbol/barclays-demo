const authenticate = require("./authentication");
const {JSONBuild, clearSession, dataset, getHttpClient, readFileSync, uuidv4} = require("./up9lib");

describe.each(dataset("data/16/dataset_16.json"))("test_016_put_shipping_task", (name) => {
    it("test_016_put_shipping_task", () => {
        clearSession();

        // PUT kafka://kafka/shipping-task (endp 16)
        const kafka = getHttpClient("kafka://kafka", authenticate);
        return kafka.fetch("/shipping-task", {
            method: "PUT",
            headers: {
                "content-type": "application/json"
            },
            body: JSONBuild("data/16/payload_for_endp_16.json", {
                "$.id": String(uuidv4()),
                "$.name": name
            })
        })
        .then((response) => {
            return response.text();
        })
        .then((text) => {
        })
        .then((data) => {
        });
    });
});

it("test_149_put_shipping_task", () => {
    clearSession();

    // PUT kafka://kafka/shipping-task (endp 149)
    const kafka = getHttpClient("kafka://kafka", authenticate);
    return kafka.fetch("/shipping-task", {
        method: "PUT",
        body: readFileSync("data/149/payload_for_endp_149.txt", "r")
    })
    .then((response) => {
        return response.text();
    })
    .then((text) => {
    })
    .then((data) => {
    });
});
