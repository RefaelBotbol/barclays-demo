from up9lib import *
from authentication import authenticate

# logging.basicConfig(level=logging.DEBUG)


@data_driven_tests
class Tests_catalogue_sock_shop(unittest.TestCase):

    @json_dataset('data/17/dataset_17.json')
    @clear_session({'spanId': 17})
    def test_017_get_catalogue(self, data_row):
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

    @json_dataset('data/18/dataset_18.json')
    @clear_session({'spanId': 18})
    def test_018_get_catalogue_id(self, data_row):
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
        id_ = jsonpath('$[*].id', resp)

        # GET http://catalogue.sock-shop/catalogue/{id} (endp 18)
        resp = catalogue_sock_shop.get(f'/catalogue/{id_}')
        resp.assert_status_code(200)

    @json_dataset('data/74/dataset_74.json')
    @clear_session({'spanId': 74})
    def test_074_get_catalogue_size(self, data_row):
        tags, = data_row

        # GET http://catalogue.sock-shop/catalogue/size (endp 74)
        catalogue_sock_shop = get_http_client('http://catalogue.sock-shop', authenticate)
        qstr = '?' + urlencode({'tags': tags})
        resp = catalogue_sock_shop.get('/catalogue/size' + qstr)
        resp.assert_status_code(200)

    @clear_session({'spanId': 76})
    def test_076_get_tags(self):
        # GET http://catalogue.sock-shop/tags (endp 76)
        catalogue_sock_shop = get_http_client('http://catalogue.sock-shop', authenticate)
        resp = catalogue_sock_shop.get('/tags')
        resp.assert_status_code(200)
        resp.assert_jsonpath('$.tags[*]')
