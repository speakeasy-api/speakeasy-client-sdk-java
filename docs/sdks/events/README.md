# Events
(*events()*)

## Overview

REST APIs for capturing event data

### Available Operations

* [getWorkspaceEventsByTarget](#getworkspaceeventsbytarget) - Load recent events for a particular workspace
* [getWorkspaceTargets](#getworkspacetargets) - Load targets for a particular workspace
* [postWorkspaceEvents](#postworkspaceevents) - Post events for a specific workspace
* [searchWorkspaceEvents](#searchworkspaceevents) - Search events for a particular workspace by any field

## getWorkspaceEventsByTarget

Load recent events for a particular workspace

### Example Usage

```java
package hello.world;

import io.github.speakeasy_sdks_staging.javaclientsdk.SDK;
import io.github.speakeasy_sdks_staging.javaclientsdk.models.errors.SDKError;
import io.github.speakeasy_sdks_staging.javaclientsdk.models.operations.GetWorkspaceEventsByTargetRequest;
import io.github.speakeasy_sdks_staging.javaclientsdk.models.operations.GetWorkspaceEventsByTargetResponse;
import io.github.speakeasy_sdks_staging.javaclientsdk.models.shared.Security;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws Exception {
        try {
            SDK sdk = SDK.builder()
                .security(Security.builder()
                    .apiKey("<YOUR_API_KEY_HERE>")
                    .build())
                .build();

            GetWorkspaceEventsByTargetRequest req = GetWorkspaceEventsByTargetRequest.builder()
                .targetID("<value>")
                .build();

            GetWorkspaceEventsByTargetResponse res = sdk.events().getWorkspaceEventsByTarget()
                .request(req)
                .call();

            if (res.cliEventBatch().isPresent()) {
                // handle response
            }
        } catch (io.github.speakeasy_sdks_staging.javaclientsdk.models.errors.Error e) {
            // handle exception
            throw e;
        } catch (SDKError e) {
            // handle exception
            throw e;
        } catch (Exception e) {
            // handle exception
            throw e;
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

| Error Object           | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/Error    | 5XX                    | application/json       |
| models/errors/SDKError | 4xx-5xx                | \*\/*                  |

## getWorkspaceTargets

Load targets for a particular workspace

### Example Usage

```java
package hello.world;

import io.github.speakeasy_sdks_staging.javaclientsdk.SDK;
import io.github.speakeasy_sdks_staging.javaclientsdk.models.errors.SDKError;
import io.github.speakeasy_sdks_staging.javaclientsdk.models.operations.GetWorkspaceTargetsRequest;
import io.github.speakeasy_sdks_staging.javaclientsdk.models.operations.GetWorkspaceTargetsResponse;
import io.github.speakeasy_sdks_staging.javaclientsdk.models.shared.Security;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws Exception {
        try {
            SDK sdk = SDK.builder()
                .security(Security.builder()
                    .apiKey("<YOUR_API_KEY_HERE>")
                    .build())
                .build();

            GetWorkspaceTargetsRequest req = GetWorkspaceTargetsRequest.builder()
                .build();

            GetWorkspaceTargetsResponse res = sdk.events().getWorkspaceTargets()
                .request(req)
                .call();

            if (res.targetSDKList().isPresent()) {
                // handle response
            }
        } catch (io.github.speakeasy_sdks_staging.javaclientsdk.models.errors.Error e) {
            // handle exception
            throw e;
        } catch (SDKError e) {
            // handle exception
            throw e;
        } catch (Exception e) {
            // handle exception
            throw e;
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

| Error Object           | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/Error    | 5XX                    | application/json       |
| models/errors/SDKError | 4xx-5xx                | \*\/*                  |

## postWorkspaceEvents

Sends an array of events to be stored for a particular workspace.

### Example Usage

```java
package hello.world;

import io.github.speakeasy_sdks_staging.javaclientsdk.SDK;
import io.github.speakeasy_sdks_staging.javaclientsdk.models.errors.SDKError;
import io.github.speakeasy_sdks_staging.javaclientsdk.models.operations.PostWorkspaceEventsRequest;
import io.github.speakeasy_sdks_staging.javaclientsdk.models.operations.PostWorkspaceEventsResponse;
import io.github.speakeasy_sdks_staging.javaclientsdk.models.shared.CliEvent;
import io.github.speakeasy_sdks_staging.javaclientsdk.models.shared.InteractionType;
import io.github.speakeasy_sdks_staging.javaclientsdk.models.shared.Security;
import java.lang.Exception;
import java.time.OffsetDateTime;
import java.util.List;

public class Application {

    public static void main(String[] args) throws Exception {
        try {
            SDK sdk = SDK.builder()
                .security(Security.builder()
                    .apiKey("<YOUR_API_KEY_HERE>")
                    .build())
                .build();

            PostWorkspaceEventsRequest req = PostWorkspaceEventsRequest.builder()
                .requestBody(List.of(
                        CliEvent.builder()
                            .createdAt(OffsetDateTime.parse("2024-11-21T06:58:42.120Z"))
                            .executionId("<value>")
                            .id("<value>")
                            .interactionType(InteractionType.CLI_EXEC)
                            .localStartedAt(OffsetDateTime.parse("2024-05-07T12:35:47.182Z"))
                            .speakeasyApiKeyName("<value>")
                            .speakeasyVersion("<value>")
                            .success(false)
                            .workspaceId("<value>")
                            .build()))
                .build();

            PostWorkspaceEventsResponse res = sdk.events().postWorkspaceEvents()
                .request(req)
                .call();

            // handle response
        } catch (io.github.speakeasy_sdks_staging.javaclientsdk.models.errors.Error e) {
            // handle exception
            throw e;
        } catch (SDKError e) {
            // handle exception
            throw e;
        } catch (Exception e) {
            // handle exception
            throw e;
        }

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

| Error Object           | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/Error    | 5XX                    | application/json       |
| models/errors/SDKError | 4xx-5xx                | \*\/*                  |

## searchWorkspaceEvents

Search events for a particular workspace by any field

### Example Usage

```java
package hello.world;

import io.github.speakeasy_sdks_staging.javaclientsdk.SDK;
import io.github.speakeasy_sdks_staging.javaclientsdk.models.errors.SDKError;
import io.github.speakeasy_sdks_staging.javaclientsdk.models.operations.SearchWorkspaceEventsRequest;
import io.github.speakeasy_sdks_staging.javaclientsdk.models.operations.SearchWorkspaceEventsResponse;
import io.github.speakeasy_sdks_staging.javaclientsdk.models.shared.Security;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws Exception {
        try {
            SDK sdk = SDK.builder()
                .security(Security.builder()
                    .apiKey("<YOUR_API_KEY_HERE>")
                    .build())
                .build();

            SearchWorkspaceEventsRequest req = SearchWorkspaceEventsRequest.builder()
                .build();

            SearchWorkspaceEventsResponse res = sdk.events().searchWorkspaceEvents()
                .request(req)
                .call();

            if (res.cliEventBatch().isPresent()) {
                // handle response
            }
        } catch (io.github.speakeasy_sdks_staging.javaclientsdk.models.errors.Error e) {
            // handle exception
            throw e;
        } catch (SDKError e) {
            // handle exception
            throw e;
        } catch (Exception e) {
            // handle exception
            throw e;
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

| Error Object           | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/Error    | 5XX                    | application/json       |
| models/errors/SDKError | 4xx-5xx                | \*\/*                  |
