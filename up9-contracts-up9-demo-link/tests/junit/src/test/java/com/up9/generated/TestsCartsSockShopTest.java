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
public class TestsCartsSockShopTest
{
    @ParameterizedTest
    @JsonFileSource(resources = "/24/dataset_24.json")
    public void testPostCartsCustomeridItems024(final JsonObject json) throws MalformedURLException, IOException
    {
        final String customerId = json.getString("customerId");
        final String size = json.getString("size");

        // GET http://catalogue.sock-shop/tags (endp 76)
        final HttpTarget catalogueSockShop = getHttpClient("http://catalogue.sock-shop", new Authentication());
        final HttpRequest request = new HttpRequest();
        final Response response = catalogueSockShop.get(request, "/tags");
        assertStatusCode(response.code(), 200);
        assertJSONPath("$.tags[*]", response.body().string());
        final String tags = JSONPath("$.tags[*]", response.body().string());

        // GET http://catalogue.sock-shop/catalogue (endp 17)
        final HttpRequest request2 = new HttpRequest();
        request2.setQueryString(new Hashtable<String, Object>() {{
            put("page", "1");
            put("size", size);
            put("sort", "id");
            put("tags", tags);
        }});
        final Response response2 = catalogueSockShop.get(request2, "/catalogue");
        assertStatusCode(response2.code(), 200);
        assertJSONPath("$[*].tag[*]", response2.body().string());
        final String itemId = JSONPath("$[*].id", response2.body().string());
        final String id = JSONPath("$[*].id", response2.body().string());

        // GET http://catalogue.sock-shop/catalogue/{id} (endp 18)
        final HttpRequest request3 = new HttpRequest();
        final Response response3 = catalogueSockShop.get(request3, "/catalogue/" + id);
        assertStatusCode(response3.code(), 200);
        final String unitPrice = JSONPath("$.price", response3.body().string());

        // POST http://carts.sock-shop/carts/{customerId}/items (endp 24)
        final HttpTarget cartsSockShop = getHttpClient("http://carts.sock-shop", new Authentication());
        final HttpRequest request4 = new HttpRequest();
        request4.setHeaders(new Hashtable<String, Object>() {{
            put("accept", "application/json");
            put("content-type", "application/json");
        }});
        request4.setJsonBody("24/payload_for_endp_24.json", new Hashtable<String, Object>() {{
            put("$.itemId", itemId);
            put("$.unitPrice", unitPrice);
        }});
        final Response response4 = cartsSockShop.post(request4, "/carts/" + customerId + "/items");
        assertStatusCode(response4.code(), 201);
        assertJSONPath("$.id", response4.body().string());
    }

    @ParameterizedTest
    @JsonFileSource(resources = "/31/dataset_31.json")
    public void testGetCartsCustomeridItems031(final JsonObject json) throws MalformedURLException, IOException
    {
        final String customerId = json.getString("customerId");
        final String x_b3_parentspanid = json.getString("x_b3_parentspanid");
        final String x_b3_spanid = json.getString("x_b3_spanid");
        final String x_b3_traceid = json.getString("x_b3_traceid");
        final String x_span_name = json.getString("x_span_name");

        // GET http://carts.sock-shop/carts/{customerId}/items (endp 31)
        final HttpTarget cartsSockShop = getHttpClient("http://carts.sock-shop", new Authentication());
        final HttpRequest request = new HttpRequest();
        request.setHeaders(new Hashtable<String, Object>() {{
            put("accept", "application/json");
            put("x-b3-parentspanid", x_b3_parentspanid);
            put("x-b3-sampled", "1");
            put("x-b3-spanid", x_b3_spanid);
            put("x-b3-traceid", x_b3_traceid);
            put("x-span-name", x_span_name);
        }});
        final Response response = cartsSockShop.get(request, "/carts/" + customerId + "/items");
        assertStatusCode(response.code(), 200);
        assertJSONPath("$[*].id", response.body().string());
    }

    @ParameterizedTest
    @JsonFileSource(resources = "/25/dataset_25.json")
    public void testGetCartsCustomeridMerge025(final JsonObject json) throws MalformedURLException, IOException
    {
        final String customerId = json.getString("customerId");
        final String sessionId = json.getString("sessionId");

        // GET http://carts.sock-shop/carts/{customerId}/merge (endp 25)
        final HttpTarget cartsSockShop = getHttpClient("http://carts.sock-shop", new Authentication());
        final HttpRequest request = new HttpRequest();
        request.setQueryString(new Hashtable<String, Object>() {{
            put("sessionId", sessionId);
        }});
        final Response response = cartsSockShop.get(request, "/carts/" + customerId + "/merge");
        assertStatusCode(response.code(), 202);
    }

