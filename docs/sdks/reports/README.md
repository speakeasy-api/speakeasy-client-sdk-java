# Reports
(*reports()*)

## Overview

REST APIs for managing reports

### Available Operations

* [getChangesReportSignedUrl](#getchangesreportsignedurl) - Get the signed access url for the change reports for a particular document.
* [getLintingReportSignedUrl](#getlintingreportsignedurl) - Get the signed access url for the linting reports for a particular document.
* [uploadReport](#uploadreport) - Upload a report.

## getChangesReportSignedUrl

Get the signed access url for the change reports for a particular document.

### Example Usage

```java
package hello.world;

import dev.speakeasyapi.javaclientsdk.SDK;
import dev.speakeasyapi.javaclientsdk.models.operations.GetChangesReportSignedUrlRequest;
import dev.speakeasyapi.javaclientsdk.models.operations.GetChangesReportSignedUrlResponse;
import dev.speakeasyapi.javaclientsdk.models.shared.Security;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws Exception {

        SDK sdk = SDK.builder()
                .security(Security.builder()
                    .apiKey("<YOUR_API_KEY_HERE>")
                    .build())
            .build();

        GetChangesReportSignedUrlRequest req = GetChangesReportSignedUrlRequest.builder()
                .documentChecksum("<value>")
                .build();

        GetChangesReportSignedUrlResponse res = sdk.reports().getChangesReportSignedUrl()
                .request(req)
                .call();

        if (res.signedAccess().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                                                       | Type                                                                                            | Required                                                                                        | Description                                                                                     |
| ----------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------- |
| `request`                                                                                       | [GetChangesReportSignedUrlRequest](../../models/operations/GetChangesReportSignedUrlRequest.md) | :heavy_check_mark:                                                                              | The request object to use for the request.                                                      |

### Response

**[GetChangesReportSignedUrlResponse](../../models/operations/GetChangesReportSignedUrlResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## getLintingReportSignedUrl

Get the signed access url for the linting reports for a particular document.

### Example Usage

```java
package hello.world;

import dev.speakeasyapi.javaclientsdk.SDK;
import dev.speakeasyapi.javaclientsdk.models.operations.GetLintingReportSignedUrlRequest;
import dev.speakeasyapi.javaclientsdk.models.operations.GetLintingReportSignedUrlResponse;
import dev.speakeasyapi.javaclientsdk.models.shared.Security;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws Exception {

        SDK sdk = SDK.builder()
                .security(Security.builder()
                    .apiKey("<YOUR_API_KEY_HERE>")
                    .build())
            .build();

        GetLintingReportSignedUrlRequest req = GetLintingReportSignedUrlRequest.builder()
                .documentChecksum("<value>")
                .build();

        GetLintingReportSignedUrlResponse res = sdk.reports().getLintingReportSignedUrl()
                .request(req)
                .call();

        if (res.signedAccess().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                                                       | Type                                                                                            | Required                                                                                        | Description                                                                                     |
| ----------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------- |
| `request`                                                                                       | [GetLintingReportSignedUrlRequest](../../models/operations/GetLintingReportSignedUrlRequest.md) | :heavy_check_mark:                                                                              | The request object to use for the request.                                                      |

### Response

**[GetLintingReportSignedUrlResponse](../../models/operations/GetLintingReportSignedUrlResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## uploadReport

Upload a report.

### Example Usage

```java
package hello.world;

import dev.speakeasyapi.javaclientsdk.SDK;
import dev.speakeasyapi.javaclientsdk.models.operations.File;
import dev.speakeasyapi.javaclientsdk.models.operations.UploadReportRequestBody;
import dev.speakeasyapi.javaclientsdk.models.operations.UploadReportResponse;
import dev.speakeasyapi.javaclientsdk.models.shared.Report;
import dev.speakeasyapi.javaclientsdk.models.shared.Security;
import java.lang.Exception;
import java.nio.charset.StandardCharsets;

public class Application {

    public static void main(String[] args) throws Exception {

        SDK sdk = SDK.builder()
                .security(Security.builder()
                    .apiKey("<YOUR_API_KEY_HERE>")
                    .build())
            .build();

        UploadReportRequestBody req = UploadReportRequestBody.builder()
                .data(Report.builder()
                    .build())
                .file(File.builder()
                    .content("0xA2Ca85EFA5".getBytes(StandardCharsets.UTF_8))
                    .fileName("example.file")
                    .build())
                .build();

        UploadReportResponse res = sdk.reports().uploadReport()
                .request(req)
                .call();

        if (res.uploadedReport().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                                     | Type                                                                          | Required                                                                      | Description                                                                   |
| ----------------------------------------------------------------------------- | ----------------------------------------------------------------------------- | ----------------------------------------------------------------------------- | ----------------------------------------------------------------------------- |
| `request`                                                                     | [UploadReportRequestBody](../../models/operations/UploadReportRequestBody.md) | :heavy_check_mark:                                                            | The request object to use for the request.                                    |

### Response

**[UploadReportResponse](../../models/operations/UploadReportResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |