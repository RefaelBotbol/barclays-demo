from up9lib import *
from authentication import authenticate

# logging.basicConfig(level=logging.DEBUG)


@data_driven_tests
class Tests_orders_sock_shop(unittest.TestCase):

    @json_dataset('data/26/dataset_26.json')
    @clear_session({'spanId': 26})
    def test_026_post_orders(self, data_row):
        address, card, customerId, items, x_b3_parentspanid, x_b3_spanid, x_b3_traceid, x_span_name = data_row

        # GET http://user.sock-shop/customers/{customerId} (endp 19)
        user_sock_shop = get_http_client('http://user.sock-shop', authenticate)
        resp = user_sock_shop.get(f'/customers/{customerId}', headers={'accept': 'application/hal+json', 'x-b3-parentspanid': x_b3_parentspanid, 'x-b3-sampled': '1', 'x-b3-spanid': x_b3_spanid, 'x-b3-traceid': x_b3_traceid, 'x-span-name': x_span_name})
        resp.assert_status_code(200)
        resp.assert_jsonpath('$._links.self.href')
        customer = jsonpath('$._links.self.href', resp)

        # POST http://orders.sock-shop/orders (endp 26)
        orders_sock_shop = get_http_client('http://orders.sock-shop', authenticate)
        with open('data/26/payload_for_endp_26.json', 'r') as json_payload_file:
            json_payload = json.load(json_payload_file)
        apply_into_json(json_payload, '$.address', address)
        apply_into_json(json_payload, '$.card', card)
        apply_into_json(json_payload, '$.customer', customer)
        apply_into_json(json_payload, '$.items', items)
        resp = orders_sock_shop.post('/orders', json=json_payload, headers={'accept': 'application/json'})
        resp.assert_status_code(201)
        resp.assert_jsonpath('$.card.ccv')

    @json_dataset('data/88/dataset_88.json')
    @clear_session({'spanId': 88})
    def test_088_get_orders_search_customerId(self, data_row):
        address, card, customerId, items, x_b3_parentspanid, x_b3_spanid, x_b3_traceid, x_span_name = data_row

        # GET http://user.sock-shop/customers/{customerId} (endp 19)
        user_sock_shop = get_http_client('http://user.sock-shop', authenticate)
        resp = user_sock_shop.get(f'/customers/{customerId}', headers={'accept': 'application/hal+json', 'x-b3-parentspanid': x_b3_parentspanid, 'x-b3-sampled': '1', 'x-b3-spanid': x_b3_spanid, 'x-b3-traceid': x_b3_traceid, 'x-span-name': x_span_name})
        resp.assert_status_code(200)
        resp.assert_jsonpath('$._links.self.href')
        customer = jsonpath('$._links.self.href', resp)

        # POST http://orders.sock-shop/orders (endp 26)
        orders_sock_shop = get_http_client('http://orders.sock-shop', authenticate)
        with open('data/88/payload_for_endp_26.json', 'r') as json_payload_file:
            json_payload = json.load(json_payload_file)
        apply_into_json(json_payload, '$.address', address)
        apply_into_json(json_payload, '$.card', card)
        apply_into_json(json_payload, '$.customer', customer)
        apply_into_json(json_payload, '$.items', items)
        resp = orders_sock_shop.post('/orders', json=json_payload, headers={'accept': 'application/json'})
        resp.assert_status_code(201)
        resp.assert_jsonpath('$.card.ccv')
        custId = jsonpath('$.customerId', resp)

        # GET http://orders.sock-shop/orders/search/customerId (endp 88)
        qstr = '?' + urlencode({'custId': custId, 'sort': 'date'})
        resp = orders_sock_shop.get('/orders/search/customerId' + qstr)
        resp.assert_status_code(200)
        resp.assert_jsonpath('$._embedded.customerOrders[*]._links.self.href')
