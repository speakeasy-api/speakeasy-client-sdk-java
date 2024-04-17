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

import io.github.speakeasy_sdks_staging.javaclientsdk.SDK;
import io.github.speakeasy_sdks_staging.javaclientsdk.models.operations.*;
import io.github.speakeasy_sdks_staging.javaclientsdk.models.operations.GetChangesReportSignedUrlRequest;
import io.github.speakeasy_sdks_staging.javaclientsdk.models.operations.GetChangesReportSignedUrlResponse;
import io.github.speakeasy_sdks_staging.javaclientsdk.models.shared.*;
import io.github.speakeasy_sdks_staging.javaclientsdk.models.shared.Security;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.time.LocalDate;
import java.time.OffsetDateTime;
import java.util.Optional;
import static java.util.Map.entry;

public class Application {

    public static void main(String[] args) {
        try {
            SDK sdk = SDK.builder()
                .security(Security.builder()
                    .apiKey("<YOUR_API_KEY_HERE>")
                    .build())
                .workspaceID("<value>")
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
        } catch (io.github.speakeasy_sdks_staging.javaclientsdk.models.errors.SDKError e) {
            // handle exception
        } catch (Exception e) {
            // handle exception
        }
    }
}
```

### Parameters

| Parameter                                                                                                                                                        | Type                                                                                                                                                             | Required                                                                                                                                                         | Description                                                                                                                                                      |
| ---------------------------------------------------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                                                                        | [io.github.speakeasy_sdks_staging.javaclientsdk.models.operations.GetChangesReportSignedUrlRequest](../../models/operations/GetChangesReportSignedUrlRequest.md) | :heavy_check_mark:                                                                                                                                               | The request object to use for the request.                                                                                                                       |


### Response

**[Optional<? extends io.github.speakeasy_sdks_staging.javaclientsdk.models.operations.GetChangesReportSignedUrlResponse>](../../models/operations/GetChangesReportSignedUrlResponse.md)**
### Errors

| Error Object           | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4xx-5xx                | */*                    |

## getLintingReportSignedUrl

Get the signed access url for the linting reports for a particular document.

### Example Usage

```java
package hello.world;

import io.github.speakeasy_sdks_staging.javaclientsdk.SDK;
import io.github.speakeasy_sdks_staging.javaclientsdk.models.operations.*;
import io.github.speakeasy_sdks_staging.javaclientsdk.models.operations.GetLintingReportSignedUrlRequest;
import io.github.speakeasy_sdks_staging.javaclientsdk.models.operations.GetLintingReportSignedUrlResponse;
import io.github.speakeasy_sdks_staging.javaclientsdk.models.shared.*;
import io.github.speakeasy_sdks_staging.javaclientsdk.models.shared.Security;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.time.LocalDate;
import java.time.OffsetDateTime;
import java.util.Optional;
import static java.util.Map.entry;

public class Application {

    public static void main(String[] args) {
        try {
            SDK sdk = SDK.builder()
                .security(Security.builder()
                    .apiKey("<YOUR_API_KEY_HERE>")
                    .build())
                .workspaceID("<value>")
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
        } catch (io.github.speakeasy_sdks_staging.javaclientsdk.models.errors.SDKError e) {
            // handle exception
        } catch (Exception e) {
            // handle exception
        }
    }
}
```

### Parameters

| Parameter                                                                                                                                                        | Type                                                                                                                                                             | Required                                                                                                                                                         | Description                                                                                                                                                      |
| ---------------------------------------------------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                                                                        | [io.github.speakeasy_sdks_staging.javaclientsdk.models.operations.GetLintingReportSignedUrlRequest](../../models/operations/GetLintingReportSignedUrlRequest.md) | :heavy_check_mark:                                                                                                                                               | The request object to use for the request.                                                                                                                       |


### Response

**[Optional<? extends io.github.speakeasy_sdks_staging.javaclientsdk.models.operations.GetLintingReportSignedUrlResponse>](../../models/operations/GetLintingReportSignedUrlResponse.md)**
### Errors

| Error Object           | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4xx-5xx                | */*                    |

## uploadReport

Upload a report.

### Example Usage

```java
package hello.world;

import io.github.speakeasy_sdks_staging.javaclientsdk.SDK;
import io.github.speakeasy_sdks_staging.javaclientsdk.models.operations.*;
import io.github.speakeasy_sdks_staging.javaclientsdk.models.operations.File;
import io.github.speakeasy_sdks_staging.javaclientsdk.models.operations.UploadReportRequestBody;
import io.github.speakeasy_sdks_staging.javaclientsdk.models.operations.UploadReportResponse;
import io.github.speakeasy_sdks_staging.javaclientsdk.models.shared.*;
import io.github.speakeasy_sdks_staging.javaclientsdk.models.shared.Report;
import io.github.speakeasy_sdks_staging.javaclientsdk.models.shared.Security;
import io.github.speakeasy_sdks_staging.javaclientsdk.models.shared.Type;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.time.LocalDate;
import java.time.OffsetDateTime;
import java.util.Optional;
import static java.util.Map.entry;

public class Application {

    public static void main(String[] args) {
        try {
            SDK sdk = SDK.builder()
                .security(Security.builder()
                    .apiKey("<YOUR_API_KEY_HERE>")
                    .build())
                .workspaceID("<value>")
                .build();

            UploadReportRequestBody req = UploadReportRequestBody.builder()
                .data(Report.builder()
                        .type(Type.CHANGES)
                        .build())
                .file(File.builder()
                        .content("0x329C0ad855".getBytes())
                        .fileName("<value>")
                        .build())
                .build();

            UploadReportResponse res = sdk.reports().uploadReport()
                .request(req)
                .call();

            if (res.uploadedReport().isPresent()) {
                // handle response
            }
        } catch (io.github.speakeasy_sdks_staging.javaclientsdk.models.errors.SDKError e) {
            // handle exception
        } catch (Exception e) {
            // handle exception
        }
    }
}
```

### Parameters

| Parameter                                                                                                                                      | Type                                                                                                                                           | Required                                                                                                                                       | Description                                                                                                                                    |
| ---------------------------------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                                                      | [io.github.speakeasy_sdks_staging.javaclientsdk.models.operations.UploadReportRequestBody](../../models/operations/UploadReportRequestBody.md) | :heavy_check_mark:                                                                                                                             | The request object to use for the request.                                                                                                     |


### Response

**[Optional<? extends io.github.speakeasy_sdks_staging.javaclientsdk.models.operations.UploadReportResponse>](../../models/operations/UploadReportResponse.md)**
### Errors

| Error Object           | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4xx-5xx                | */*                    |
