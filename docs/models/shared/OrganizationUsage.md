# OrganizationUsage


## Fields

| Field                                                     | Type                                                      | Required                                                  | Description                                               |
| --------------------------------------------------------- | --------------------------------------------------------- | --------------------------------------------------------- | --------------------------------------------------------- |
| `accessible`                                              | *boolean*                                                 | :heavy_check_mark:                                        | Indicates if the features are accessible                  |
| `accessibleFeatures`                                      | List\<*String*>                                           | :heavy_check_mark:                                        | Features that are accessible                              |
| `genLockIds`                                              | List\<*String*>                                           | :heavy_check_mark:                                        | List of generation lock IDs                               |
| `language`                                                | *String*                                                  | :heavy_check_mark:                                        | The programming language used                             |
| `maxOperations`                                           | *long*                                                    | :heavy_check_mark:                                        | Maximum Number of operations per SDK specific in contract |
| `numberOfOperations`                                      | *long*                                                    | :heavy_check_mark:                                        | Number of operations performed                            |
| `usedFeatures`                                            | List\<*String*>                                           | :heavy_check_mark:                                        | Features that have been used                              |
| `workspaces`                                              | List\<*String*>                                           | :heavy_check_mark:                                        | List of workspace IDs                                     |