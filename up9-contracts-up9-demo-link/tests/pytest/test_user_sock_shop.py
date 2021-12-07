from up9lib import *
from authentication import authenticate

# logging.basicConfig(level=logging.DEBUG)


@data_driven_tests
class Tests_user_sock_shop(unittest.TestCase):

    @json_dataset('data/28/dataset_28.json')
    @clear_session({'spanId': 28})
    def test_028_get_addresses_addresseId(self, data_row):
        addresseId, x_b3_parentspanid, x_b3_spanid, x_b3_traceid, x_span_name = data_row

        # GET http://user.sock-shop/addresses/{addresseId} (endp 28)
        user_sock_shop = get_http_client('http://user.sock-shop', authenticate)
        resp = user_sock_shop.get(f'/addresses/{addresseId}', headers={'accept': 'application/hal+json', 'x-b3-parentspanid': x_b3_parentspanid, 'x-b3-sampled': '1', 'x-b3-spanid': x_b3_spanid, 'x-b3-traceid': x_b3_traceid, 'x-span-name': x_span_name})
        resp.assert_status_code(200)
        resp.assert_jsonpath('$._links.self.href')

    @json_dataset('data/29/dataset_29.json')
    @clear_session({'spanId': 29})
    def test_029_get_cards_cardId(self, data_row):
        cardId, x_b3_parentspanid, x_b3_spanid, x_b3_traceid, x_span_name = data_row

        # GET http://user.sock-shop/cards/{cardId} (endp 29)
        user_sock_shop = get_http_client('http://user.sock-shop', authenticate)
        resp = user_sock_shop.get(f'/cards/{cardId}', headers={'accept': 'application/hal+json', 'x-b3-parentspanid': x_b3_parentspanid, 'x-b3-sampled': '1', 'x-b3-spanid': x_b3_spanid, 'x-b3-traceid': x_b3_traceid, 'x-span-name': x_span_name})
        resp.assert_status_code(200)
        resp.assert_jsonpath('$._links.card.href')

    @clear_session({'spanId': 222})
    def test_222_get_customers(self):
        # GET http://user.sock-shop/customers (endp 222)
        user_sock_shop = get_http_client('http://user.sock-shop', authenticate)
        resp = user_sock_shop.get('/customers')
        resp.assert_status_code(200)
        resp.assert_jsonpath('$._embedded.customer[*]._links.self.href')

    @json_dataset('data/19/dataset_19.json')
    @clear_session({'spanId': 19})
    def test_019_get_customers_customerId(self, data_row):
        customerId, x_b3_parentspanid, x_b3_spanid, x_b3_traceid, x_span_name = data_row

        # GET http://user.sock-shop/customers/{customerId} (endp 19)
        user_sock_shop = get_http_client('http://user.sock-shop', authenticate)
        resp = user_sock_shop.get(f'/customers/{customerId}', headers={'accept': 'application/hal+json', 'x-b3-parentspanid': x_b3_parentspanid, 'x-b3-sampled': '1', 'x-b3-spanid': x_b3_spanid, 'x-b3-traceid': x_b3_traceid, 'x-span-name': x_span_name})
        resp.assert_status_code(200)
        resp.assert_jsonpath('$._links.self.href')

    @json_dataset('data/20/dataset_20.json')
    @clear_session({'spanId': 20})
    def test_020_get_customers_customerId_addresses(self, data_row):
        customerId, = data_row

        # GET http://user.sock-shop/customers/{customerId}/addresses (endp 20)
        user_sock_shop = get_http_client('http://user.sock-shop', authenticate)
        resp = user_sock_shop.get(f'/customers/{customerId}/addresses')
        resp.assert_status_code(200)
        resp.assert_jsonpath('$._embedded.address[*]._links.self.href')

    @json_dataset('data/21/dataset_21.json')
    @clear_session({'spanId': 21})
    def test_021_get_customers_customerId_cards(self, data_row):
        customerId, = data_row

        # GET http://user.sock-shop/customers/{customerId}/cards (endp 21)
        user_sock_shop = get_http_client('http://user.sock-shop', authenticate)
        resp = user_sock_shop.get(f'/customers/{customerId}/cards')
        resp.assert_status_code(200)
        resp.assert_jsonpath('$._embedded.card[*]._links.card.href')
