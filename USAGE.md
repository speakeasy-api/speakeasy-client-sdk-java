<!-- Start SDK Example Usage [usage] -->
```java
package hello.world;

import dev.speakeasyapi.javaclientsdk.ChaseTest;
import dev.speakeasyapi.javaclientsdk.models.errors.Error;
import dev.speakeasyapi.javaclientsdk.models.operations.GetApisRequest;
import dev.speakeasyapi.javaclientsdk.models.operations.GetApisResponse;
import dev.speakeasyapi.javaclientsdk.models.shared.Security;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws Error, Exception {

        ChaseTest sdk = ChaseTest.builder()
                .security(Security.builder()
                    .apiKey("<YOUR_API_KEY_HERE>")
                    .build())
            .build();

        GetApisRequest req = GetApisRequest.builder()
                .build();

        GetApisResponse res = sdk.apis().getApis()
                .request(req)
                .call();

        if (res.apis().isPresent()) {
            // handle response
        }
    }
}
```
<!-- End SDK Example Usage [usage] -->