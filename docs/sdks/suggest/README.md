# Suggest
(*suggest()*)

## Overview

REST APIs for managing LLM OAS suggestions

### Available Operations

* [suggest](#suggest) - Generate suggestions for improving an OpenAPI document.
* [suggestItems](#suggestitems) - Generate generic suggestions for a list of items.
* [suggestOpenAPI](#suggestopenapi) - (DEPRECATED) Generate suggestions for improving an OpenAPI document.
* [suggestOpenAPIRegistry](#suggestopenapiregistry) - Generate suggestions for improving an OpenAPI document stored in the registry.

## suggest

Get suggestions from an LLM model for improving an OpenAPI document.

### Example Usage

```java
package hello.world;

import dev.speakeasyapi.javaclientsdk.RyanTest;
import dev.speakeasyapi.javaclientsdk.models.operations.SuggestRequest;
import dev.speakeasyapi.javaclientsdk.models.operations.SuggestResponse;
import dev.speakeasyapi.javaclientsdk.models.shared.License;
import dev.speakeasyapi.javaclientsdk.models.shared.OASInfo;
import dev.speakeasyapi.javaclientsdk.models.shared.OASSummary;
import dev.speakeasyapi.javaclientsdk.models.shared.Security;
import dev.speakeasyapi.javaclientsdk.models.shared.SuggestRequestBody;
import dev.speakeasyapi.javaclientsdk.models.shared.SuggestRequestBodySuggestionType;
import java.lang.Exception;
import java.util.List;

public class Application {

    public static void main(String[] args) throws Exception {

        RyanTest sdk = RyanTest.builder()
                .security(Security.builder()
                    .apiKey("<YOUR_API_KEY_HERE>")
                    .build())
            .build();

        SuggestRequest req = SuggestRequest.builder()
                .suggestRequestBody(SuggestRequestBody.builder()
                    .diagnostics(List.of(
                    ))
                    .oasSummary(OASSummary.builder()
                        .info(OASInfo.builder()
                            .description("Operative impactful monitoring")
                            .license(License.builder()
                                .build())
                            .summary("<value>")
                            .title("<value>")
                            .version("<value>")
                            .build())
                        .operations(List.of(
                        ))
                        .build())
                    .suggestionType(SuggestRequestBodySuggestionType.DIAGNOSTICS_ONLY)
                    .build())
                .xSessionId("<value>")
                .build();

        SuggestResponse res = sdk.suggest().suggest()
                .request(req)
                .call();

        if (res.schema().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                   | Type                                                        | Required                                                    | Description                                                 |
| ----------------------------------------------------------- | ----------------------------------------------------------- | ----------------------------------------------------------- | ----------------------------------------------------------- |
| `request`                                                   | [SuggestRequest](../../models/operations/SuggestRequest.md) | :heavy_check_mark:                                          | The request object to use for the request.                  |

### Response

**[SuggestResponse](../../models/operations/SuggestResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## suggestItems

Generate generic suggestions for a list of items.

### Example Usage

```java
package hello.world;

import dev.speakeasyapi.javaclientsdk.RyanTest;
import dev.speakeasyapi.javaclientsdk.models.operations.SuggestItemsResponse;
import dev.speakeasyapi.javaclientsdk.models.shared.Security;
import dev.speakeasyapi.javaclientsdk.models.shared.SuggestItemsRequestBody;
import java.lang.Exception;
import java.util.List;

public class Application {

    public static void main(String[] args) throws Exception {

        RyanTest sdk = RyanTest.builder()
                .security(Security.builder()
                    .apiKey("<YOUR_API_KEY_HERE>")
                    .build())
            .build();

        SuggestItemsRequestBody req = SuggestItemsRequestBody.builder()
                .items(List.of(
                ))
                .prompt("<value>")
                .build();

        SuggestItemsResponse res = sdk.suggest().suggestItems()
                .request(req)
                .call();

        if (res.strings().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                                 | Type                                                                      | Required                                                                  | Description                                                               |
| ------------------------------------------------------------------------- | ------------------------------------------------------------------------- | ------------------------------------------------------------------------- | ------------------------------------------------------------------------- |
| `request`                                                                 | [SuggestItemsRequestBody](../../models/shared/SuggestItemsRequestBody.md) | :heavy_check_mark:                                                        | The request object to use for the request.                                |

### Response

**[SuggestItemsResponse](../../models/operations/SuggestItemsResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## suggestOpenAPI

Get suggestions from an LLM model for improving an OpenAPI document.

### Example Usage

```java
package hello.world;

import dev.speakeasyapi.javaclientsdk.RyanTest;
import dev.speakeasyapi.javaclientsdk.models.operations.Schema;
import dev.speakeasyapi.javaclientsdk.models.operations.SuggestOpenAPIRequest;
import dev.speakeasyapi.javaclientsdk.models.operations.SuggestOpenAPIRequestBody;
import dev.speakeasyapi.javaclientsdk.models.operations.SuggestOpenAPIResponse;
import dev.speakeasyapi.javaclientsdk.models.shared.Security;
import java.lang.Exception;
import java.nio.charset.StandardCharsets;

public class Application {

    public static void main(String[] args) throws Exception {

        RyanTest sdk = RyanTest.builder()
                .security(Security.builder()
                    .apiKey("<YOUR_API_KEY_HERE>")
                    .build())
            .build();

        SuggestOpenAPIRequest req = SuggestOpenAPIRequest.builder()
                .requestBody(SuggestOpenAPIRequestBody.builder()
                    .schema(Schema.builder()
                        .content("0x0beEcB7cF6".getBytes(StandardCharsets.UTF_8))
                        .fileName("example.file")
                        .build())
                    .build())
                .xSessionId("<value>")
                .build();

        SuggestOpenAPIResponse res = sdk.suggest().suggestOpenAPI()
                .request(req)
                .call();

        if (res.schema().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                                 | Type                                                                      | Required                                                                  | Description                                                               |
| ------------------------------------------------------------------------- | ------------------------------------------------------------------------- | ------------------------------------------------------------------------- | ------------------------------------------------------------------------- |
| `request`                                                                 | [SuggestOpenAPIRequest](../../models/operations/SuggestOpenAPIRequest.md) | :heavy_check_mark:                                                        | The request object to use for the request.                                |

### Response

**[SuggestOpenAPIResponse](../../models/operations/SuggestOpenAPIResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## suggestOpenAPIRegistry

Get suggestions from an LLM model for improving an OpenAPI document stored in the registry.

### Example Usage

```java
package hello.world;

import dev.speakeasyapi.javaclientsdk.RyanTest;
import dev.speakeasyapi.javaclientsdk.models.operations.SuggestOpenAPIRegistryRequest;
import dev.speakeasyapi.javaclientsdk.models.operations.SuggestOpenAPIRegistryResponse;
import dev.speakeasyapi.javaclientsdk.models.shared.Security;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws Exception {

        RyanTest sdk = RyanTest.builder()
                .security(Security.builder()
                    .apiKey("<YOUR_API_KEY_HERE>")
                    .build())
            .build();

        SuggestOpenAPIRegistryRequest req = SuggestOpenAPIRegistryRequest.builder()
                .namespaceName("<value>")
                .revisionReference("<value>")
                .xSessionId("<value>")
                .build();

        SuggestOpenAPIRegistryResponse res = sdk.suggest().suggestOpenAPIRegistry()
                .request(req)
                .call();

        if (res.schema().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                                                 | Type                                                                                      | Required                                                                                  | Description                                                                               |
| ----------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------- |
| `request`                                                                                 | [SuggestOpenAPIRegistryRequest](../../models/operations/SuggestOpenAPIRegistryRequest.md) | :heavy_check_mark:                                                                        | The request object to use for the request.                                                |

### Response

**[SuggestOpenAPIRegistryResponse](../../models/operations/SuggestOpenAPIRegistryResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |