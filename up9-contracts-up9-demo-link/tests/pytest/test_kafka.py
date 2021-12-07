from up9lib import *
from authentication import authenticate

# logging.basicConfig(level=logging.DEBUG)


@data_driven_tests
class Tests_kafka(unittest.TestCase):

    @json_dataset('data/16/dataset_16.json')
    @clear_session({'spanId': 16})
    def test_016_put_shipping_task(self, data_row):
        name, = data_row

        # PUT kafka://kafka/shipping-task (endp 16)
        kafka = Kafka('TARGET_KAFKA')
        with open('data/16/payload_for_endp_16.json', 'r') as json_payload_file:
            json_payload = json.load(json_payload_file)
        apply_into_json(json_payload, '$.id', str(uuid.uuid4()))
        apply_into_json(json_payload, '$.name', name)
        resp = kafka.put('/shipping-task', json=json_payload)

    @clear_session({'spanId': 149})
    def test_149_put_shipping_task(self):
        # PUT kafka://kafka/shipping-task (endp 149)
        kafka = Kafka('TARGET_KAFKA')
        with open('data/149/payload_for_endp_149.txt', 'r') as payload_file:
            payload = payload_file.read()
        resp = kafka.put('/shipping-task', data=payload)
