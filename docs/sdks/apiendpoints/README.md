# ApiEndpoints
(*apiEndpoints()*)

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

import dev.speakeasyapi.javaclientsdk.ChaseTest;
import dev.speakeasyapi.javaclientsdk.models.errors.Error;
import dev.speakeasyapi.javaclientsdk.models.operations.DeleteApiEndpointRequest;
import dev.speakeasyapi.javaclientsdk.models.operations.DeleteApiEndpointResponse;
import dev.speakeasyapi.javaclientsdk.models.shared.Security;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws Error, Exception {

        ChaseTest sdk = ChaseTest.builder()
                .security(Security.builder()
                    .apiKey("<YOUR_API_KEY_HERE>")
                    .build())
            .build();

        DeleteApiEndpointRequest req = DeleteApiEndpointRequest.builder()
                .apiEndpointID("<value>")
                .apiID("<value>")
                .versionID("<value>")
                .build();

        DeleteApiEndpointResponse res = sdk.apiEndpoints().deleteApiEndpoint()
                .request(req)
                .call();

        // handle response
    }
}
```

### Parameters

| Parameter                                                                       | Type                                                                            | Required                                                                        | Description                                                                     |
| ------------------------------------------------------------------------------- | ------------------------------------------------------------------------------- | ------------------------------------------------------------------------------- | ------------------------------------------------------------------------------- |
| `request`                                                                       | [DeleteApiEndpointRequest](../../models/operations/DeleteApiEndpointRequest.md) | :heavy_check_mark:                                                              | The request object to use for the request.                                      |

### Response

**[DeleteApiEndpointResponse](../../models/operations/DeleteApiEndpointResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/Error    | 4XX                    | application/json       |
| models/errors/SDKError | 5XX                    | \*/\*                  |

## findApiEndpoint

Find an ApiEndpoint via its displayName (set by operationId from a registered OpenAPI schema).
This is useful for finding the ID of an ApiEndpoint to use in the /v1/apis/{apiID}/version/{versionID}/api_endpoints/{apiEndpointID} endpoints.

### Example Usage

```java
package hello.world;

