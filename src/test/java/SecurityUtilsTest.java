import internal.utils.SecurityClient;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import pkg.models.shared.SchemeApiKey;
import pkg.models.shared.Security;

import java.util.*;
import java.net.URI;
import java.util.Collections;
import java.util.Map;

import static internal.utils.Security.createSecurityClient;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

class SecurityUtilsTest {

    @Test
    @DisplayName("Create SecurityClient should parse security metadata annotation")
    void createSecurityClientShouldParseSecurityMetadataAnnotation() {
        SecurityClient securityClient = createSecurityClient(new Security(new SchemeApiKey("myKey")));
        assertNotNull(securityClient.getClient());
        assertEquals(Map.of("x-api-key", "myKey"), securityClient.getHeaders());
        assertEquals(Collections.emptyMap(), securityClient.getQueryParams());
        assertEquals(Map.of("x-api-key", List.of("myKey")), securityClient.getRequestBuilder().uri(URI.create("https://www.speakeasyapi.dev")).build().headers().map());
    }



}