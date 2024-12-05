# Subscriptions
(*subscriptions()*)

## Overview

REST APIs for managing subscriptions

### Available Operations

* [createSubscription](#createsubscription) - Create Subscription
* [listRegistrySubscriptions](#listregistrysubscriptions) - List Subscriptions

## createSubscription

Create Subscription

### Example Usage

```java
package hello.world;

import dev.speakeasyapi.javaclientsdk.RyanTest;
import dev.speakeasyapi.javaclientsdk.models.operations.CreateSubscriptionRequest;
import dev.speakeasyapi.javaclientsdk.models.operations.CreateSubscriptionResponse;
import dev.speakeasyapi.javaclientsdk.models.shared.EventType;
import dev.speakeasyapi.javaclientsdk.models.shared.RegistrySubscription;
import dev.speakeasyapi.javaclientsdk.models.shared.Security;
import dev.speakeasyapi.javaclientsdk.models.shared.SubscriptionType;
import java.lang.Exception;
import java.time.OffsetDateTime;

public class Application {

    public static void main(String[] args) throws Exception {

        RyanTest sdk = RyanTest.builder()
                .security(Security.builder()
                    .apiKey("<YOUR_API_KEY_HERE>")
                    .build())
            .build();

        CreateSubscriptionRequest req = CreateSubscriptionRequest.builder()
                .registrySubscription(RegistrySubscription.builder()
                    .createdAt(OffsetDateTime.parse("2022-06-08T17:58:57.702Z"))
                    .eventType(EventType.UPDATE)
                    .id("<id>")
                    .namespaceName("<value>")
                    .subscriptionSettings("<value>")
                    .subscriptionType(SubscriptionType.CLI)
                    .updatedAt(OffsetDateTime.parse("2022-07-20T08:51:35.776Z"))
                    .workspaceId("<id>")
                    .build())
                .build();

        CreateSubscriptionResponse res = sdk.subscriptions().createSubscription()
                .request(req)
                .call();

        if (res.registrySubscription().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                                         | Type                                                                              | Required                                                                          | Description                                                                       |
| --------------------------------------------------------------------------------- | --------------------------------------------------------------------------------- | --------------------------------------------------------------------------------- | --------------------------------------------------------------------------------- |
| `request`                                                                         | [CreateSubscriptionRequest](../../models/operations/CreateSubscriptionRequest.md) | :heavy_check_mark:                                                                | The request object to use for the request.                                        |

### Response

**[CreateSubscriptionResponse](../../models/operations/CreateSubscriptionResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## listRegistrySubscriptions

List Subscriptions

### Example Usage

```java
package hello.world;

import dev.speakeasyapi.javaclientsdk.RyanTest;
import dev.speakeasyapi.javaclientsdk.models.operations.ListRegistrySubscriptionsRequest;
import dev.speakeasyapi.javaclientsdk.models.operations.ListRegistrySubscriptionsResponse;
import dev.speakeasyapi.javaclientsdk.models.shared.Security;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws Exception {

        RyanTest sdk = RyanTest.builder()
                .security(Security.builder()
                    .apiKey("<YOUR_API_KEY_HERE>")
                    .build())
            .build();

        ListRegistrySubscriptionsRequest req = ListRegistrySubscriptionsRequest.builder()
                .build();

        ListRegistrySubscriptionsResponse res = sdk.subscriptions().listRegistrySubscriptions()
                .request(req)
                .call();

        if (res.classes().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                                                       | Type                                                                                            | Required                                                                                        | Description                                                                                     |
| ----------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------- |
| `request`                                                                                       | [ListRegistrySubscriptionsRequest](../../models/operations/ListRegistrySubscriptionsRequest.md) | :heavy_check_mark:                                                                              | The request object to use for the request.                                                      |

### Response

**[ListRegistrySubscriptionsResponse](../../models/operations/ListRegistrySubscriptionsResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |