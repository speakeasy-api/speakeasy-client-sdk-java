# ApiEndpointInput

An ApiEndpoint is a description of an Endpoint for an API.


## Fields

| Field                                                              | Type                                                               | Required                                                           | Description                                                        |
| ------------------------------------------------------------------ | ------------------------------------------------------------------ | ------------------------------------------------------------------ | ------------------------------------------------------------------ |
| `apiEndpointId`                                                    | *String*                                                           | :heavy_check_mark:                                                 | The ID of this ApiEndpoint. This is a hash of the method and path. |
| `description`                                                      | *String*                                                           | :heavy_check_mark:                                                 | A detailed description of the ApiEndpoint.                         |
| `displayName`                                                      | *String*                                                           | :heavy_check_mark:                                                 | A human-readable name for the ApiEndpoint.                         |
| `method`                                                           | *String*                                                           | :heavy_check_mark:                                                 | HTTP verb.                                                         |
| `path`                                                             | *String*                                                           | :heavy_check_mark:                                                 | Path that handles this Api.                                        |
| `versionId`                                                        | *String*                                                           | :heavy_check_mark:                                                 | The version ID of the Api this ApiEndpoint belongs to.             |