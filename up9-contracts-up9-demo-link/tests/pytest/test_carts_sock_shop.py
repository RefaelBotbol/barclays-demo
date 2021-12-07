from up9lib import *
from authentication import authenticate

# logging.basicConfig(level=logging.DEBUG)


@data_driven_tests
class Tests_carts_sock_shop(unittest.TestCase):

    @json_dataset('data/24/dataset_24.json')
    @clear_session({'spanId': 24})
    def test_024_post_carts_customerId_items(self, data_row):
        customerId, size = data_row

        # GET http://catalogue.sock-shop/tags (endp 76)
        catalogue_sock_shop = get_http_client('http://catalogue.sock-shop', authenticate)
        resp = catalogue_sock_shop.get('/tags')
        resp.assert_status_code(200)
        resp.assert_jsonpath('$.tags[*]')
        tags = jsonpath('$.tags[*]', resp)

        # GET http://catalogue.sock-shop/catalogue (endp 17)
        qstr = '?' + urlencode({'page': '1', 'size': size, 'sort': 'id', 'tags': tags})
        resp = catalogue_sock_shop.get('/catalogue' + qstr)
        resp.assert_status_code(200)
        resp.assert_jsonpath('$[*].tag[*]')
        itemId = jsonpath('$[*].id', resp)
        id_ = jsonpath('$[*].id', resp)

        # GET http://catalogue.sock-shop/catalogue/{id} (endp 18)
        resp = catalogue_sock_shop.get(f'/catalogue/{id_}')
        resp.assert_status_code(200)
        unitPrice = jsonpath('$.price', resp)

        # POST http://carts.sock-shop/carts/{customerId}/items (endp 24)
        carts_sock_shop = get_http_client('http://carts.sock-shop', authenticate)
        with open('data/24/payload_for_endp_24.json', 'r') as json_payload_file:
            json_payload = json.load(json_payload_file)
        apply_into_json(json_payload, '$.itemId', itemId)
        apply_into_json(json_payload, '$.unitPrice', unitPrice)
        resp = carts_sock_shop.post(f'/carts/{customerId}/items', json=json_payload, headers={'accept': 'application/json'})
        resp.assert_status_code(201)
        resp.assert_jsonpath('$.id')

    @json_dataset('data/31/dataset_31.json')
    @clear_session({'spanId': 31})
    def test_031_get_carts_customerId_items(self, data_row):
        customerId, x_b3_parentspanid, x_b3_spanid, x_b3_traceid, x_span_name = data_row

        # GET http://carts.sock-shop/carts/{customerId}/items (endp 31)
        carts_sock_shop = get_http_client('http://carts.sock-shop', authenticate)
        resp = carts_sock_shop.get(f'/carts/{customerId}/items', headers={'accept': 'application/json', 'x-b3-parentspanid': x_b3_parentspanid, 'x-b3-sampled': '1', 'x-b3-spanid': x_b3_spanid, 'x-b3-traceid': x_b3_traceid, 'x-span-name': x_span_name})
        resp.assert_status_code(200)
        resp.assert_jsonpath('$[*].id')

    @json_dataset('data/25/dataset_25.json')
    @clear_session({'spanId': 25})
    def test_025_get_carts_customerId_merge(self, data_row):
        customerId, sessionId = data_row

        # GET http://carts.sock-shop/carts/{customerId}/merge (endp 25)
        carts_sock_shop = get_http_client('http://carts.sock-shop', authenticate)
        qstr = '?' + urlencode({'sessionId': sessionId})
        resp = carts_sock_shop.get(f'/carts/{customerId}/merge' + qstr)
        resp.assert_status_code(202)

    @json_dataset('data/123/dataset_123.json')
    @clear_session({'spanId': 123})
    def test_123_get_carts_customerId_merge(self, data_row):
        customerId, sessionId = data_row

        # GET http://carts.sock-shop/carts/{customerId}/merge (endp 123)
        carts_sock_shop = get_http_client('http://carts.sock-shop', authenticate)
        qstr = '?' + urlencode({'sessionId': sessionId})
        resp = carts_sock_shop.get(f'/carts/{customerId}/merge' + qstr)
        resp.assert_status_code(202)

    @clear_session({'spanId': 251})
    def test_251_get_carts_xGsbdrPaoqfokjGLQgckj33LqFFZhSTL_items(self):
        # GET http://carts.sock-shop/carts/xGsbdrPaoqfokjGLQgckj33LqFFZhSTL/items (endp 251)
        carts_sock_shop = get_http_client('http://carts.sock-shop', authenticate)
        resp = carts_sock_shop.get('/carts/xGsbdrPaoqfokjGLQgckj33LqFFZhSTL/items')
        resp.assert_status_code(200)
        resp.assert_jsonpath('$[*].id')

    @json_dataset('data/262/dataset_262.json')
    @clear_session({'spanId': 262})
    def test_262_post_carts_xGsbdrPaoqfokjGLQgckj33LqFFZhSTL_items(self, data_row):
        size, = data_row

        # GET http://catalogue.sock-shop/tags (endp 76)
        catalogue_sock_shop = get_http_client('http://catalogue.sock-shop', authenticate)
        resp = catalogue_sock_shop.get('/tags')
        resp.assert_status_code(200)
        resp.assert_jsonpath('$.tags[*]')
        tags = jsonpath('$.tags[*]', resp)

        # GET http://catalogue.sock-shop/catalogue (endp 17)
        qstr = '?' + urlencode({'page': '1', 'size': size, 'sort': 'id', 'tags': tags})
        resp = catalogue_sock_shop.get('/catalogue' + qstr)
        resp.assert_status_code(200)
        resp.assert_jsonpath('$[*].tag[*]')
        itemId = jsonpath('$[*].id', resp)
        id_ = jsonpath('$[*].id', resp)

        # GET http://catalogue.sock-shop/catalogue/{id} (endp 18)
        resp = catalogue_sock_shop.get(f'/catalogue/{id_}')
        resp.assert_status_code(200)
        unitPrice = jsonpath('$.price', resp)

        # POST http://carts.sock-shop/carts/xGsbdrPaoqfokjGLQgckj33LqFFZhSTL/items (endp 262)
        carts_sock_shop = get_http_client('http://carts.sock-shop', authenticate)
        with open('data/262/payload_for_endp_262.json', 'r') as json_payload_file:
            json_payload = json.load(json_payload_file)
        apply_into_json(json_payload, '$.itemId', itemId)
        apply_into_json(json_payload, '$.unitPrice', unitPrice)
        resp = carts_sock_shop.post('/carts/xGsbdrPaoqfokjGLQgckj33LqFFZhSTL/items', json=json_payload, headers={'accept': 'application/json'})
        resp.assert_status_code(201)
        resp.assert_jsonpath('$.id')
