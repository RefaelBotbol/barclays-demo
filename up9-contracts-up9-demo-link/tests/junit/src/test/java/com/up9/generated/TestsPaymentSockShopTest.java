package com.up9.generated;

import com.up9.generated.Authentication;
import com.up9.up9lib.HttpRequest;
import com.up9.up9lib.HttpTarget;
import java.io.IOException;
import java.net.MalformedURLException;
import java.util.Hashtable;
import javax.json.JsonObject;
import net.joshka.junit.json.params.JsonFileSource;
import okhttp3.Response;
import org.junit.jupiter.api.MethodOrderer.Alphanumeric;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;
import org.junit.jupiter.params.ParameterizedTest;
import static com.up9.up9lib.Common.*;

@TestMethodOrder(Alphanumeric.class)
public class TestsPaymentSockShopTest
{
    @ParameterizedTest
    @JsonFileSource(resources = "/15/dataset_15.json")
    public void testPostPaymentauth015(final JsonObject json) throws MalformedURLException, IOException
    {
        final String addresseId = json.getString("addresseId");
        final String cardId = json.getString("cardId");
        final String city = json.getString("city");
        final String customerId = json.getString("customerId");
        final String longNum = json.getString("longNum");
        final String number = json.getString("number");
        final String x_b3_parentspanid = json.getString("x_b3_parentspanid");
        final String x_b3_parentspanid1 = json.getString("x_b3_parentspanid1");
        final String x_b3_parentspanid2 = json.getString("x_b3_parentspanid2");
        final String x_b3_parentspanid3 = json.getString("x_b3_parentspanid3");
        final String x_b3_spanid = json.getString("x_b3_spanid");
        final String x_b3_spanid1 = json.getString("x_b3_spanid1");
        final String x_b3_spanid2 = json.getString("x_b3_spanid2");
        final String x_b3_spanid3 = json.getString("x_b3_spanid3");
        final String x_b3_traceid = json.getString("x_b3_traceid");
        final String x_b3_traceid1 = json.getString("x_b3_traceid1");
        final String x_b3_traceid2 = json.getString("x_b3_traceid2");
        final String x_b3_traceid3 = json.getString("x_b3_traceid3");
        final String x_span_name = json.getString("x_span_name");
        final String x_span_name1 = json.getString("x_span_name1");
        final String x_span_name2 = json.getString("x_span_name2");

        // GET http://user.sock-shop/customers/{customerId} (endp 19)
        final HttpTarget userSockShop = getHttpClient("http://user.sock-shop", new Authentication());
        final HttpRequest request = new HttpRequest();
        request.setHeaders(new Hashtable<String, Object>() {{
            put("accept", "application/hal+json");
            put("x-b3-parentspanid", x_b3_parentspanid);
            put("x-b3-sampled", "1");
            put("x-b3-spanid", x_b3_spanid);
            put("x-b3-traceid", x_b3_traceid);
            put("x-span-name", x_span_name);
        }});
        final Response response = userSockShop.get(request, "/customers/" + customerId);
        assertStatusCode(response.code(), 200);
        assertJSONPath("$._links.self.href", response.body().string());
        final String firstName = JSONPath("$.firstName", response.body().string());
        final String lastName = JSONPath("$.lastName", response.body().string());
        final String username = JSONPath("$.username", response.body().string());

        // GET http://user.sock-shop/addresses/{addresseId} (endp 28)
        final HttpRequest request2 = new HttpRequest();
        request2.setHeaders(new Hashtable<String, Object>() {{
            put("accept", "application/hal+json");
            put("x-b3-parentspanid", x_b3_parentspanid1);
            put("x-b3-sampled", "1");
            put("x-b3-spanid", x_b3_spanid1);
            put("x-b3-traceid", x_b3_traceid1);
            put("x-span-name", x_span_name1);
        }});
        final Response response2 = userSockShop.get(request2, "/addresses/" + addresseId);
        assertStatusCode(response2.code(), 200);
        assertJSONPath("$._links.self.href", response2.body().string());
        final String country = JSONPath("$.country", response2.body().string());
        final String postcode = JSONPath("$.postcode", response2.body().string());
        final String street = JSONPath("$.street", response2.body().string());

        // GET http://user.sock-shop/cards/{cardId} (endp 29)
        final HttpRequest request3 = new HttpRequest();
        request3.setHeaders(new Hashtable<String, Object>() {{
            put("accept", "application/hal+json");
            put("x-b3-parentspanid", x_b3_parentspanid2);
            put("x-b3-sampled", "1");
            put("x-b3-spanid", x_b3_spanid2);
            put("x-b3-traceid", x_b3_traceid2);
            put("x-span-name", x_span_name2);
        }});
        final Response response3 = userSockShop.get(request3, "/cards/" + cardId);
        assertStatusCode(response3.code(), 200);
        assertJSONPath("$._links.card.href", response3.body().string());
        final String ccv = JSONPath("$.ccv", response3.body().string());
        final String expires = JSONPath("$.expires", response3.body().string());

        // POST http://payment.sock-shop/paymentAuth (endp 15)
        final HttpTarget paymentSockShop = getHttpClient("http://payment.sock-shop", new Authentication());
        final HttpRequest request4 = new HttpRequest();
        request4.setHeaders(new Hashtable<String, Object>() {{
            put("accept", "application/json");
            put("content-type", "application/json");
            put("x-b3-parentspanid", x_b3_parentspanid3);
            put("x-b3-sampled", "1");
            put("x-b3-spanid", x_b3_spanid3);
            put("x-b3-traceid", x_b3_traceid3);
            put("x-span-name", "http:/paymentAuth");
        }});
        request4.setJsonBody("15/payload_for_endp_15.json", new Hashtable<String, Object>() {{
            put("$.address.city", city);
            put("$.address.country", country);
            put("$.address.number", number);
            put("$.address.postcode", postcode);
            put("$.address.street", street);
            put("$.amount", randomFloat(4.99f, 414.87f));
            put("$.card.ccv", ccv);
            put("$.card.expires", expires);
            put("$.card.longNum", longNum);
            put("$.customer.firstName", firstName);
            put("$.customer.lastName", lastName);
            put("$.customer.username", username);
        }});
        final Response response4 = paymentSockShop.post(request4, "/paymentAuth");
        assertStatusCode(response4.code(), 200);
        assertJSONPath("$.message", response4.body().string());
    }
}

