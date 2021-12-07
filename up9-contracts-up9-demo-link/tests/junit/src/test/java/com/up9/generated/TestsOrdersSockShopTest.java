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
public class TestsOrdersSockShopTest
{
    @ParameterizedTest
    @JsonFileSource(resources = "/88/dataset_88.json")
    public void testGetOrdersSearchCustomerid088(final JsonObject json) throws MalformedURLException, IOException
    {
        final String address = json.getString("address");
        final String card = json.getString("card");
        final String customerId = json.getString("customerId");
        final String items = json.getString("items");
        final String x_b3_parentspanid = json.getString("x_b3_parentspanid");
        final String x_b3_spanid = json.getString("x_b3_spanid");
        final String x_b3_traceid = json.getString("x_b3_traceid");
        final String x_span_name = json.getString("x_span_name");

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
        final String customer = JSONPath("$._links.self.href", response.body().string());

        // POST http://orders.sock-shop/orders (endp 26)
        final HttpTarget ordersSockShop = getHttpClient("http://orders.sock-shop", new Authentication());
        final HttpRequest request2 = new HttpRequest();
        request2.setHeaders(new Hashtable<String, Object>() {{
            put("accept", "application/json");
            put("content-type", "application/json");
        }});
        request2.setJsonBody("26/payload_for_endp_26.json", new Hashtable<String, Object>() {{
            put("$.address", address);
            put("$.card", card);
            put("$.customer", customer);
            put("$.items", items);
        }});
        final Response response2 = ordersSockShop.post(request2, "/orders");
        assertStatusCode(response2.code(), 201);
        assertJSONPath("$.card.ccv", response2.body().string());
        final String custId = JSONPath("$.customerId", response2.body().string());

        // GET http://orders.sock-shop/orders/search/customerId (endp 88)
        final HttpRequest request3 = new HttpRequest();
        request3.setQueryString(new Hashtable<String, Object>() {{
            put("custId", custId);
            put("sort", "date");
        }});
        final Response response3 = ordersSockShop.get(request3, "/orders/search/customerId");
        assertStatusCode(response3.code(), 200);
        assertJSONPath("$._embedded.customerOrders[*]._links.self.href", response3.body().string());
    }
}

