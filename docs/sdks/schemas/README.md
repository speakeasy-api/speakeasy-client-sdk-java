# Schemas
(*schemas()*)

## Overview

REST APIs for managing Schema entities

### Available Operations

* [deleteSchema](#deleteschema) - Delete a particular schema revision for an Api.
* [downloadSchema](#downloadschema) - Download the latest schema for a particular apiID.
* [downloadSchemaRevision](#downloadschemarevision) - Download a particular schema revision for an Api.
* [getSchema](#getschema) - Get information about the latest schema.
* [getSchemaDiff](#getschemadiff) - Get a diff of two schema revisions for an Api.
* [getSchemaRevision](#getschemarevision) - Get information about a particular schema revision for an Api.
* [getSchemas](#getschemas) - Get information about all schemas associated with a particular apiID.
* [registerSchema](#registerschema) - Register a schema.

## deleteSchema

Delete a particular schema revision for an Api.

### Example Usage

```java
package hello.world;

import dev.speakeasyapi.javaclientsdk.ChaseTest;
import dev.speakeasyapi.javaclientsdk.models.errors.Error;
import dev.speakeasyapi.javaclientsdk.models.operations.DeleteSchemaRequest;
import dev.speakeasyapi.javaclientsdk.models.operations.DeleteSchemaResponse;
import dev.speakeasyapi.javaclientsdk.models.shared.Security;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws Error, Exception {

        ChaseTest sdk = ChaseTest.builder()
                .security(Security.builder()
                    .apiKey("<YOUR_API_KEY_HERE>")
                    .build())
            .build();

        DeleteSchemaRequest req = DeleteSchemaRequest.builder()
                .apiID("<value>")
                .revisionID("<value>")
                .versionID("<value>")
                .build();

        DeleteSchemaResponse res = sdk.schemas().deleteSchema()
                .request(req)
                .call();

        // handle response
    }
}
```

### Parameters

| Parameter                                                             | Type                                                                  | Required                                                              | Description                                                           |
| --------------------------------------------------------------------- | --------------------------------------------------------------------- | --------------------------------------------------------------------- | --------------------------------------------------------------------- |
| `request`                                                             | [DeleteSchemaRequest](../../models/operations/DeleteSchemaRequest.md) | :heavy_check_mark:                                                    | The request object to use for the request.                            |

### Response

**[DeleteSchemaResponse](../../models/operations/DeleteSchemaResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/Error    | 4XX                    | application/json       |
| models/errors/SDKError | 5XX                    | \*/\*                  |

## downloadSchema

Download the latest schema for a particular apiID.

### Example Usage

```java
package hello.world;

import dev.speakeasyapi.javaclientsdk.ChaseTest;
import dev.speakeasyapi.javaclientsdk.models.errors.Error;
import dev.speakeasyapi.javaclientsdk.models.operations.DownloadSchemaRequest;
import dev.speakeasyapi.javaclientsdk.models.operations.DownloadSchemaResponse;
import dev.speakeasyapi.javaclientsdk.models.shared.Security;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws Error, Exception {

        ChaseTest sdk = ChaseTest.builder()
                .security(Security.builder()
                    .apiKey("<YOUR_API_KEY_HERE>")
                    .build())
            .build();

        DownloadSchemaRequest req = DownloadSchemaRequest.builder()
                .apiID("<value>")
                .versionID("<value>")
                .build();

        DownloadSchemaResponse res = sdk.schemas().downloadSchema()
                .request(req)
                .call();

        if (res.twoXXApplicationJsonSchema().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                                 | Type                                                                      | Required                                                                  | Description                                                               |
| ------------------------------------------------------------------------- | ------------------------------------------------------------------------- | ------------------------------------------------------------------------- | ------------------------------------------------------------------------- |
| `request`                                                                 | [DownloadSchemaRequest](../../models/operations/DownloadSchemaRequest.md) | :heavy_check_mark:                                                        | The request object to use for the request.                                |

### Response

**[DownloadSchemaResponse](../../models/operations/DownloadSchemaResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/Error    | 4XX                    | application/json       |
| models/errors/SDKError | 5XX                    | \*/\*                  |

## downloadSchemaRevision

Download a particular schema revision for an Api.

### Example Usage

```java
package hello.world;

import dev.speakeasyapi.javaclientsdk.ChaseTest;
import dev.speakeasyapi.javaclientsdk.models.errors.Error;
import dev.speakeasyapi.javaclientsdk.models.operations.DownloadSchemaRevisionRequest;
import dev.speakeasyapi.javaclientsdk.models.operations.DownloadSchemaRevisionResponse;
import dev.speakeasyapi.javaclientsdk.models.shared.Security;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws Error, Exception {

        ChaseTest sdk = ChaseTest.builder()
                .security(Security.builder()
                    .apiKey("<YOUR_API_KEY_HERE>")
                    .build())
            .build();

        DownloadSchemaRevisionRequest req = DownloadSchemaRevisionRequest.builder()
                .apiID("<value>")
                .revisionID("<value>")
                .versionID("<value>")
                .build();

        DownloadSchemaRevisionResponse res = sdk.schemas().downloadSchemaRevision()
                .request(req)
                .call();

        if (res.twoXXApplicationJsonSchema().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                                                 | Type                                                                                      | Required                                                                                  | Description                                                                               |
| ----------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------- |
| `request`                                                                                 | [DownloadSchemaRevisionRequest](../../models/operations/DownloadSchemaRevisionRequest.md) | :heavy_check_mark:                                                                        | The request object to use for the request.                                                |

### Response

**[DownloadSchemaRevisionResponse](../../models/operations/DownloadSchemaRevisionResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/Error    | 4XX                    | application/json       |
| models/errors/SDKError | 5XX                    | \*/\*                  |

## getSchema

Returns information about the last uploaded schema for a particular API version.
This won't include the schema itself, that can be retrieved via the downloadSchema operation.

### Example Usage

```java
package hello.world;

import dev.speakeasyapi.javaclientsdk.ChaseTest;
import dev.speakeasyapi.javaclientsdk.models.errors.Error;
import dev.speakeasyapi.javaclientsdk.models.operations.GetSchemaRequest;
import dev.speakeasyapi.javaclientsdk.models.operations.GetSchemaResponse;
import dev.speakeasyapi.javaclientsdk.models.shared.Security;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws Error, Exception {

        ChaseTest sdk = ChaseTest.builder()
                .security(Security.builder()
                    .apiKey("<YOUR_API_KEY_HERE>")
                    .build())
            .build();

        GetSchemaRequest req = GetSchemaRequest.builder()
                .apiID("<value>")
                .versionID("<value>")
                .build();

        GetSchemaResponse res = sdk.schemas().getSchema()
                .request(req)
                .call();

        if (res.schema().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                       | Type                                                            | Required                                                        | Description                                                     |
| --------------------------------------------------------------- | --------------------------------------------------------------- | --------------------------------------------------------------- | --------------------------------------------------------------- |
| `request`                                                       | [GetSchemaRequest](../../models/operations/GetSchemaRequest.md) | :heavy_check_mark:                                              | The request object to use for the request.                      |

### Response

**[GetSchemaResponse](../../models/operations/GetSchemaResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/Error    | 4XX                    | application/json       |
| models/errors/SDKError | 5XX                    | \*/\*                  |

## getSchemaDiff

Get a diff of two schema revisions for an Api.

### Example Usage

```java
package hello.world;

import dev.speakeasyapi.javaclientsdk.ChaseTest;
import dev.speakeasyapi.javaclientsdk.models.errors.Error;
import dev.speakeasyapi.javaclientsdk.models.operations.GetSchemaDiffRequest;
import dev.speakeasyapi.javaclientsdk.models.operations.GetSchemaDiffResponse;
import dev.speakeasyapi.javaclientsdk.models.shared.Security;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws Error, Exception {

        ChaseTest sdk = ChaseTest.builder()
                .security(Security.builder()
                    .apiKey("<YOUR_API_KEY_HERE>")
                    .build())
            .build();

        GetSchemaDiffRequest req = GetSchemaDiffRequest.builder()
                .apiID("<value>")
                .baseRevisionID("<value>")
                .targetRevisionID("<value>")
                .versionID("<value>")
                .build();

        GetSchemaDiffResponse res = sdk.schemas().getSchemaDiff()
                .request(req)
                .call();

        if (res.schemaDiff().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                               | Type                                                                    | Required                                                                | Description                                                             |
| ----------------------------------------------------------------------- | ----------------------------------------------------------------------- | ----------------------------------------------------------------------- | ----------------------------------------------------------------------- |
| `request`                                                               | [GetSchemaDiffRequest](../../models/operations/GetSchemaDiffRequest.md) | :heavy_check_mark:                                                      | The request object to use for the request.                              |

### Response

**[GetSchemaDiffResponse](../../models/operations/GetSchemaDiffResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/Error    | 4XX                    | application/json       |
| models/errors/SDKError | 5XX                    | \*/\*                  |

## getSchemaRevision

Returns information about the last uploaded schema for a particular schema revision.
This won't include the schema itself, that can be retrieved via the downloadSchema operation.

### Example Usage

```java
package hello.world;

import dev.speakeasyapi.javaclientsdk.ChaseTest;
import dev.speakeasyapi.javaclientsdk.models.errors.Error;
import dev.speakeasyapi.javaclientsdk.models.operations.GetSchemaRevisionRequest;
import dev.speakeasyapi.javaclientsdk.models.operations.GetSchemaRevisionResponse;
import dev.speakeasyapi.javaclientsdk.models.shared.Security;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws Error, Exception {

        ChaseTest sdk = ChaseTest.builder()
                .security(Security.builder()
                    .apiKey("<YOUR_API_KEY_HERE>")
                    .build())
            .build();

        GetSchemaRevisionRequest req = GetSchemaRevisionRequest.builder()
                .apiID("<value>")
                .revisionID("<value>")
                .versionID("<value>")
                .build();

        GetSchemaRevisionResponse res = sdk.schemas().getSchemaRevision()
                .request(req)
                .call();

        if (res.schema().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                                       | Type                                                                            | Required                                                                        | Description                                                                     |
| ------------------------------------------------------------------------------- | ------------------------------------------------------------------------------- | ------------------------------------------------------------------------------- | ------------------------------------------------------------------------------- |
| `request`                                                                       | [GetSchemaRevisionRequest](../../models/operations/GetSchemaRevisionRequest.md) | :heavy_check_mark:                                                              | The request object to use for the request.                                      |

### Response

**[GetSchemaRevisionResponse](../../models/operations/GetSchemaRevisionResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/Error    | 4XX                    | application/json       |
| models/errors/SDKError | 5XX                    | \*/\*                  |

## getSchemas

Returns information the schemas associated with a particular apiID.
This won't include the schemas themselves, they can be retrieved via the downloadSchema operation.

### Example Usage

```java
package hello.world;

import dev.speakeasyapi.javaclientsdk.ChaseTest;
import dev.speakeasyapi.javaclientsdk.models.errors.Error;
import dev.speakeasyapi.javaclientsdk.models.operations.GetSchemasRequest;
import dev.speakeasyapi.javaclientsdk.models.operations.GetSchemasResponse;
import dev.speakeasyapi.javaclientsdk.models.shared.Security;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws Error, Exception {

        ChaseTest sdk = ChaseTest.builder()
                .security(Security.builder()
                    .apiKey("<YOUR_API_KEY_HERE>")
                    .build())
            .build();

        GetSchemasRequest req = GetSchemasRequest.builder()
                .apiID("<value>")
                .versionID("<value>")
                .build();

        GetSchemasResponse res = sdk.schemas().getSchemas()
                .request(req)
                .call();

        if (res.classes().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                         | Type                                                              | Required                                                          | Description                                                       |
| ----------------------------------------------------------------- | ----------------------------------------------------------------- | ----------------------------------------------------------------- | ----------------------------------------------------------------- |
| `request`                                                         | [GetSchemasRequest](../../models/operations/GetSchemasRequest.md) | :heavy_check_mark:                                                | The request object to use for the request.                        |

### Response

**[GetSchemasResponse](../../models/operations/GetSchemasResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/Error    | 4XX                    | application/json       |
| models/errors/SDKError | 5XX                    | \*/\*                  |

## registerSchema

Allows uploading a schema for a particular API version.
This will be used to populate ApiEndpoints and used as a base for any schema generation if present.

### Example Usage

```java
package hello.world;

import dev.speakeasyapi.javaclientsdk.ChaseTest;
import dev.speakeasyapi.javaclientsdk.models.errors.Error;
import dev.speakeasyapi.javaclientsdk.models.operations.RegisterSchemaFile;
import dev.speakeasyapi.javaclientsdk.models.operations.RegisterSchemaRequest;
import dev.speakeasyapi.javaclientsdk.models.operations.RegisterSchemaRequestBody;
import dev.speakeasyapi.javaclientsdk.models.operations.RegisterSchemaResponse;
import dev.speakeasyapi.javaclientsdk.models.shared.Security;
import java.lang.Exception;
import java.nio.charset.StandardCharsets;

public class Application {

    public static void main(String[] args) throws Error, Exception {

        ChaseTest sdk = ChaseTest.builder()
                .security(Security.builder()
                    .apiKey("<YOUR_API_KEY_HERE>")
                    .build())
            .build();

        RegisterSchemaRequest req = RegisterSchemaRequest.builder()
                .requestBody(RegisterSchemaRequestBody.builder()
                    .file(RegisterSchemaFile.builder()
                        .content("0xCFA30D144c".getBytes(StandardCharsets.UTF_8))
                        .fileName("example.file")
                        .build())
                    .build())
                .apiID("<value>")
                .versionID("<value>")
                .build();

        RegisterSchemaResponse res = sdk.schemas().registerSchema()
                .request(req)
                .call();

        // handle response
    }
}
```

### Parameters

| Parameter                                                                 | Type                                                                      | Required                                                                  | Description                                                               |
| ------------------------------------------------------------------------- | ------------------------------------------------------------------------- | ------------------------------------------------------------------------- | ------------------------------------------------------------------------- |
| `request`                                                                 | [RegisterSchemaRequest](../../models/operations/RegisterSchemaRequest.md) | :heavy_check_mark:                                                        | The request object to use for the request.                                |

### Response

**[RegisterSchemaResponse](../../models/operations/RegisterSchemaResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/Error    | 4XX                    | application/json       |
| models/errors/SDKError | 5XX                    | \*/\*                  |