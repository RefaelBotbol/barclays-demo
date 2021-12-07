const authenticate = require("./authentication");
const {JSONPath, clearSession, dataset, getHttpClient} = require("./up9lib");

it("test_222_get_customers", () => {
    clearSession();

    // GET http://user.sock-shop/customers (endp 222)
    const user_sock_shop = getHttpClient("http://user.sock-shop", authenticate);
    return user_sock_shop.fetch("/customers")
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

describe.each(dataset("data/20/dataset_20.json"))("test_020_get_customers_customerId_addresses", (customerId) => {
    it("test_020_get_customers_customerId_addresses", () => {
        clearSession();

        // GET http://user.sock-shop/customers/{customerId}/addresses (endp 20)
        const user_sock_shop = getHttpClient("http://user.sock-shop", authenticate);
        return user_sock_shop.fetch("/customers/" + customerId + "/addresses")
        .then((response) => {
            expect(response.status).toEqual(200);
            return response.text();
        })
        .then((text) => {
            return JSON.parse(text);
        })
        .then((data) => {
            expect(JSONPath({
                path: "$._embedded.address[*]._links.self.href",
                json: data
            })).not.toBeNull();
        });
    });
});

describe.each(dataset("data/21/dataset_21.json"))("test_021_get_customers_customerId_cards", (customerId) => {
    it("test_021_get_customers_customerId_cards", () => {
        clearSession();

        // GET http://user.sock-shop/customers/{customerId}/cards (endp 21)
        const user_sock_shop = getHttpClient("http://user.sock-shop", authenticate);
        return user_sock_shop.fetch("/customers/" + customerId + "/cards")
        .then((response) => {
            expect(response.status).toEqual(200);
            return response.text();
        })
        .then((text) => {
            return JSON.parse(text);
        })
        .then((data) => {
            expect(JSONPath({
                path: "$._embedded.card[*]._links.card.href",
                json: data
            })).not.toBeNull();
        });
    });
});
