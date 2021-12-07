from up9lib import *
from authentication import authenticate

# logging.basicConfig(level=logging.DEBUG)


@data_driven_tests
class Tests_shipping_sock_shop(unittest.TestCase):

    @json_dataset('data/33/dataset_33.json')
    @clear_session({'spanId': 33})
    def test_033_post_shipping(self, data_row):
        name, x_b3_parentspanid, x_b3_spanid, x_b3_traceid = data_row

        # POST http://shipping.sock-shop/shipping (endp 33)
        shipping_sock_shop = get_http_client('http://shipping.sock-shop', authenticate)
        with open('data/33/payload_for_endp_33.json', 'r') as json_payload_file:
            json_payload = json.load(json_payload_file)
        apply_into_json(json_payload, '$.id', str(uuid.uuid4()))
        apply_into_json(json_payload, '$.name', name)
        resp = shipping_sock_shop.post('/shipping', json=json_payload, headers={'accept': 'application/json', 'x-b3-parentspanid': x_b3_parentspanid, 'x-b3-sampled': '1', 'x-b3-spanid': x_b3_spanid, 'x-b3-traceid': x_b3_traceid, 'x-span-name': 'http:/shipping'})
        resp.assert_status_code(201)
        resp.assert_jsonpath('$.id')
