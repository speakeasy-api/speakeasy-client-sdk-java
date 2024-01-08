<!-- Start SDK Example Usage [usage] -->
```java
package hello.world;

import dev.speakeasyapi.javaclientsdk.SDK;
import dev.speakeasyapi.javaclientsdk.models.operations.GetApisRequest;
import dev.speakeasyapi.javaclientsdk.models.operations.GetApisResponse;
import dev.speakeasyapi.javaclientsdk.models.operations.QueryParamOp;
import dev.speakeasyapi.javaclientsdk.models.shared.Security;

public class Application {
    public static void main(String[] args) {
        try {
            SDK sdk = SDK.builder()
                .setSecurity(new Security(
                "string"){{
                    apiKey = "<YOUR_API_KEY_HERE>";
                }})
                .build();

            dev.speakeasyapi.javaclientsdk.models.operations.GetApisRequest req = new GetApisRequest(
){{
                metadata = new java.util.HashMap<String, String[]>(
                ){{
                    put("key", new String[]{{
                        add("string"),
                    }});
                }};
                op = new QueryParamOp(
                    false);

            }};

            dev.speakeasyapi.javaclientsdk.models.operations.GetApisResponse res = sdk.apis.getApis(req);

            if (res.classes != null) {
                // handle response
            }
        } catch (Exception e) {
            // handle exception
        }
    }
}
```
<!-- End SDK Example Usage [usage] -->