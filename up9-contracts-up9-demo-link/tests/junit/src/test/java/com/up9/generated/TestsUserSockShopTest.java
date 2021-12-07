package com.up9.generated;

import com.up9.generated.Authentication;
import com.up9.up9lib.HttpRequest;
import com.up9.up9lib.HttpTarget;
import java.io.IOException;
import java.net.MalformedURLException;
import javax.json.JsonObject;
import net.joshka.junit.json.params.JsonFileSource;
import okhttp3.Response;
import org.junit.jupiter.api.MethodOrderer.Alphanumeric;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;
import org.junit.jupiter.params.ParameterizedTest;
import static com.up9.up9lib.Common.*;

@TestMethodOrder(Alphanumeric.class)
public class TestsUserSockShopTest
{
    @Test
    public void testGetCustomers222() throws MalformedURLException, IOException
    {
        // GET http://user.sock-shop/customers (endp 222)
        final HttpTarget userSockShop = getHttpClient("http://user.sock-shop", new Authentication());
        final HttpRequest request = new HttpRequest();
        final Response response = userSockShop.get(request, "/customers");
        assertStatusCode(response.code(), 200);
        assertJSONPath("$._embedded.customer[*]._links.self.href", response.body().string());
    }

    @ParameterizedTest
    @JsonFileSource(resources = "/20/dataset_20.json")
    public void testGetCustomersCustomeridAddresses020(final JsonObject json) throws MalformedURLException, IOException
    {
        final String customerId = json.getString("customerId");

        // GET http://user.sock-shop/customers/{customerId}/addresses (endp 20)
        final HttpTarget userSockShop = getHttpClient("http://user.sock-shop", new Authentication());
        final HttpRequest request = new HttpRequest();
        final Response response = userSockShop.get(request, "/customers/" + customerId + "/addresses");
        assertStatusCode(response.code(), 200);
        assertJSONPath("$._embedded.address[*]._links.self.href", response.body().string());
    }

    @ParameterizedTest
    @JsonFileSource(resources = "/21/dataset_21.json")
    public void testGetCustomersCustomeridCards021(final JsonObject json) throws MalformedURLException, IOException
    {
        final String customerId = json.getString("customerId");

        // GET http://user.sock-shop/customers/{customerId}/cards (endp 21)
        final HttpTarget userSockShop = getHttpClient("http://user.sock-shop", new Authentication());
        final HttpRequest request = new HttpRequest();
        final Response response = userSockShop.get(request, "/customers/" + customerId + "/cards");
        assertStatusCode(response.code(), 200);
        assertJSONPath("$._embedded.card[*]._links.card.href", response.body().string());
    }
}

