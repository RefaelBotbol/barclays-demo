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
public class TestsShippingSockShopTest
{
    @ParameterizedTest
    @JsonFileSource(resources = "/33/dataset_33.json")
    public void testPostShipping033(final JsonObject json) throws MalformedURLException, IOException
    {
        final String name = json.getString("name");
        final String x_b3_parentspanid = json.getString("x_b3_parentspanid");
        final String x_b3_spanid = json.getString("x_b3_spanid");
        final String x_b3_traceid = json.getString("x_b3_traceid");

        // POST http://shipping.sock-shop/shipping (endp 33)
        final HttpTarget shippingSockShop = getHttpClient("http://shipping.sock-shop", new Authentication());
        final HttpRequest request = new HttpRequest();
        request.setHeaders(new Hashtable<String, Object>() {{
            put("accept", "application/json");
            put("content-type", "application/json");
            put("x-b3-parentspanid", x_b3_parentspanid);
            put("x-b3-sampled", "1");
            put("x-b3-spanid", x_b3_spanid);
            put("x-b3-traceid", x_b3_traceid);
            put("x-span-name", "http:/shipping");
        }});
        request.setJsonBody("33/payload_for_endp_33.json", new Hashtable<String, Object>() {{
            put("$.id", uuidv4());
            put("$.name", name);
        }});
        final Response response = shippingSockShop.post(request, "/shipping");
        assertStatusCode(response.code(), 201);
        assertJSONPath("$.id", response.body().string());
    }
}

