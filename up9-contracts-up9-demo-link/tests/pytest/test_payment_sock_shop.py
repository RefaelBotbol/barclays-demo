from up9lib import *
from authentication import authenticate

# logging.basicConfig(level=logging.DEBUG)


@data_driven_tests
class Tests_payment_sock_shop(unittest.TestCase):

    @json_dataset('data/15/dataset_15.json')
    @clear_session({'spanId': 15})
    def test_015_post_paymentAuth(self, data_row):
        addresseId, cardId, city, customerId, longNum, number, x_b3_parentspanid, x_b3_parentspanid1, x_b3_parentspanid2, x_b3_parentspanid3, x_b3_spanid, x_b3_spanid1, x_b3_spanid2, x_b3_spanid3, x_b3_traceid, x_b3_traceid1, x_b3_traceid2, x_b3_traceid3, x_span_name, x_span_name1, x_span_name2 = data_row

        # GET http://user.sock-shop/customers/{customerId} (endp 19)
        user_sock_shop = get_http_client('http://user.sock-shop', authenticate)
        resp = user_sock_shop.get(f'/customers/{customerId}', headers={'accept': 'application/hal+json', 'x-b3-parentspanid': x_b3_parentspanid, 'x-b3-sampled': '1', 'x-b3-spanid': x_b3_spanid, 'x-b3-traceid': x_b3_traceid, 'x-span-name': x_span_name})
        resp.assert_status_code(200)
        resp.assert_jsonpath('$._links.self.href')
        firstName = jsonpath('$.firstName', resp)
        lastName = jsonpath('$.lastName', resp)
        username = jsonpath('$.username', resp)

        # GET http://user.sock-shop/addresses/{addresseId} (endp 28)
        resp = user_sock_shop.get(f'/addresses/{addresseId}', headers={'accept': 'application/hal+json', 'x-b3-parentspanid': x_b3_parentspanid1, 'x-b3-sampled': '1', 'x-b3-spanid': x_b3_spanid1, 'x-b3-traceid': x_b3_traceid1, 'x-span-name': x_span_name1})
        resp.assert_status_code(200)
        resp.assert_jsonpath('$._links.self.href')
        country = jsonpath('$.country', resp)
        postcode = jsonpath('$.postcode', resp)
        street = jsonpath('$.street', resp)

        # GET http://user.sock-shop/cards/{cardId} (endp 29)
        resp = user_sock_shop.get(f'/cards/{cardId}', headers={'accept': 'application/hal+json', 'x-b3-parentspanid': x_b3_parentspanid2, 'x-b3-sampled': '1', 'x-b3-spanid': x_b3_spanid2, 'x-b3-traceid': x_b3_traceid2, 'x-span-name': x_span_name2})
        resp.assert_status_code(200)
        resp.assert_jsonpath('$._links.card.href')
        ccv = jsonpath('$.ccv', resp)
        expires = jsonpath('$.expires', resp)

        # POST http://payment.sock-shop/paymentAuth (endp 15)
        payment_sock_shop = get_http_client('http://payment.sock-shop', authenticate)
        with open('data/15/payload_for_endp_15.json', 'r') as json_payload_file:
            json_payload = json.load(json_payload_file)
        apply_into_json(json_payload, '$.address.city', city)
        apply_into_json(json_payload, '$.address.country', country)
        apply_into_json(json_payload, '$.address.number', number)
        apply_into_json(json_payload, '$.address.postcode', postcode)
        apply_into_json(json_payload, '$.address.street', street)
        apply_into_json(json_payload, '$.amount', float(random.uniform(4.99, 414.87)))
        apply_into_json(json_payload, '$.card.ccv', ccv)
        apply_into_json(json_payload, '$.card.expires', expires)
        apply_into_json(json_payload, '$.card.longNum', longNum)
        apply_into_json(json_payload, '$.customer.firstName', firstName)
        apply_into_json(json_payload, '$.customer.lastName', lastName)
        apply_into_json(json_payload, '$.customer.username', username)
        resp = payment_sock_shop.post('/paymentAuth', json=json_payload, headers={'accept': 'application/json', 'x-b3-parentspanid': x_b3_parentspanid3, 'x-b3-sampled': '1', 'x-b3-spanid': x_b3_spanid3, 'x-b3-traceid': x_b3_traceid3, 'x-span-name': 'http:/paymentAuth'})
        resp.assert_status_code(200)
        resp.assert_jsonpath('$.message')