import dev.speakeasyapi.javaclientsdk.ChaseTest;
import dev.speakeasyapi.javaclientsdk.models.errors.Error;
import dev.speakeasyapi.javaclientsdk.models.operations.FindApiEndpointRequest;
import dev.speakeasyapi.javaclientsdk.models.operations.FindApiEndpointResponse;
import dev.speakeasyapi.javaclientsdk.models.shared.Security;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws Error, Exception {

        ChaseTest sdk = ChaseTest.builder()
                .security(Security.builder()
                    .apiKey("<YOUR_API_KEY_HERE>")
                    .build())
            .build();

        FindApiEndpointRequest req = FindApiEndpointRequest.builder()
                .apiID("<value>")
                .displayName("Don.Strosin")
                .versionID("<value>")
                .build();

        FindApiEndpointResponse res = sdk.apiEndpoints().findApiEndpoint()
                .request(req)
                .call();

        if (res.apiEndpoint().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                                   | Type                                                                        | Required                                                                    | Description                                                                 |
| --------------------------------------------------------------------------- | --------------------------------------------------------------------------- | --------------------------------------------------------------------------- | --------------------------------------------------------------------------- |
| `request`                                                                   | [FindApiEndpointRequest](../../models/operations/FindApiEndpointRequest.md) | :heavy_check_mark:                                                          | The request object to use for the request.                                  |

### Response

**[FindApiEndpointResponse](../../models/operations/FindApiEndpointResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/Error    | 4XX                    | application/json       |
| models/errors/SDKError | 5XX                    | \*/\*                  |

## generateOpenApiSpecForApiEndpoint

This endpoint will generate a new operation in any registered OpenAPI document if the operation does not already exist in the document.
Returns the original document and the newly generated document allowing a diff to be performed to see what has changed.

### Example Usage

```java
package hello.world;

import dev.speakeasyapi.javaclientsdk.ChaseTest;
import dev.speakeasyapi.javaclientsdk.models.errors.Error;
import dev.speakeasyapi.javaclientsdk.models.operations.GenerateOpenApiSpecForApiEndpointRequest;
import dev.speakeasyapi.javaclientsdk.models.operations.GenerateOpenApiSpecForApiEndpointResponse;
import dev.speakeasyapi.javaclientsdk.models.shared.Security;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws Error, Exception {

        ChaseTest sdk = ChaseTest.builder()
                .security(Security.builder()
                    .apiKey("<YOUR_API_KEY_HERE>")
                    .build())
            .build();

        GenerateOpenApiSpecForApiEndpointRequest req = GenerateOpenApiSpecForApiEndpointRequest.builder()
                .apiEndpointID("<value>")
                .apiID("<value>")
                .versionID("<value>")
                .build();

        GenerateOpenApiSpecForApiEndpointResponse res = sdk.apiEndpoints().generateOpenApiSpecForApiEndpoint()
                .request(req)
                .call();

        if (res.generateOpenApiSpecDiff().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                                                                       | Type                                                                                                            | Required                                                                                                        | Description                                                                                                     |
| --------------------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                       | [GenerateOpenApiSpecForApiEndpointRequest](../../models/operations/GenerateOpenApiSpecForApiEndpointRequest.md) | :heavy_check_mark:                                                                                              | The request object to use for the request.                                                                      |

### Response

**[GenerateOpenApiSpecForApiEndpointResponse](../../models/operations/GenerateOpenApiSpecForApiEndpointResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/Error    | 4XX                    | application/json       |
| models/errors/SDKError | 5XX                    | \*/\*                  |

## generatePostmanCollectionForApiEndpoint

Generates a postman collection that allows the endpoint to be called from postman variables produced for any path/query/header parameters included in the OpenAPI document.

### Example Usage

```java
package hello.world;

import dev.speakeasyapi.javaclientsdk.ChaseTest;
import dev.speakeasyapi.javaclientsdk.models.errors.Error;
import dev.speakeasyapi.javaclientsdk.models.operations.GeneratePostmanCollectionForApiEndpointRequest;
import dev.speakeasyapi.javaclientsdk.models.operations.GeneratePostmanCollectionForApiEndpointResponse;
import dev.speakeasyapi.javaclientsdk.models.shared.Security;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws Error, Exception {

        ChaseTest sdk = ChaseTest.builder()
                .security(Security.builder()
                    .apiKey("<YOUR_API_KEY_HERE>")
                    .build())
            .build();

        GeneratePostmanCollectionForApiEndpointRequest req = GeneratePostmanCollectionForApiEndpointRequest.builder()
                .apiEndpointID("<value>")
                .apiID("<value>")
                .versionID("<value>")
                .build();

        GeneratePostmanCollectionForApiEndpointResponse res = sdk.apiEndpoints().generatePostmanCollectionForApiEndpoint()
                .request(req)
                .call();

        if (res.postmanCollection().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                                                                                   | Type                                                                                                                        | Required                                                                                                                    | Description                                                                                                                 |
| --------------------------------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                                   | [GeneratePostmanCollectionForApiEndpointRequest](../../models/operations/GeneratePostmanCollectionForApiEndpointRequest.md) | :heavy_check_mark:                                                                                                          | The request object to use for the request.                                                                                  |

### Response

**[GeneratePostmanCollectionForApiEndpointResponse](../../models/operations/GeneratePostmanCollectionForApiEndpointResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/Error    | 4XX                    | application/json       |
| models/errors/SDKError | 5XX                    | \*/\*                  |

## getAllApiEndpoints

Get all Api endpoints for a particular apiID.

### Example Usage

```java
package hello.world;

import dev.speakeasyapi.javaclientsdk.ChaseTest;
import dev.speakeasyapi.javaclientsdk.models.errors.Error;
import dev.speakeasyapi.javaclientsdk.models.operations.GetAllApiEndpointsRequest;
import dev.speakeasyapi.javaclientsdk.models.operations.GetAllApiEndpointsResponse;
import dev.speakeasyapi.javaclientsdk.models.shared.Security;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws Error, Exception {

        ChaseTest sdk = ChaseTest.builder()
                .security(Security.builder()
                    .apiKey("<YOUR_API_KEY_HERE>")
                    .build())
            .build();

        GetAllApiEndpointsRequest req = GetAllApiEndpointsRequest.builder()
                .apiID("<value>")
                .build();

        GetAllApiEndpointsResponse res = sdk.apiEndpoints().getAllApiEndpoints()
                .request(req)
                .call();

        if (res.apiEndpoints().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                                         | Type                                                                              | Required                                                                          | Description                                                                       |
| --------------------------------------------------------------------------------- | --------------------------------------------------------------------------------- | --------------------------------------------------------------------------------- | --------------------------------------------------------------------------------- |
| `request`                                                                         | [GetAllApiEndpointsRequest](../../models/operations/GetAllApiEndpointsRequest.md) | :heavy_check_mark:                                                                | The request object to use for the request.                                        |

### Response

**[GetAllApiEndpointsResponse](../../models/operations/GetAllApiEndpointsResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/Error    | 4XX                    | application/json       |
| models/errors/SDKError | 5XX                    | \*/\*                  |

## getAllForVersionApiEndpoints

Get all ApiEndpoints for a particular apiID and versionID.

### Example Usage

```java
package hello.world;

import dev.speakeasyapi.javaclientsdk.ChaseTest;
import dev.speakeasyapi.javaclientsdk.models.errors.Error;
import dev.speakeasyapi.javaclientsdk.models.operations.GetAllForVersionApiEndpointsRequest;
import dev.speakeasyapi.javaclientsdk.models.operations.GetAllForVersionApiEndpointsResponse;
import dev.speakeasyapi.javaclientsdk.models.shared.Security;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws Error, Exception {

        ChaseTest sdk = ChaseTest.builder()
                .security(Security.builder()
                    .apiKey("<YOUR_API_KEY_HERE>")
                    .build())
            .build();

        GetAllForVersionApiEndpointsRequest req = GetAllForVersionApiEndpointsRequest.builder()
                .apiID("<value>")
                .versionID("<value>")
                .build();

        GetAllForVersionApiEndpointsResponse res = sdk.apiEndpoints().getAllForVersionApiEndpoints()
                .request(req)
                .call();

        if (res.apiEndpoints().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                                                             | Type                                                                                                  | Required                                                                                              | Description                                                                                           |
| ----------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------- |
| `request`                                                                                             | [GetAllForVersionApiEndpointsRequest](../../models/operations/GetAllForVersionApiEndpointsRequest.md) | :heavy_check_mark:                                                                                    | The request object to use for the request.                                                            |

### Response

**[GetAllForVersionApiEndpointsResponse](../../models/operations/GetAllForVersionApiEndpointsResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/Error    | 4XX                    | application/json       |
| models/errors/SDKError | 5XX                    | \*/\*                  |

## getApiEndpoint

Get an ApiEndpoint.

### Example Usage

```java
package hello.world;

import dev.speakeasyapi.javaclientsdk.ChaseTest;
import dev.speakeasyapi.javaclientsdk.models.errors.Error;
import dev.speakeasyapi.javaclientsdk.models.operations.GetApiEndpointRequest;
import dev.speakeasyapi.javaclientsdk.models.operations.GetApiEndpointResponse;
import dev.speakeasyapi.javaclientsdk.models.shared.Security;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws Error, Exception {

        ChaseTest sdk = ChaseTest.builder()
                .security(Security.builder()
                    .apiKey("<YOUR_API_KEY_HERE>")
                    .build())
            .build();

        GetApiEndpointRequest req = GetApiEndpointRequest.builder()
                .apiEndpointID("<value>")
                .apiID("<value>")
                .versionID("<value>")
                .build();

        GetApiEndpointResponse res = sdk.apiEndpoints().getApiEndpoint()
                .request(req)
                .call();

        if (res.apiEndpoint().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                                 | Type                                                                      | Required                                                                  | Description                                                               |
| ------------------------------------------------------------------------- | ------------------------------------------------------------------------- | ------------------------------------------------------------------------- | ------------------------------------------------------------------------- |
| `request`                                                                 | [GetApiEndpointRequest](../../models/operations/GetApiEndpointRequest.md) | :heavy_check_mark:                                                        | The request object to use for the request.                                |

### Response

**[GetApiEndpointResponse](../../models/operations/GetApiEndpointResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/Error    | 4XX                    | application/json       |
| models/errors/SDKError | 5XX                    | \*/\*                  |

## upsertApiEndpoint

Upsert an ApiEndpoint. If the ApiEndpoint does not exist it will be created, otherwise it will be updated.

### Example Usage

```java
package hello.world;

import dev.speakeasyapi.javaclientsdk.ChaseTest;
import dev.speakeasyapi.javaclientsdk.models.errors.Error;
import dev.speakeasyapi.javaclientsdk.models.operations.UpsertApiEndpointRequest;
import dev.speakeasyapi.javaclientsdk.models.operations.UpsertApiEndpointResponse;
import dev.speakeasyapi.javaclientsdk.models.shared.ApiEndpointInput;
import dev.speakeasyapi.javaclientsdk.models.shared.Security;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws Error, Exception {

        ChaseTest sdk = ChaseTest.builder()
                .security(Security.builder()
                    .apiKey("<YOUR_API_KEY_HERE>")
                    .build())
            .build();

        UpsertApiEndpointRequest req = UpsertApiEndpointRequest.builder()
                .apiEndpoint(ApiEndpointInput.builder()
                    .apiEndpointId("<value>")
                    .description("Public-key systematic attitude")
                    .displayName("Camille.Schaefer11")
                    .method("<value>")
                    .path("/Library")
                    .versionId("<value>")
                    .build())
                .apiEndpointID("<value>")
                .apiID("<value>")
                .versionID("<value>")
                .build();

        UpsertApiEndpointResponse res = sdk.apiEndpoints().upsertApiEndpoint()
                .request(req)
                .call();

        if (res.apiEndpoint().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                                       | Type                                                                            | Required                                                                        | Description                                                                     |
| ------------------------------------------------------------------------------- | ------------------------------------------------------------------------------- | ------------------------------------------------------------------------------- | ------------------------------------------------------------------------------- |
| `request`                                                                       | [UpsertApiEndpointRequest](../../models/operations/UpsertApiEndpointRequest.md) | :heavy_check_mark:                                                              | The request object to use for the request.                                      |

### Response

**[UpsertApiEndpointResponse](../../models/operations/UpsertApiEndpointResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/Error    | 4XX                    | application/json       |
| models/errors/SDKError | 5XX                    | \*/\*                  |