    @ParameterizedTest
    @JsonFileSource(resources = "/123/dataset_123.json")
    public void testGetCartsCustomeridMerge123(final JsonObject json) throws MalformedURLException, IOException
    {
        final String customerId = json.getString("customerId");
        final String sessionId = json.getString("sessionId");

        // GET http://carts.sock-shop/carts/{customerId}/merge (endp 123)
        final HttpTarget cartsSockShop = getHttpClient("http://carts.sock-shop", new Authentication());
        final HttpRequest request = new HttpRequest();
        request.setQueryString(new Hashtable<String, Object>() {{
            put("sessionId", sessionId);
        }});
        final Response response = cartsSockShop.get(request, "/carts/" + customerId + "/merge");
        assertStatusCode(response.code(), 202);
    }

    @Test
    public void testGetCartsXgsbdrpaoqfokjglqgckj33lqffzhstlItems251() throws MalformedURLException, IOException
    {
        // GET http://carts.sock-shop/carts/xGsbdrPaoqfokjGLQgckj33LqFFZhSTL/items (endp 251)
        final HttpTarget cartsSockShop = getHttpClient("http://carts.sock-shop", new Authentication());
        final HttpRequest request = new HttpRequest();
        final Response response = cartsSockShop.get(request, "/carts/xGsbdrPaoqfokjGLQgckj33LqFFZhSTL/items");
        assertStatusCode(response.code(), 200);
        assertJSONPath("$[*].id", response.body().string());
    }

    @ParameterizedTest
    @JsonFileSource(resources = "/262/dataset_262.json")
    public void testPostCartsXgsbdrpaoqfokjglqgckj33lqffzhstlItems262(final JsonObject json) throws MalformedURLException, IOException
    {
        final String size = json.getString("size");

        // GET http://catalogue.sock-shop/tags (endp 76)
        final HttpTarget catalogueSockShop = getHttpClient("http://catalogue.sock-shop", new Authentication());
        final HttpRequest request = new HttpRequest();
        final Response response = catalogueSockShop.get(request, "/tags");
        assertStatusCode(response.code(), 200);
        assertJSONPath("$.tags[*]", response.body().string());
        final String tags = JSONPath("$.tags[*]", response.body().string());

        // GET http://catalogue.sock-shop/catalogue (endp 17)
        final HttpRequest request2 = new HttpRequest();
        request2.setQueryString(new Hashtable<String, Object>() {{
            put("page", "1");
            put("size", size);
            put("sort", "id");
            put("tags", tags);
        }});
        final Response response2 = catalogueSockShop.get(request2, "/catalogue");
        assertStatusCode(response2.code(), 200);
        assertJSONPath("$[*].tag[*]", response2.body().string());
        final String itemId = JSONPath("$[*].id", response2.body().string());
        final String id = JSONPath("$[*].id", response2.body().string());

        // GET http://catalogue.sock-shop/catalogue/{id} (endp 18)
        final HttpRequest request3 = new HttpRequest();
        final Response response3 = catalogueSockShop.get(request3, "/catalogue/" + id);
        assertStatusCode(response3.code(), 200);
        final String unitPrice = JSONPath("$.price", response3.body().string());

        // POST http://carts.sock-shop/carts/xGsbdrPaoqfokjGLQgckj33LqFFZhSTL/items (endp 262)
        final HttpTarget cartsSockShop = getHttpClient("http://carts.sock-shop", new Authentication());
        final HttpRequest request4 = new HttpRequest();
        request4.setHeaders(new Hashtable<String, Object>() {{
            put("accept", "application/json");
            put("content-type", "application/json");
        }});
        request4.setJsonBody("262/payload_for_endp_262.json", new Hashtable<String, Object>() {{
            put("$.itemId", itemId);
            put("$.unitPrice", unitPrice);
        }});
        final Response response4 = cartsSockShop.post(request4, "/carts/xGsbdrPaoqfokjGLQgckj33LqFFZhSTL/items");
        assertStatusCode(response4.code(), 201);
        assertJSONPath("$.id", response4.body().string());
    }
}

