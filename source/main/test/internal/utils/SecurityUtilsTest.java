package internal.utils;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import pkg.models.shared.security.SchemeApiKey;
import pkg.models.shared.security.Security;

import java.util.Collections;
import java.util.Map;

import static internal.utils.SecurityUtils.createSecurityClient;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

class SecurityUtilsTest {

    @Test
    @DisplayName("Create SecurityClient should parse security metadata annotation")
    void createSecurityClientShouldParseSecurityMetadataAnnotation() {
        SecurityClient actual = createSecurityClient(new Security(new SchemeApiKey("myKey")));
        assertNotNull(actual.getClient());
        assertEquals(Map.of("x-api-key", "myKey"), actual.getHeaders());
        assertEquals(actual.getQueryParams(), Collections.emptyMap());
    }



}