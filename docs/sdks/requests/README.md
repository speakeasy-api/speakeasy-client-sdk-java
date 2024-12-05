# Requests
(*requests()*)

## Overview

REST APIs for retrieving request information

### Available Operations

* [generateRequestPostmanCollection](#generaterequestpostmancollection) - Generate a Postman collection for a particular request.
* [getRequestFromEventLog](#getrequestfromeventlog) - Get information about a particular request.
* [queryEventLog](#queryeventlog) - Query the event log to retrieve a list of requests.

## generateRequestPostmanCollection

Generates a Postman collection for a particular request.
Allowing it to be replayed with the same inputs that were captured by the SDK.

### Example Usage

```java
package hello.world;

import dev.speakeasyapi.javaclientsdk.ChaseTest;
import dev.speakeasyapi.javaclientsdk.models.errors.Error;
import dev.speakeasyapi.javaclientsdk.models.operations.GenerateRequestPostmanCollectionRequest;
import dev.speakeasyapi.javaclientsdk.models.operations.GenerateRequestPostmanCollectionResponse;
import dev.speakeasyapi.javaclientsdk.models.shared.Security;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws Error, Exception {

        ChaseTest sdk = ChaseTest.builder()
                .security(Security.builder()
                    .apiKey("<YOUR_API_KEY_HERE>")
                    .build())
            .build();

        GenerateRequestPostmanCollectionRequest req = GenerateRequestPostmanCollectionRequest.builder()
                .requestID("<value>")
                .build();

        GenerateRequestPostmanCollectionResponse res = sdk.requests().generateRequestPostmanCollection()
                .request(req)
                .call();

        if (res.postmanCollection().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                                                                     | Type                                                                                                          | Required                                                                                                      | Description                                                                                                   |
| ------------------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                     | [GenerateRequestPostmanCollectionRequest](../../models/operations/GenerateRequestPostmanCollectionRequest.md) | :heavy_check_mark:                                                                                            | The request object to use for the request.                                                                    |

### Response

**[GenerateRequestPostmanCollectionResponse](../../models/operations/GenerateRequestPostmanCollectionResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/Error    | 4XX                    | application/json       |
| models/errors/SDKError | 5XX                    | \*/\*                  |

## getRequestFromEventLog

Get information about a particular request.

### Example Usage

```java
package hello.world;

import dev.speakeasyapi.javaclientsdk.ChaseTest;
import dev.speakeasyapi.javaclientsdk.models.errors.Error;
import dev.speakeasyapi.javaclientsdk.models.operations.GetRequestFromEventLogRequest;
import dev.speakeasyapi.javaclientsdk.models.operations.GetRequestFromEventLogResponse;
import dev.speakeasyapi.javaclientsdk.models.shared.Security;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws Error, Exception {

        ChaseTest sdk = ChaseTest.builder()
                .security(Security.builder()
                    .apiKey("<YOUR_API_KEY_HERE>")
                    .build())
            .build();

        GetRequestFromEventLogRequest req = GetRequestFromEventLogRequest.builder()
                .requestID("<value>")
                .build();

        GetRequestFromEventLogResponse res = sdk.requests().getRequestFromEventLog()
                .request(req)
                .call();

        if (res.unboundedRequest().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                                                 | Type                                                                                      | Required                                                                                  | Description                                                                               |
| ----------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------- |
| `request`                                                                                 | [GetRequestFromEventLogRequest](../../models/operations/GetRequestFromEventLogRequest.md) | :heavy_check_mark:                                                                        | The request object to use for the request.                                                |

### Response

**[GetRequestFromEventLogResponse](../../models/operations/GetRequestFromEventLogResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/Error    | 4XX                    | application/json       |
| models/errors/SDKError | 5XX                    | \*/\*                  |

## queryEventLog

Supports retrieving a list of request captured by the SDK for this workspace.
Allows the filtering of requests on a number of criteria such as ApiID, VersionID, Path, Method, etc.

### Example Usage

```java
package hello.world;

import dev.speakeasyapi.javaclientsdk.ChaseTest;
import dev.speakeasyapi.javaclientsdk.models.errors.Error;
import dev.speakeasyapi.javaclientsdk.models.operations.QueryEventLogRequest;
import dev.speakeasyapi.javaclientsdk.models.operations.QueryEventLogResponse;
import dev.speakeasyapi.javaclientsdk.models.shared.Security;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws Error, Exception {

        ChaseTest sdk = ChaseTest.builder()
                .security(Security.builder()
                    .apiKey("<YOUR_API_KEY_HERE>")
                    .build())
            .build();

        QueryEventLogRequest req = QueryEventLogRequest.builder()
                .build();

        QueryEventLogResponse res = sdk.requests().queryEventLog()
                .request(req)
                .call();

        if (res.boundedRequests().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                               | Type                                                                    | Required                                                                | Description                                                             |
| ----------------------------------------------------------------------- | ----------------------------------------------------------------------- | ----------------------------------------------------------------------- | ----------------------------------------------------------------------- |
| `request`                                                               | [QueryEventLogRequest](../../models/operations/QueryEventLogRequest.md) | :heavy_check_mark:                                                      | The request object to use for the request.                              |

### Response

**[QueryEventLogResponse](../../models/operations/QueryEventLogResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/Error    | 4XX                    | application/json       |
| models/errors/SDKError | 5XX                    | \*/\*                  |