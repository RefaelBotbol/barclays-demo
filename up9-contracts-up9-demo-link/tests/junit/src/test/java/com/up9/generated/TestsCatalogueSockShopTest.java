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
public class TestsCatalogueSockShopTest
{
    @ParameterizedTest
    @JsonFileSource(resources = "/74/dataset_74.json")
    public void testGetCatalogueSize074(final JsonObject json) throws MalformedURLException, IOException
    {
        final String tags = json.getString("tags");

        // GET http://catalogue.sock-shop/catalogue/size (endp 74)
        final HttpTarget catalogueSockShop = getHttpClient("http://catalogue.sock-shop", new Authentication());
        final HttpRequest request = new HttpRequest();
        request.setQueryString(new Hashtable<String, Object>() {{
            put("tags", tags);
        }});
        final Response response = catalogueSockShop.get(request, "/catalogue/size");
        assertStatusCode(response.code(), 200);
    }
}

