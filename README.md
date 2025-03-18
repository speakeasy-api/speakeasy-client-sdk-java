# <no value>

<!-- Start Summary [summary] -->
## Summary

Speakeasy API: The Speakeasy API allows teams to manage common operations with their APIs

For more information about the API: [The Speakeasy Platform Documentation](/docs)
<!-- End Summary [summary] -->

<!-- Start Table of Contents [toc] -->
## Table of Contents
<!-- $toc-max-depth=2 -->
* [<no value>](#no-value)
  * [SDK Installation](#sdk-installation)
  * [SDK Example Usage](#sdk-example-usage)
  * [Available Resources and Operations](#available-resources-and-operations)
  * [Server Selection](#server-selection)
  * [Error Handling](#error-handling)
  * [Authentication](#authentication)
  * [Global Parameters](#global-parameters)
  * [Retries](#retries)

<!-- End Table of Contents [toc] -->

<!-- Start SDK Installation [installation] -->
## SDK Installation

### Getting started

JDK 11 or later is required.

The samples below show how a published SDK artifact is used:

Gradle:
```groovy
implementation 'dev.speakeasyapi:javaclientsdk:7.26.0'
```

Maven:
```xml
<dependency>
    <groupId>dev.speakeasyapi</groupId>
    <artifactId>javaclientsdk</artifactId>
    <version>7.26.0</version>
</dependency>
```

### How to build
After cloning the git repository to your file system you can build the SDK artifact from source to the `build` directory by running `./gradlew build` on *nix systems or `gradlew.bat` on Windows systems.

If you wish to build from source and publish the SDK artifact to your local Maven repository (on your filesystem) then use the following command (after cloning the git repo locally):

On *nix:
```bash
./gradlew publishToMavenLocal -Pskip.signing
```
On Windows:
```bash
gradlew.bat publishToMavenLocal -Pskip.signing
```
<!-- End SDK Installation [installation] -->

<!-- Start SDK Example Usage [usage] -->
## SDK Example Usage

### Example

```java
package hello.world;

import dev.speakeasyapi.javaclientsdk.RyanTest;
import dev.speakeasyapi.javaclientsdk.models.operations.GetApisRequest;
import dev.speakeasyapi.javaclientsdk.models.operations.GetApisResponse;
import dev.speakeasyapi.javaclientsdk.models.shared.Security;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws Exception {

        RyanTest sdk = RyanTest.builder()
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

<!-- Start Available Resources and Operations [operations] -->
## Available Resources and Operations

<details open>
<summary>Available methods</summary>

### [apiEndpoints()](docs/sdks/apiendpoints/README.md)

* [deleteApiEndpoint](docs/sdks/apiendpoints/README.md#deleteapiendpoint) - Delete an ApiEndpoint.
* [findApiEndpoint](docs/sdks/apiendpoints/README.md#findapiendpoint) - Find an ApiEndpoint via its displayName.
* [generateOpenApiSpecForApiEndpoint](docs/sdks/apiendpoints/README.md#generateopenapispecforapiendpoint) - Generate an OpenAPI specification for a particular ApiEndpoint.
* [generatePostmanCollectionForApiEndpoint](docs/sdks/apiendpoints/README.md#generatepostmancollectionforapiendpoint) - Generate a Postman collection for a particular ApiEndpoint.
* [getAllApiEndpoints](docs/sdks/apiendpoints/README.md#getallapiendpoints) - Get all Api endpoints for a particular apiID.
* [getAllForVersionApiEndpoints](docs/sdks/apiendpoints/README.md#getallforversionapiendpoints) - Get all ApiEndpoints for a particular apiID and versionID.
* [getApiEndpoint](docs/sdks/apiendpoints/README.md#getapiendpoint) - Get an ApiEndpoint.
* [upsertApiEndpoint](docs/sdks/apiendpoints/README.md#upsertapiendpoint) - Upsert an ApiEndpoint.

### [apis()](docs/sdks/apis/README.md)

* [deleteApi](docs/sdks/apis/README.md#deleteapi) - Delete an Api.
* [generateOpenApiSpec](docs/sdks/apis/README.md#generateopenapispec) - Generate an OpenAPI specification for a particular Api.
* [generatePostmanCollection](docs/sdks/apis/README.md#generatepostmancollection) - Generate a Postman collection for a particular Api.
* [getAllApiVersions](docs/sdks/apis/README.md#getallapiversions) - Get all Api versions for a particular ApiEndpoint.
* [getApis](docs/sdks/apis/README.md#getapis) - Get a list of Apis for a given workspace
* [upsertApi](docs/sdks/apis/README.md#upsertapi) - Upsert an Api

### [auth()](docs/sdks/auth/README.md)

* [validateApiKey](docs/sdks/auth/README.md#validateapikey) - Validate the current api key.

### [embeds()](docs/sdks/embeds/README.md)

* [getEmbedAccessToken](docs/sdks/embeds/README.md#getembedaccesstoken) - Get an embed access token for the current workspace.
* [getValidEmbedAccessTokens](docs/sdks/embeds/README.md#getvalidembedaccesstokens) - Get all valid embed access tokens for the current workspace.
* [revokeEmbedAccessToken](docs/sdks/embeds/README.md#revokeembedaccesstoken) - Revoke an embed access EmbedToken.

### [events()](docs/sdks/events/README.md)

* [postWorkspaceEvents](docs/sdks/events/README.md#postworkspaceevents) - Post events for a specific workspace

### [metadata()](docs/sdks/metadata/README.md)

* [deleteVersionMetadata](docs/sdks/metadata/README.md#deleteversionmetadata) - Delete metadata for a particular apiID and versionID.
* [getVersionMetadata](docs/sdks/metadata/README.md#getversionmetadata) - Get all metadata for a particular apiID and versionID.
* [insertVersionMetadata](docs/sdks/metadata/README.md#insertversionmetadata) - Insert metadata for a particular apiID and versionID.

### [requests()](docs/sdks/requests/README.md)

* [generateRequestPostmanCollection](docs/sdks/requests/README.md#generaterequestpostmancollection) - Generate a Postman collection for a particular request.
* [getRequestFromEventLog](docs/sdks/requests/README.md#getrequestfromeventlog) - Get information about a particular request.
* [queryEventLog](docs/sdks/requests/README.md#queryeventlog) - Query the event log to retrieve a list of requests.


### [schemas()](docs/sdks/schemas/README.md)

* [deleteSchema](docs/sdks/schemas/README.md#deleteschema) - Delete a particular schema revision for an Api.
* [downloadSchema](docs/sdks/schemas/README.md#downloadschema) - Download the latest schema for a particular apiID.
* [downloadSchemaRevision](docs/sdks/schemas/README.md#downloadschemarevision) - Download a particular schema revision for an Api.
* [getSchema](docs/sdks/schemas/README.md#getschema) - Get information about the latest schema.
* [getSchemaDiff](docs/sdks/schemas/README.md#getschemadiff) - Get a diff of two schema revisions for an Api.
* [getSchemaRevision](docs/sdks/schemas/README.md#getschemarevision) - Get information about a particular schema revision for an Api.
* [getSchemas](docs/sdks/schemas/README.md#getschemas) - Get information about all schemas associated with a particular apiID.
* [registerSchema](docs/sdks/schemas/README.md#registerschema) - Register a schema.

</details>
<!-- End Available Resources and Operations [operations] -->



<!-- Start Server Selection [server] -->
## Server Selection

### Select Server by Name

You can override the default server globally using the `.server(AvailableServers server)` builder method when initializing the SDK client instance. The selected server will then be used as the default on the operations that use it. This table lists the names associated with the available servers:

| Name   | Server                              | Description |
| ------ | ----------------------------------- | ----------- |
| `prod` | `https://api.prod.speakeasyapi.dev` |             |

#### Example

```java
package hello.world;

import dev.speakeasyapi.javaclientsdk.RyanTest;
import dev.speakeasyapi.javaclientsdk.models.operations.DeleteApiRequest;
import dev.speakeasyapi.javaclientsdk.models.operations.DeleteApiResponse;
import dev.speakeasyapi.javaclientsdk.models.shared.Security;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws Exception {

        RyanTest sdk = RyanTest.builder()
                .server(RyanTest.AvailableServers.PROD)
                .security(Security.builder()
                    .apiKey("<YOUR_API_KEY_HERE>")
                    .build())
            .build();

        DeleteApiRequest req = DeleteApiRequest.builder()
                .apiID("<id>")
                .versionID("<id>")
                .build();

        DeleteApiResponse res = sdk.apis().deleteApi()
                .request(req)
                .call();

        // handle response
    }
}
```

### Override Server URL Per-Client

The default server can also be overridden globally using the `.serverURL(String serverUrl)` builder method when initializing the SDK client instance. For example:
```java
package hello.world;

import dev.speakeasyapi.javaclientsdk.RyanTest;
import dev.speakeasyapi.javaclientsdk.models.operations.DeleteApiRequest;
import dev.speakeasyapi.javaclientsdk.models.operations.DeleteApiResponse;
import dev.speakeasyapi.javaclientsdk.models.shared.Security;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws Exception {

        RyanTest sdk = RyanTest.builder()
                .serverURL("https://api.prod.speakeasyapi.dev")
                .security(Security.builder()
                    .apiKey("<YOUR_API_KEY_HERE>")
                    .build())
            .build();

        DeleteApiRequest req = DeleteApiRequest.builder()
                .apiID("<id>")
                .versionID("<id>")
                .build();

        DeleteApiResponse res = sdk.apis().deleteApi()
                .request(req)
                .call();

        // handle response
    }
}
```
<!-- End Server Selection [server] -->

<!-- Start Error Handling [errors] -->
## Error Handling

Handling errors in this SDK should largely match your expectations. All operations return a response object or raise an exception.

By default, an API error will throw a `models/errors/SDKError` exception. When custom error responses are specified for an operation, the SDK may also throw their associated exception. You can refer to respective *Errors* tables in SDK docs for more details on possible exception types for each operation. For example, the `postWorkspaceEvents` method throws the following exceptions:

| Error Type             | Status Code | Content Type     |
| ---------------------- | ----------- | ---------------- |
| models/errors/Error    | 5XX         | application/json |
| models/errors/SDKError | 4XX         | \*/\*            |

### Example

```java
package hello.world;

import dev.speakeasyapi.javaclientsdk.RyanTest;
import dev.speakeasyapi.javaclientsdk.models.errors.Error;
import dev.speakeasyapi.javaclientsdk.models.operations.PostWorkspaceEventsRequest;
import dev.speakeasyapi.javaclientsdk.models.operations.PostWorkspaceEventsResponse;
import dev.speakeasyapi.javaclientsdk.models.shared.CliEvent;
import dev.speakeasyapi.javaclientsdk.models.shared.InteractionType;
import dev.speakeasyapi.javaclientsdk.models.shared.Security;
import java.lang.Exception;
import java.time.OffsetDateTime;
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
                    CliEvent.builder()
                        .createdAt(OffsetDateTime.parse("2025-03-02T10:07:28.113Z"))
                        .executionId("<id>")
                        .id("<id>")
                        .interactionType(InteractionType.TARGET_GENERATE)
                        .localStartedAt(OffsetDateTime.parse("2025-08-12T17:54:17.538Z"))
                        .speakeasyApiKeyName("<value>")
                        .speakeasyVersion("<value>")
                        .success(true)
                        .workspaceId("<id>")
                        .build()))
                .workspaceID("<id>")
                .build();

        PostWorkspaceEventsResponse res = sdk.events().postWorkspaceEvents()
                .request(req)
                .call();

        // handle response
    }
}
```
<!-- End Error Handling [errors] -->

<!-- Start Authentication [security] -->
## Authentication

### Per-Client Security Schemes

This SDK supports the following security scheme globally:

| Name     | Type   | Scheme  |
| -------- | ------ | ------- |
| `apiKey` | apiKey | API key |

You can set the security parameters through the `security` builder method when initializing the SDK client instance. For example:
```java
package hello.world;

import dev.speakeasyapi.javaclientsdk.RyanTest;
import dev.speakeasyapi.javaclientsdk.models.operations.DeleteApiRequest;
import dev.speakeasyapi.javaclientsdk.models.operations.DeleteApiResponse;
import dev.speakeasyapi.javaclientsdk.models.shared.Security;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws Exception {

        RyanTest sdk = RyanTest.builder()
                .security(Security.builder()
                    .apiKey("<YOUR_API_KEY_HERE>")
                    .build())
            .build();

        DeleteApiRequest req = DeleteApiRequest.builder()
                .apiID("<id>")
                .versionID("<id>")
                .build();

        DeleteApiResponse res = sdk.apis().deleteApi()
                .request(req)
                .call();

        // handle response
    }
}
```
<!-- End Authentication [security] -->

<!-- Start Global Parameters [global-parameters] -->
## Global Parameters

A parameter is configured globally. This parameter may be set on the SDK client instance itself during initialization. When configured as an option during SDK initialization, This global value will be used as the default on the operations that use it. When such operations are called, there is a place in each to override the global value, if needed.

For example, you can set `workspaceID` to `"<id>"` at SDK initialization and then you do not have to pass the same value on calls to operations like `postWorkspaceEvents`. But if you want to do so you may, which will locally override the global setting. See the example code below for a demonstration.


### Available Globals

The following global parameter is available.

| Name        | Type             | Description                |
| ----------- | ---------------- | -------------------------- |
| workspaceID | java.lang.String | The workspaceID parameter. |

### Example

```java
package hello.world;

import dev.speakeasyapi.javaclientsdk.RyanTest;
import dev.speakeasyapi.javaclientsdk.models.errors.Error;
import dev.speakeasyapi.javaclientsdk.models.operations.PostWorkspaceEventsRequest;
import dev.speakeasyapi.javaclientsdk.models.operations.PostWorkspaceEventsResponse;
import dev.speakeasyapi.javaclientsdk.models.shared.CliEvent;
import dev.speakeasyapi.javaclientsdk.models.shared.InteractionType;
import dev.speakeasyapi.javaclientsdk.models.shared.Security;
import java.lang.Exception;
import java.time.OffsetDateTime;
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
                    CliEvent.builder()
                        .createdAt(OffsetDateTime.parse("2025-03-02T10:07:28.113Z"))
                        .executionId("<id>")
                        .id("<id>")
                        .interactionType(InteractionType.TARGET_GENERATE)
                        .localStartedAt(OffsetDateTime.parse("2025-08-12T17:54:17.538Z"))
                        .speakeasyApiKeyName("<value>")
                        .speakeasyVersion("<value>")
                        .success(true)
                        .workspaceId("<id>")
                        .build()))
                .workspaceID("<id>")
                .build();

        PostWorkspaceEventsResponse res = sdk.events().postWorkspaceEvents()
                .request(req)
                .call();

        // handle response
    }
}
```
<!-- End Global Parameters [global-parameters] -->

<!-- Start Retries [retries] -->
## Retries

Some of the endpoints in this SDK support retries. If you use the SDK without any configuration, it will fall back to the default retry strategy provided by the API. However, the default retry strategy can be overridden on a per-operation basis, or across the entire SDK.

To change the default retry strategy for a single API call, you can provide a `RetryConfig` object through the `retryConfig` builder method:
```java
package hello.world;

import dev.speakeasyapi.javaclientsdk.RyanTest;
import dev.speakeasyapi.javaclientsdk.models.errors.Error;
import dev.speakeasyapi.javaclientsdk.models.operations.PostWorkspaceEventsRequest;
import dev.speakeasyapi.javaclientsdk.models.operations.PostWorkspaceEventsResponse;
import dev.speakeasyapi.javaclientsdk.models.shared.CliEvent;
import dev.speakeasyapi.javaclientsdk.models.shared.InteractionType;
import dev.speakeasyapi.javaclientsdk.models.shared.Security;
import dev.speakeasyapi.javaclientsdk.utils.BackoffStrategy;
import dev.speakeasyapi.javaclientsdk.utils.RetryConfig;
import java.lang.Exception;
import java.time.OffsetDateTime;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class Application {

    public static void main(String[] args) throws Error, Exception {

        RyanTest sdk = RyanTest.builder()
                .security(Security.builder()
                    .apiKey("<YOUR_API_KEY_HERE>")
                    .build())
            .build();

        PostWorkspaceEventsRequest req = PostWorkspaceEventsRequest.builder()
                .requestBody(List.of(
                    CliEvent.builder()
                        .createdAt(OffsetDateTime.parse("2025-03-02T10:07:28.113Z"))
                        .executionId("<id>")
                        .id("<id>")
                        .interactionType(InteractionType.TARGET_GENERATE)
                        .localStartedAt(OffsetDateTime.parse("2025-08-12T17:54:17.538Z"))
                        .speakeasyApiKeyName("<value>")
                        .speakeasyVersion("<value>")
                        .success(true)
                        .workspaceId("<id>")
                        .build()))
                .workspaceID("<id>")
                .build();

        PostWorkspaceEventsResponse res = sdk.events().postWorkspaceEvents()
                .request(req)
                .retryConfig(RetryConfig.builder()
                    .backoff(BackoffStrategy.builder()
                        .initialInterval(1L, TimeUnit.MILLISECONDS)
                        .maxInterval(50L, TimeUnit.MILLISECONDS)
                        .maxElapsedTime(1000L, TimeUnit.MILLISECONDS)
                        .baseFactor(1.1)
                        .jitterFactor(0.15)
                        .retryConnectError(false)
                        .build())
                    .build())
                .call();

        // handle response
    }
}
```

If you'd like to override the default retry strategy for all operations that support retries, you can provide a configuration at SDK initialization:
```java
package hello.world;

import dev.speakeasyapi.javaclientsdk.RyanTest;
import dev.speakeasyapi.javaclientsdk.models.errors.Error;
import dev.speakeasyapi.javaclientsdk.models.operations.PostWorkspaceEventsRequest;
import dev.speakeasyapi.javaclientsdk.models.operations.PostWorkspaceEventsResponse;
import dev.speakeasyapi.javaclientsdk.models.shared.CliEvent;
import dev.speakeasyapi.javaclientsdk.models.shared.InteractionType;
import dev.speakeasyapi.javaclientsdk.models.shared.Security;
import dev.speakeasyapi.javaclientsdk.utils.BackoffStrategy;
import dev.speakeasyapi.javaclientsdk.utils.RetryConfig;
import java.lang.Exception;
import java.time.OffsetDateTime;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class Application {

    public static void main(String[] args) throws Error, Exception {

        RyanTest sdk = RyanTest.builder()
                .retryConfig(RetryConfig.builder()
                    .backoff(BackoffStrategy.builder()
                        .initialInterval(1L, TimeUnit.MILLISECONDS)
                        .maxInterval(50L, TimeUnit.MILLISECONDS)
                        .maxElapsedTime(1000L, TimeUnit.MILLISECONDS)
                        .baseFactor(1.1)
                        .jitterFactor(0.15)
                        .retryConnectError(false)
                        .build())
                    .build())
                .security(Security.builder()
                    .apiKey("<YOUR_API_KEY_HERE>")
                    .build())
            .build();

        PostWorkspaceEventsRequest req = PostWorkspaceEventsRequest.builder()
                .requestBody(List.of(
                    CliEvent.builder()
                        .createdAt(OffsetDateTime.parse("2025-03-02T10:07:28.113Z"))
                        .executionId("<id>")
                        .id("<id>")
                        .interactionType(InteractionType.TARGET_GENERATE)
                        .localStartedAt(OffsetDateTime.parse("2025-08-12T17:54:17.538Z"))
                        .speakeasyApiKeyName("<value>")
                        .speakeasyVersion("<value>")
                        .success(true)
                        .workspaceId("<id>")
                        .build()))
                .workspaceID("<id>")
                .build();

        PostWorkspaceEventsResponse res = sdk.events().postWorkspaceEvents()
                .request(req)
                .call();

        // handle response
    }
}
```
<!-- End Retries [retries] -->

<!-- Placeholder for Future Speakeasy SDK Sections -->



### SDK Generated by [Speakeasy](https://docs.speakeasyapi.dev/docs/using-speakeasy/client-sdks)
