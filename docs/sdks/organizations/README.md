# Organizations
(*organizations()*)

## Overview

REST APIs for managing Organizations (speakeasy L1 Tenancy construct)

### Available Operations

* [create](#create) - Create an organization
* [createFreeTrial](#createfreetrial) - Create a free trial for an organization
* [get](#get) - Get organization
* [getAll](#getall) - Get organizations for a user
* [getUsage](#getusage) - Get billing usage summary for a particular organization

## create

Creates an organization

### Example Usage

```java
package hello.world;

import dev.speakeasyapi.javaclientsdk.RyanTest;
import dev.speakeasyapi.javaclientsdk.models.errors.Error;
import dev.speakeasyapi.javaclientsdk.models.operations.CreateOrganizationResponse;
import dev.speakeasyapi.javaclientsdk.models.shared.AccountType;
import dev.speakeasyapi.javaclientsdk.models.shared.Organization;
import dev.speakeasyapi.javaclientsdk.models.shared.Security;
import java.lang.Exception;
import java.time.OffsetDateTime;

public class Application {

    public static void main(String[] args) throws Error, Exception {

        RyanTest sdk = RyanTest.builder()
                .security(Security.builder()
                    .apiKey("<YOUR_API_KEY_HERE>")
                    .build())
            .build();

        Organization req = Organization.builder()
                .accountType(AccountType.SCALE_UP)
                .createdAt(OffsetDateTime.parse("2023-12-01T17:06:07.804Z"))
                .id("<id>")
                .name("<value>")
                .slug("<value>")
                .ssoActivated(true)
                .telemetryDisabled(true)
                .updatedAt(OffsetDateTime.parse("2022-05-28T06:20:22.766Z"))
                .build();

        CreateOrganizationResponse res = sdk.organizations().create()
                .request(req)
                .call();

        if (res.organization().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                           | Type                                                | Required                                            | Description                                         |
| --------------------------------------------------- | --------------------------------------------------- | --------------------------------------------------- | --------------------------------------------------- |
| `request`                                           | [Organization](../../models/shared/Organization.md) | :heavy_check_mark:                                  | The request object to use for the request.          |

### Response

**[CreateOrganizationResponse](../../models/operations/CreateOrganizationResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/Error    | 4XX                    | application/json       |
| models/errors/SDKError | 5XX                    | \*/\*                  |

## createFreeTrial

Creates a free trial for an organization

### Example Usage

```java
package hello.world;

import dev.speakeasyapi.javaclientsdk.RyanTest;
import dev.speakeasyapi.javaclientsdk.models.errors.Error;
import dev.speakeasyapi.javaclientsdk.models.operations.CreateFreeTrialResponse;
import dev.speakeasyapi.javaclientsdk.models.shared.Security;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws Error, Exception {

        RyanTest sdk = RyanTest.builder()
                .security(Security.builder()
                    .apiKey("<YOUR_API_KEY_HERE>")
                    .build())
            .build();

        CreateFreeTrialResponse res = sdk.organizations().createFreeTrial()
                .call();

        // handle response
    }
}
```

### Response

**[CreateFreeTrialResponse](../../models/operations/CreateFreeTrialResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/Error    | 4XX                    | application/json       |
| models/errors/SDKError | 5XX                    | \*/\*                  |

## get

Get information about a particular organization.

### Example Usage

```java
package hello.world;

import dev.speakeasyapi.javaclientsdk.RyanTest;
import dev.speakeasyapi.javaclientsdk.models.errors.Error;
import dev.speakeasyapi.javaclientsdk.models.operations.GetOrganizationRequest;
import dev.speakeasyapi.javaclientsdk.models.operations.GetOrganizationResponse;
import dev.speakeasyapi.javaclientsdk.models.shared.Security;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws Error, Exception {

        RyanTest sdk = RyanTest.builder()
                .security(Security.builder()
                    .apiKey("<YOUR_API_KEY_HERE>")
                    .build())
            .build();

        GetOrganizationRequest req = GetOrganizationRequest.builder()
                .organizationID("<value>")
                .build();

        GetOrganizationResponse res = sdk.organizations().get()
                .request(req)
                .call();

        if (res.organization().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                                   | Type                                                                        | Required                                                                    | Description                                                                 |
| --------------------------------------------------------------------------- | --------------------------------------------------------------------------- | --------------------------------------------------------------------------- | --------------------------------------------------------------------------- |
| `request`                                                                   | [GetOrganizationRequest](../../models/operations/GetOrganizationRequest.md) | :heavy_check_mark:                                                          | The request object to use for the request.                                  |

### Response

**[GetOrganizationResponse](../../models/operations/GetOrganizationResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/Error    | 4XX                    | application/json       |
| models/errors/SDKError | 5XX                    | \*/\*                  |

## getAll

Returns a list of organizations a user has access too

### Example Usage

```java
package hello.world;

import dev.speakeasyapi.javaclientsdk.RyanTest;
import dev.speakeasyapi.javaclientsdk.models.errors.Error;
import dev.speakeasyapi.javaclientsdk.models.operations.GetOrganizationsResponse;
import dev.speakeasyapi.javaclientsdk.models.shared.Security;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws Error, Exception {

        RyanTest sdk = RyanTest.builder()
                .security(Security.builder()
                    .apiKey("<YOUR_API_KEY_HERE>")
                    .build())
            .build();

        GetOrganizationsResponse res = sdk.organizations().getAll()
                .call();

        if (res.organizations().isPresent()) {
            // handle response
        }
    }
}
```

### Response

**[GetOrganizationsResponse](../../models/operations/GetOrganizationsResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/Error    | 4XX                    | application/json       |
| models/errors/SDKError | 5XX                    | \*/\*                  |

## getUsage

Returns a billing usage summary by target languages for a particular organization

### Example Usage

```java
package hello.world;

import dev.speakeasyapi.javaclientsdk.RyanTest;
import dev.speakeasyapi.javaclientsdk.models.errors.Error;
import dev.speakeasyapi.javaclientsdk.models.operations.GetOrganizationUsageResponse;
import dev.speakeasyapi.javaclientsdk.models.shared.Security;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws Error, Exception {

        RyanTest sdk = RyanTest.builder()
                .security(Security.builder()
                    .apiKey("<YOUR_API_KEY_HERE>")
                    .build())
            .build();

        GetOrganizationUsageResponse res = sdk.organizations().getUsage()
                .call();

        if (res.organizationUsageResponse().isPresent()) {
            // handle response
        }
    }
}
```

### Response

**[GetOrganizationUsageResponse](../../models/operations/GetOrganizationUsageResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/Error    | 4XX                    | application/json       |
| models/errors/SDKError | 5XX                    | \*/\*                  |