# <no value>

<!-- Start SDK Installation -->
## SDK Installation

### Gradle

```groovy
implementation 'dev.speakeasyapi.javaclientsdk:speakeasy-client-sdk-java:1.31.1'
```
<!-- End SDK Installation -->

## SDK Example Usage
<!-- Start SDK Example Usage -->
```java
package hello.world;

import dev.speakeasyapi.javaclientsdk.SDK;
import dev.speakeasyapi.javaclientsdk.models.operations.GetApisOp;
import dev.speakeasyapi.javaclientsdk.models.operations.GetApisRequest;
import dev.speakeasyapi.javaclientsdk.models.operations.GetApisResponse;
import dev.speakeasyapi.javaclientsdk.models.shared.Security;

public class Application {
    public static void main(String[] args) {
        try {
            SDK sdk = SDK.builder()
                .setSecurity(new Security("corrupti") {{
                    apiKey = "YOUR_API_KEY_HERE";
                }})
                .build();

            GetApisRequest req = new GetApisRequest() {{
                metadata = new java.util.HashMap<String, String[]>() {{
                    put("distinctio", new String[]{{
                        add("unde"),
                        add("nulla"),
                        add("corrupti"),
                        add("illum"),
                    }});
                    put("vel", new String[]{{
                        add("deserunt"),
                        add("suscipit"),
                        add("iure"),
                    }});
                    put("magnam", new String[]{{
                        add("ipsa"),
                        add("delectus"),
                        add("tempora"),
                        add("suscipit"),
                    }});
                }};
                op = new GetApisOp(false);;
            }};            

            GetApisResponse res = sdk.apis.getApis(req);

            if (res.apis != null) {
                // handle response
            }
        } catch (Exception e) {
            // handle exception
        }
    }
}
```
<!-- End SDK Example Usage -->

<!-- Start SDK Available Operations -->
## Available Resources and Operations

### [SDK](docs/sdk/README.md)

* [validateApiKey](docs/sdk/README.md#validateapikey) - Validate the current api key.

### [apiEndpoints](docs/apiendpoints/README.md)

* [deleteApiEndpoint](docs/apiendpoints/README.md#deleteapiendpoint) - Delete an ApiEndpoint.
* [findApiEndpoint](docs/apiendpoints/README.md#findapiendpoint) - Find an ApiEndpoint via its displayName.
* [generateOpenApiSpecForApiEndpoint](docs/apiendpoints/README.md#generateopenapispecforapiendpoint) - Generate an OpenAPI specification for a particular ApiEndpoint.
* [generatePostmanCollectionForApiEndpoint](docs/apiendpoints/README.md#generatepostmancollectionforapiendpoint) - Generate a Postman collection for a particular ApiEndpoint.
* [getAllApiEndpoints](docs/apiendpoints/README.md#getallapiendpoints) - Get all Api endpoints for a particular apiID.
* [getAllForVersionApiEndpoints](docs/apiendpoints/README.md#getallforversionapiendpoints) - Get all ApiEndpoints for a particular apiID and versionID.
* [getApiEndpoint](docs/apiendpoints/README.md#getapiendpoint) - Get an ApiEndpoint.
* [upsertApiEndpoint](docs/apiendpoints/README.md#upsertapiendpoint) - Upsert an ApiEndpoint.

### [apis](docs/apis/README.md)

* [deleteApi](docs/apis/README.md#deleteapi) - Delete an Api.
* [generateOpenApiSpec](docs/apis/README.md#generateopenapispec) - Generate an OpenAPI specification for a particular Api.
* [generatePostmanCollection](docs/apis/README.md#generatepostmancollection) - Generate a Postman collection for a particular Api.
* [getAllApiVersions](docs/apis/README.md#getallapiversions) - Get all Api versions for a particular ApiEndpoint.
* [getApis](docs/apis/README.md#getapis) - Get a list of Apis for a given workspace
* [upsertApi](docs/apis/README.md#upsertapi) - Upsert an Api

### [embeds](docs/embeds/README.md)

* [getEmbedAccessToken](docs/embeds/README.md#getembedaccesstoken) - Get an embed access token for the current workspace.
* [getValidEmbedAccessTokens](docs/embeds/README.md#getvalidembedaccesstokens) - Get all valid embed access tokens for the current workspace.
* [revokeEmbedAccessToken](docs/embeds/README.md#revokeembedaccesstoken) - Revoke an embed access EmbedToken.

### [metadata](docs/metadata/README.md)

* [deleteVersionMetadata](docs/metadata/README.md#deleteversionmetadata) - Delete metadata for a particular apiID and versionID.
* [getVersionMetadata](docs/metadata/README.md#getversionmetadata) - Get all metadata for a particular apiID and versionID.
* [insertVersionMetadata](docs/metadata/README.md#insertversionmetadata) - Insert metadata for a particular apiID and versionID.

### [plugins](docs/plugins/README.md)

* [getPlugins](docs/plugins/README.md#getplugins) - Get all plugins for the current workspace.
* [runPlugin](docs/plugins/README.md#runplugin) - Run a plugin
* [upsertPlugin](docs/plugins/README.md#upsertplugin) - Upsert a plugin

### [requests](docs/requests/README.md)

* [generateRequestPostmanCollection](docs/requests/README.md#generaterequestpostmancollection) - Generate a Postman collection for a particular request.
* [getRequestFromEventLog](docs/requests/README.md#getrequestfromeventlog) - Get information about a particular request.
* [queryEventLog](docs/requests/README.md#queryeventlog) - Query the event log to retrieve a list of requests.

### [schemas](docs/schemas/README.md)

* [deleteSchema](docs/schemas/README.md#deleteschema) - Delete a particular schema revision for an Api.
* [downloadSchema](docs/schemas/README.md#downloadschema) - Download the latest schema for a particular apiID.
* [downloadSchemaRevision](docs/schemas/README.md#downloadschemarevision) - Download a particular schema revision for an Api.
* [getSchema](docs/schemas/README.md#getschema) - Get information about the latest schema.
* [getSchemaDiff](docs/schemas/README.md#getschemadiff) - Get a diff of two schema revisions for an Api.
* [getSchemaRevision](docs/schemas/README.md#getschemarevision) - Get information about a particular schema revision for an Api.
* [getSchemas](docs/schemas/README.md#getschemas) - Get information about all schemas associated with a particular apiID.
* [registerSchema](docs/schemas/README.md#registerschema) - Register a schema.
<!-- End SDK Available Operations -->

### SDK Generated by [Speakeasy](https://docs.speakeasyapi.dev/docs/using-speakeasy/client-sdks)
