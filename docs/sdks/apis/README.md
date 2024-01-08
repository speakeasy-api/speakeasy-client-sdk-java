# Apis
(*apis*)

## Overview

REST APIs for managing Api entities

### Available Operations

* [deleteApi](#deleteapi) - Delete an Api.
* [generateOpenApiSpec](#generateopenapispec) - Generate an OpenAPI specification for a particular Api.
* [generatePostmanCollection](#generatepostmancollection) - Generate a Postman collection for a particular Api.
* [getAllApiVersions](#getallapiversions) - Get all Api versions for a particular ApiEndpoint.
* [getApis](#getapis) - Get a list of Apis for a given workspace
* [upsertApi](#upsertapi) - Upsert an Api

## deleteApi

Delete a particular version of an Api. The will also delete all associated ApiEndpoints, Metadata, Schemas & Request Logs (if using a Postgres datastore).

### Example Usage

```java
package hello.world;

import dev.speakeasyapi.javaclientsdk.SDK;
import dev.speakeasyapi.javaclientsdk.models.operations.DeleteApiRequest;
import dev.speakeasyapi.javaclientsdk.models.operations.DeleteApiResponse;
import dev.speakeasyapi.javaclientsdk.models.shared.Security;

public class Application {
    public static void main(String[] args) {
        try {
            SDK sdk = SDK.builder()
                .setSecurity(new Security(
                "string"){{
                    apiKey = "<YOUR_API_KEY_HERE>";
                }})
                .build();

            dev.speakeasyapi.javaclientsdk.models.operations.DeleteApiRequest req = new DeleteApiRequest(
                "string",
                "string");

            dev.speakeasyapi.javaclientsdk.models.operations.DeleteApiResponse res = sdk.apis.deleteApi(req);

            if (res.statusCode == 200) {
                // handle response
            }
        } catch (Exception e) {
            // handle exception
        }
    }
}
```

### Parameters

| Parameter                                                                                                        | Type                                                                                                             | Required                                                                                                         | Description                                                                                                      |
| ---------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                        | [dev.speakeasyapi.javaclientsdk.models.operations.DeleteApiRequest](../../models/operations/DeleteApiRequest.md) | :heavy_check_mark:                                                                                               | The request object to use for the request.                                                                       |


### Response

**[dev.speakeasyapi.javaclientsdk.models.operations.DeleteApiResponse](../../models/operations/DeleteApiResponse.md)**


## generateOpenApiSpec

This endpoint will generate any missing operations in any registered OpenAPI document if the operation does not already exist in the document.
Returns the original document and the newly generated document allowing a diff to be performed to see what has changed.

### Example Usage

```java
package hello.world;

import dev.speakeasyapi.javaclientsdk.SDK;
import dev.speakeasyapi.javaclientsdk.models.operations.GenerateOpenApiSpecRequest;
import dev.speakeasyapi.javaclientsdk.models.operations.GenerateOpenApiSpecResponse;
import dev.speakeasyapi.javaclientsdk.models.shared.Security;

public class Application {
    public static void main(String[] args) {
        try {
            SDK sdk = SDK.builder()
                .setSecurity(new Security(
                "string"){{
                    apiKey = "<YOUR_API_KEY_HERE>";
                }})
                .build();

            dev.speakeasyapi.javaclientsdk.models.operations.GenerateOpenApiSpecRequest req = new GenerateOpenApiSpecRequest(
                "string",
                "string");

            dev.speakeasyapi.javaclientsdk.models.operations.GenerateOpenApiSpecResponse res = sdk.apis.generateOpenApiSpec(req);

            if (res.generateOpenApiSpecDiff != null) {
                // handle response
            }
        } catch (Exception e) {
            // handle exception
        }
    }
}
```

### Parameters

| Parameter                                                                                                                            | Type                                                                                                                                 | Required                                                                                                                             | Description                                                                                                                          |
| ------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------ |
| `request`                                                                                                                            | [dev.speakeasyapi.javaclientsdk.models.operations.GenerateOpenApiSpecRequest](../../models/operations/GenerateOpenApiSpecRequest.md) | :heavy_check_mark:                                                                                                                   | The request object to use for the request.                                                                                           |


### Response

**[dev.speakeasyapi.javaclientsdk.models.operations.GenerateOpenApiSpecResponse](../../models/operations/GenerateOpenApiSpecResponse.md)**


## generatePostmanCollection

Generates a postman collection containing all endpoints for a particular API. Includes variables produced for any path/query/header parameters included in the OpenAPI document.

### Example Usage

```java
package hello.world;

import dev.speakeasyapi.javaclientsdk.SDK;
import dev.speakeasyapi.javaclientsdk.models.operations.GeneratePostmanCollectionRequest;
import dev.speakeasyapi.javaclientsdk.models.operations.GeneratePostmanCollectionResponse;
import dev.speakeasyapi.javaclientsdk.models.shared.Security;

public class Application {
    public static void main(String[] args) {
        try {
            SDK sdk = SDK.builder()
                .setSecurity(new Security(
                "string"){{
                    apiKey = "<YOUR_API_KEY_HERE>";
                }})
                .build();

            dev.speakeasyapi.javaclientsdk.models.operations.GeneratePostmanCollectionRequest req = new GeneratePostmanCollectionRequest(
                "string",
                "string");

            dev.speakeasyapi.javaclientsdk.models.operations.GeneratePostmanCollectionResponse res = sdk.apis.generatePostmanCollection(req);

            if (res.postmanCollection != null) {
                // handle response
            }
        } catch (Exception e) {
            // handle exception
        }
    }
}
```

### Parameters

| Parameter                                                                                                                                        | Type                                                                                                                                             | Required                                                                                                                                         | Description                                                                                                                                      |
| ------------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------------ |
| `request`                                                                                                                                        | [dev.speakeasyapi.javaclientsdk.models.operations.GeneratePostmanCollectionRequest](../../models/operations/GeneratePostmanCollectionRequest.md) | :heavy_check_mark:                                                                                                                               | The request object to use for the request.                                                                                                       |


### Response

**[dev.speakeasyapi.javaclientsdk.models.operations.GeneratePostmanCollectionResponse](../../models/operations/GeneratePostmanCollectionResponse.md)**


## getAllApiVersions

Get all Api versions for a particular ApiEndpoint.
Supports filtering the versions based on metadata attributes.

### Example Usage

```java
package hello.world;

import dev.speakeasyapi.javaclientsdk.SDK;
import dev.speakeasyapi.javaclientsdk.models.operations.GetAllApiVersionsRequest;
import dev.speakeasyapi.javaclientsdk.models.operations.GetAllApiVersionsResponse;
import dev.speakeasyapi.javaclientsdk.models.operations.Op;
import dev.speakeasyapi.javaclientsdk.models.shared.Security;

public class Application {
    public static void main(String[] args) {
        try {
            SDK sdk = SDK.builder()
                .setSecurity(new Security(
                "string"){{
                    apiKey = "<YOUR_API_KEY_HERE>";
                }})
                .build();

            dev.speakeasyapi.javaclientsdk.models.operations.GetAllApiVersionsRequest req = new GetAllApiVersionsRequest(
                "string"){{
                metadata = new java.util.HashMap<String, String[]>(
                ){{
                    put("key", new String[]{{
                        add("string"),
                    }});
                }};
                op = new Op(
                    false);

            }};

            dev.speakeasyapi.javaclientsdk.models.operations.GetAllApiVersionsResponse res = sdk.apis.getAllApiVersions(req);

            if (res.classes != null) {
                // handle response
            }
        } catch (Exception e) {
            // handle exception
        }
    }
}
```

### Parameters

| Parameter                                                                                                                        | Type                                                                                                                             | Required                                                                                                                         | Description                                                                                                                      |
| -------------------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                                        | [dev.speakeasyapi.javaclientsdk.models.operations.GetAllApiVersionsRequest](../../models/operations/GetAllApiVersionsRequest.md) | :heavy_check_mark:                                                                                                               | The request object to use for the request.                                                                                       |


### Response

**[dev.speakeasyapi.javaclientsdk.models.operations.GetAllApiVersionsResponse](../../models/operations/GetAllApiVersionsResponse.md)**


## getApis

Get a list of all Apis and their versions for a given workspace.
Supports filtering the APIs based on metadata attributes.

### Example Usage

```java
package hello.world;

import dev.speakeasyapi.javaclientsdk.SDK;
import dev.speakeasyapi.javaclientsdk.models.operations.GetApisRequest;
import dev.speakeasyapi.javaclientsdk.models.operations.GetApisResponse;
import dev.speakeasyapi.javaclientsdk.models.operations.QueryParamOp;
import dev.speakeasyapi.javaclientsdk.models.shared.Security;

public class Application {
    public static void main(String[] args) {
        try {
            SDK sdk = SDK.builder()
                .setSecurity(new Security(
                "string"){{
                    apiKey = "<YOUR_API_KEY_HERE>";
                }})
                .build();

            dev.speakeasyapi.javaclientsdk.models.operations.GetApisRequest req = new GetApisRequest(
){{
                metadata = new java.util.HashMap<String, String[]>(
                ){{
                    put("key", new String[]{{
                        add("string"),
                    }});
                }};
                op = new QueryParamOp(
                    false);

            }};

            dev.speakeasyapi.javaclientsdk.models.operations.GetApisResponse res = sdk.apis.getApis(req);

            if (res.classes != null) {
                // handle response
            }
        } catch (Exception e) {
            // handle exception
        }
    }
}
```

### Parameters

| Parameter                                                                                                    | Type                                                                                                         | Required                                                                                                     | Description                                                                                                  |
| ------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------ |
| `request`                                                                                                    | [dev.speakeasyapi.javaclientsdk.models.operations.GetApisRequest](../../models/operations/GetApisRequest.md) | :heavy_check_mark:                                                                                           | The request object to use for the request.                                                                   |


### Response

**[dev.speakeasyapi.javaclientsdk.models.operations.GetApisResponse](../../models/operations/GetApisResponse.md)**


## upsertApi

Upsert an Api. If the Api does not exist, it will be created.
If the Api exists, it will be updated.

### Example Usage

```java
package hello.world;

import dev.speakeasyapi.javaclientsdk.SDK;
import dev.speakeasyapi.javaclientsdk.models.operations.UpsertApiRequest;
import dev.speakeasyapi.javaclientsdk.models.operations.UpsertApiResponse;
import dev.speakeasyapi.javaclientsdk.models.shared.ApiInput;
import dev.speakeasyapi.javaclientsdk.models.shared.Security;

public class Application {
    public static void main(String[] args) {
        try {
            SDK sdk = SDK.builder()
                .setSecurity(new Security(
                "string"){{
                    apiKey = "<YOUR_API_KEY_HERE>";
                }})
                .build();

            dev.speakeasyapi.javaclientsdk.models.operations.UpsertApiRequest req = new UpsertApiRequest(
                new ApiInput(
                    "string",
                    "string",
                    "string"){{
                    metaData = new java.util.HashMap<String, String[]>(
                    ){{
                        put("key", new String[]{{
                            add("string"),
                        }});
                    }};

                }},
                "string");

            dev.speakeasyapi.javaclientsdk.models.operations.UpsertApiResponse res = sdk.apis.upsertApi(req);

            if (res.api != null) {
                // handle response
            }
        } catch (Exception e) {
            // handle exception
        }
    }
}
```

### Parameters

| Parameter                                                                                                        | Type                                                                                                             | Required                                                                                                         | Description                                                                                                      |
| ---------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                        | [dev.speakeasyapi.javaclientsdk.models.operations.UpsertApiRequest](../../models/operations/UpsertApiRequest.md) | :heavy_check_mark:                                                                                               | The request object to use for the request.                                                                       |


### Response

**[dev.speakeasyapi.javaclientsdk.models.operations.UpsertApiResponse](../../models/operations/UpsertApiResponse.md)**

