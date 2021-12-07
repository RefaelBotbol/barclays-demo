from up9lib import *
from authentication import authenticate

# logging.basicConfig(level=logging.DEBUG)


@data_driven_tests
class Tests_front_end_sock_shop(unittest.TestCase):

    @json_dataset('data/1/dataset_1.json')
    @clear_session({'spanId': 1})
    def test_001_get_(self, data_row):
        amp_cache_transform, content, keep_alive, param, postman_token, r, s, vars_0_, x_datadog_parent_id, x_datadog_trace_id = data_row

        # GET http://front-end.sock-shop/ (endp 1)
        front_end_sock_shop = get_http_client('http://front-end.sock-shop', authenticate)
        qstr = '?' + urlencode({'': param, 'XDEBUG_SESSION_START': 'phpstorm', 'a': 'fetch', 'content': content, 'debug': '1', 'function': 'call_user_func_array', 'q': 'login.destroy.session', 'r': r, 's': s, 'up_auto_log': 'true', 'vars[0]': vars_0_})
        resp = front_end_sock_shop.get('/' + qstr, headers={'accept': 'text/html', 'amp-cache-transform': amp_cache_transform, 'keep-alive': keep_alive, 'postman-token': postman_token, 'x-datadog-parent-id': x_datadog_parent_id, 'x-datadog-sampling-priority': '0', 'x-datadog-trace-id': x_datadog_trace_id})
        resp.assert_status_code(200)
        resp.assert_cssselect('div#hot div.box div.container div h2', expected_value='Hot this week')

    @json_dataset('data/125/dataset_125.json')
    @clear_session({'spanId': 125})
    def test_125_get_(self, data_row):
        content, = data_row

        # GET http://front-end.sock-shop/ (endp 125)
        front_end_sock_shop = get_http_client('http://front-end.sock-shop', authenticate)
        qstr = '?' + urlencode({'a': 'fetch', 'content': content})
        resp = front_end_sock_shop.get('/' + qstr)
        resp.assert_status_code(200)
        resp.assert_cssselect('div#hot div.box div.container div h2', expected_value='Hot this week')

    @clear_session({'spanId': 187})
    def test_187_get_(self):
        # GET http://front-end.sock-shop/ (endp 187)
        front_end_sock_shop = get_http_client('http://front-end.sock-shop', authenticate)
        resp = front_end_sock_shop.get('/')
        resp.assert_status_code(200)
        resp.assert_cssselect('div#hot div.box div.container div h2', expected_value='Hot this week')

    @clear_session({'spanId': 190})
    def test_190_get_(self):
        # GET http://front-end.sock-shop/ (endp 190)
        front_end_sock_shop = get_http_client('http://front-end.sock-shop', authenticate)
        resp = front_end_sock_shop.get('/')
        resp.assert_status_code(200)
        resp.assert_cssselect('div#hot div.box div.container div h2', expected_value='Hot this week')

    @clear_session({'spanId': 191})
    def test_191_head_(self):
        # HEAD http://front-end.sock-shop/ (endp 191)
        front_end_sock_shop = get_http_client('http://front-end.sock-shop', authenticate)
        resp = front_end_sock_shop.head('/')
        resp.assert_status_code(200)

    @clear_session({'spanId': 192})
    def test_192_get_(self):
        # GET http://front-end.sock-shop/ (endp 192)
        front_end_sock_shop = get_http_client('http://front-end.sock-shop', authenticate)
        resp = front_end_sock_shop.get('/')
        resp.assert_status_code(200)
        resp.assert_cssselect('div#hot div.box div.container div h2', expected_value='Hot this week')

    @clear_session({'spanId': 193})
    def test_193_get_(self):
        # GET http://front-end.sock-shop/ (endp 193)
        front_end_sock_shop = get_http_client('http://front-end.sock-shop', authenticate)
        resp = front_end_sock_shop.get('/')
        resp.assert_status_code(200)
        resp.assert_cssselect('div#hot div.box div.container div h2', expected_value='Hot this week')

    @clear_session({'spanId': 194})
    def test_194_get_(self):
        # GET http://front-end.sock-shop/ (endp 194)
        front_end_sock_shop = get_http_client('http://front-end.sock-shop', authenticate)
        resp = front_end_sock_shop.get('/')
        resp.assert_status_code(200)
        resp.assert_cssselect('div#hot div.box div.container div h2', expected_value='Hot this week')

    @clear_session({'spanId': 195})
    def test_195_get_(self):
        # GET http://front-end.sock-shop/ (endp 195)
        front_end_sock_shop = get_http_client('http://front-end.sock-shop', authenticate)
        resp = front_end_sock_shop.get('/')
        resp.assert_status_code(200)
        resp.assert_cssselect('div#hot div.box div.container div h2', expected_value='Hot this week')

    @clear_session({'spanId': 207})
    def test_207_get_(self):
        # GET http://front-end.sock-shop/ (endp 207)
        front_end_sock_shop = get_http_client('http://front-end.sock-shop', authenticate)
        resp = front_end_sock_shop.get('/')
        resp.assert_status_code(200)
        resp.assert_cssselect('div#hot div.box div.container div h2', expected_value='Hot this week')

    @clear_session({'spanId': 211})
    def test_211_get_(self):
        # GET http://front-end.sock-shop/ (endp 211)
        front_end_sock_shop = get_http_client('http://front-end.sock-shop', authenticate)
        resp = front_end_sock_shop.get('/')
        resp.assert_status_code(200)
        resp.assert_cssselect('div#hot div.box div.container div h2', expected_value='Hot this week')

    @clear_session({'spanId': 212})
    def test_212_get_(self):
        # GET http://front-end.sock-shop/ (endp 212)
        front_end_sock_shop = get_http_client('http://front-end.sock-shop', authenticate)
        resp = front_end_sock_shop.get('/')
        resp.assert_status_code(200)
        resp.assert_cssselect('div#hot div.box div.container div h2', expected_value='Hot this week')

    @clear_session({'spanId': 213})
    def test_213_get_(self):
        # GET http://front-end.sock-shop/ (endp 213)
        front_end_sock_shop = get_http_client('http://front-end.sock-shop', authenticate)
        resp = front_end_sock_shop.get('/')
        resp.assert_status_code(200)
        resp.assert_cssselect('div#hot div.box div.container div h2', expected_value='Hot this week')

    @clear_session({'spanId': 214})
    def test_214_get_(self):
        # GET http://front-end.sock-shop/ (endp 214)
        front_end_sock_shop = get_http_client('http://front-end.sock-shop', authenticate)
        resp = front_end_sock_shop.get('/')
        resp.assert_status_code(200)
        resp.assert_cssselect('div#hot div.box div.container div h2', expected_value='Hot this week')

    @clear_session({'spanId': 215})
    def test_215_get_(self):
        # GET http://front-end.sock-shop/ (endp 215)
        front_end_sock_shop = get_http_client('http://front-end.sock-shop', authenticate)
        resp = front_end_sock_shop.get('/')
        resp.assert_status_code(200)
        resp.assert_cssselect('div#hot div.box div.container div h2', expected_value='Hot this week')

    @clear_session({'spanId': 216})
    def test_216_get_(self):
        # GET http://front-end.sock-shop/ (endp 216)
        front_end_sock_shop = get_http_client('http://front-end.sock-shop', authenticate)
        resp = front_end_sock_shop.get('/')
        resp.assert_status_code(200)
        resp.assert_cssselect('div#hot div.box div.container div h2', expected_value='Hot this week')

    @clear_session({'spanId': 218})
    def test_218_get_(self):
        # GET http://front-end.sock-shop/ (endp 218)
        front_end_sock_shop = get_http_client('http://front-end.sock-shop', authenticate)
        resp = front_end_sock_shop.get('/')
        resp.assert_status_code(200)
        resp.assert_cssselect('div#hot div.box div.container div h2', expected_value='Hot this week')

    @clear_session({'spanId': 219})
    def test_219_get_(self):
        # GET http://front-end.sock-shop/ (endp 219)
        front_end_sock_shop = get_http_client('http://front-end.sock-shop', authenticate)
        resp = front_end_sock_shop.get('/')
        resp.assert_status_code(200)
        resp.assert_cssselect('div#hot div.box div.container div h2', expected_value='Hot this week')

    @clear_session({'spanId': 220})
    def test_220_get_(self):
        # GET http://front-end.sock-shop/ (endp 220)
        front_end_sock_shop = get_http_client('http://front-end.sock-shop', authenticate)
        resp = front_end_sock_shop.get('/')
        resp.assert_status_code(200)
        resp.assert_cssselect('div#hot div.box div.container div h2', expected_value='Hot this week')

    @clear_session({'spanId': 225})
    def test_225_get_(self):
        # GET http://front-end.sock-shop/ (endp 225)
        front_end_sock_shop = get_http_client('http://front-end.sock-shop', authenticate)
        resp = front_end_sock_shop.get('/')
        resp.assert_status_code(200)
        resp.assert_cssselect('div#hot div.box div.container div h2', expected_value='Hot this week')

    @clear_session({'spanId': 227})
    def test_227_get_(self):
        # GET http://front-end.sock-shop/ (endp 227)
        front_end_sock_shop = get_http_client('http://front-end.sock-shop', authenticate)
        resp = front_end_sock_shop.get('/')
        resp.assert_status_code(200)
        resp.assert_cssselect('div#hot div.box div.container div h2', expected_value='Hot this week')

    @clear_session({'spanId': 235})
    def test_235_get_(self):
        # GET http://front-end.sock-shop/ (endp 235)
        front_end_sock_shop = get_http_client('http://front-end.sock-shop', authenticate)
        resp = front_end_sock_shop.get('/')
        resp.assert_status_code(200)
        resp.assert_cssselect('div#hot div.box div.container div h2', expected_value='Hot this week')

    @clear_session({'spanId': 236})
    def test_236_get_(self):
        # GET http://front-end.sock-shop/ (endp 236)
        front_end_sock_shop = get_http_client('http://front-end.sock-shop', authenticate)
        resp = front_end_sock_shop.get('/')
        resp.assert_status_code(200)
        resp.assert_cssselect('div#hot div.box div.container div h2', expected_value='Hot this week')

    @clear_session({'spanId': 237})
    def test_237_get_(self):
        # GET http://front-end.sock-shop/ (endp 237)
        front_end_sock_shop = get_http_client('http://front-end.sock-shop', authenticate)
        resp = front_end_sock_shop.get('/')
        resp.assert_status_code(200)
        resp.assert_cssselect('div#hot div.box div.container div h2', expected_value='Hot this week')

    @clear_session({'spanId': 238})
    def test_238_get_(self):
        # GET http://front-end.sock-shop/ (endp 238)
        front_end_sock_shop = get_http_client('http://front-end.sock-shop', authenticate)
        resp = front_end_sock_shop.get('/')
        resp.assert_status_code(200)
        resp.assert_cssselect('div#hot div.box div.container div h2', expected_value='Hot this week')

    @clear_session({'spanId': 241})
    def test_241_get_(self):
        # GET http://front-end.sock-shop/ (endp 241)
        front_end_sock_shop = get_http_client('http://front-end.sock-shop', authenticate)
        resp = front_end_sock_shop.get('/')
        resp.assert_status_code(200)
        resp.assert_cssselect('div#hot div.box div.container div h2', expected_value='Hot this week')

    @json_dataset('data/40/dataset_40.json')
    @clear_session({'spanId': 40})
    def test_040_get_param(self, data_row):
        bs_real_ip, param = data_row

        # GET http://front-end.sock-shop/{param} (endp 40)
        front_end_sock_shop = get_http_client('http://front-end.sock-shop', authenticate)
        resp = front_end_sock_shop.get(f'/{param}', headers={'bs_real_ip': bs_real_ip, 'x-requested-with': 'XMLHttpRequest'})
        resp.assert_status_code(200)
        resp.assert_cssselect('div#hot div.box div.container div h2', expected_value='Hot this week')

    @json_dataset('data/50/dataset_50.json')
    @clear_session({'spanId': 50})
    def test_050_get_address(self, data_row):
        amp_cache_transform, postman_token = data_row

        # GET http://front-end.sock-shop/address (endp 50)
        front_end_sock_shop = get_http_client('http://front-end.sock-shop', authenticate)
        resp = front_end_sock_shop.get('/address', headers={'amp-cache-transform': amp_cache_transform, 'postman-token': postman_token, 'x-requested-with': 'XMLHttpRequest'})
        resp.assert_status_code(200)
        resp.assert_jsonpath('$._links.self.href')

    @json_dataset('data/170/dataset_170.json')
    @clear_session({'spanId': 170})
    def test_170_post_addresses(self, data_row):
        city, country, number, postman_token, street = data_row

        # GET http://front-end.sock-shop/customers/{customerId} (endp 62)
        front_end_sock_shop = get_http_client('http://front-end.sock-shop', authenticate)
        resp = front_end_sock_shop.get(f"/customers/{str(get_data_from_cookie('logged_in'))}", headers={'postman-token': postman_token, 'x-requested-with': 'XMLHttpRequest'})
        resp.assert_status_code(200)
        resp.assert_jsonpath('$._links.self.href')
        postcode = jsonpath('$.lastName', resp)

        # POST http://front-end.sock-shop/addresses (endp 170)
        with open('data/170/payload_for_endp_170.json', 'r') as json_payload_file:
            json_payload = json.load(json_payload_file)
        apply_into_json(json_payload, '$.city', city)
        apply_into_json(json_payload, '$.country', country)
        apply_into_json(json_payload, '$.number', number)
        apply_into_json(json_payload, '$.postcode', postcode)
        apply_into_json(json_payload, '$.street', street)
        resp = front_end_sock_shop.post('/addresses', json=json_payload, headers={'x-requested-with': 'XMLHttpRequest'})
        resp.assert_status_code(200)
        resp.assert_jsonpath('$.id')

    @json_dataset('data/8/dataset_8.json')
    @clear_session({'spanId': 8})
    def test_008_get_basket_html(self, data_row):
        amp_cache_transform, = data_row

        # GET http://front-end.sock-shop/basket.html (endp 8)
        front_end_sock_shop = get_http_client('http://front-end.sock-shop', authenticate)
        resp = front_end_sock_shop.get('/basket.html', headers={'amp-cache-transform': amp_cache_transform})
        resp.assert_status_code(200)
        resp.assert_cssselect('div#basket div.box form h1', expected_value='Shopping cart')

    @json_dataset('data/52/dataset_52.json')
    @clear_session({'spanId': 52})
    def test_052_get_card(self, data_row):
        amp_cache_transform, postman_token = data_row

        # GET http://front-end.sock-shop/card (endp 52)
        front_end_sock_shop = get_http_client('http://front-end.sock-shop', authenticate)
        resp = front_end_sock_shop.get('/card', headers={'amp-cache-transform': amp_cache_transform, 'postman-token': postman_token, 'x-requested-with': 'XMLHttpRequest'})
        resp.assert_status_code(200)
        resp.assert_jsonpath('$.number')

    @json_dataset('data/173/dataset_173.json')
    @clear_session({'spanId': 173})
    def test_173_post_cards(self, data_row):
        ccv, expires, longNum = data_row

        # POST http://front-end.sock-shop/cards (endp 173)
        front_end_sock_shop = get_http_client('http://front-end.sock-shop', authenticate)
        with open('data/173/payload_for_endp_173.json', 'r') as json_payload_file:
            json_payload = json.load(json_payload_file)
        apply_into_json(json_payload, '$.ccv', ccv)
        apply_into_json(json_payload, '$.expires', expires)
        apply_into_json(json_payload, '$.longNum', longNum)
        resp = front_end_sock_shop.post('/cards', json=json_payload, headers={'x-requested-with': 'XMLHttpRequest'})
        resp.assert_status_code(200)
        resp.assert_jsonpath('$.id')

    @json_dataset('data/9/dataset_9.json')
    @clear_session({'spanId': 9})
    def test_009_post_cart(self, data_row):
        amp_cache_transform, postman_token, postman_token1, size, tags = data_row

        # GET http://front-end.sock-shop/catalogue (endp 11)
        front_end_sock_shop = get_http_client('http://front-end.sock-shop', authenticate)
        qstr = '?' + urlencode({'page': '1', 'size': size, 'sort': 'id', 'tags': tags})
        resp = front_end_sock_shop.get('/catalogue' + qstr, headers={'amp-cache-transform': amp_cache_transform, 'postman-token': postman_token, 'x-requested-with': 'XMLHttpRequest'})
        resp.assert_status_code(200)
        resp.assert_jsonpath('$[*].tag[*]')
        id_ = jsonpath('$[*].id', resp)

        # POST http://front-end.sock-shop/cart (endp 9)
        with open('data/9/payload_for_endp_9.json', 'r') as json_payload_file:
            json_payload = json.load(json_payload_file)
        apply_into_json(json_payload, '$.id', id_)
        resp = front_end_sock_shop.post('/cart', json=json_payload, headers={'postman-token': postman_token1, 'x-requested-with': 'XMLHttpRequest'})
        resp.assert_status_code(201)

    @json_dataset('data/35/dataset_35.json')
    @clear_session({'spanId': 35})
    def test_035_get_cart(self, data_row):
        amp_cache_transform, postman_token = data_row

        # GET http://front-end.sock-shop/cart (endp 35)
        front_end_sock_shop = get_http_client('http://front-end.sock-shop', authenticate)
        resp = front_end_sock_shop.get('/cart', headers={'amp-cache-transform': amp_cache_transform, 'postman-token': postman_token, 'x-requested-with': 'XMLHttpRequest'})
        resp.assert_status_code(200)
        resp.assert_jsonpath('$[*].id')

    @json_dataset('data/234/dataset_234.json')
    @clear_session({'spanId': 234})
    def test_234_post_cart_update(self, data_row):
        id_, = data_row

        # POST http://front-end.sock-shop/cart/update (endp 234)
        front_end_sock_shop = get_http_client('http://front-end.sock-shop', authenticate)
        with open('data/234/payload_for_endp_234.json', 'r') as json_payload_file:
            json_payload = json.load(json_payload_file)
        apply_into_json(json_payload, '$.id', id_)
        resp = front_end_sock_shop.post('/cart/update', json=json_payload, headers={'x-requested-with': 'XMLHttpRequest'})
        resp.assert_status_code(202)

    @json_dataset('data/11/dataset_11.json')
    @clear_session({'spanId': 11})
    def test_011_get_catalogue(self, data_row):
        amp_cache_transform, postman_token, size, tags = data_row

        # GET http://front-end.sock-shop/catalogue (endp 11)
        front_end_sock_shop = get_http_client('http://front-end.sock-shop', authenticate)
        qstr = '?' + urlencode({'page': '1', 'size': size, 'sort': 'id', 'tags': tags})
        resp = front_end_sock_shop.get('/catalogue' + qstr, headers={'amp-cache-transform': amp_cache_transform, 'postman-token': postman_token, 'x-requested-with': 'XMLHttpRequest'})
        resp.assert_status_code(200)
        resp.assert_jsonpath('$[*].tag[*]')

    @json_dataset('data/199/dataset_199.json')
    @clear_session({'spanId': 199})
    def test_199_get_catalogue(self, data_row):
        size, tags = data_row

        # GET http://front-end.sock-shop/catalogue (endp 199)
        front_end_sock_shop = get_http_client('http://front-end.sock-shop', authenticate)
        qstr = '?' + urlencode({'page': '1', 'size': size, 'tags': tags})
        resp = front_end_sock_shop.get('/catalogue' + qstr, headers={'x-requested-with': 'XMLHttpRequest'})
        resp.assert_status_code(200)

    @json_dataset('data/206/dataset_206.json')
    @clear_session({'spanId': 206})
    def test_206_get_catalogue(self, data_row):
        size, = data_row

        # GET http://front-end.sock-shop/catalogue (endp 206)
        front_end_sock_shop = get_http_client('http://front-end.sock-shop', authenticate)
        qstr = '?' + urlencode({'size': size})
        resp = front_end_sock_shop.get('/catalogue' + qstr, headers={'x-requested-with': 'XMLHttpRequest'})
        resp.assert_status_code(200)

    @json_dataset('data/56/dataset_56.json')
    @clear_session({'spanId': 56})
    def test_056_get_catalogue_id(self, data_row):
        amp_cache_transform, postman_token, postman_token1, size, tags = data_row

        # GET http://front-end.sock-shop/catalogue (endp 11)
        front_end_sock_shop = get_http_client('http://front-end.sock-shop', authenticate)
        qstr = '?' + urlencode({'page': '1', 'size': size, 'sort': 'id', 'tags': tags})
        resp = front_end_sock_shop.get('/catalogue' + qstr, headers={'amp-cache-transform': amp_cache_transform, 'postman-token': postman_token, 'x-requested-with': 'XMLHttpRequest'})
        resp.assert_status_code(200)
        resp.assert_jsonpath('$[*].tag[*]')
        id_ = jsonpath('$[*].id', resp)

        # GET http://front-end.sock-shop/catalogue/{id} (endp 56)
        resp = front_end_sock_shop.get(f'/catalogue/{id_}', headers={'postman-token': postman_token1, 'x-requested-with': 'XMLHttpRequest'})
        resp.assert_status_code(200)
        resp.assert_jsonpath('$.tag[*]')

    @json_dataset('data/36/dataset_36.json')
    @clear_session({'spanId': 36})
    def test_036_get_catalogue_size(self, data_row):
        amp_cache_transform, postman_token, tags = data_row

        # GET http://front-end.sock-shop/catalogue/size (endp 36)
        front_end_sock_shop = get_http_client('http://front-end.sock-shop', authenticate)
        qstr = '?' + urlencode({'tags': tags})
        resp = front_end_sock_shop.get('/catalogue/size' + qstr, headers={'amp-cache-transform': amp_cache_transform, 'postman-token': postman_token, 'x-requested-with': 'XMLHttpRequest'})
        resp.assert_status_code(200)
        resp.assert_jsonpath('$.tag[*]')

    @clear_session({'spanId': 201})
    def test_201_get_catalogue_size(self):
        # GET http://front-end.sock-shop/catalogue/size (endp 201)
        front_end_sock_shop = get_http_client('http://front-end.sock-shop', authenticate)
        qstr = '?' + urlencode({'tags': ''})
        resp = front_end_sock_shop.get('/catalogue/size' + qstr, headers={'x-requested-with': 'XMLHttpRequest'})
        resp.assert_status_code(200)

    @json_dataset('data/12/dataset_12.json')
    @clear_session({'spanId': 12})
    def test_012_get_category_html(self, data_row):
        amp_cache_transform, tags = data_row

        # GET http://front-end.sock-shop/category.html (endp 12)
        front_end_sock_shop = get_http_client('http://front-end.sock-shop', authenticate)
        qstr = '?' + urlencode({'tags': tags})
        resp = front_end_sock_shop.get('/category.html' + qstr, headers={'amp-cache-transform': amp_cache_transform})
        resp.assert_status_code(200)
        resp.assert_cssselect('div#content div.container div div.panel.panel-default.sidebar-menu div.panel-heading h3.panel-title', expected_value='Filters ')

    @clear_session({'spanId': 242})
    def test_242_get_category_html(self):
        # GET http://front-end.sock-shop/category.html (endp 242)
        front_end_sock_shop = get_http_client('http://front-end.sock-shop', authenticate)
        resp = front_end_sock_shop.get('/category.html')
        resp.assert_status_code(206)

    @json_dataset('data/60/dataset_60.json')
    @clear_session({'spanId': 60})
    def test_060_get_customer_order_html(self, data_row):
        order, postman_token = data_row

        # GET http://front-end.sock-shop/customer-order.html (endp 60)
        front_end_sock_shop = get_http_client('http://front-end.sock-shop', authenticate)
        qstr = '?' + urlencode({'order': order})
        resp = front_end_sock_shop.get('/customer-order.html' + qstr, headers={'postman-token': postman_token})
        resp.assert_status_code(200)
        resp.assert_cssselect('div#customer-order div.box h2', expected_value='Order #')

    @json_dataset('data/61/dataset_61.json')
    @clear_session({'spanId': 61})
    def test_061_get_customer_orders_html(self, data_row):
        amp_cache_transform, postman_token = data_row

        # GET http://front-end.sock-shop/customer-orders.html (endp 61)
        front_end_sock_shop = get_http_client('http://front-end.sock-shop', authenticate)
        resp = front_end_sock_shop.get('/customer-orders.html', headers={'amp-cache-transform': amp_cache_transform, 'postman-token': postman_token})
        resp.assert_status_code(200)
        resp.assert_cssselect('div#customer-orders div.box h1', expected_value='My orders')

    @json_dataset('data/224/dataset_224.json')
    @clear_session({'spanId': 224})
    def test_224_get_customers(self, data_row):
        postman_token, = data_row

        # GET http://front-end.sock-shop/customers (endp 224)
        front_end_sock_shop = get_http_client('http://front-end.sock-shop', authenticate)
        resp = front_end_sock_shop.get('/customers', headers={'postman-token': postman_token, 'x-requested-with': 'XMLHttpRequest'})
        resp.assert_status_code(200)
        resp.assert_jsonpath('$._embedded.customer[*]._links.self.href')

    @json_dataset('data/62/dataset_62.json')
    @clear_session({'spanId': 62})
    def test_062_get_customers_customerId(self, data_row):
        postman_token, = data_row

        # GET http://front-end.sock-shop/customers/{customerId} (endp 62)
        front_end_sock_shop = get_http_client('http://front-end.sock-shop', authenticate)
        resp = front_end_sock_shop.get(f"/customers/{str(get_data_from_cookie('logged_in'))}", headers={'postman-token': postman_token, 'x-requested-with': 'XMLHttpRequest'})
        resp.assert_status_code(200)
        resp.assert_jsonpath('$._links.self.href')

    @json_dataset('data/13/dataset_13.json')
    @clear_session({'spanId': 13})
    def test_013_get_detail_html(self, data_row):
        amp_cache_transform, amp_cache_transform1, postman_token, size, tags = data_row

        # GET http://front-end.sock-shop/catalogue (endp 11)
        front_end_sock_shop = get_http_client('http://front-end.sock-shop', authenticate)
        qstr = '?' + urlencode({'page': '1', 'size': size, 'sort': 'id', 'tags': tags})
        resp = front_end_sock_shop.get('/catalogue' + qstr, headers={'amp-cache-transform': amp_cache_transform, 'postman-token': postman_token, 'x-requested-with': 'XMLHttpRequest'})
        resp.assert_status_code(200)
        resp.assert_jsonpath('$[*].tag[*]')
        id_ = jsonpath('$[*].id', resp)

        # GET http://front-end.sock-shop/detail.html (endp 13)
        qstr = '?' + urlencode({'id': id_})
        resp = front_end_sock_shop.get('/detail.html' + qstr, headers={'amp-cache-transform': amp_cache_transform1})
        resp.assert_status_code(200)
        resp.assert_cssselect('div#content div.container div div.row.same-height-row div div.box.same-height h3', expected_value='You may also like these products')

    @clear_session({'spanId': 39})
    def test_039_get_footer_html(self):
        # GET http://front-end.sock-shop/footer.html (endp 39)
        front_end_sock_shop = get_http_client('http://front-end.sock-shop', authenticate)
        resp = front_end_sock_shop.get('/footer.html', headers={'x-requested-with': 'XMLHttpRequest'})
        resp.assert_status_code(200)
        resp.assert_cssselect('div#copyright div.container div p.pull-left a', expected_value='Weaveworks')

    @json_dataset('data/64/dataset_64.json')
    @clear_session({'spanId': 64})
    def test_064_get_index_html(self, data_row):
        amp_cache_transform, findcli, postman_token = data_row

        # GET http://front-end.sock-shop/index.html (endp 64)
        front_end_sock_shop = get_http_client('http://front-end.sock-shop', authenticate)
        qstr = '?' + urlencode({'findcli': findcli})
        resp = front_end_sock_shop.get('/index.html' + qstr, headers={'amp-cache-transform': amp_cache_transform, 'postman-token': postman_token})
        resp.assert_status_code(200)
        resp.assert_cssselect('div#hot div.box div.container div h2', expected_value='Hot this week')

    @clear_session({'spanId': 240})
    def test_240_get_ipinfo_io(self):
        # GET http://front-end.sock-shop/ipinfo.io (endp 240)
        front_end_sock_shop = get_http_client('http://front-end.sock-shop', authenticate)
        resp = front_end_sock_shop.get('/ipinfo.io')
        resp.assert_status_code(200)
        resp.assert_cssselect('div#hot div.box div.container div h2', expected_value='Hot this week')

    @clear_session({'spanId': 41})
    def test_041_get_tags(self):
        # GET http://front-end.sock-shop/tags (endp 41)
        front_end_sock_shop = get_http_client('http://front-end.sock-shop', authenticate)
        resp = front_end_sock_shop.get('/tags', headers={'x-requested-with': 'XMLHttpRequest'})
        resp.assert_status_code(200)

    @json_dataset('data/71/dataset_71.json')
    @clear_session({'spanId': 71})
    def test_071_get_tags(self, data_row):
        amp_cache_transform, postman_token = data_row

        # GET http://front-end.sock-shop/tags (endp 71)
        front_end_sock_shop = get_http_client('http://front-end.sock-shop', authenticate)
        resp = front_end_sock_shop.get('/tags', headers={'amp-cache-transform': amp_cache_transform, 'postman-token': postman_token, 'x-requested-with': 'XMLHttpRequest'})
        resp.assert_status_code(200)
        resp.assert_jsonpath('$.tags[*]')

    @clear_session({'spanId': 42})
    def test_042_get_topbar_html(self):
        # GET http://front-end.sock-shop/topbar.html (endp 42)
        front_end_sock_shop = get_http_client('http://front-end.sock-shop', authenticate)
        resp = front_end_sock_shop.get('/topbar.html', headers={'x-requested-with': 'XMLHttpRequest'})
        resp.assert_status_code(200)
        resp.assert_cssselect('div#top div.container div.offer a.btn.btn-success', expected_value='Offer of the day')

    @clear_session({'spanId': 243})
    def test_243_get_www_99syn_com_index_html(self):
        # GET http://front-end.sock-shop/www.99syn.com/index.html (endp 243)
        front_end_sock_shop = get_http_client('http://front-end.sock-shop', authenticate)
        resp = front_end_sock_shop.get('/www.99syn.com/index.html')
        resp.assert_status_code(200)
        resp.assert_cssselect('div#hot div.box div.container div h2', expected_value='Hot this week')
