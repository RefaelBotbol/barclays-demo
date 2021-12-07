package up9_autogenerated_tests

import (
    . "authentication"
    . "up9lib"
    assert "github.com/stretchr/testify/assert"
    testing "testing"
    uuid "github.com/google/uuid"
)

func TestPostShipping033(t *testing.T) {
    for _, tt := range LoadDataset(t, "data/33/dataset_33.json") {
        name := tt.(map[string]interface{})["name"]
        x_b3_parentspanid := tt.(map[string]interface{})["x_b3_parentspanid"]
        x_b3_spanid := tt.(map[string]interface{})["x_b3_spanid"]
        x_b3_traceid := tt.(map[string]interface{})["x_b3_traceid"]

        // POST http://shipping.sock-shop/shipping (endp 33)
        shippingSockShop := GetHttpClient(t, "http://shipping.sock-shop", new(Authentication))
        req := new(HttpRequest)
        req.SetHeaders(map[string]interface{}{
            "accept": "application/json",
            "content-type": "application/json",
            "x-b3-parentspanid": x_b3_parentspanid,
            "x-b3-sampled": "1",
            "x-b3-spanid": x_b3_spanid,
            "x-b3-traceid": x_b3_traceid,
            "x-span-name": "http:/shipping",
        })
        req.SetJsonBody("data/33/payload_for_endp_33.json", map[string]interface{}{
            "$.id": uuid.New().String(),
            "$.name": name,
        })
        resp := shippingSockShop.Post(req, "/shipping")
        assert.Equal(t, 201, resp.StatusCode())
        assert.NotNil(t, JsonPath(t, "$.id", resp.String()))
    }
}
