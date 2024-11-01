# AccessToken

An AccessToken is a token that can be used to authenticate with the Speakeasy API.


## Fields

| Field                                                     | Type                                                      | Required                                                  | Description                                               |
| --------------------------------------------------------- | --------------------------------------------------------- | --------------------------------------------------------- | --------------------------------------------------------- |
| `accessToken`                                             | *String*                                                  | :heavy_check_mark:                                        | N/A                                                       |
| `claims`                                                  | [Claims](../../models/shared/Claims.md)                   | :heavy_check_mark:                                        | N/A                                                       |
| `featureFlags`                                            | List\<[FeatureFlag](../../models/shared/FeatureFlag.md)>  | :heavy_minus_sign:                                        | N/A                                                       |
| `user`                                                    | [AccessTokenUser](../../models/shared/AccessTokenUser.md) | :heavy_check_mark:                                        | N/A                                                       |
| `workspaces`                                              | List\<[Workspaces](../../models/shared/Workspaces.md)>    | :heavy_minus_sign:                                        | N/A                                                       |