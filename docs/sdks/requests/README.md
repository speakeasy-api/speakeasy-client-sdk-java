# Requests
(*requests*)

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

import dev.speakeasyapi.javaclientsdk.SDK;
import dev.speakeasyapi.javaclientsdk.models.operations.GenerateRequestPostmanCollectionRequest;
import dev.speakeasyapi.javaclientsdk.models.operations.GenerateRequestPostmanCollectionResponse;
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

            dev.speakeasyapi.javaclientsdk.models.operations.GenerateRequestPostmanCollectionRequest req = new GenerateRequestPostmanCollectionRequest(
                "string");

            dev.speakeasyapi.javaclientsdk.models.operations.GenerateRequestPostmanCollectionResponse res = sdk.requests.generateRequestPostmanCollection(req);

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

| Parameter                                                                                                                                                      | Type                                                                                                                                                           | Required                                                                                                                                                       | Description                                                                                                                                                    |
| -------------------------------------------------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                                                                      | [dev.speakeasyapi.javaclientsdk.models.operations.GenerateRequestPostmanCollectionRequest](../../models/operations/GenerateRequestPostmanCollectionRequest.md) | :heavy_check_mark:                                                                                                                                             | The request object to use for the request.                                                                                                                     |


### Response

**[dev.speakeasyapi.javaclientsdk.models.operations.GenerateRequestPostmanCollectionResponse](../../models/operations/GenerateRequestPostmanCollectionResponse.md)**


## getRequestFromEventLog

Get information about a particular request.

### Example Usage

```java
package hello.world;

import dev.speakeasyapi.javaclientsdk.SDK;
import dev.speakeasyapi.javaclientsdk.models.operations.GetRequestFromEventLogRequest;
import dev.speakeasyapi.javaclientsdk.models.operations.GetRequestFromEventLogResponse;
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

            dev.speakeasyapi.javaclientsdk.models.operations.GetRequestFromEventLogRequest req = new GetRequestFromEventLogRequest(
                "string");

            dev.speakeasyapi.javaclientsdk.models.operations.GetRequestFromEventLogResponse res = sdk.requests.getRequestFromEventLog(req);

            if (res.unboundedRequest != null) {
                // handle response
            }
        } catch (Exception e) {
            // handle exception
        }
    }
}
```

### Parameters

| Parameter                                                                                                                                  | Type                                                                                                                                       | Required                                                                                                                                   | Description                                                                                                                                |
| ------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------ |
| `request`                                                                                                                                  | [dev.speakeasyapi.javaclientsdk.models.operations.GetRequestFromEventLogRequest](../../models/operations/GetRequestFromEventLogRequest.md) | :heavy_check_mark:                                                                                                                         | The request object to use for the request.                                                                                                 |


### Response

**[dev.speakeasyapi.javaclientsdk.models.operations.GetRequestFromEventLogResponse](../../models/operations/GetRequestFromEventLogResponse.md)**


## queryEventLog

Supports retrieving a list of request captured by the SDK for this workspace.
Allows the filtering of requests on a number of criteria such as ApiID, VersionID, Path, Method, etc.

### Example Usage

```java
package hello.world;

import dev.speakeasyapi.javaclientsdk.SDK;
import dev.speakeasyapi.javaclientsdk.models.operations.QueryEventLogRequest;
import dev.speakeasyapi.javaclientsdk.models.operations.QueryEventLogResponse;
import dev.speakeasyapi.javaclientsdk.models.shared.Filter;
import dev.speakeasyapi.javaclientsdk.models.shared.Filters;
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

            dev.speakeasyapi.javaclientsdk.models.operations.QueryEventLogRequest req = new QueryEventLogRequest(
){{
                filters = new Filters(
                    new dev.speakeasyapi.javaclientsdk.models.shared.Filter[]{{
                        add(new Filter(
                        "string",
                        "string",
                        "string"){{
                            key = "<key>";
                            operator = "string";
                            value = "string";
                        }}),
                    }},
                    241978L,
                    451388L,
                    "string");

            }};

            dev.speakeasyapi.javaclientsdk.models.operations.QueryEventLogResponse res = sdk.requests.queryEventLog(req);

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

| Parameter                                                                                                                | Type                                                                                                                     | Required                                                                                                                 | Description                                                                                                              |
| ------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------ |
| `request`                                                                                                                | [dev.speakeasyapi.javaclientsdk.models.operations.QueryEventLogRequest](../../models/operations/QueryEventLogRequest.md) | :heavy_check_mark:                                                                                                       | The request object to use for the request.                                                                               |


### Response

**[dev.speakeasyapi.javaclientsdk.models.operations.QueryEventLogResponse](../../models/operations/QueryEventLogResponse.md)**

