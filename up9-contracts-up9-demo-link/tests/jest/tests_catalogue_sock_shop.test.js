const authenticate = require("./authentication");
const {clearSession, dataset, getHttpClient, urlencode} = require("./up9lib");

describe.each(dataset("data/74/dataset_74.json"))("test_074_get_catalogue_size", (tags) => {
    it("test_074_get_catalogue_size", () => {
        clearSession();

        // GET http://catalogue.sock-shop/catalogue/size (endp 74)
        const catalogue_sock_shop = getHttpClient("http://catalogue.sock-shop", authenticate);
        return catalogue_sock_shop.fetch("/catalogue/size" + urlencode([["tags", tags]]))
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
