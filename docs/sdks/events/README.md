# Events
(*events()*)

## Overview

REST APIs for managing events captured by a speakeasy binary (CLI, GitHub Action etc)

### Available Operations

* [getEventsByTarget](#geteventsbytarget) - Load recent events for a particular workspace
* [getTargets](#gettargets) - Load targets for a particular workspace
* [getTargetsDeprecated](#gettargetsdeprecated) - Load targets for a particular workspace
* [post](#post) - Post events for a specific workspace
* [search](#search) - Search events for a particular workspace by any field

## getEventsByTarget

Load recent events for a particular workspace

### Example Usage

```java
package hello.world;

import dev.speakeasyapi.javaclientsdk.RyanTest;
import dev.speakeasyapi.javaclientsdk.models.errors.Error;
import dev.speakeasyapi.javaclientsdk.models.operations.GetWorkspaceEventsByTargetRequest;
import dev.speakeasyapi.javaclientsdk.models.operations.GetWorkspaceEventsByTargetResponse;
import dev.speakeasyapi.javaclientsdk.models.shared.Security;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws Error, Exception {

        RyanTest sdk = RyanTest.builder()
                .security(Security.builder()
                    .apiKey("<YOUR_API_KEY_HERE>")
                    .build())
            .build();

        GetWorkspaceEventsByTargetRequest req = GetWorkspaceEventsByTargetRequest.builder()
                .targetId("<id>")
                .workspaceId("<id>")
                .build();

        GetWorkspaceEventsByTargetResponse res = sdk.events().getEventsByTarget()
                .request(req)
                .call();

        if (res.cliEventBatch().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                                                         | Type                                                                                              | Required                                                                                          | Description                                                                                       |
| ------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------- |
| `request`                                                                                         | [GetWorkspaceEventsByTargetRequest](../../models/operations/GetWorkspaceEventsByTargetRequest.md) | :heavy_check_mark:                                                                                | The request object to use for the request.                                                        |

### Response

**[GetWorkspaceEventsByTargetResponse](../../models/operations/GetWorkspaceEventsByTargetResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/Error    | 5XX                    | application/json       |
| models/errors/SDKError | 4XX                    | \*/\*                  |

## getTargets

Load targets for a particular workspace

### Example Usage

```java
package hello.world;

import dev.speakeasyapi.javaclientsdk.RyanTest;
import dev.speakeasyapi.javaclientsdk.models.errors.Error;
import dev.speakeasyapi.javaclientsdk.models.operations.GetWorkspaceTargetsRequest;
import dev.speakeasyapi.javaclientsdk.models.operations.GetWorkspaceTargetsResponse;
import dev.speakeasyapi.javaclientsdk.models.shared.Security;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws Error, Exception {

        RyanTest sdk = RyanTest.builder()
                .security(Security.builder()
                    .apiKey("<YOUR_API_KEY_HERE>")
                    .build())
            .build();

        GetWorkspaceTargetsRequest req = GetWorkspaceTargetsRequest.builder()
                .build();

        GetWorkspaceTargetsResponse res = sdk.events().getTargets()
                .request(req)
                .call();

        if (res.targetSDKList().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                                           | Type                                                                                | Required                                                                            | Description                                                                         |
| ----------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------- |
| `request`                                                                           | [GetWorkspaceTargetsRequest](../../models/operations/GetWorkspaceTargetsRequest.md) | :heavy_check_mark:                                                                  | The request object to use for the request.                                          |

### Response

**[GetWorkspaceTargetsResponse](../../models/operations/GetWorkspaceTargetsResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/Error    | 5XX                    | application/json       |
| models/errors/SDKError | 4XX                    | \*/\*                  |

## getTargetsDeprecated

Load targets for a particular workspace

### Example Usage

```java
package hello.world;

import dev.speakeasyapi.javaclientsdk.RyanTest;
import dev.speakeasyapi.javaclientsdk.models.errors.Error;
import dev.speakeasyapi.javaclientsdk.models.operations.GetWorkspaceTargetsDeprecatedRequest;
import dev.speakeasyapi.javaclientsdk.models.operations.GetWorkspaceTargetsDeprecatedResponse;
import dev.speakeasyapi.javaclientsdk.models.shared.Security;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws Error, Exception {

        RyanTest sdk = RyanTest.builder()
                .security(Security.builder()
                    .apiKey("<YOUR_API_KEY_HERE>")
                    .build())
            .build();

        GetWorkspaceTargetsDeprecatedRequest req = GetWorkspaceTargetsDeprecatedRequest.builder()
                .workspaceId("<id>")
                .build();

        GetWorkspaceTargetsDeprecatedResponse res = sdk.events().getTargetsDeprecated()
                .request(req)
                .call();

        if (res.targetSDKList().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                                                               | Type                                                                                                    | Required                                                                                                | Description                                                                                             |
| ------------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------------- |
| `request`                                                                                               | [GetWorkspaceTargetsDeprecatedRequest](../../models/operations/GetWorkspaceTargetsDeprecatedRequest.md) | :heavy_check_mark:                                                                                      | The request object to use for the request.                                                              |

### Response

**[GetWorkspaceTargetsDeprecatedResponse](../../models/operations/GetWorkspaceTargetsDeprecatedResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/Error    | 5XX                    | application/json       |
| models/errors/SDKError | 4XX                    | \*/\*                  |

## post

Sends an array of events to be stored for a particular workspace.

### Example Usage

```java
package hello.world;

import dev.speakeasyapi.javaclientsdk.RyanTest;
import dev.speakeasyapi.javaclientsdk.models.errors.Error;
import dev.speakeasyapi.javaclientsdk.models.operations.PostWorkspaceEventsRequest;
import dev.speakeasyapi.javaclientsdk.models.operations.PostWorkspaceEventsResponse;
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

        PostWorkspaceEventsRequest req = PostWorkspaceEventsRequest.builder()
                .requestBody(List.of(
                ))
                .workspaceId("<id>")
                .build();

        PostWorkspaceEventsResponse res = sdk.events().post()
                .request(req)
                .call();

        // handle response
    }
}
```

### Parameters

| Parameter                                                                           | Type                                                                                | Required                                                                            | Description                                                                         |
| ----------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------- |
| `request`                                                                           | [PostWorkspaceEventsRequest](../../models/operations/PostWorkspaceEventsRequest.md) | :heavy_check_mark:                                                                  | The request object to use for the request.                                          |

### Response

**[PostWorkspaceEventsResponse](../../models/operations/PostWorkspaceEventsResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/Error    | 5XX                    | application/json       |
| models/errors/SDKError | 4XX                    | \*/\*                  |

## search

Search events for a particular workspace by any field

### Example Usage

```java
package hello.world;

import dev.speakeasyapi.javaclientsdk.RyanTest;
import dev.speakeasyapi.javaclientsdk.models.errors.Error;
import dev.speakeasyapi.javaclientsdk.models.operations.SearchWorkspaceEventsRequest;
import dev.speakeasyapi.javaclientsdk.models.operations.SearchWorkspaceEventsResponse;
import dev.speakeasyapi.javaclientsdk.models.shared.Security;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws Error, Exception {

        RyanTest sdk = RyanTest.builder()
                .security(Security.builder()
                    .apiKey("<YOUR_API_KEY_HERE>")
                    .build())
            .build();

        SearchWorkspaceEventsRequest req = SearchWorkspaceEventsRequest.builder()
                .workspaceId("<id>")
                .build();

        SearchWorkspaceEventsResponse res = sdk.events().search()
                .request(req)
                .call();

        if (res.cliEventBatch().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                                               | Type                                                                                    | Required                                                                                | Description                                                                             |
| --------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------- |
| `request`                                                                               | [SearchWorkspaceEventsRequest](../../models/operations/SearchWorkspaceEventsRequest.md) | :heavy_check_mark:                                                                      | The request object to use for the request.                                              |

### Response

**[SearchWorkspaceEventsResponse](../../models/operations/SearchWorkspaceEventsResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/Error    | 5XX                    | application/json       |
| models/errors/SDKError | 4XX                    | \*/\*                  |