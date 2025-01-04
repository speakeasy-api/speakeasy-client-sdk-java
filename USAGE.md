<!-- Start SDK Example Usage [usage] -->
```java
package hello.world;

import dev.speakeasyapi.javaclientsdk.RyanTest;
import dev.speakeasyapi.javaclientsdk.models.errors.Error;
import dev.speakeasyapi.javaclientsdk.models.operations.CreateRemoteSourceResponse;
import dev.speakeasyapi.javaclientsdk.models.shared.RemoteDocument;
import dev.speakeasyapi.javaclientsdk.models.shared.RemoteSource;
import dev.speakeasyapi.javaclientsdk.models.shared.Security;
import java.lang.Exception;
import java.util.List;

public class Application {

    public static void main(String[] args) throws Error, Exception {

        RyanTest sdk = RyanTest.builder()
                .security(Security.builder()
                    .apiKey("<YOUR_API_KEY_HERE>")
                    .build())
            .build();

        RemoteSource req = RemoteSource.builder()
                .inputs(List.of(
                    RemoteDocument.builder()
                        .registryUrl("https://productive-swine.net")
                        .build()))
                .output(RemoteDocument.builder()
                    .registryUrl("https://spiteful-apricot.info")
                    .build())
                .build();

        CreateRemoteSourceResponse res = sdk.artifacts().createRemoteSource()
                .request(req)
                .call();

        // handle response
    }
}
```
<!-- End SDK Example Usage [usage] -->