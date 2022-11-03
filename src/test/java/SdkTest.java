import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import pkg.models.operations.GetApiQueryParams;
import pkg.models.operations.GetApisOp;
import pkg.models.operations.GetApisRequest;
import pkg.models.shared.SchemeApiKey;
import pkg.models.shared.Security;

import java.util.*;
import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.time.Duration;
import java.util.Map;

class SdkTest {
    @Test
    @DisplayName("Create the sdk and make a call")
    void createTheSdkAndMakeACall() {
        Sdk sdk = new Sdk.SdkBuilder().withSecurity(new Security(new SchemeApiKey("myKey")))
            .withServers(new String[] {"www.abc.com"})
            .build();

        sdk.getApis(new GetApisRequest(new GetApiQueryParams(
            Map.of("test-label-key",
                List.of("test-label-value")), new GetApisOp(true)
        )));

    }
}