# Subscriptions
(*subscriptions()*)

## Overview

REST APIs for managing subscriptions

### Available Operations

* [activateSubscriptionNamespace](#activatesubscriptionnamespace) - Activate an ignored namespace for a subscription
* [ignoreSubscriptionNamespace](#ignoresubscriptionnamespace) - Ignored a namespace for a subscription

## activateSubscriptionNamespace

Activate an ignored namespace for a subscription

### Example Usage

```java
package hello.world;

import dev.speakeasyapi.javaclientsdk.RyanTest;
import dev.speakeasyapi.javaclientsdk.models.errors.Error;
import dev.speakeasyapi.javaclientsdk.models.operations.ActivateSubscriptionNamespaceRequest;
import dev.speakeasyapi.javaclientsdk.models.operations.ActivateSubscriptionNamespaceResponse;
import dev.speakeasyapi.javaclientsdk.models.shared.Security;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws Error, Exception {

        RyanTest sdk = RyanTest.builder()
                .security(Security.builder()
                    .apiKey("<YOUR_API_KEY_HERE>")
                    .build())
            .build();

        ActivateSubscriptionNamespaceRequest req = ActivateSubscriptionNamespaceRequest.builder()
                .namespaceName("<value>")
                .subscriptionID("<id>")
                .build();

        ActivateSubscriptionNamespaceResponse res = sdk.subscriptions().activateSubscriptionNamespace()
                .request(req)
                .call();

        // handle response
    }
}
```

### Parameters

| Parameter                                                                                               | Type                                                                                                    | Required                                                                                                | Description                                                                                             |
| ------------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------------- |
| `request`                                                                                               | [ActivateSubscriptionNamespaceRequest](../../models/operations/ActivateSubscriptionNamespaceRequest.md) | :heavy_check_mark:                                                                                      | The request object to use for the request.                                                              |

### Response

**[ActivateSubscriptionNamespaceResponse](../../models/operations/ActivateSubscriptionNamespaceResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/Error    | 4XX                    | application/json       |
| models/errors/SDKError | 5XX                    | \*/\*                  |

## ignoreSubscriptionNamespace

Ignored a namespace for a subscription

### Example Usage

```java
package hello.world;

import dev.speakeasyapi.javaclientsdk.RyanTest;
import dev.speakeasyapi.javaclientsdk.models.errors.Error;
import dev.speakeasyapi.javaclientsdk.models.operations.IgnoreSubscriptionNamespaceRequest;
import dev.speakeasyapi.javaclientsdk.models.operations.IgnoreSubscriptionNamespaceResponse;
import dev.speakeasyapi.javaclientsdk.models.shared.Security;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws Error, Exception {

        RyanTest sdk = RyanTest.builder()
                .security(Security.builder()
                    .apiKey("<YOUR_API_KEY_HERE>")
                    .build())
            .build();

        IgnoreSubscriptionNamespaceRequest req = IgnoreSubscriptionNamespaceRequest.builder()
                .namespaceName("<value>")
                .subscriptionID("<id>")
                .build();

        IgnoreSubscriptionNamespaceResponse res = sdk.subscriptions().ignoreSubscriptionNamespace()
                .request(req)
                .call();

        // handle response
    }
}
```

### Parameters

| Parameter                                                                                           | Type                                                                                                | Required                                                                                            | Description                                                                                         |
| --------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------- |
| `request`                                                                                           | [IgnoreSubscriptionNamespaceRequest](../../models/operations/IgnoreSubscriptionNamespaceRequest.md) | :heavy_check_mark:                                                                                  | The request object to use for the request.                                                          |

### Response

**[IgnoreSubscriptionNamespaceResponse](../../models/operations/IgnoreSubscriptionNamespaceResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/Error    | 4XX                    | application/json       |
| models/errors/SDKError | 5XX                    | \*/\*                  |