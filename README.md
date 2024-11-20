# <no value>

<!-- Start Summary [summary] -->
## Summary

Speakeasy API: The Subscriptions API manages subscriptions for CLI and registry events

For more information about the API: [The Speakeasy Platform Documentation](/docs)
<!-- End Summary [summary] -->

<!-- Start Table of Contents [toc] -->
## Table of Contents

* [SDK Installation](#sdk-installation)
* [SDK Example Usage](#sdk-example-usage)
* [Available Resources and Operations](#available-resources-and-operations)
* [Global Parameters](#global-parameters)
* [Retries](#retries)
* [Error Handling](#error-handling)
* [Server Selection](#server-selection)
* [Authentication](#authentication)
<!-- End Table of Contents [toc] -->

<!-- Start SDK Installation [installation] -->
## SDK Installation

### Getting started

JDK 11 or later is required.

The samples below show how a published SDK artifact is used:

Gradle:
```groovy
implementation 'dev.speakeasyapi:javaclientsdk:7.19.2'
```

Maven:
```xml
<dependency>
    <groupId>dev.speakeasyapi</groupId>
    <artifactId>javaclientsdk</artifactId>
    <version>7.19.2</version>
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

import dev.speakeasyapi.javaclientsdk.SDK;
import dev.speakeasyapi.javaclientsdk.models.errors.Error;
import dev.speakeasyapi.javaclientsdk.models.operations.GetApisRequest;
import dev.speakeasyapi.javaclientsdk.models.operations.GetApisResponse;
import dev.speakeasyapi.javaclientsdk.models.shared.Security;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws Error, Exception {

        SDK sdk = SDK.builder()
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

### [artifacts()](docs/sdks/artifacts/README.md)

* [createRemoteSource](docs/sdks/artifacts/README.md#createremotesource) - Configure a new remote source
* [getBlob](docs/sdks/artifacts/README.md#getblob) - Get blob for a particular digest
* [getManifest](docs/sdks/artifacts/README.md#getmanifest) - Get manifest for a particular reference
* [getNamespaces](docs/sdks/artifacts/README.md#getnamespaces) - Each namespace contains many revisions.
* [getRevisions](docs/sdks/artifacts/README.md#getrevisions)
* [getTags](docs/sdks/artifacts/README.md#gettags)
* [listRemoteSources](docs/sdks/artifacts/README.md#listremotesources) - Get remote sources attached to a particular namespace
* [postTags](docs/sdks/artifacts/README.md#posttags) - Add tags to an existing revision
* [preflight](docs/sdks/artifacts/README.md#preflight) - Get access token for communicating with OCI distribution endpoints

### [auth()](docs/sdks/auth/README.md)

* [getAccess](docs/sdks/auth/README.md#getaccess) - Get access allowances for a particular workspace
* [getAccessToken](docs/sdks/auth/README.md#getaccesstoken) - Get or refresh an access token for the current workspace.
* [getUser](docs/sdks/auth/README.md#getuser) - Get information about the current user.
* [validateApiKey](docs/sdks/auth/README.md#validateapikey) - Validate the current api key.

### [embeds()](docs/sdks/embeds/README.md)

* [getEmbedAccessToken](docs/sdks/embeds/README.md#getembedaccesstoken) - Get an embed access token for the current workspace.
* [getValidEmbedAccessTokens](docs/sdks/embeds/README.md#getvalidembedaccesstokens) - Get all valid embed access tokens for the current workspace.
* [revokeEmbedAccessToken](docs/sdks/embeds/README.md#revokeembedaccesstoken) - Revoke an embed access EmbedToken.

### [events()](docs/sdks/events/README.md)

* [getEventsByTarget](docs/sdks/events/README.md#geteventsbytarget) - Load recent events for a particular workspace
* [getTargets](docs/sdks/events/README.md#gettargets) - Load targets for a particular workspace
* [getTargetsDeprecated](docs/sdks/events/README.md#gettargetsdeprecated) - Load targets for a particular workspace
* [post](docs/sdks/events/README.md#post) - Post events for a specific workspace
* [search](docs/sdks/events/README.md#search) - Search events for a particular workspace by any field

### [github()](docs/sdks/github/README.md)

* [checkAccess](docs/sdks/github/README.md#checkaccess)
* [checkPublishingPRs](docs/sdks/github/README.md#checkpublishingprs)
* [checkPublishingSecrets](docs/sdks/github/README.md#checkpublishingsecrets)
* [configureCodeSamples](docs/sdks/github/README.md#configurecodesamples)
* [configureMintlifyRepo](docs/sdks/github/README.md#configuremintlifyrepo)
* [configureTarget](docs/sdks/github/README.md#configuretarget)
* [getAction](docs/sdks/github/README.md#getaction)
* [linkGithub](docs/sdks/github/README.md#linkgithub)
* [storePublishingSecrets](docs/sdks/github/README.md#storepublishingsecrets)
* [triggerAction](docs/sdks/github/README.md#triggeraction)

### [metadata()](docs/sdks/metadata/README.md)

* [deleteVersionMetadata](docs/sdks/metadata/README.md#deleteversionmetadata) - Delete metadata for a particular apiID and versionID.
* [getVersionMetadata](docs/sdks/metadata/README.md#getversionmetadata) - Get all metadata for a particular apiID and versionID.
* [insertVersionMetadata](docs/sdks/metadata/README.md#insertversionmetadata) - Insert metadata for a particular apiID and versionID.

### [organizations()](docs/sdks/organizations/README.md)

* [create](docs/sdks/organizations/README.md#create) - Create an organization
* [createFreeTrial](docs/sdks/organizations/README.md#createfreetrial) - Create a free trial for an organization
* [get](docs/sdks/organizations/README.md#get) - Get organization
* [getAll](docs/sdks/organizations/README.md#getall) - Get organizations for a user
* [getUsage](docs/sdks/organizations/README.md#getusage) - Get billing usage summary for a particular organization

### [reports()](docs/sdks/reports/README.md)

* [getChangesReportSignedUrl](docs/sdks/reports/README.md#getchangesreportsignedurl) - Get the signed access url for the change reports for a particular document.
* [getLintingReportSignedUrl](docs/sdks/reports/README.md#getlintingreportsignedurl) - Get the signed access url for the linting reports for a particular document.
* [uploadReport](docs/sdks/reports/README.md#uploadreport) - Upload a report.

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

### [SDK](docs/sdks/sdk/README.md)

* [generateCodeSamplePreview](docs/sdks/sdk/README.md#generatecodesamplepreview) - Generate Code Sample previews from a file and configuration parameters.
* [generateCodeSamplePreviewAsync](docs/sdks/sdk/README.md#generatecodesamplepreviewasync) - Initiate asynchronous Code Sample preview generation from a file and configuration parameters, receiving an async JobID response for polling.
* [getCodeSamplePreviewAsync](docs/sdks/sdk/README.md#getcodesamplepreviewasync) - Poll for the result of an asynchronous Code Sample preview generation.

### [shortURLs()](docs/sdks/shorturls/README.md)

* [create](docs/sdks/shorturls/README.md#create) - Shorten a URL.

### [subscriptions()](docs/sdks/subscriptions/README.md)

* [createSubscription](docs/sdks/subscriptions/README.md#createsubscription) - Create Subscription
* [listRegistrySubscriptions](docs/sdks/subscriptions/README.md#listregistrysubscriptions) - List Subscriptions

### [suggest()](docs/sdks/suggest/README.md)

* [suggest](docs/sdks/suggest/README.md#suggest) - Generate suggestions for improving an OpenAPI document.
* [suggestItems](docs/sdks/suggest/README.md#suggestitems) - Generate generic suggestions for a list of items.
* [suggestOpenAPI](docs/sdks/suggest/README.md#suggestopenapi) - (DEPRECATED) Generate suggestions for improving an OpenAPI document.
* [suggestOpenAPIRegistry](docs/sdks/suggest/README.md#suggestopenapiregistry) - Generate suggestions for improving an OpenAPI document stored in the registry.

### [workspaces()](docs/sdks/workspaces/README.md)

* [create](docs/sdks/workspaces/README.md#create) - Create a workspace
* [createToken](docs/sdks/workspaces/README.md#createtoken) - Create a token for a particular workspace
* [deleteToken](docs/sdks/workspaces/README.md#deletetoken) - Delete a token for a particular workspace
* [get](docs/sdks/workspaces/README.md#get) - Get workspace by context
* [getAll](docs/sdks/workspaces/README.md#getall) - Get workspaces for a user
* [getByID](docs/sdks/workspaces/README.md#getbyid) - Get workspace
* [getFeatureFlags](docs/sdks/workspaces/README.md#getfeatureflags) - Get workspace feature flags
* [getSettings](docs/sdks/workspaces/README.md#getsettings) - Get workspace settings
* [getTeam](docs/sdks/workspaces/README.md#getteam) - Get team members for a particular workspace
* [getTokens](docs/sdks/workspaces/README.md#gettokens) - Get tokens for a particular workspace
* [grantAccess](docs/sdks/workspaces/README.md#grantaccess) - Grant a user access to a particular workspace
* [revokeAccess](docs/sdks/workspaces/README.md#revokeaccess) - Revoke a user's access to a particular workspace
* [update](docs/sdks/workspaces/README.md#update) - Update workspace details
* [updateSettings](docs/sdks/workspaces/README.md#updatesettings) - Update workspace settings

</details>
<!-- End Available Resources and Operations [operations] -->



<!-- Start Server Selection [server] -->
## Server Selection

### Select Server by Name

You can override the default server globally using the `.server(AvailableServers server)` builder method when initializing the SDK client instance. The selected server will then be used as the default on the operations that use it. This table lists the names associated with the available servers:

| Name   | Server                              |
| ------ | ----------------------------------- |
| `prod` | `https://api.prod.speakeasyapi.dev` |

#### Example

```java
package hello.world;

import dev.speakeasyapi.javaclientsdk.SDK;
import dev.speakeasyapi.javaclientsdk.models.errors.Error;
import dev.speakeasyapi.javaclientsdk.models.operations.GenerateCodeSamplePreviewResponse;
import dev.speakeasyapi.javaclientsdk.models.shared.CodeSampleSchemaInput;
import dev.speakeasyapi.javaclientsdk.models.shared.SchemaFile;
import dev.speakeasyapi.javaclientsdk.models.shared.Security;
import java.lang.Exception;
import java.nio.charset.StandardCharsets;
import java.util.List;

public class Application {

    public static void main(String[] args) throws Error, Exception {

        SDK sdk = SDK.builder()
                .server(SDK.AvailableServers.PROD)
                .security(Security.builder()
                    .apiKey("<YOUR_API_KEY_HERE>")
                    .build())
            .build();

        CodeSampleSchemaInput req = CodeSampleSchemaInput.builder()
                .languages(List.of(
                    "<value>"))
                .schemaFile(SchemaFile.builder()
                    .content("0xc3dD8BfBef".getBytes(StandardCharsets.UTF_8))
                    .fileName("example.file")
                    .build())
                .build();

        GenerateCodeSamplePreviewResponse res = sdk.generateCodeSamplePreview()
                .request(req)
                .call();

        if (res.twoHundredApplicationJsonResponseStream().isPresent()) {
            // handle response
        }
    }
}
```

### Override Server URL Per-Client

The default server can also be overridden globally using the `.serverURL(String serverUrl)` builder method when initializing the SDK client instance. For example:
```java
package hello.world;

import dev.speakeasyapi.javaclientsdk.SDK;
import dev.speakeasyapi.javaclientsdk.models.errors.Error;
import dev.speakeasyapi.javaclientsdk.models.operations.GenerateCodeSamplePreviewResponse;
import dev.speakeasyapi.javaclientsdk.models.shared.CodeSampleSchemaInput;
import dev.speakeasyapi.javaclientsdk.models.shared.SchemaFile;
import dev.speakeasyapi.javaclientsdk.models.shared.Security;
import java.lang.Exception;
import java.nio.charset.StandardCharsets;
import java.util.List;

public class Application {

    public static void main(String[] args) throws Error, Exception {

        SDK sdk = SDK.builder()
                .serverURL("https://api.prod.speakeasyapi.dev")
                .security(Security.builder()
                    .apiKey("<YOUR_API_KEY_HERE>")
                    .build())
            .build();

        CodeSampleSchemaInput req = CodeSampleSchemaInput.builder()
                .languages(List.of(
                    "<value>"))
                .schemaFile(SchemaFile.builder()
                    .content("0xc3dD8BfBef".getBytes(StandardCharsets.UTF_8))
                    .fileName("example.file")
                    .build())
                .build();

        GenerateCodeSamplePreviewResponse res = sdk.generateCodeSamplePreview()
                .request(req)
                .call();

        if (res.twoHundredApplicationJsonResponseStream().isPresent()) {
            // handle response
        }
    }
}
```
<!-- End Server Selection [server] -->

<!-- Start Error Handling [errors] -->
## Error Handling

Handling errors in this SDK should largely match your expectations. All operations return a response object or raise an exception.

By default, an API error will throw a `models/errors/SDKError` exception. When custom error responses are specified for an operation, the SDK may also throw their associated exception. You can refer to respective *Errors* tables in SDK docs for more details on possible exception types for each operation. For example, the `generateCodeSamplePreview` method throws the following exceptions:

| Error Type          | Status Code | Content Type     |
| ------------------- | ----------- | ---------------- |
| models/errors/Error | 4XX, 5XX    | application/json |

### Example

```java
package hello.world;

import dev.speakeasyapi.javaclientsdk.SDK;
import dev.speakeasyapi.javaclientsdk.models.errors.Error;
import dev.speakeasyapi.javaclientsdk.models.operations.GenerateCodeSamplePreviewResponse;
import dev.speakeasyapi.javaclientsdk.models.shared.CodeSampleSchemaInput;
import dev.speakeasyapi.javaclientsdk.models.shared.SchemaFile;
import dev.speakeasyapi.javaclientsdk.models.shared.Security;
import java.lang.Exception;
import java.nio.charset.StandardCharsets;
import java.util.List;

public class Application {

    public static void main(String[] args) throws Error, Exception {

        SDK sdk = SDK.builder()
                .security(Security.builder()
                    .apiKey("<YOUR_API_KEY_HERE>")
                    .build())
            .build();

        CodeSampleSchemaInput req = CodeSampleSchemaInput.builder()
                .languages(List.of(
                    "<value>"))
                .schemaFile(SchemaFile.builder()
                    .content("0xc3dD8BfBef".getBytes(StandardCharsets.UTF_8))
                    .fileName("example.file")
                    .build())
                .build();

        GenerateCodeSamplePreviewResponse res = sdk.generateCodeSamplePreview()
                .request(req)
                .call();

        if (res.twoHundredApplicationJsonResponseStream().isPresent()) {
            // handle response
        }
    }
}
```
<!-- End Error Handling [errors] -->

<!-- Start Authentication [security] -->
## Authentication

### Per-Client Security Schemes

This SDK supports the following security schemes globally:

| Name                  | Type   | Scheme      |
| --------------------- | ------ | ----------- |
| `apiKey`              | apiKey | API key     |
| `bearer`              | http   | HTTP Bearer |
| `workspaceIdentifier` | apiKey | API key     |

You can set the security parameters through the `security` builder method when initializing the SDK client instance. The selected scheme will be used by default to authenticate with the API for all operations that support it. For example:
```java
package hello.world;

import dev.speakeasyapi.javaclientsdk.SDK;
import dev.speakeasyapi.javaclientsdk.models.errors.Error;
import dev.speakeasyapi.javaclientsdk.models.operations.GenerateCodeSamplePreviewResponse;
import dev.speakeasyapi.javaclientsdk.models.shared.CodeSampleSchemaInput;
import dev.speakeasyapi.javaclientsdk.models.shared.SchemaFile;
import dev.speakeasyapi.javaclientsdk.models.shared.Security;
import java.lang.Exception;
import java.nio.charset.StandardCharsets;
import java.util.List;

public class Application {

    public static void main(String[] args) throws Error, Exception {

        SDK sdk = SDK.builder()
                .security(Security.builder()
                    .apiKey("<YOUR_API_KEY_HERE>")
                    .build())
            .build();

        CodeSampleSchemaInput req = CodeSampleSchemaInput.builder()
                .languages(List.of(
                    "<value>"))
                .schemaFile(SchemaFile.builder()
                    .content("0xc3dD8BfBef".getBytes(StandardCharsets.UTF_8))
                    .fileName("example.file")
                    .build())
                .build();

        GenerateCodeSamplePreviewResponse res = sdk.generateCodeSamplePreview()
                .request(req)
                .call();

        if (res.twoHundredApplicationJsonResponseStream().isPresent()) {
            // handle response
        }
    }
}
```
<!-- End Authentication [security] -->

<!-- Start Global Parameters [global-parameters] -->
## Global Parameters

A parameter is configured globally. This parameter may be set on the SDK client instance itself during initialization. When configured as an option during SDK initialization, This global value will be used as the default on the operations that use it. When such operations are called, there is a place in each to override the global value, if needed.

For example, you can set `workspace_id` to `"<id>"` at SDK initialization and then you do not have to pass the same value on calls to operations like `getAccessToken`. But if you want to do so you may, which will locally override the global setting. See the example code below for a demonstration.


### Available Globals

The following global parameter is available.

| Name        | Type             | Description                |
| ----------- | ---------------- | -------------------------- |
| workspaceId | java.lang.String | The workspaceId parameter. |

### Example

```java
package hello.world;

import dev.speakeasyapi.javaclientsdk.SDK;
import dev.speakeasyapi.javaclientsdk.models.errors.Error;
import dev.speakeasyapi.javaclientsdk.models.operations.GetAccessTokenRequest;
import dev.speakeasyapi.javaclientsdk.models.operations.GetAccessTokenResponse;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws Error, Exception {

        SDK sdk = SDK.builder()
            .build();

        GetAccessTokenRequest req = GetAccessTokenRequest.builder()
                .workspaceId("<id>")
                .build();

        GetAccessTokenResponse res = sdk.auth().getAccessToken()
                .request(req)
                .call();

        if (res.accessToken().isPresent()) {
            // handle response
        }
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

import dev.speakeasyapi.javaclientsdk.SDK;
import dev.speakeasyapi.javaclientsdk.models.operations.GetWorkspaceAccessRequest;
import dev.speakeasyapi.javaclientsdk.models.operations.GetWorkspaceAccessResponse;
import dev.speakeasyapi.javaclientsdk.models.shared.Security;
import dev.speakeasyapi.javaclientsdk.utils.BackoffStrategy;
import dev.speakeasyapi.javaclientsdk.utils.RetryConfig;
import java.lang.Exception;
import java.util.concurrent.TimeUnit;

public class Application {

    public static void main(String[] args) throws Exception {

        SDK sdk = SDK.builder()
                .security(Security.builder()
                    .apiKey("<YOUR_API_KEY_HERE>")
                    .build())
            .build();

        GetWorkspaceAccessRequest req = GetWorkspaceAccessRequest.builder()
                .build();

        GetWorkspaceAccessResponse res = sdk.auth().getAccess()
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

        if (res.accessDetails().isPresent()) {
            // handle response
        }
    }
}
```

If you'd like to override the default retry strategy for all operations that support retries, you can provide a configuration at SDK initialization:
```java
package hello.world;

import dev.speakeasyapi.javaclientsdk.SDK;
import dev.speakeasyapi.javaclientsdk.models.operations.GetWorkspaceAccessRequest;
import dev.speakeasyapi.javaclientsdk.models.operations.GetWorkspaceAccessResponse;
import dev.speakeasyapi.javaclientsdk.models.shared.Security;
import dev.speakeasyapi.javaclientsdk.utils.BackoffStrategy;
import dev.speakeasyapi.javaclientsdk.utils.RetryConfig;
import java.lang.Exception;
import java.util.concurrent.TimeUnit;

public class Application {

    public static void main(String[] args) throws Exception {

        SDK sdk = SDK.builder()
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

        GetWorkspaceAccessRequest req = GetWorkspaceAccessRequest.builder()
                .build();

        GetWorkspaceAccessResponse res = sdk.auth().getAccess()
                .request(req)
                .call();

        if (res.accessDetails().isPresent()) {
            // handle response
        }
    }
}
```
<!-- End Retries [retries] -->

<!-- Placeholder for Future Speakeasy SDK Sections -->



### SDK Generated by [Speakeasy](https://docs.speakeasyapi.dev/docs/using-speakeasy/client-sdks)
