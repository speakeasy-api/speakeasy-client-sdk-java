# SDK

## Overview

Speakeasy API: The Speakeasy API allows teams to manage common operations with their APIs

The Speakeasy Platform Documentation
<https://speakeasyapi.dev/docs/>
### Available Operations

* [validateApiKey](#validateapikey) - Validate the current api key.

## validateApiKey

Validate the current api key.

### Example Usage

```java
package hello.world;

import dev.speakeasyapi.javaclientsdk.SDK;
import dev.speakeasyapi.javaclientsdk.models.operations.ValidateApiKeyResponse;
import dev.speakeasyapi.javaclientsdk.models.shared.Security;

public class Application {
    public static void main(String[] args) {
        try {
            SDK sdk = SDK.builder()
                .setSecurity(new Security("molestiae") {{
                    apiKey = "";
                }})
                .build();

            ValidateApiKeyResponse res = sdk.sdk.validateApiKey();

            if (res.statusCode == 200) {
                // handle response
            }
        } catch (Exception e) {
            // handle exception
        }
    }
}
```


### Response

**[dev.speakeasyapi.javaclientsdk.models.operations.ValidateApiKeyResponse](../../models/operations/ValidateApiKeyResponse.md)**

