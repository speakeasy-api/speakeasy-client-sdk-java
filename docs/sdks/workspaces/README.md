# Workspaces
(*workspaces()*)

## Overview

REST APIs for managing Workspaces (speakeasy tenancy)

### Available Operations

* [create](#create) - Create a workspace
* [createToken](#createtoken) - Create a token for a particular workspace
* [deleteToken](#deletetoken) - Delete a token for a particular workspace
* [get](#get) - Get workspace by context
* [getAll](#getall) - Get workspaces for a user
* [getByID](#getbyid) - Get workspace
* [getFeatureFlags](#getfeatureflags) - Get workspace feature flags
* [getSettings](#getsettings) - Get workspace settings
* [getTeam](#getteam) - Get team members for a particular workspace
* [getTokens](#gettokens) - Get tokens for a particular workspace
* [grantAccess](#grantaccess) - Grant a user access to a particular workspace
* [revokeAccess](#revokeaccess) - Revoke a user's access to a particular workspace
* [setFeatureFlags](#setfeatureflags) - Set workspace feature flags
* [update](#update) - Update workspace details
* [updateSettings](#updatesettings) - Update workspace settings

## create

Creates a workspace

### Example Usage

```java
package hello.world;

import dev.speakeasyapi.javaclientsdk.RyanTest;
import dev.speakeasyapi.javaclientsdk.models.errors.Error;
import dev.speakeasyapi.javaclientsdk.models.operations.CreateWorkspaceResponse;
import dev.speakeasyapi.javaclientsdk.models.shared.Security;
import dev.speakeasyapi.javaclientsdk.models.shared.Workspace;
import java.lang.Exception;
import java.time.OffsetDateTime;

public class Application {

    public static void main(String[] args) throws Error, Exception {

        RyanTest sdk = RyanTest.builder()
                .security(Security.builder()
                    .apiKey("<YOUR_API_KEY_HERE>")
                    .build())
            .build();

        Workspace req = Workspace.builder()
                .createdAt(OffsetDateTime.parse("2023-06-18T07:14:55.338Z"))
                .id("<id>")
                .name("<value>")
                .organizationId("<id>")
                .slug("<value>")
                .updatedAt(OffsetDateTime.parse("2023-12-01T17:06:07.804Z"))
                .verified(true)
                .build();

        CreateWorkspaceResponse res = sdk.workspaces().create()
                .request(req)
                .call();

        if (res.workspace().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                     | Type                                          | Required                                      | Description                                   |
| --------------------------------------------- | --------------------------------------------- | --------------------------------------------- | --------------------------------------------- |
| `request`                                     | [Workspace](../../models/shared/Workspace.md) | :heavy_check_mark:                            | The request object to use for the request.    |

### Response

**[CreateWorkspaceResponse](../../models/operations/CreateWorkspaceResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/Error    | 4XX                    | application/json       |
| models/errors/SDKError | 5XX                    | \*/\*                  |

## createToken

Create a token for a particular workspace

### Example Usage

```java
package hello.world;

import dev.speakeasyapi.javaclientsdk.RyanTest;
import dev.speakeasyapi.javaclientsdk.models.errors.Error;
import dev.speakeasyapi.javaclientsdk.models.operations.CreateWorkspaceTokenRequest;
import dev.speakeasyapi.javaclientsdk.models.operations.CreateWorkspaceTokenResponse;
import dev.speakeasyapi.javaclientsdk.models.shared.Security;
import dev.speakeasyapi.javaclientsdk.models.shared.WorkspaceToken;
import java.lang.Exception;
import java.time.OffsetDateTime;

public class Application {

    public static void main(String[] args) throws Error, Exception {

        RyanTest sdk = RyanTest.builder()
                .security(Security.builder()
                    .apiKey("<YOUR_API_KEY_HERE>")
                    .build())
            .build();

        CreateWorkspaceTokenRequest req = CreateWorkspaceTokenRequest.builder()
                .workspaceToken(WorkspaceToken.builder()
                    .alg("<value>")
                    .createdAt(OffsetDateTime.parse("2022-08-16T02:33:00.784Z"))
                    .id("<id>")
                    .key("<key>")
                    .name("<value>")
                    .workspaceId("<id>")
                    .build())
                .workspaceId("<id>")
                .build();

        CreateWorkspaceTokenResponse res = sdk.workspaces().createToken()
                .request(req)
                .call();

        // handle response
    }
}
```

### Parameters

| Parameter                                                                             | Type                                                                                  | Required                                                                              | Description                                                                           |
| ------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------- |
| `request`                                                                             | [CreateWorkspaceTokenRequest](../../models/operations/CreateWorkspaceTokenRequest.md) | :heavy_check_mark:                                                                    | The request object to use for the request.                                            |

### Response

**[CreateWorkspaceTokenResponse](../../models/operations/CreateWorkspaceTokenResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/Error    | 4XX                    | application/json       |
| models/errors/SDKError | 5XX                    | \*/\*                  |

## deleteToken

Delete a token for a particular workspace

### Example Usage

```java
package hello.world;

import dev.speakeasyapi.javaclientsdk.RyanTest;
import dev.speakeasyapi.javaclientsdk.models.errors.Error;
import dev.speakeasyapi.javaclientsdk.models.operations.DeleteWorkspaceTokenRequest;
import dev.speakeasyapi.javaclientsdk.models.operations.DeleteWorkspaceTokenResponse;
import dev.speakeasyapi.javaclientsdk.models.shared.Security;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws Error, Exception {

        RyanTest sdk = RyanTest.builder()
                .security(Security.builder()
                    .apiKey("<YOUR_API_KEY_HERE>")
                    .build())
            .build();

        DeleteWorkspaceTokenRequest req = DeleteWorkspaceTokenRequest.builder()
                .tokenID("<id>")
                .workspaceId("<id>")
                .build();

        DeleteWorkspaceTokenResponse res = sdk.workspaces().deleteToken()
                .request(req)
                .call();

        // handle response
    }
}
```

### Parameters

| Parameter                                                                             | Type                                                                                  | Required                                                                              | Description                                                                           |
| ------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------- |
| `request`                                                                             | [DeleteWorkspaceTokenRequest](../../models/operations/DeleteWorkspaceTokenRequest.md) | :heavy_check_mark:                                                                    | The request object to use for the request.                                            |

### Response

**[DeleteWorkspaceTokenResponse](../../models/operations/DeleteWorkspaceTokenResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/Error    | 4XX                    | application/json       |
| models/errors/SDKError | 5XX                    | \*/\*                  |

## get

Get information about a particular workspace by context.

### Example Usage

```java
package hello.world;

import dev.speakeasyapi.javaclientsdk.RyanTest;
import dev.speakeasyapi.javaclientsdk.models.errors.Error;
import dev.speakeasyapi.javaclientsdk.models.operations.GetWorkspaceByContextResponse;
import dev.speakeasyapi.javaclientsdk.models.shared.Security;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws Error, Exception {

        RyanTest sdk = RyanTest.builder()
                .security(Security.builder()
                    .apiKey("<YOUR_API_KEY_HERE>")
                    .build())
            .build();

        GetWorkspaceByContextResponse res = sdk.workspaces().get()
                .call();

        if (res.workspaceAndOrganization().isPresent()) {
            // handle response
        }
    }
}
```

### Response

**[GetWorkspaceByContextResponse](../../models/operations/GetWorkspaceByContextResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/Error    | 4XX                    | application/json       |
| models/errors/SDKError | 5XX                    | \*/\*                  |

## getAll

Returns a list of workspaces a user has access too

### Example Usage

```java
package hello.world;

import dev.speakeasyapi.javaclientsdk.RyanTest;
import dev.speakeasyapi.javaclientsdk.models.errors.Error;
import dev.speakeasyapi.javaclientsdk.models.operations.GetWorkspacesResponse;
import dev.speakeasyapi.javaclientsdk.models.shared.Security;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws Error, Exception {

        RyanTest sdk = RyanTest.builder()
                .security(Security.builder()
                    .apiKey("<YOUR_API_KEY_HERE>")
                    .build())
            .build();

        GetWorkspacesResponse res = sdk.workspaces().getAll()
                .call();

        if (res.workspaces().isPresent()) {
            // handle response
        }
    }
}
```

### Response

**[GetWorkspacesResponse](../../models/operations/GetWorkspacesResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/Error    | 4XX                    | application/json       |
| models/errors/SDKError | 5XX                    | \*/\*                  |

## getByID

Get information about a particular workspace.

### Example Usage

```java
package hello.world;

import dev.speakeasyapi.javaclientsdk.RyanTest;
import dev.speakeasyapi.javaclientsdk.models.errors.Error;
import dev.speakeasyapi.javaclientsdk.models.operations.GetWorkspaceRequest;
import dev.speakeasyapi.javaclientsdk.models.operations.GetWorkspaceResponse;
import dev.speakeasyapi.javaclientsdk.models.shared.Security;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws Error, Exception {

        RyanTest sdk = RyanTest.builder()
                .security(Security.builder()
                    .apiKey("<YOUR_API_KEY_HERE>")
                    .build())
            .build();

        GetWorkspaceRequest req = GetWorkspaceRequest.builder()
                .workspaceId("<id>")
                .build();

        GetWorkspaceResponse res = sdk.workspaces().getByID()
                .request(req)
                .call();

        if (res.workspace().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                             | Type                                                                  | Required                                                              | Description                                                           |
| --------------------------------------------------------------------- | --------------------------------------------------------------------- | --------------------------------------------------------------------- | --------------------------------------------------------------------- |
| `request`                                                             | [GetWorkspaceRequest](../../models/operations/GetWorkspaceRequest.md) | :heavy_check_mark:                                                    | The request object to use for the request.                            |

### Response

**[GetWorkspaceResponse](../../models/operations/GetWorkspaceResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/Error    | 4XX                    | application/json       |
| models/errors/SDKError | 5XX                    | \*/\*                  |

## getFeatureFlags

Get workspace feature flags

### Example Usage

```java
package hello.world;

import dev.speakeasyapi.javaclientsdk.RyanTest;
import dev.speakeasyapi.javaclientsdk.models.errors.Error;
import dev.speakeasyapi.javaclientsdk.models.operations.GetWorkspaceFeatureFlagsRequest;
import dev.speakeasyapi.javaclientsdk.models.operations.GetWorkspaceFeatureFlagsResponse;
import dev.speakeasyapi.javaclientsdk.models.shared.Security;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws Error, Exception {

        RyanTest sdk = RyanTest.builder()
                .security(Security.builder()
                    .apiKey("<YOUR_API_KEY_HERE>")
                    .build())
            .build();

        GetWorkspaceFeatureFlagsRequest req = GetWorkspaceFeatureFlagsRequest.builder()
                .workspaceId("<id>")
                .build();

        GetWorkspaceFeatureFlagsResponse res = sdk.workspaces().getFeatureFlags()
                .request(req)
                .call();

        if (res.workspaceFeatureFlagResponse().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                                                     | Type                                                                                          | Required                                                                                      | Description                                                                                   |
| --------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------- |
| `request`                                                                                     | [GetWorkspaceFeatureFlagsRequest](../../models/operations/GetWorkspaceFeatureFlagsRequest.md) | :heavy_check_mark:                                                                            | The request object to use for the request.                                                    |

### Response

**[GetWorkspaceFeatureFlagsResponse](../../models/operations/GetWorkspaceFeatureFlagsResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/Error    | 5XX                    | application/json       |
| models/errors/SDKError | 4XX                    | \*/\*                  |

## getSettings

Get settings about a particular workspace.

### Example Usage

```java
package hello.world;

import dev.speakeasyapi.javaclientsdk.RyanTest;
import dev.speakeasyapi.javaclientsdk.models.errors.Error;
import dev.speakeasyapi.javaclientsdk.models.operations.GetWorkspaceSettingsRequest;
import dev.speakeasyapi.javaclientsdk.models.operations.GetWorkspaceSettingsResponse;
import dev.speakeasyapi.javaclientsdk.models.shared.Security;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws Error, Exception {

        RyanTest sdk = RyanTest.builder()
                .security(Security.builder()
                    .apiKey("<YOUR_API_KEY_HERE>")
                    .build())
            .build();

        GetWorkspaceSettingsRequest req = GetWorkspaceSettingsRequest.builder()
                .workspaceId("<id>")
                .build();

        GetWorkspaceSettingsResponse res = sdk.workspaces().getSettings()
                .request(req)
                .call();

        if (res.workspaceSettings().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                                             | Type                                                                                  | Required                                                                              | Description                                                                           |
| ------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------- |
| `request`                                                                             | [GetWorkspaceSettingsRequest](../../models/operations/GetWorkspaceSettingsRequest.md) | :heavy_check_mark:                                                                    | The request object to use for the request.                                            |

### Response

**[GetWorkspaceSettingsResponse](../../models/operations/GetWorkspaceSettingsResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/Error    | 4XX                    | application/json       |
| models/errors/SDKError | 5XX                    | \*/\*                  |

## getTeam

Get team members for a particular workspace

### Example Usage

```java
package hello.world;

import dev.speakeasyapi.javaclientsdk.RyanTest;
import dev.speakeasyapi.javaclientsdk.models.errors.Error;
import dev.speakeasyapi.javaclientsdk.models.operations.GetWorkspaceTeamRequest;
import dev.speakeasyapi.javaclientsdk.models.operations.GetWorkspaceTeamResponse;
import dev.speakeasyapi.javaclientsdk.models.shared.Security;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws Error, Exception {

        RyanTest sdk = RyanTest.builder()
                .security(Security.builder()
                    .apiKey("<YOUR_API_KEY_HERE>")
                    .build())
            .build();

        GetWorkspaceTeamRequest req = GetWorkspaceTeamRequest.builder()
                .workspaceId("<id>")
                .build();

        GetWorkspaceTeamResponse res = sdk.workspaces().getTeam()
                .request(req)
                .call();

        if (res.workspaceTeamResponse().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                                     | Type                                                                          | Required                                                                      | Description                                                                   |
| ----------------------------------------------------------------------------- | ----------------------------------------------------------------------------- | ----------------------------------------------------------------------------- | ----------------------------------------------------------------------------- |
| `request`                                                                     | [GetWorkspaceTeamRequest](../../models/operations/GetWorkspaceTeamRequest.md) | :heavy_check_mark:                                                            | The request object to use for the request.                                    |

### Response

**[GetWorkspaceTeamResponse](../../models/operations/GetWorkspaceTeamResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/Error    | 4XX                    | application/json       |
| models/errors/SDKError | 5XX                    | \*/\*                  |

## getTokens

Get tokens for a particular workspace

### Example Usage

```java
package hello.world;

import dev.speakeasyapi.javaclientsdk.RyanTest;
import dev.speakeasyapi.javaclientsdk.models.errors.Error;
import dev.speakeasyapi.javaclientsdk.models.operations.GetWorkspaceTokensRequest;
import dev.speakeasyapi.javaclientsdk.models.operations.GetWorkspaceTokensResponse;
import dev.speakeasyapi.javaclientsdk.models.shared.Security;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws Error, Exception {

        RyanTest sdk = RyanTest.builder()
                .security(Security.builder()
                    .apiKey("<YOUR_API_KEY_HERE>")
                    .build())
            .build();

        GetWorkspaceTokensRequest req = GetWorkspaceTokensRequest.builder()
                .workspaceId("<id>")
                .build();

        GetWorkspaceTokensResponse res = sdk.workspaces().getTokens()
                .request(req)
                .call();

        if (res.classes().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                                         | Type                                                                              | Required                                                                          | Description                                                                       |
| --------------------------------------------------------------------------------- | --------------------------------------------------------------------------------- | --------------------------------------------------------------------------------- | --------------------------------------------------------------------------------- |
| `request`                                                                         | [GetWorkspaceTokensRequest](../../models/operations/GetWorkspaceTokensRequest.md) | :heavy_check_mark:                                                                | The request object to use for the request.                                        |

### Response

**[GetWorkspaceTokensResponse](../../models/operations/GetWorkspaceTokensResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/Error    | 4XX                    | application/json       |
| models/errors/SDKError | 5XX                    | \*/\*                  |

## grantAccess

Grant a user access to a particular workspace

### Example Usage

```java
package hello.world;

import dev.speakeasyapi.javaclientsdk.RyanTest;
import dev.speakeasyapi.javaclientsdk.models.errors.Error;
import dev.speakeasyapi.javaclientsdk.models.operations.GrantUserAccessToWorkspaceRequest;
import dev.speakeasyapi.javaclientsdk.models.operations.GrantUserAccessToWorkspaceResponse;
import dev.speakeasyapi.javaclientsdk.models.shared.Security;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws Error, Exception {

        RyanTest sdk = RyanTest.builder()
                .security(Security.builder()
                    .apiKey("<YOUR_API_KEY_HERE>")
                    .build())
            .build();

        GrantUserAccessToWorkspaceRequest req = GrantUserAccessToWorkspaceRequest.builder()
                .email("Lucinda.Batz8@hotmail.com")
                .workspaceId("<id>")
                .build();

        GrantUserAccessToWorkspaceResponse res = sdk.workspaces().grantAccess()
                .request(req)
                .call();

        if (res.workspaceInviteResponse().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                                                         | Type                                                                                              | Required                                                                                          | Description                                                                                       |
| ------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------- |
| `request`                                                                                         | [GrantUserAccessToWorkspaceRequest](../../models/operations/GrantUserAccessToWorkspaceRequest.md) | :heavy_check_mark:                                                                                | The request object to use for the request.                                                        |

### Response

**[GrantUserAccessToWorkspaceResponse](../../models/operations/GrantUserAccessToWorkspaceResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/Error    | 4XX                    | application/json       |
| models/errors/SDKError | 5XX                    | \*/\*                  |

## revokeAccess

Revoke a user's access to a particular workspace

### Example Usage

```java
package hello.world;

import dev.speakeasyapi.javaclientsdk.RyanTest;
import dev.speakeasyapi.javaclientsdk.models.errors.Error;
import dev.speakeasyapi.javaclientsdk.models.operations.RevokeUserAccessToWorkspaceRequest;
import dev.speakeasyapi.javaclientsdk.models.operations.RevokeUserAccessToWorkspaceResponse;
import dev.speakeasyapi.javaclientsdk.models.shared.Security;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws Error, Exception {

        RyanTest sdk = RyanTest.builder()
                .security(Security.builder()
                    .apiKey("<YOUR_API_KEY_HERE>")
                    .build())
            .build();

        RevokeUserAccessToWorkspaceRequest req = RevokeUserAccessToWorkspaceRequest.builder()
                .userId("<id>")
                .workspaceId("<id>")
                .build();

        RevokeUserAccessToWorkspaceResponse res = sdk.workspaces().revokeAccess()
                .request(req)
                .call();

        // handle response
    }
}
```

### Parameters

| Parameter                                                                                           | Type                                                                                                | Required                                                                                            | Description                                                                                         |
| --------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------- |
| `request`                                                                                           | [RevokeUserAccessToWorkspaceRequest](../../models/operations/RevokeUserAccessToWorkspaceRequest.md) | :heavy_check_mark:                                                                                  | The request object to use for the request.                                                          |

### Response

**[RevokeUserAccessToWorkspaceResponse](../../models/operations/RevokeUserAccessToWorkspaceResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/Error    | 4XX                    | application/json       |
| models/errors/SDKError | 5XX                    | \*/\*                  |

## setFeatureFlags

Set workspace feature flags

### Example Usage

```java
package hello.world;

import dev.speakeasyapi.javaclientsdk.RyanTest;
import dev.speakeasyapi.javaclientsdk.models.errors.Error;
import dev.speakeasyapi.javaclientsdk.models.operations.SetWorkspaceFeatureFlagsResponse;
import dev.speakeasyapi.javaclientsdk.models.shared.Security;
import dev.speakeasyapi.javaclientsdk.models.shared.WorkspaceFeatureFlag;
import dev.speakeasyapi.javaclientsdk.models.shared.WorkspaceFeatureFlagRequest;
import java.lang.Exception;
import java.util.List;

public class Application {

    public static void main(String[] args) throws Error, Exception {

        RyanTest sdk = RyanTest.builder()
                .security(Security.builder()
                    .apiKey("<YOUR_API_KEY_HERE>")
                    .build())
            .build();

        WorkspaceFeatureFlagRequest req = WorkspaceFeatureFlagRequest.builder()
                .featureFlags(List.of(
                    WorkspaceFeatureFlag.SKIP_SCHEMA_REGISTRY,
                    WorkspaceFeatureFlag.WEBHOOKS))
                .build();

        SetWorkspaceFeatureFlagsResponse res = sdk.workspaces().setFeatureFlags()
                .request(req)
                .call();

        if (res.workspaceFeatureFlagResponse().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                                         | Type                                                                              | Required                                                                          | Description                                                                       |
| --------------------------------------------------------------------------------- | --------------------------------------------------------------------------------- | --------------------------------------------------------------------------------- | --------------------------------------------------------------------------------- |
| `request`                                                                         | [WorkspaceFeatureFlagRequest](../../models/shared/WorkspaceFeatureFlagRequest.md) | :heavy_check_mark:                                                                | The request object to use for the request.                                        |

### Response

**[SetWorkspaceFeatureFlagsResponse](../../models/operations/SetWorkspaceFeatureFlagsResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/Error    | 5XX                    | application/json       |
| models/errors/SDKError | 4XX                    | \*/\*                  |

## update

Update information about a particular workspace.

### Example Usage

```java
package hello.world;

import dev.speakeasyapi.javaclientsdk.RyanTest;
import dev.speakeasyapi.javaclientsdk.models.errors.Error;
import dev.speakeasyapi.javaclientsdk.models.operations.UpdateWorkspaceDetailsRequest;
import dev.speakeasyapi.javaclientsdk.models.operations.UpdateWorkspaceDetailsResponse;
import dev.speakeasyapi.javaclientsdk.models.shared.Security;
import dev.speakeasyapi.javaclientsdk.models.shared.Workspace;
import java.lang.Exception;
import java.time.OffsetDateTime;

public class Application {

    public static void main(String[] args) throws Error, Exception {

        RyanTest sdk = RyanTest.builder()
                .security(Security.builder()
                    .apiKey("<YOUR_API_KEY_HERE>")
                    .build())
            .build();

        UpdateWorkspaceDetailsRequest req = UpdateWorkspaceDetailsRequest.builder()
                .workspace(Workspace.builder()
                    .createdAt(OffsetDateTime.parse("2024-07-28T19:04:48.565Z"))
                    .id("<id>")
                    .name("<value>")
                    .organizationId("<id>")
                    .slug("<value>")
                    .updatedAt(OffsetDateTime.parse("2023-10-17T10:52:42.015Z"))
                    .verified(true)
                    .build())
                .workspaceId("<id>")
                .build();

        UpdateWorkspaceDetailsResponse res = sdk.workspaces().update()
                .request(req)
                .call();

        // handle response
    }
}
```

### Parameters

| Parameter                                                                                 | Type                                                                                      | Required                                                                                  | Description                                                                               |
| ----------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------- |
| `request`                                                                                 | [UpdateWorkspaceDetailsRequest](../../models/operations/UpdateWorkspaceDetailsRequest.md) | :heavy_check_mark:                                                                        | The request object to use for the request.                                                |

### Response

**[UpdateWorkspaceDetailsResponse](../../models/operations/UpdateWorkspaceDetailsResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/Error    | 4XX                    | application/json       |
| models/errors/SDKError | 5XX                    | \*/\*                  |

## updateSettings

Update settings about a particular workspace.

### Example Usage

```java
package hello.world;

import dev.speakeasyapi.javaclientsdk.RyanTest;
import dev.speakeasyapi.javaclientsdk.models.errors.Error;
import dev.speakeasyapi.javaclientsdk.models.operations.UpdateWorkspaceSettingsRequest;
import dev.speakeasyapi.javaclientsdk.models.operations.UpdateWorkspaceSettingsResponse;
import dev.speakeasyapi.javaclientsdk.models.shared.Security;
import dev.speakeasyapi.javaclientsdk.models.shared.WorkspaceSettings;
import java.lang.Exception;
import java.time.OffsetDateTime;

public class Application {

    public static void main(String[] args) throws Error, Exception {

        RyanTest sdk = RyanTest.builder()
                .security(Security.builder()
                    .apiKey("<YOUR_API_KEY_HERE>")
                    .build())
            .build();

        UpdateWorkspaceSettingsRequest req = UpdateWorkspaceSettingsRequest.builder()
                .workspaceSettings(WorkspaceSettings.builder()
                    .createdAt(OffsetDateTime.parse("2022-07-05T11:43:28.305Z"))
                    .updatedAt(OffsetDateTime.parse("2023-05-15T05:39:21.874Z"))
                    .webhookUrl("https://grown-pharmacopoeia.net")
                    .workspaceId("<id>")
                    .build())
                .workspaceId("<id>")
                .build();

        UpdateWorkspaceSettingsResponse res = sdk.workspaces().updateSettings()
                .request(req)
                .call();

        // handle response
    }
}
```

### Parameters

| Parameter                                                                                   | Type                                                                                        | Required                                                                                    | Description                                                                                 |
| ------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------- |
| `request`                                                                                   | [UpdateWorkspaceSettingsRequest](../../models/operations/UpdateWorkspaceSettingsRequest.md) | :heavy_check_mark:                                                                          | The request object to use for the request.                                                  |

### Response

**[UpdateWorkspaceSettingsResponse](../../models/operations/UpdateWorkspaceSettingsResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/Error    | 4XX                    | application/json       |
| models/errors/SDKError | 5XX                    | \*/\*                  |