# Github
(*github()*)

## Overview

### Available Operations

* [checkAccess](#checkaccess)
* [checkPublishingPRs](#checkpublishingprs)
* [checkPublishingSecrets](#checkpublishingsecrets)
* [configureCodeSamples](#configurecodesamples)
* [configureMintlifyRepo](#configuremintlifyrepo)
* [configureTarget](#configuretarget)
* [getAction](#getaction)
* [getSetup](#getsetup)
* [linkGithub](#linkgithub)
* [storePublishingSecrets](#storepublishingsecrets)
* [triggerAction](#triggeraction)

## checkAccess

### Example Usage

```java
package hello.world;

import dev.speakeasyapi.javaclientsdk.SDK;
import dev.speakeasyapi.javaclientsdk.models.errors.Error;
import dev.speakeasyapi.javaclientsdk.models.operations.CheckGithubAccessRequest;
import dev.speakeasyapi.javaclientsdk.models.operations.CheckGithubAccessResponse;
import dev.speakeasyapi.javaclientsdk.models.shared.Security;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws Error, Exception {

        SDK sdk = SDK.builder()
                .security(Security.builder()
                    .apiKey("<YOUR_API_KEY_HERE>")
                    .build())
            .build();

        CheckGithubAccessRequest req = CheckGithubAccessRequest.builder()
                .org("<value>")
                .repo("<value>")
                .build();

        CheckGithubAccessResponse res = sdk.github().checkAccess()
                .request(req)
                .call();

        // handle response
    }
}
```

### Parameters

| Parameter                                                                       | Type                                                                            | Required                                                                        | Description                                                                     |
| ------------------------------------------------------------------------------- | ------------------------------------------------------------------------------- | ------------------------------------------------------------------------------- | ------------------------------------------------------------------------------- |
| `request`                                                                       | [CheckGithubAccessRequest](../../models/operations/CheckGithubAccessRequest.md) | :heavy_check_mark:                                                              | The request object to use for the request.                                      |

### Response

**[CheckGithubAccessResponse](../../models/operations/CheckGithubAccessResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/Error    | 4XX                    | application/json       |
| models/errors/SDKError | 5XX                    | \*/\*                  |

## checkPublishingPRs

### Example Usage

```java
package hello.world;

import dev.speakeasyapi.javaclientsdk.SDK;
import dev.speakeasyapi.javaclientsdk.models.errors.Error;
import dev.speakeasyapi.javaclientsdk.models.operations.GithubCheckPublishingPRsRequest;
import dev.speakeasyapi.javaclientsdk.models.operations.GithubCheckPublishingPRsResponse;
import dev.speakeasyapi.javaclientsdk.models.shared.Security;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws Error, Exception {

        SDK sdk = SDK.builder()
                .security(Security.builder()
                    .apiKey("<YOUR_API_KEY_HERE>")
                    .build())
            .build();

        GithubCheckPublishingPRsRequest req = GithubCheckPublishingPRsRequest.builder()
                .generateGenLockId("<id>")
                .org("<value>")
                .repo("<value>")
                .build();

        GithubCheckPublishingPRsResponse res = sdk.github().checkPublishingPRs()
                .request(req)
                .call();

        if (res.githubPublishingPRResponse().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                                                     | Type                                                                                          | Required                                                                                      | Description                                                                                   |
| --------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------- |
| `request`                                                                                     | [GithubCheckPublishingPRsRequest](../../models/operations/GithubCheckPublishingPRsRequest.md) | :heavy_check_mark:                                                                            | The request object to use for the request.                                                    |

### Response

**[GithubCheckPublishingPRsResponse](../../models/operations/GithubCheckPublishingPRsResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/Error    | 4XX                    | application/json       |
| models/errors/SDKError | 5XX                    | \*/\*                  |

## checkPublishingSecrets

### Example Usage

```java
package hello.world;

import dev.speakeasyapi.javaclientsdk.SDK;
import dev.speakeasyapi.javaclientsdk.models.errors.Error;
import dev.speakeasyapi.javaclientsdk.models.operations.GithubCheckPublishingSecretsRequest;
import dev.speakeasyapi.javaclientsdk.models.operations.GithubCheckPublishingSecretsResponse;
import dev.speakeasyapi.javaclientsdk.models.shared.Security;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws Error, Exception {

        SDK sdk = SDK.builder()
                .security(Security.builder()
                    .apiKey("<YOUR_API_KEY_HERE>")
                    .build())
            .build();

        GithubCheckPublishingSecretsRequest req = GithubCheckPublishingSecretsRequest.builder()
                .generateGenLockId("<value>")
                .build();

        GithubCheckPublishingSecretsResponse res = sdk.github().checkPublishingSecrets()
                .request(req)
                .call();

        if (res.githubMissingPublishingSecretsResponse().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                                                             | Type                                                                                                  | Required                                                                                              | Description                                                                                           |
| ----------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------- |
| `request`                                                                                             | [GithubCheckPublishingSecretsRequest](../../models/operations/GithubCheckPublishingSecretsRequest.md) | :heavy_check_mark:                                                                                    | The request object to use for the request.                                                            |

### Response

**[GithubCheckPublishingSecretsResponse](../../models/operations/GithubCheckPublishingSecretsResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/Error    | 4XX                    | application/json       |
| models/errors/SDKError | 5XX                    | \*/\*                  |

## configureCodeSamples

### Example Usage

```java
package hello.world;

import dev.speakeasyapi.javaclientsdk.SDK;
import dev.speakeasyapi.javaclientsdk.models.errors.Error;
import dev.speakeasyapi.javaclientsdk.models.operations.GithubConfigureCodeSamplesResponse;
import dev.speakeasyapi.javaclientsdk.models.shared.GithubConfigureCodeSamplesRequest;
import dev.speakeasyapi.javaclientsdk.models.shared.Security;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws Error, Exception {

        SDK sdk = SDK.builder()
                .security(Security.builder()
                    .apiKey("<YOUR_API_KEY_HERE>")
                    .build())
            .build();

        GithubConfigureCodeSamplesRequest req = GithubConfigureCodeSamplesRequest.builder()
                .org("<value>")
                .repo("<value>")
                .targetName("<value>")
                .build();

        GithubConfigureCodeSamplesResponse res = sdk.github().configureCodeSamples()
                .request(req)
                .call();

        if (res.githubConfigureCodeSamplesResponse().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                                                     | Type                                                                                          | Required                                                                                      | Description                                                                                   |
| --------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------- |
| `request`                                                                                     | [GithubConfigureCodeSamplesRequest](../../models/shared/GithubConfigureCodeSamplesRequest.md) | :heavy_check_mark:                                                                            | The request object to use for the request.                                                    |

### Response

**[GithubConfigureCodeSamplesResponse](../../models/operations/GithubConfigureCodeSamplesResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/Error    | 4XX                    | application/json       |
| models/errors/SDKError | 5XX                    | \*/\*                  |

## configureMintlifyRepo

### Example Usage

```java
package hello.world;

import dev.speakeasyapi.javaclientsdk.SDK;
import dev.speakeasyapi.javaclientsdk.models.errors.Error;
import dev.speakeasyapi.javaclientsdk.models.operations.GithubConfigureMintlifyRepoResponse;
import dev.speakeasyapi.javaclientsdk.models.shared.GithubConfigureMintlifyRepoRequest;
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

        GithubConfigureMintlifyRepoRequest req = GithubConfigureMintlifyRepoRequest.builder()
                .input("<value>")
                .org("<value>")
                .overlays(List.of(
                    "<value>"))
                .repo("<value>")
                .build();

        GithubConfigureMintlifyRepoResponse res = sdk.github().configureMintlifyRepo()
                .request(req)
                .call();

        // handle response
    }
}
```

### Parameters

| Parameter                                                                                       | Type                                                                                            | Required                                                                                        | Description                                                                                     |
| ----------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------- |
| `request`                                                                                       | [GithubConfigureMintlifyRepoRequest](../../models/shared/GithubConfigureMintlifyRepoRequest.md) | :heavy_check_mark:                                                                              | The request object to use for the request.                                                      |

### Response

**[GithubConfigureMintlifyRepoResponse](../../models/operations/GithubConfigureMintlifyRepoResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/Error    | 4XX                    | application/json       |
| models/errors/SDKError | 5XX                    | \*/\*                  |

## configureTarget

### Example Usage

```java
package hello.world;

import dev.speakeasyapi.javaclientsdk.SDK;
import dev.speakeasyapi.javaclientsdk.models.errors.Error;
import dev.speakeasyapi.javaclientsdk.models.operations.GithubConfigureTargetResponse;
import dev.speakeasyapi.javaclientsdk.models.shared.GithubConfigureTargetRequest;
import dev.speakeasyapi.javaclientsdk.models.shared.Security;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws Error, Exception {

        SDK sdk = SDK.builder()
                .security(Security.builder()
                    .apiKey("<YOUR_API_KEY_HERE>")
                    .build())
            .build();

        GithubConfigureTargetRequest req = GithubConfigureTargetRequest.builder()
                .org("<value>")
                .repoName("<value>")
                .build();

        GithubConfigureTargetResponse res = sdk.github().configureTarget()
                .request(req)
                .call();

        // handle response
    }
}
```

### Parameters

| Parameter                                                                           | Type                                                                                | Required                                                                            | Description                                                                         |
| ----------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------- |
| `request`                                                                           | [GithubConfigureTargetRequest](../../models/shared/GithubConfigureTargetRequest.md) | :heavy_check_mark:                                                                  | The request object to use for the request.                                          |

### Response

**[GithubConfigureTargetResponse](../../models/operations/GithubConfigureTargetResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/Error    | 4XX                    | application/json       |
| models/errors/SDKError | 5XX                    | \*/\*                  |

## getAction

### Example Usage

```java
package hello.world;

import dev.speakeasyapi.javaclientsdk.SDK;
import dev.speakeasyapi.javaclientsdk.models.errors.Error;
import dev.speakeasyapi.javaclientsdk.models.operations.GetGitHubActionRequest;
import dev.speakeasyapi.javaclientsdk.models.operations.GetGitHubActionResponse;
import dev.speakeasyapi.javaclientsdk.models.shared.Security;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws Error, Exception {

        SDK sdk = SDK.builder()
                .security(Security.builder()
                    .apiKey("<YOUR_API_KEY_HERE>")
                    .build())
            .build();

        GetGitHubActionRequest req = GetGitHubActionRequest.builder()
                .org("<value>")
                .repo("<value>")
                .build();

        GetGitHubActionResponse res = sdk.github().getAction()
                .request(req)
                .call();

        if (res.githubGetActionResponse().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                                   | Type                                                                        | Required                                                                    | Description                                                                 |
| --------------------------------------------------------------------------- | --------------------------------------------------------------------------- | --------------------------------------------------------------------------- | --------------------------------------------------------------------------- |
| `request`                                                                   | [GetGitHubActionRequest](../../models/operations/GetGitHubActionRequest.md) | :heavy_check_mark:                                                          | The request object to use for the request.                                  |

### Response

**[GetGitHubActionResponse](../../models/operations/GetGitHubActionResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/Error    | 4XX                    | application/json       |
| models/errors/SDKError | 5XX                    | \*/\*                  |

## getSetup

### Example Usage

```java
package hello.world;

import dev.speakeasyapi.javaclientsdk.SDK;
import dev.speakeasyapi.javaclientsdk.models.errors.Error;
import dev.speakeasyapi.javaclientsdk.models.operations.GetGithubSetupStateRequest;
import dev.speakeasyapi.javaclientsdk.models.operations.GetGithubSetupStateResponse;
import dev.speakeasyapi.javaclientsdk.models.shared.Security;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws Error, Exception {

        SDK sdk = SDK.builder()
                .security(Security.builder()
                    .apiKey("<YOUR_API_KEY_HERE>")
                    .build())
            .build();

        GetGithubSetupStateRequest req = GetGithubSetupStateRequest.builder()
                .generateGenLockId("<id>")
                .org("<value>")
                .repo("<value>")
                .build();

        GetGithubSetupStateResponse res = sdk.github().getSetup()
                .request(req)
                .call();

        if (res.githubSetupStateResponse().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                                           | Type                                                                                | Required                                                                            | Description                                                                         |
| ----------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------- |
| `request`                                                                           | [GetGithubSetupStateRequest](../../models/operations/GetGithubSetupStateRequest.md) | :heavy_check_mark:                                                                  | The request object to use for the request.                                          |

### Response

**[GetGithubSetupStateResponse](../../models/operations/GetGithubSetupStateResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/Error    | 4XX                    | application/json       |
| models/errors/SDKError | 5XX                    | \*/\*                  |

## linkGithub

### Example Usage

```java
package hello.world;

import dev.speakeasyapi.javaclientsdk.SDK;
import dev.speakeasyapi.javaclientsdk.models.errors.Error;
import dev.speakeasyapi.javaclientsdk.models.operations.LinkGithubAccessRequest;
import dev.speakeasyapi.javaclientsdk.models.operations.LinkGithubAccessResponse;
import dev.speakeasyapi.javaclientsdk.models.shared.Security;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws Error, Exception {

        SDK sdk = SDK.builder()
                .security(Security.builder()
                    .apiKey("<YOUR_API_KEY_HERE>")
                    .build())
            .build();

        LinkGithubAccessRequest req = LinkGithubAccessRequest.builder()
                .build();

        LinkGithubAccessResponse res = sdk.github().linkGithub()
                .request(req)
                .call();

        // handle response
    }
}
```

### Parameters

| Parameter                                                                     | Type                                                                          | Required                                                                      | Description                                                                   |
| ----------------------------------------------------------------------------- | ----------------------------------------------------------------------------- | ----------------------------------------------------------------------------- | ----------------------------------------------------------------------------- |
| `request`                                                                     | [LinkGithubAccessRequest](../../models/operations/LinkGithubAccessRequest.md) | :heavy_check_mark:                                                            | The request object to use for the request.                                    |

### Response

**[LinkGithubAccessResponse](../../models/operations/LinkGithubAccessResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/Error    | 4XX                    | application/json       |
| models/errors/SDKError | 5XX                    | \*/\*                  |

## storePublishingSecrets

### Example Usage

```java
package hello.world;

import dev.speakeasyapi.javaclientsdk.SDK;
import dev.speakeasyapi.javaclientsdk.models.errors.Error;
import dev.speakeasyapi.javaclientsdk.models.operations.GithubStorePublishingSecretsResponse;
import dev.speakeasyapi.javaclientsdk.models.shared.GithubStorePublishingSecretsRequest;
import dev.speakeasyapi.javaclientsdk.models.shared.Security;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws Error, Exception {

        SDK sdk = SDK.builder()
                .security(Security.builder()
                    .apiKey("<YOUR_API_KEY_HERE>")
                    .build())
            .build();

        GithubStorePublishingSecretsRequest req = GithubStorePublishingSecretsRequest.builder()
                .generateGenLockId("<value>")
                .build();

        GithubStorePublishingSecretsResponse res = sdk.github().storePublishingSecrets()
                .request(req)
                .call();

        // handle response
    }
}
```

### Parameters

| Parameter                                                                                         | Type                                                                                              | Required                                                                                          | Description                                                                                       |
| ------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------- |
| `request`                                                                                         | [GithubStorePublishingSecretsRequest](../../models/shared/GithubStorePublishingSecretsRequest.md) | :heavy_check_mark:                                                                                | The request object to use for the request.                                                        |

### Response

**[GithubStorePublishingSecretsResponse](../../models/operations/GithubStorePublishingSecretsResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/Error    | 4XX                    | application/json       |
| models/errors/SDKError | 5XX                    | \*/\*                  |

## triggerAction

### Example Usage

```java
package hello.world;

import dev.speakeasyapi.javaclientsdk.SDK;
import dev.speakeasyapi.javaclientsdk.models.errors.Error;
import dev.speakeasyapi.javaclientsdk.models.operations.GithubTriggerActionResponse;
import dev.speakeasyapi.javaclientsdk.models.shared.GithubTriggerActionRequest;
import dev.speakeasyapi.javaclientsdk.models.shared.Security;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws Error, Exception {

        SDK sdk = SDK.builder()
                .security(Security.builder()
                    .apiKey("<YOUR_API_KEY_HERE>")
                    .build())
            .build();

        GithubTriggerActionRequest req = GithubTriggerActionRequest.builder()
                .genLockId("<id>")
                .org("<value>")
                .repoName("<value>")
                .build();

        GithubTriggerActionResponse res = sdk.github().triggerAction()
                .request(req)
                .call();

        // handle response
    }
}
```

### Parameters

| Parameter                                                                       | Type                                                                            | Required                                                                        | Description                                                                     |
| ------------------------------------------------------------------------------- | ------------------------------------------------------------------------------- | ------------------------------------------------------------------------------- | ------------------------------------------------------------------------------- |
| `request`                                                                       | [GithubTriggerActionRequest](../../models/shared/GithubTriggerActionRequest.md) | :heavy_check_mark:                                                              | The request object to use for the request.                                      |

### Response

**[GithubTriggerActionResponse](../../models/operations/GithubTriggerActionResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/Error    | 4XX                    | application/json       |
| models/errors/SDKError | 5XX                    | \*/\*                  |