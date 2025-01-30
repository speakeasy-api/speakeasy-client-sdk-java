# SchemaDiff

A SchemaDiff represents a diff of two Schemas.


## Fields

| Field                                                           | Type                                                            | Required                                                        | Description                                                     |
| --------------------------------------------------------------- | --------------------------------------------------------------- | --------------------------------------------------------------- | --------------------------------------------------------------- |
| `additions`                                                     | List\<*String*>                                                 | :heavy_check_mark:                                              | Holds every addition change in the diff.                        |
| `deletions`                                                     | List\<*String*>                                                 | :heavy_check_mark:                                              | Holds every deletion change in the diff.                        |
| `modifications`                                                 | Map\<String, [ValueChange](../../models/shared/ValueChange.md)> | :heavy_check_mark:                                              | Holds every modification change in the diff.                    |