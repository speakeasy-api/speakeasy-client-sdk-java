# Plugins
(*plugins*)

## Overview

REST APIs for managing and running plugins

### Available Operations

* [getPlugins](#getplugins) - Get all plugins for the current workspace.
* [runPlugin](#runplugin) - Run a plugin
* [upsertPlugin](#upsertplugin) - Upsert a plugin

## getPlugins

Get all plugins for the current workspace.

### Example Usage

```java
package hello.world;

import dev.speakeasyapi.javaclientsdk.SDK;
import dev.speakeasyapi.javaclientsdk.models.operations.GetPluginsResponse;
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

            dev.speakeasyapi.javaclientsdk.models.operations.GetPluginsResponse res = sdk.plugins.getPlugins();

            if (res.classes != null) {
                // handle response
            }
        } catch (Exception e) {
            // handle exception
        }
    }
}
```


### Response

**[dev.speakeasyapi.javaclientsdk.models.operations.GetPluginsResponse](../../models/operations/GetPluginsResponse.md)**


## runPlugin

Run a plugin

### Example Usage

```java
package hello.world;

import dev.speakeasyapi.javaclientsdk.SDK;
import dev.speakeasyapi.javaclientsdk.models.operations.RunPluginRequest;
import dev.speakeasyapi.javaclientsdk.models.operations.RunPluginResponse;
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

            dev.speakeasyapi.javaclientsdk.models.operations.RunPluginRequest req = new RunPluginRequest(
                "string"){{
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
                    669298L,
                    94585L,
                    "string");

            }};

            dev.speakeasyapi.javaclientsdk.models.operations.RunPluginResponse res = sdk.plugins.runPlugin(req);

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

| Parameter                                                                                                        | Type                                                                                                             | Required                                                                                                         | Description                                                                                                      |
| ---------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                        | [dev.speakeasyapi.javaclientsdk.models.operations.RunPluginRequest](../../models/operations/RunPluginRequest.md) | :heavy_check_mark:                                                                                               | The request object to use for the request.                                                                       |


### Response

**[dev.speakeasyapi.javaclientsdk.models.operations.RunPluginResponse](../../models/operations/RunPluginResponse.md)**


## upsertPlugin

Upsert a plugin

### Example Usage

```java
package hello.world;

import dev.speakeasyapi.javaclientsdk.SDK;
import dev.speakeasyapi.javaclientsdk.models.operations.UpsertPluginResponse;
import dev.speakeasyapi.javaclientsdk.models.shared.Plugin;
import dev.speakeasyapi.javaclientsdk.models.shared.Security;
import java.time.OffsetDateTime;

public class Application {
    public static void main(String[] args) {
        try {
            SDK sdk = SDK.builder()
                .setSecurity(new Security(
                "string"){{
                    apiKey = "<YOUR_API_KEY_HERE>";
                }})
                .build();

            dev.speakeasyapi.javaclientsdk.models.shared.Plugin req = new Plugin(
                "string",
                "string",
                "string",
                "string"){{
                createdAt = OffsetDateTime.parse("2022-12-30T06:44:39.575Z");
                evalHash = "string";
                updatedAt = OffsetDateTime.parse("2024-08-18T02:22:14.384Z");

            }};

            dev.speakeasyapi.javaclientsdk.models.operations.UpsertPluginResponse res = sdk.plugins.upsertPlugin(req);

            if (res.plugin != null) {
                // handle response
            }
        } catch (Exception e) {
            // handle exception
        }
    }
}
```

### Parameters

| Parameter                                                                            | Type                                                                                 | Required                                                                             | Description                                                                          |
| ------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------ |
| `request`                                                                            | [dev.speakeasyapi.javaclientsdk.models.shared.Plugin](../../models/shared/Plugin.md) | :heavy_check_mark:                                                                   | The request object to use for the request.                                           |


### Response

**[dev.speakeasyapi.javaclientsdk.models.operations.UpsertPluginResponse](../../models/operations/UpsertPluginResponse.md)**

