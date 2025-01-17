# CodeSamples
(*codeSamples()*)

## Overview

REST APIs for retrieving Code Samples

### Available Operations

* [generateCodeSamplePreview](#generatecodesamplepreview) - Generate Code Sample previews from a file and configuration parameters.
* [generateCodeSamplePreviewAsync](#generatecodesamplepreviewasync) - Initiate asynchronous Code Sample preview generation from a file and configuration parameters, receiving an async JobID response for polling.
* [getCodeSamplePreviewAsync](#getcodesamplepreviewasync) - Poll for the result of an asynchronous Code Sample preview generation.

## generateCodeSamplePreview

This endpoint generates Code Sample previews from a file and configuration parameters.

### Example Usage

```java
package hello.world;

import dev.speakeasyapi.javaclientsdk.RyanTest;
import dev.speakeasyapi.javaclientsdk.models.errors.Error;
import dev.speakeasyapi.javaclientsdk.models.operations.GenerateCodeSamplePreviewResponse;
import dev.speakeasyapi.javaclientsdk.models.shared.CodeSampleSchemaInput;
import dev.speakeasyapi.javaclientsdk.models.shared.SchemaFile;
import dev.speakeasyapi.javaclientsdk.models.shared.Security;
import java.lang.Exception;
import java.nio.charset.StandardCharsets;
import java.util.List;

public class Application {

    public static void main(String[] args) throws Error, Error, Exception {

        RyanTest sdk = RyanTest.builder()
                .security(Security.builder()
                    .apiKey("<YOUR_API_KEY_HERE>")
                    .build())
            .build();

        CodeSampleSchemaInput req = CodeSampleSchemaInput.builder()
                .languages(List.of(
                    "<value>",
                    "<value>"))
                .schemaFile(SchemaFile.builder()
                    .content("0xc3dD8BfBef".getBytes(StandardCharsets.UTF_8))
                    .fileName("example.file")
                    .build())
                .build();

        GenerateCodeSamplePreviewResponse res = sdk.codeSamples().generateCodeSamplePreview()
                .request(req)
                .call();

        if (res.twoHundredApplicationJsonResponseStream().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                             | Type                                                                  | Required                                                              | Description                                                           |
| --------------------------------------------------------------------- | --------------------------------------------------------------------- | --------------------------------------------------------------------- | --------------------------------------------------------------------- |
| `request`                                                             | [CodeSampleSchemaInput](../../models/shared/CodeSampleSchemaInput.md) | :heavy_check_mark:                                                    | The request object to use for the request.                            |

### Response

**[GenerateCodeSamplePreviewResponse](../../models/operations/GenerateCodeSamplePreviewResponse.md)**

### Errors

| Error Type          | Status Code         | Content Type        |
| ------------------- | ------------------- | ------------------- |
| models/errors/Error | 4XX                 | application/json    |
| models/errors/Error | 5XX                 | application/json    |

## generateCodeSamplePreviewAsync

This endpoint generates Code Sample previews from a file and configuration parameters, receiving an async JobID response for polling.

### Example Usage

```java
package hello.world;

import dev.speakeasyapi.javaclientsdk.RyanTest;
import dev.speakeasyapi.javaclientsdk.models.errors.Error;
import dev.speakeasyapi.javaclientsdk.models.operations.GenerateCodeSamplePreviewAsyncResponse;
import dev.speakeasyapi.javaclientsdk.models.shared.CodeSampleSchemaInput;
import dev.speakeasyapi.javaclientsdk.models.shared.SchemaFile;
import dev.speakeasyapi.javaclientsdk.models.shared.Security;
import java.lang.Exception;
import java.nio.charset.StandardCharsets;
import java.util.List;

public class Application {

    public static void main(String[] args) throws Error, Error, Exception {

        RyanTest sdk = RyanTest.builder()
                .security(Security.builder()
                    .apiKey("<YOUR_API_KEY_HERE>")
                    .build())
            .build();

        CodeSampleSchemaInput req = CodeSampleSchemaInput.builder()
                .languages(List.of(
                    "<value>",
                    "<value>",
                    "<value>"))
                .schemaFile(SchemaFile.builder()
                    .content("0xED5CDd177E".getBytes(StandardCharsets.UTF_8))
                    .fileName("example.file")
                    .build())
                .build();

        GenerateCodeSamplePreviewAsyncResponse res = sdk.codeSamples().generateCodeSamplePreviewAsync()
                .request(req)
                .call();

        if (res.object().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                             | Type                                                                  | Required                                                              | Description                                                           |
| --------------------------------------------------------------------- | --------------------------------------------------------------------- | --------------------------------------------------------------------- | --------------------------------------------------------------------- |
| `request`                                                             | [CodeSampleSchemaInput](../../models/shared/CodeSampleSchemaInput.md) | :heavy_check_mark:                                                    | The request object to use for the request.                            |

### Response

**[GenerateCodeSamplePreviewAsyncResponse](../../models/operations/GenerateCodeSamplePreviewAsyncResponse.md)**

### Errors

| Error Type          | Status Code         | Content Type        |
| ------------------- | ------------------- | ------------------- |
| models/errors/Error | 4XX                 | application/json    |
| models/errors/Error | 5XX                 | application/json    |

## getCodeSamplePreviewAsync

Poll for the result of an asynchronous Code Sample preview generation.

### Example Usage

```java
package hello.world;

import dev.speakeasyapi.javaclientsdk.RyanTest;
import dev.speakeasyapi.javaclientsdk.models.errors.Error;
import dev.speakeasyapi.javaclientsdk.models.operations.GetCodeSamplePreviewAsyncRequest;
import dev.speakeasyapi.javaclientsdk.models.operations.GetCodeSamplePreviewAsyncResponse;
import dev.speakeasyapi.javaclientsdk.models.shared.Security;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws Error, Error, Exception {

        RyanTest sdk = RyanTest.builder()
                .security(Security.builder()
                    .apiKey("<YOUR_API_KEY_HERE>")
                    .build())
            .build();

        GetCodeSamplePreviewAsyncRequest req = GetCodeSamplePreviewAsyncRequest.builder()
                .jobID("<id>")
                .build();

        GetCodeSamplePreviewAsyncResponse res = sdk.codeSamples().getCodeSamplePreviewAsync()
                .request(req)
                .call();

        if (res.twoHundredApplicationJsonResponseStream().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                                                       | Type                                                                                            | Required                                                                                        | Description                                                                                     |
| ----------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------- |
| `request`                                                                                       | [GetCodeSamplePreviewAsyncRequest](../../models/operations/GetCodeSamplePreviewAsyncRequest.md) | :heavy_check_mark:                                                                              | The request object to use for the request.                                                      |

### Response

**[GetCodeSamplePreviewAsyncResponse](../../models/operations/GetCodeSamplePreviewAsyncResponse.md)**

### Errors

| Error Type          | Status Code         | Content Type        |
| ------------------- | ------------------- | ------------------- |
| models/errors/Error | 4XX                 | application/json    |
| models/errors/Error | 5XX                 | application/json    |