# Artifacts
(*artifacts()*)

## Overview

REST APIs for working with Registry artifacts

### Available Operations

* [createRemoteSource](#createremotesource) - Configure a new remote source
* [getBlob](#getblob) - Get blob for a particular digest
* [getManifest](#getmanifest) - Get manifest for a particular reference
* [getNamespaces](#getnamespaces) - Each namespace contains many revisions.
* [getRevisions](#getrevisions)
* [getTags](#gettags)
* [listRemoteSources](#listremotesources) - Get remote sources attached to a particular namespace
* [postTags](#posttags) - Add tags to an existing revision
* [preflight](#preflight) - Get access token for communicating with OCI distribution endpoints
* [setVisibility](#setvisibility) - Set visibility of a namespace with an existing metadata entry

## createRemoteSource

Configure a new remote source

### Example Usage

```java
package hello.world;

import dev.speakeasyapi.javaclientsdk.SDK;
import dev.speakeasyapi.javaclientsdk.models.errors.Error;
import dev.speakeasyapi.javaclientsdk.models.operations.CreateRemoteSourceResponse;
import dev.speakeasyapi.javaclientsdk.models.shared.RemoteDocument;
import dev.speakeasyapi.javaclientsdk.models.shared.RemoteSource;
import dev.speakeasyapi.javaclientsdk.models.shared.Security;
import java.lang.Exception;
import java.util.List;

public class Application {

    public static void main(String[] args) throws Error, Exception {

        SDK sdk = SDK.builder()
                .security(Security.builder()
                    .apiKey("<YOUR_API_KEY_HERE>")
                    .build())
            .build();

        RemoteSource req = RemoteSource.builder()
                .inputs(List.of(
                    RemoteDocument.builder()
                        .registryUrl("https://productive-swine.net")
                        .build()))
                .output(RemoteDocument.builder()
                    .registryUrl("https://spiteful-apricot.info")
                    .build())
                .build();

        CreateRemoteSourceResponse res = sdk.artifacts().createRemoteSource()
                .request(req)
                .call();

        // handle response
    }
}
```

### Parameters

| Parameter                                           | Type                                                | Required                                            | Description                                         |
| --------------------------------------------------- | --------------------------------------------------- | --------------------------------------------------- | --------------------------------------------------- |
| `request`                                           | [RemoteSource](../../models/shared/RemoteSource.md) | :heavy_check_mark:                                  | The request object to use for the request.          |

### Response

**[CreateRemoteSourceResponse](../../models/operations/CreateRemoteSourceResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/Error    | 4XX                    | application/json       |
| models/errors/SDKError | 5XX                    | \*/\*                  |

## getBlob

Get blob for a particular digest

### Example Usage

```java
package hello.world;

import dev.speakeasyapi.javaclientsdk.SDK;
import dev.speakeasyapi.javaclientsdk.models.errors.Error;
import dev.speakeasyapi.javaclientsdk.models.operations.GetBlobRequest;
import dev.speakeasyapi.javaclientsdk.models.operations.GetBlobResponse;
import dev.speakeasyapi.javaclientsdk.models.shared.Security;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws Error, Exception {

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

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/Error    | 4XX                    | application/json       |
| models/errors/SDKError | 5XX                    | \*/\*                  |

## getManifest

Get manifest for a particular reference

### Example Usage

```java
package hello.world;

import dev.speakeasyapi.javaclientsdk.SDK;
import dev.speakeasyapi.javaclientsdk.models.errors.Error;
import dev.speakeasyapi.javaclientsdk.models.operations.GetManifestRequest;
import dev.speakeasyapi.javaclientsdk.models.operations.GetManifestResponse;
import dev.speakeasyapi.javaclientsdk.models.shared.Security;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws Error, Exception {

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

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/Error    | 4XX                    | application/json       |
| models/errors/SDKError | 5XX                    | \*/\*                  |

## getNamespaces

Each namespace contains many revisions.

### Example Usage

```java
package hello.world;

import dev.speakeasyapi.javaclientsdk.SDK;
import dev.speakeasyapi.javaclientsdk.models.errors.Error;
import dev.speakeasyapi.javaclientsdk.models.operations.GetNamespacesRequest;
import dev.speakeasyapi.javaclientsdk.models.operations.GetNamespacesResponse;
import dev.speakeasyapi.javaclientsdk.models.shared.Security;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws Error, Exception {

        SDK sdk = SDK.builder()
                .security(Security.builder()
                    .apiKey("<YOUR_API_KEY_HERE>")
                    .build())
            .build();

        GetNamespacesRequest req = GetNamespacesRequest.builder()
                .build();

        GetNamespacesResponse res = sdk.artifacts().getNamespaces()
                .request(req)
                .call();

        if (res.getNamespacesResponse().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                               | Type                                                                    | Required                                                                | Description                                                             |
| ----------------------------------------------------------------------- | ----------------------------------------------------------------------- | ----------------------------------------------------------------------- | ----------------------------------------------------------------------- |
| `request`                                                               | [GetNamespacesRequest](../../models/operations/GetNamespacesRequest.md) | :heavy_check_mark:                                                      | The request object to use for the request.                              |

### Response

**[GetNamespacesResponse](../../models/operations/GetNamespacesResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/Error    | 4XX                    | application/json       |
| models/errors/SDKError | 5XX                    | \*/\*                  |

## getRevisions

### Example Usage

```java
package hello.world;

import dev.speakeasyapi.javaclientsdk.SDK;
import dev.speakeasyapi.javaclientsdk.models.errors.Error;
import dev.speakeasyapi.javaclientsdk.models.operations.GetRevisionsRequest;
import dev.speakeasyapi.javaclientsdk.models.operations.GetRevisionsResponse;
import dev.speakeasyapi.javaclientsdk.models.shared.Security;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws Error, Exception {

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

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/Error    | 4XX                    | application/json       |
| models/errors/SDKError | 5XX                    | \*/\*                  |

## getTags

### Example Usage

```java
package hello.world;

import dev.speakeasyapi.javaclientsdk.SDK;
import dev.speakeasyapi.javaclientsdk.models.errors.Error;
import dev.speakeasyapi.javaclientsdk.models.operations.GetTagsRequest;
import dev.speakeasyapi.javaclientsdk.models.operations.GetTagsResponse;
import dev.speakeasyapi.javaclientsdk.models.shared.Security;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws Error, Exception {

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

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/Error    | 4XX                    | application/json       |
| models/errors/SDKError | 5XX                    | \*/\*                  |

## listRemoteSources

Get remote sources attached to a particular namespace

### Example Usage

```java
package hello.world;

import dev.speakeasyapi.javaclientsdk.SDK;
import dev.speakeasyapi.javaclientsdk.models.errors.Error;
import dev.speakeasyapi.javaclientsdk.models.operations.ListRemoteSourcesRequest;
import dev.speakeasyapi.javaclientsdk.models.operations.ListRemoteSourcesResponse;
import dev.speakeasyapi.javaclientsdk.models.shared.Security;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws Error, Exception {

        SDK sdk = SDK.builder()
                .security(Security.builder()
                    .apiKey("<YOUR_API_KEY_HERE>")
                    .build())
            .build();

        ListRemoteSourcesRequest req = ListRemoteSourcesRequest.builder()
                .namespaceName("<value>")
                .build();

        ListRemoteSourcesResponse res = sdk.artifacts().listRemoteSources()
                .request(req)
                .call();

        if (res.remoteSource().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                                       | Type                                                                            | Required                                                                        | Description                                                                     |
| ------------------------------------------------------------------------------- | ------------------------------------------------------------------------------- | ------------------------------------------------------------------------------- | ------------------------------------------------------------------------------- |
| `request`                                                                       | [ListRemoteSourcesRequest](../../models/operations/ListRemoteSourcesRequest.md) | :heavy_check_mark:                                                              | The request object to use for the request.                                      |

### Response

**[ListRemoteSourcesResponse](../../models/operations/ListRemoteSourcesResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/Error    | 4XX                    | application/json       |
| models/errors/SDKError | 5XX                    | \*/\*                  |

## postTags

Add tags to an existing revision

### Example Usage

```java
package hello.world;

import dev.speakeasyapi.javaclientsdk.SDK;
import dev.speakeasyapi.javaclientsdk.models.errors.Error;
import dev.speakeasyapi.javaclientsdk.models.operations.PostTagsRequest;
import dev.speakeasyapi.javaclientsdk.models.operations.PostTagsResponse;
import dev.speakeasyapi.javaclientsdk.models.shared.Security;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws Error, Exception {

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

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/Error    | 4XX                    | application/json       |
| models/errors/SDKError | 5XX                    | \*/\*                  |

## preflight

Get access token for communicating with OCI distribution endpoints

### Example Usage

```java
package hello.world;

import dev.speakeasyapi.javaclientsdk.SDK;
import dev.speakeasyapi.javaclientsdk.models.errors.Error;
import dev.speakeasyapi.javaclientsdk.models.operations.PreflightResponse;
import dev.speakeasyapi.javaclientsdk.models.shared.PreflightRequest;
import dev.speakeasyapi.javaclientsdk.models.shared.Security;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws Error, Exception {

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

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/Error    | 4XX                    | application/json       |
| models/errors/SDKError | 5XX                    | \*/\*                  |

## setVisibility

Set visibility of a namespace with an existing metadata entry

### Example Usage

```java
package hello.world;

import dev.speakeasyapi.javaclientsdk.SDK;
import dev.speakeasyapi.javaclientsdk.models.errors.Error;
import dev.speakeasyapi.javaclientsdk.models.operations.SetVisibilityRequest;
import dev.speakeasyapi.javaclientsdk.models.operations.SetVisibilityResponse;
import dev.speakeasyapi.javaclientsdk.models.shared.Security;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws Error, Exception {

        SDK sdk = SDK.builder()
                .security(Security.builder()
                    .apiKey("<YOUR_API_KEY_HERE>")
                    .build())
            .build();

        SetVisibilityRequest req = SetVisibilityRequest.builder()
                .namespaceName("<value>")
                .build();

        SetVisibilityResponse res = sdk.artifacts().setVisibility()
                .request(req)
                .call();

        // handle response
    }
}
```

### Parameters

| Parameter                                                               | Type                                                                    | Required                                                                | Description                                                             |
| ----------------------------------------------------------------------- | ----------------------------------------------------------------------- | ----------------------------------------------------------------------- | ----------------------------------------------------------------------- |
| `request`                                                               | [SetVisibilityRequest](../../models/operations/SetVisibilityRequest.md) | :heavy_check_mark:                                                      | The request object to use for the request.                              |

### Response

**[SetVisibilityResponse](../../models/operations/SetVisibilityResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/Error    | 4XX                    | application/json       |
| models/errors/SDKError | 5XX                    | \*/\*                  |