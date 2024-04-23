# Events
(*events()*)

## Overview

REST APIs for capturing event data

### Available Operations

* [getWorkspaceEvents](#getworkspaceevents) - Load recent events for a particular workspace
* [getWorkspaceEventsBySourceRevisionDigest](#getworkspaceeventsbysourcerevisiondigest) - Load events for a particular workspace and source revision digest
* [getWorkspaceTargets](#getworkspacetargets) - Load targets for a particular workspace
* [postWorkspaceEvents](#postworkspaceevents) - Post events for a specific workspace

## getWorkspaceEvents

Load recent events for a particular workspace

### Example Usage

```java
package hello.world;

import io.github.speakeasy_sdks_staging.javaclientsdk.SDK;
import io.github.speakeasy_sdks_staging.javaclientsdk.models.operations.*;
import io.github.speakeasy_sdks_staging.javaclientsdk.models.operations.GetWorkspaceEventsRequest;
import io.github.speakeasy_sdks_staging.javaclientsdk.models.operations.GetWorkspaceEventsResponse;
import io.github.speakeasy_sdks_staging.javaclientsdk.models.shared.*;
import io.github.speakeasy_sdks_staging.javaclientsdk.models.shared.Security;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.time.LocalDate;
import java.time.OffsetDateTime;
import java.util.Optional;
import static java.util.Map.entry;

public class Application {

    public static void main(String[] args) {
        try {
            SDK sdk = SDK.builder()
                .security(Security.builder()
                    .apiKey("<YOUR_API_KEY_HERE>")
                    .build())
                .workspaceID("<value>")
                .build();

            GetWorkspaceEventsRequest req = GetWorkspaceEventsRequest.builder()
                .afterCreatedAt(OffsetDateTime.parse("2024-04-02T06:03:54.204Z"))
                .generateGenLockId("<value>")
                .build();

            GetWorkspaceEventsResponse res = sdk.events().getWorkspaceEvents()
                .request(req)
                .call();

            if (res.cliEventBatch().isPresent()) {
                // handle response
            }
        } catch (io.github.speakeasy_sdks_staging.javaclientsdk.models.errors.Error e) {
            // handle exception
        } catch (io.github.speakeasy_sdks_staging.javaclientsdk.models.errors.SDKError e) {
            // handle exception
        } catch (Exception e) {
            // handle exception
        }
    }
}
```

### Parameters

| Parameter                                                                                                                                          | Type                                                                                                                                               | Required                                                                                                                                           | Description                                                                                                                                        |
| -------------------------------------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                                                          | [io.github.speakeasy_sdks_staging.javaclientsdk.models.operations.GetWorkspaceEventsRequest](../../models/operations/GetWorkspaceEventsRequest.md) | :heavy_check_mark:                                                                                                                                 | The request object to use for the request.                                                                                                         |


### Response

**[Optional<? extends io.github.speakeasy_sdks_staging.javaclientsdk.models.operations.GetWorkspaceEventsResponse>](../../models/operations/GetWorkspaceEventsResponse.md)**
### Errors

| Error Object                                                       | Status Code                                                        | Content Type                                                       |
| ------------------------------------------------------------------ | ------------------------------------------------------------------ | ------------------------------------------------------------------ |
| io.github.speakeasy_sdks_staging.javaclientsdk.models.errors.Error | 5XX                                                                | application/json                                                   |
| models/errors/SDKError                                             | 4xx-5xx                                                            | */*                                                                |

## getWorkspaceEventsBySourceRevisionDigest

Load events for a particular workspace and source revision digest

### Example Usage

```java
package hello.world;

import io.github.speakeasy_sdks_staging.javaclientsdk.SDK;
import io.github.speakeasy_sdks_staging.javaclientsdk.models.operations.*;
import io.github.speakeasy_sdks_staging.javaclientsdk.models.operations.GetWorkspaceEventsBySourceRevisionDigestRequest;
import io.github.speakeasy_sdks_staging.javaclientsdk.models.operations.GetWorkspaceEventsBySourceRevisionDigestResponse;
import io.github.speakeasy_sdks_staging.javaclientsdk.models.shared.*;
import io.github.speakeasy_sdks_staging.javaclientsdk.models.shared.Security;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.time.LocalDate;
import java.time.OffsetDateTime;
import java.util.Optional;
import static java.util.Map.entry;

public class Application {

    public static void main(String[] args) {
        try {
            SDK sdk = SDK.builder()
                .security(Security.builder()
                    .apiKey("<YOUR_API_KEY_HERE>")
                    .build())
                .workspaceID("<value>")
                .build();

            GetWorkspaceEventsBySourceRevisionDigestRequest req = GetWorkspaceEventsBySourceRevisionDigestRequest.builder()
                .sourceRevisionDigest("<value>")
                .build();

            GetWorkspaceEventsBySourceRevisionDigestResponse res = sdk.events().getWorkspaceEventsBySourceRevisionDigest()
                .request(req)
                .call();

            if (res.cliEventBatch().isPresent()) {
                // handle response
            }
        } catch (io.github.speakeasy_sdks_staging.javaclientsdk.models.errors.Error e) {
            // handle exception
        } catch (io.github.speakeasy_sdks_staging.javaclientsdk.models.errors.SDKError e) {
            // handle exception
        } catch (Exception e) {
            // handle exception
        }
    }
}
```

### Parameters

| Parameter                                                                                                                                                                                      | Type                                                                                                                                                                                           | Required                                                                                                                                                                                       | Description                                                                                                                                                                                    |
| ---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                                                                                                      | [io.github.speakeasy_sdks_staging.javaclientsdk.models.operations.GetWorkspaceEventsBySourceRevisionDigestRequest](../../models/operations/GetWorkspaceEventsBySourceRevisionDigestRequest.md) | :heavy_check_mark:                                                                                                                                                                             | The request object to use for the request.                                                                                                                                                     |


### Response

**[Optional<? extends io.github.speakeasy_sdks_staging.javaclientsdk.models.operations.GetWorkspaceEventsBySourceRevisionDigestResponse>](../../models/operations/GetWorkspaceEventsBySourceRevisionDigestResponse.md)**
### Errors

| Error Object                                                       | Status Code                                                        | Content Type                                                       |
| ------------------------------------------------------------------ | ------------------------------------------------------------------ | ------------------------------------------------------------------ |
| io.github.speakeasy_sdks_staging.javaclientsdk.models.errors.Error | 5XX                                                                | application/json                                                   |
| models/errors/SDKError                                             | 4xx-5xx                                                            | */*                                                                |

## getWorkspaceTargets

Load targets for a particular workspace

### Example Usage

```java
package hello.world;

import io.github.speakeasy_sdks_staging.javaclientsdk.SDK;
import io.github.speakeasy_sdks_staging.javaclientsdk.models.operations.*;
import io.github.speakeasy_sdks_staging.javaclientsdk.models.operations.GetWorkspaceTargetsRequest;
import io.github.speakeasy_sdks_staging.javaclientsdk.models.operations.GetWorkspaceTargetsResponse;
import io.github.speakeasy_sdks_staging.javaclientsdk.models.shared.*;
import io.github.speakeasy_sdks_staging.javaclientsdk.models.shared.Security;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.time.LocalDate;
import java.time.OffsetDateTime;
import java.util.Optional;
import static java.util.Map.entry;

public class Application {

    public static void main(String[] args) {
        try {
            SDK sdk = SDK.builder()
                .security(Security.builder()
                    .apiKey("<YOUR_API_KEY_HERE>")
                    .build())
                .workspaceID("<value>")
                .build();

            GetWorkspaceTargetsRequest req = GetWorkspaceTargetsRequest.builder()
                .afterLastEventCreatedAt(OffsetDateTime.parse("2024-11-24T17:59:46.647Z"))
                .build();

            GetWorkspaceTargetsResponse res = sdk.events().getWorkspaceTargets()
                .request(req)
                .call();

            if (res.targetSDKList().isPresent()) {
                // handle response
            }
        } catch (io.github.speakeasy_sdks_staging.javaclientsdk.models.errors.Error e) {
            // handle exception
        } catch (io.github.speakeasy_sdks_staging.javaclientsdk.models.errors.SDKError e) {
            // handle exception
        } catch (Exception e) {
            // handle exception
        }
    }
}
```

### Parameters

| Parameter                                                                                                                                            | Type                                                                                                                                                 | Required                                                                                                                                             | Description                                                                                                                                          |
| ---------------------------------------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                                                            | [io.github.speakeasy_sdks_staging.javaclientsdk.models.operations.GetWorkspaceTargetsRequest](../../models/operations/GetWorkspaceTargetsRequest.md) | :heavy_check_mark:                                                                                                                                   | The request object to use for the request.                                                                                                           |


### Response

**[Optional<? extends io.github.speakeasy_sdks_staging.javaclientsdk.models.operations.GetWorkspaceTargetsResponse>](../../models/operations/GetWorkspaceTargetsResponse.md)**
### Errors

| Error Object                                                       | Status Code                                                        | Content Type                                                       |
| ------------------------------------------------------------------ | ------------------------------------------------------------------ | ------------------------------------------------------------------ |
| io.github.speakeasy_sdks_staging.javaclientsdk.models.errors.Error | 5XX                                                                | application/json                                                   |
| models/errors/SDKError                                             | 4xx-5xx                                                            | */*                                                                |

## postWorkspaceEvents

Sends an array of events to be stored for a particular workspace.

### Example Usage

```java
package hello.world;

import io.github.speakeasy_sdks_staging.javaclientsdk.SDK;
import io.github.speakeasy_sdks_staging.javaclientsdk.models.operations.*;
import io.github.speakeasy_sdks_staging.javaclientsdk.models.operations.PostWorkspaceEventsRequest;
import io.github.speakeasy_sdks_staging.javaclientsdk.models.operations.PostWorkspaceEventsResponse;
import io.github.speakeasy_sdks_staging.javaclientsdk.models.shared.*;
import io.github.speakeasy_sdks_staging.javaclientsdk.models.shared.CliEvent;
import io.github.speakeasy_sdks_staging.javaclientsdk.models.shared.GenerateBumpType;
import io.github.speakeasy_sdks_staging.javaclientsdk.models.shared.InteractionType;
import io.github.speakeasy_sdks_staging.javaclientsdk.models.shared.OpenapiDiffBumpType;
import io.github.speakeasy_sdks_staging.javaclientsdk.models.shared.Security;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.time.LocalDate;
import java.time.OffsetDateTime;
import java.util.Optional;
import static java.util.Map.entry;

public class Application {

    public static void main(String[] args) {
        try {
            SDK sdk = SDK.builder()
                .security(Security.builder()
                    .apiKey("<YOUR_API_KEY_HERE>")
                    .build())
                .workspaceID("<value>")
                .build();

            PostWorkspaceEventsRequest req = PostWorkspaceEventsRequest.builder()
                .requestBody(java.util.List.of(
                        CliEvent.builder()
                            .createdAt(OffsetDateTime.parse("2023-10-28T06:47:51.791Z"))
                            .executionId("<value>")
                            .id("<value>")
                            .interactionType(InteractionType.TARGET_GENERATE)
                            .localStartedAt(OffsetDateTime.parse("2024-02-25T22:57:22.933Z"))
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
        } catch (io.github.speakeasy_sdks_staging.javaclientsdk.models.errors.SDKError e) {
            // handle exception
        } catch (Exception e) {
            // handle exception
        }
    }
}
```

### Parameters

| Parameter                                                                                                                                            | Type                                                                                                                                                 | Required                                                                                                                                             | Description                                                                                                                                          |
| ---------------------------------------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                                                            | [io.github.speakeasy_sdks_staging.javaclientsdk.models.operations.PostWorkspaceEventsRequest](../../models/operations/PostWorkspaceEventsRequest.md) | :heavy_check_mark:                                                                                                                                   | The request object to use for the request.                                                                                                           |


### Response

**[Optional<? extends io.github.speakeasy_sdks_staging.javaclientsdk.models.operations.PostWorkspaceEventsResponse>](../../models/operations/PostWorkspaceEventsResponse.md)**
### Errors

| Error Object                                                       | Status Code                                                        | Content Type                                                       |
| ------------------------------------------------------------------ | ------------------------------------------------------------------ | ------------------------------------------------------------------ |
| io.github.speakeasy_sdks_staging.javaclientsdk.models.errors.Error | 5XX                                                                | application/json                                                   |
| models/errors/SDKError                                             | 4xx-5xx                                                            | */*                                                                |
