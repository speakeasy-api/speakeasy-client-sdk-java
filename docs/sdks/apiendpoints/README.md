# ApiEndpoints
(*apiEndpoints*)

## Overview

REST APIs for managing ApiEndpoint entities

### Available Operations

* [deleteApiEndpoint](#deleteapiendpoint) - Delete an ApiEndpoint.
* [findApiEndpoint](#findapiendpoint) - Find an ApiEndpoint via its displayName.
* [generateOpenApiSpecForApiEndpoint](#generateopenapispecforapiendpoint) - Generate an OpenAPI specification for a particular ApiEndpoint.
* [generatePostmanCollectionForApiEndpoint](#generatepostmancollectionforapiendpoint) - Generate a Postman collection for a particular ApiEndpoint.
* [getAllApiEndpoints](#getallapiendpoints) - Get all Api endpoints for a particular apiID.
* [getAllForVersionApiEndpoints](#getallforversionapiendpoints) - Get all ApiEndpoints for a particular apiID and versionID.
* [getApiEndpoint](#getapiendpoint) - Get an ApiEndpoint.
* [upsertApiEndpoint](#upsertapiendpoint) - Upsert an ApiEndpoint.

## deleteApiEndpoint

Delete an ApiEndpoint. This will also delete all associated Request Logs (if using a Postgres datastore).

### Example Usage

```java
package hello.world;

import dev.speakeasyapi.javaclientsdk.SDK;
import dev.speakeasyapi.javaclientsdk.models.operations.DeleteApiEndpointRequest;
import dev.speakeasyapi.javaclientsdk.models.operations.DeleteApiEndpointResponse;
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

            dev.speakeasyapi.javaclientsdk.models.operations.DeleteApiEndpointRequest req = new DeleteApiEndpointRequest(
                "string",
                "string",
                "string");

            dev.speakeasyapi.javaclientsdk.models.operations.DeleteApiEndpointResponse res = sdk.apiEndpoints.deleteApiEndpoint(req);

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

| Parameter                                                                                                                        | Type                                                                                                                             | Required                                                                                                                         | Description                                                                                                                      |
| -------------------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                                        | [dev.speakeasyapi.javaclientsdk.models.operations.DeleteApiEndpointRequest](../../models/operations/DeleteApiEndpointRequest.md) | :heavy_check_mark:                                                                                                               | The request object to use for the request.                                                                                       |


### Response

**[dev.speakeasyapi.javaclientsdk.models.operations.DeleteApiEndpointResponse](../../models/operations/DeleteApiEndpointResponse.md)**


## findApiEndpoint

Find an ApiEndpoint via its displayName (set by operationId from a registered OpenAPI schema).
This is useful for finding the ID of an ApiEndpoint to use in the /v1/apis/{apiID}/version/{versionID}/api_endpoints/{apiEndpointID} endpoints.

### Example Usage

```java
package hello.world;

import dev.speakeasyapi.javaclientsdk.SDK;
import dev.speakeasyapi.javaclientsdk.models.operations.FindApiEndpointRequest;
import dev.speakeasyapi.javaclientsdk.models.operations.FindApiEndpointResponse;
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

            dev.speakeasyapi.javaclientsdk.models.operations.FindApiEndpointRequest req = new FindApiEndpointRequest(
                "string",
                "string",
                "string");

            dev.speakeasyapi.javaclientsdk.models.operations.FindApiEndpointResponse res = sdk.apiEndpoints.findApiEndpoint(req);

            if (res.apiEndpoint != null) {
                // handle response
            }
        } catch (Exception e) {
            // handle exception
        }
    }
}
```

### Parameters

| Parameter                                                                                                                    | Type                                                                                                                         | Required                                                                                                                     | Description                                                                                                                  |
| ---------------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                                    | [dev.speakeasyapi.javaclientsdk.models.operations.FindApiEndpointRequest](../../models/operations/FindApiEndpointRequest.md) | :heavy_check_mark:                                                                                                           | The request object to use for the request.                                                                                   |


### Response

**[dev.speakeasyapi.javaclientsdk.models.operations.FindApiEndpointResponse](../../models/operations/FindApiEndpointResponse.md)**


## generateOpenApiSpecForApiEndpoint

This endpoint will generate a new operation in any registered OpenAPI document if the operation does not already exist in the document.
Returns the original document and the newly generated document allowing a diff to be performed to see what has changed.

### Example Usage

```java
package hello.world;

import dev.speakeasyapi.javaclientsdk.SDK;
import dev.speakeasyapi.javaclientsdk.models.operations.GenerateOpenApiSpecForApiEndpointRequest;
import dev.speakeasyapi.javaclientsdk.models.operations.GenerateOpenApiSpecForApiEndpointResponse;
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

            dev.speakeasyapi.javaclientsdk.models.operations.GenerateOpenApiSpecForApiEndpointRequest req = new GenerateOpenApiSpecForApiEndpointRequest(
                "string",
                "string",
                "string");

            dev.speakeasyapi.javaclientsdk.models.operations.GenerateOpenApiSpecForApiEndpointResponse res = sdk.apiEndpoints.generateOpenApiSpecForApiEndpoint(req);

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

| Parameter                                                                                                                                                        | Type                                                                                                                                                             | Required                                                                                                                                                         | Description                                                                                                                                                      |
| ---------------------------------------------------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                                                                        | [dev.speakeasyapi.javaclientsdk.models.operations.GenerateOpenApiSpecForApiEndpointRequest](../../models/operations/GenerateOpenApiSpecForApiEndpointRequest.md) | :heavy_check_mark:                                                                                                                                               | The request object to use for the request.                                                                                                                       |


### Response

**[dev.speakeasyapi.javaclientsdk.models.operations.GenerateOpenApiSpecForApiEndpointResponse](../../models/operations/GenerateOpenApiSpecForApiEndpointResponse.md)**


## generatePostmanCollectionForApiEndpoint

Generates a postman collection that allows the endpoint to be called from postman variables produced for any path/query/header parameters included in the OpenAPI document.

### Example Usage

```java
package hello.world;

import dev.speakeasyapi.javaclientsdk.SDK;
import dev.speakeasyapi.javaclientsdk.models.operations.GeneratePostmanCollectionForApiEndpointRequest;
import dev.speakeasyapi.javaclientsdk.models.operations.GeneratePostmanCollectionForApiEndpointResponse;
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

            dev.speakeasyapi.javaclientsdk.models.operations.GeneratePostmanCollectionForApiEndpointRequest req = new GeneratePostmanCollectionForApiEndpointRequest(
                "string",
                "string",
                "string");

            dev.speakeasyapi.javaclientsdk.models.operations.GeneratePostmanCollectionForApiEndpointResponse res = sdk.apiEndpoints.generatePostmanCollectionForApiEndpoint(req);

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

| Parameter                                                                                                                                                                    | Type                                                                                                                                                                         | Required                                                                                                                                                                     | Description                                                                                                                                                                  |
| ---------------------------------------------------------------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                                                                                    | [dev.speakeasyapi.javaclientsdk.models.operations.GeneratePostmanCollectionForApiEndpointRequest](../../models/operations/GeneratePostmanCollectionForApiEndpointRequest.md) | :heavy_check_mark:                                                                                                                                                           | The request object to use for the request.                                                                                                                                   |


### Response

**[dev.speakeasyapi.javaclientsdk.models.operations.GeneratePostmanCollectionForApiEndpointResponse](../../models/operations/GeneratePostmanCollectionForApiEndpointResponse.md)**


## getAllApiEndpoints

Get all Api endpoints for a particular apiID.

### Example Usage

```java
package hello.world;

import dev.speakeasyapi.javaclientsdk.SDK;
import dev.speakeasyapi.javaclientsdk.models.operations.GetAllApiEndpointsRequest;
import dev.speakeasyapi.javaclientsdk.models.operations.GetAllApiEndpointsResponse;
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

            dev.speakeasyapi.javaclientsdk.models.operations.GetAllApiEndpointsRequest req = new GetAllApiEndpointsRequest(
                "string");

            dev.speakeasyapi.javaclientsdk.models.operations.GetAllApiEndpointsResponse res = sdk.apiEndpoints.getAllApiEndpoints(req);

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

| Parameter                                                                                                                          | Type                                                                                                                               | Required                                                                                                                           | Description                                                                                                                        |
| ---------------------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                                          | [dev.speakeasyapi.javaclientsdk.models.operations.GetAllApiEndpointsRequest](../../models/operations/GetAllApiEndpointsRequest.md) | :heavy_check_mark:                                                                                                                 | The request object to use for the request.                                                                                         |


### Response

**[dev.speakeasyapi.javaclientsdk.models.operations.GetAllApiEndpointsResponse](../../models/operations/GetAllApiEndpointsResponse.md)**


## getAllForVersionApiEndpoints

Get all ApiEndpoints for a particular apiID and versionID.

### Example Usage

```java
package hello.world;

import dev.speakeasyapi.javaclientsdk.SDK;
import dev.speakeasyapi.javaclientsdk.models.operations.GetAllForVersionApiEndpointsRequest;
import dev.speakeasyapi.javaclientsdk.models.operations.GetAllForVersionApiEndpointsResponse;
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

            dev.speakeasyapi.javaclientsdk.models.operations.GetAllForVersionApiEndpointsRequest req = new GetAllForVersionApiEndpointsRequest(
                "string",
                "string");

            dev.speakeasyapi.javaclientsdk.models.operations.GetAllForVersionApiEndpointsResponse res = sdk.apiEndpoints.getAllForVersionApiEndpoints(req);

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

| Parameter                                                                                                                                              | Type                                                                                                                                                   | Required                                                                                                                                               | Description                                                                                                                                            |
| ------------------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------------------ |
| `request`                                                                                                                                              | [dev.speakeasyapi.javaclientsdk.models.operations.GetAllForVersionApiEndpointsRequest](../../models/operations/GetAllForVersionApiEndpointsRequest.md) | :heavy_check_mark:                                                                                                                                     | The request object to use for the request.                                                                                                             |


### Response

**[dev.speakeasyapi.javaclientsdk.models.operations.GetAllForVersionApiEndpointsResponse](../../models/operations/GetAllForVersionApiEndpointsResponse.md)**


## getApiEndpoint

Get an ApiEndpoint.

### Example Usage

```java
package hello.world;

import dev.speakeasyapi.javaclientsdk.SDK;
import dev.speakeasyapi.javaclientsdk.models.operations.GetApiEndpointRequest;
import dev.speakeasyapi.javaclientsdk.models.operations.GetApiEndpointResponse;
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

            dev.speakeasyapi.javaclientsdk.models.operations.GetApiEndpointRequest req = new GetApiEndpointRequest(
                "string",
                "string",
                "string");

            dev.speakeasyapi.javaclientsdk.models.operations.GetApiEndpointResponse res = sdk.apiEndpoints.getApiEndpoint(req);

            if (res.apiEndpoint != null) {
                // handle response
            }
        } catch (Exception e) {
            // handle exception
        }
    }
}
```

### Parameters

| Parameter                                                                                                                  | Type                                                                                                                       | Required                                                                                                                   | Description                                                                                                                |
| -------------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                                  | [dev.speakeasyapi.javaclientsdk.models.operations.GetApiEndpointRequest](../../models/operations/GetApiEndpointRequest.md) | :heavy_check_mark:                                                                                                         | The request object to use for the request.                                                                                 |


### Response

**[dev.speakeasyapi.javaclientsdk.models.operations.GetApiEndpointResponse](../../models/operations/GetApiEndpointResponse.md)**


## upsertApiEndpoint

Upsert an ApiEndpoint. If the ApiEndpoint does not exist it will be created, otherwise it will be updated.

### Example Usage

```java
package hello.world;

import dev.speakeasyapi.javaclientsdk.SDK;
import dev.speakeasyapi.javaclientsdk.models.operations.UpsertApiEndpointRequest;
import dev.speakeasyapi.javaclientsdk.models.operations.UpsertApiEndpointResponse;
import dev.speakeasyapi.javaclientsdk.models.shared.ApiEndpointInput;
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

            dev.speakeasyapi.javaclientsdk.models.operations.UpsertApiEndpointRequest req = new UpsertApiEndpointRequest(
                new ApiEndpointInput(
                    "string",
                    "string",
                    "string",
                    "string",
                    "string",
                    "string"),
                "string",
                "string",
                "string");

            dev.speakeasyapi.javaclientsdk.models.operations.UpsertApiEndpointResponse res = sdk.apiEndpoints.upsertApiEndpoint(req);

            if (res.apiEndpoint != null) {
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
| `request`                                                                                                                        | [dev.speakeasyapi.javaclientsdk.models.operations.UpsertApiEndpointRequest](../../models/operations/UpsertApiEndpointRequest.md) | :heavy_check_mark:                                                                                                               | The request object to use for the request.                                                                                       |


### Response

**[dev.speakeasyapi.javaclientsdk.models.operations.UpsertApiEndpointResponse](../../models/operations/UpsertApiEndpointResponse.md)**

