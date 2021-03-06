package up9_autogenerated_tests

import (
    . "authentication"
    . "up9lib"
    assert "github.com/stretchr/testify/assert"
    testing "testing"
)

func TestGetCatalogueSize074(t *testing.T) {
    for _, tt := range LoadDataset(t, "data/74/dataset_74.json") {
        tags := tt.(map[string]interface{})["tags"]

        // GET http://catalogue.sock-shop/catalogue/size (endp 74)
        catalogueSockShop := GetHttpClient(t, "http://catalogue.sock-shop", new(Authentication))
        req := new(HttpRequest)
        req.SetQueryString(map[string]interface{}{
            "tags": tags,
        })
        resp := catalogueSockShop.Get(req, "/catalogue/size")
        assert.Equal(t, 200, resp.StatusCode())
    }
}
