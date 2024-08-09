# Artifacts
(*artifacts()*)

## Overview

REST APIs for working with Registry artifacts

### Available Operations

* [getBlob](#getblob) - Get blob for a particular digest
* [getManifest](#getmanifest) - Get manifest for a particular reference
* [getNamespaces](#getnamespaces) - Each namespace contains many revisions.
* [getOASSummary](#getoassummary)
* [getRevisions](#getrevisions)
* [getTags](#gettags)
* [postTags](#posttags) - Add tags to an existing revision
* [preflight](#preflight) - Get access token for communicating with OCI distribution endpoints

## getBlob

Get blob for a particular digest

### Example Usage

```java
package hello.world;

import io.github.speakeasy_sdks_staging.javaclientsdk.SDK;
import io.github.speakeasy_sdks_staging.javaclientsdk.models.errors.SDKError;
import io.github.speakeasy_sdks_staging.javaclientsdk.models.operations.GetBlobRequest;
import io.github.speakeasy_sdks_staging.javaclientsdk.models.operations.GetBlobResponse;
import io.github.speakeasy_sdks_staging.javaclientsdk.models.shared.Security;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws Exception {
        try {
            SDK sdk = SDK.builder()
                .security(Security.builder()
                    .apiKey("<YOUR_API_KEY_HERE>")
                    .build())
                .build();

            GetBlobRequest req = GetBlobRequest.builder()
                .digest("<value>")
                .namespaceName("<value>")
                .organizationSlug("<value>")
                .workspaceSlug("<value>")
                .build();

            GetBlobResponse res = sdk.artifacts().getBlob()
                .request(req)
                .call();

            if (res.blob().isPresent()) {
                // handle response
            }
        } catch (SDKError e) {
            // handle exception
            throw e;
        } catch (Exception e) {
            // handle exception
            throw e;
        }

    }
}
```

### Parameters

| Parameter                                                   | Type                                                        | Required                                                    | Description                                                 |
| ----------------------------------------------------------- | ----------------------------------------------------------- | ----------------------------------------------------------- | ----------------------------------------------------------- |
| `request`                                                   | [GetBlobRequest](../../models/operations/GetBlobRequest.md) | :heavy_check_mark:                                          | The request object to use for the request.                  |


### Response

**[GetBlobResponse](../../models/operations/GetBlobResponse.md)**
### Errors

| Error Object           | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4xx-5xx                | \*\/*                  |

## getManifest

Get manifest for a particular reference

### Example Usage

```java
package hello.world;

import io.github.speakeasy_sdks_staging.javaclientsdk.SDK;
import io.github.speakeasy_sdks_staging.javaclientsdk.models.errors.SDKError;
import io.github.speakeasy_sdks_staging.javaclientsdk.models.operations.GetManifestRequest;
import io.github.speakeasy_sdks_staging.javaclientsdk.models.operations.GetManifestResponse;
import io.github.speakeasy_sdks_staging.javaclientsdk.models.shared.Security;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws Exception {
        try {
            SDK sdk = SDK.builder()
                .security(Security.builder()
                    .apiKey("<YOUR_API_KEY_HERE>")
                    .build())
                .build();

            GetManifestRequest req = GetManifestRequest.builder()
                .namespaceName("<value>")
                .organizationSlug("<value>")
                .revisionReference("<value>")
                .workspaceSlug("<value>")
                .build();

            GetManifestResponse res = sdk.artifacts().getManifest()
                .request(req)
                .call();

            if (res.manifest().isPresent()) {
                // handle response
            }
        } catch (SDKError e) {
            // handle exception
            throw e;
        } catch (Exception e) {
            // handle exception
            throw e;
        }

    }
}
```

### Parameters

| Parameter                                                           | Type                                                                | Required                                                            | Description                                                         |
| ------------------------------------------------------------------- | ------------------------------------------------------------------- | ------------------------------------------------------------------- | ------------------------------------------------------------------- |
| `request`                                                           | [GetManifestRequest](../../models/operations/GetManifestRequest.md) | :heavy_check_mark:                                                  | The request object to use for the request.                          |


### Response

**[GetManifestResponse](../../models/operations/GetManifestResponse.md)**
### Errors

| Error Object           | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4xx-5xx                | \*\/*                  |

## getNamespaces

Each namespace contains many revisions.

### Example Usage

```java
package hello.world;

import io.github.speakeasy_sdks_staging.javaclientsdk.SDK;
import io.github.speakeasy_sdks_staging.javaclientsdk.models.errors.SDKError;
import io.github.speakeasy_sdks_staging.javaclientsdk.models.operations.GetNamespacesResponse;
import io.github.speakeasy_sdks_staging.javaclientsdk.models.shared.Security;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws Exception {
        try {
            SDK sdk = SDK.builder()
                .security(Security.builder()
                    .apiKey("<YOUR_API_KEY_HERE>")
                    .build())
                .build();

            GetNamespacesResponse res = sdk.artifacts().getNamespaces()
                .call();

            if (res.getNamespacesResponse().isPresent()) {
                // handle response
            }
        } catch (SDKError e) {
            // handle exception
            throw e;
        } catch (Exception e) {
            // handle exception
            throw e;
        }

    }
}
```


### Response

**[GetNamespacesResponse](../../models/operations/GetNamespacesResponse.md)**
### Errors

| Error Object           | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4xx-5xx                | \*\/*                  |

## getOASSummary

### Example Usage

```java
package hello.world;

import io.github.speakeasy_sdks_staging.javaclientsdk.SDK;
import io.github.speakeasy_sdks_staging.javaclientsdk.models.errors.SDKError;
import io.github.speakeasy_sdks_staging.javaclientsdk.models.operations.GetOASSummaryRequest;
import io.github.speakeasy_sdks_staging.javaclientsdk.models.operations.GetOASSummaryResponse;
import io.github.speakeasy_sdks_staging.javaclientsdk.models.shared.Security;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws Exception {
        try {
            SDK sdk = SDK.builder()
                .security(Security.builder()
                    .apiKey("<YOUR_API_KEY_HERE>")
                    .build())
                .build();

            GetOASSummaryRequest req = GetOASSummaryRequest.builder()
                .namespaceName("<value>")
                .revisionReference("<value>")
                .build();

            GetOASSummaryResponse res = sdk.artifacts().getOASSummary()
                .request(req)
                .call();

            if (res.oasSummary().isPresent()) {
                // handle response
            }
        } catch (SDKError e) {
            // handle exception
            throw e;
        } catch (Exception e) {
            // handle exception
            throw e;
        }

    }
}
```

### Parameters

| Parameter                                                               | Type                                                                    | Required                                                                | Description                                                             |
| ----------------------------------------------------------------------- | ----------------------------------------------------------------------- | ----------------------------------------------------------------------- | ----------------------------------------------------------------------- |
| `request`                                                               | [GetOASSummaryRequest](../../models/operations/GetOASSummaryRequest.md) | :heavy_check_mark:                                                      | The request object to use for the request.                              |


### Response

**[GetOASSummaryResponse](../../models/operations/GetOASSummaryResponse.md)**
### Errors

| Error Object           | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4xx-5xx                | \*\/*                  |

## getRevisions

### Example Usage

```java
package hello.world;

import io.github.speakeasy_sdks_staging.javaclientsdk.SDK;
import io.github.speakeasy_sdks_staging.javaclientsdk.models.errors.SDKError;
import io.github.speakeasy_sdks_staging.javaclientsdk.models.operations.GetRevisionsRequest;
import io.github.speakeasy_sdks_staging.javaclientsdk.models.operations.GetRevisionsResponse;
import io.github.speakeasy_sdks_staging.javaclientsdk.models.shared.Security;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws Exception {
        try {
            SDK sdk = SDK.builder()
                .security(Security.builder()
                    .apiKey("<YOUR_API_KEY_HERE>")
                    .build())
                .build();

            GetRevisionsRequest req = GetRevisionsRequest.builder()
                .namespaceName("<value>")
                .build();

            GetRevisionsResponse res = sdk.artifacts().getRevisions()
                .request(req)
                .call();

            if (res.getRevisionsResponse().isPresent()) {
                // handle response
            }
        } catch (SDKError e) {
            // handle exception
            throw e;
        } catch (Exception e) {
            // handle exception
            throw e;
        }

    }
}
```

### Parameters

| Parameter                                                             | Type                                                                  | Required                                                              | Description                                                           |
| --------------------------------------------------------------------- | --------------------------------------------------------------------- | --------------------------------------------------------------------- | --------------------------------------------------------------------- |
| `request`                                                             | [GetRevisionsRequest](../../models/operations/GetRevisionsRequest.md) | :heavy_check_mark:                                                    | The request object to use for the request.                            |


### Response

**[GetRevisionsResponse](../../models/operations/GetRevisionsResponse.md)**
### Errors

| Error Object           | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4xx-5xx                | \*\/*                  |

## getTags

### Example Usage

```java
package hello.world;

import io.github.speakeasy_sdks_staging.javaclientsdk.SDK;
import io.github.speakeasy_sdks_staging.javaclientsdk.models.errors.SDKError;
import io.github.speakeasy_sdks_staging.javaclientsdk.models.operations.GetTagsRequest;
import io.github.speakeasy_sdks_staging.javaclientsdk.models.operations.GetTagsResponse;
import io.github.speakeasy_sdks_staging.javaclientsdk.models.shared.Security;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws Exception {
        try {
            SDK sdk = SDK.builder()
                .security(Security.builder()
                    .apiKey("<YOUR_API_KEY_HERE>")
                    .build())
                .build();

            GetTagsRequest req = GetTagsRequest.builder()
                .namespaceName("<value>")
                .build();

            GetTagsResponse res = sdk.artifacts().getTags()
                .request(req)
                .call();

            if (res.getTagsResponse().isPresent()) {
                // handle response
            }
        } catch (SDKError e) {
            // handle exception
            throw e;
        } catch (Exception e) {
            // handle exception
            throw e;
        }

    }
}
```

### Parameters

| Parameter                                                   | Type                                                        | Required                                                    | Description                                                 |
| ----------------------------------------------------------- | ----------------------------------------------------------- | ----------------------------------------------------------- | ----------------------------------------------------------- |
| `request`                                                   | [GetTagsRequest](../../models/operations/GetTagsRequest.md) | :heavy_check_mark:                                          | The request object to use for the request.                  |


### Response

**[GetTagsResponse](../../models/operations/GetTagsResponse.md)**
### Errors

| Error Object           | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4xx-5xx                | \*\/*                  |

## postTags

Add tags to an existing revision

### Example Usage

```java
package hello.world;

import io.github.speakeasy_sdks_staging.javaclientsdk.SDK;
import io.github.speakeasy_sdks_staging.javaclientsdk.models.errors.SDKError;
import io.github.speakeasy_sdks_staging.javaclientsdk.models.operations.PostTagsRequest;
import io.github.speakeasy_sdks_staging.javaclientsdk.models.operations.PostTagsResponse;
import io.github.speakeasy_sdks_staging.javaclientsdk.models.shared.Security;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws Exception {
        try {
            SDK sdk = SDK.builder()
                .security(Security.builder()
                    .apiKey("<YOUR_API_KEY_HERE>")
                    .build())
                .build();

            PostTagsRequest req = PostTagsRequest.builder()
                .namespaceName("<value>")
                .build();

            PostTagsResponse res = sdk.artifacts().postTags()
                .request(req)
                .call();

            // handle response
        } catch (SDKError e) {
            // handle exception
            throw e;
        } catch (Exception e) {
            // handle exception
            throw e;
        }

    }
}
```

### Parameters

| Parameter                                                     | Type                                                          | Required                                                      | Description                                                   |
| ------------------------------------------------------------- | ------------------------------------------------------------- | ------------------------------------------------------------- | ------------------------------------------------------------- |
| `request`                                                     | [PostTagsRequest](../../models/operations/PostTagsRequest.md) | :heavy_check_mark:                                            | The request object to use for the request.                    |


### Response

**[PostTagsResponse](../../models/operations/PostTagsResponse.md)**
### Errors

| Error Object           | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4xx-5xx                | \*\/*                  |

## preflight

Get access token for communicating with OCI distribution endpoints

### Example Usage

```java
package hello.world;

import io.github.speakeasy_sdks_staging.javaclientsdk.SDK;
import io.github.speakeasy_sdks_staging.javaclientsdk.models.errors.SDKError;
import io.github.speakeasy_sdks_staging.javaclientsdk.models.operations.PreflightResponse;
import io.github.speakeasy_sdks_staging.javaclientsdk.models.shared.PreflightRequest;
import io.github.speakeasy_sdks_staging.javaclientsdk.models.shared.Security;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws Exception {
        try {
            SDK sdk = SDK.builder()
                .security(Security.builder()
                    .apiKey("<YOUR_API_KEY_HERE>")
                    .build())
                .build();

            PreflightRequest req = PreflightRequest.builder()
                .namespaceName("<value>")
                .build();

            PreflightResponse res = sdk.artifacts().preflight()
                .request(req)
                .call();

            if (res.preflightToken().isPresent()) {
                // handle response
            }
        } catch (SDKError e) {
            // handle exception
            throw e;
        } catch (Exception e) {
            // handle exception
            throw e;
        }

    }
}
```

### Parameters

| Parameter                                                   | Type                                                        | Required                                                    | Description                                                 |
| ----------------------------------------------------------- | ----------------------------------------------------------- | ----------------------------------------------------------- | ----------------------------------------------------------- |
| `request`                                                   | [PreflightRequest](../../models/shared/PreflightRequest.md) | :heavy_check_mark:                                          | The request object to use for the request.                  |


### Response

**[PreflightResponse](../../models/operations/PreflightResponse.md)**
### Errors

| Error Object           | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4xx-5xx                | \*\/*                  |
