# CodeSampleSchemaInput


## Fields

| Field                                            | Type                                             | Required                                         | Description                                      |
| ------------------------------------------------ | ------------------------------------------------ | ------------------------------------------------ | ------------------------------------------------ |
| `languages`                                      | List\<*String*>                                  | :heavy_check_mark:                               | A list of languages to generate code samples for |
| `packageName`                                    | *Optional\<String>*                              | :heavy_minus_sign:                               | The name of the package                          |
| `schemaFile`                                     | [SchemaFile](../../models/shared/SchemaFile.md)  | :heavy_check_mark:                               | The OpenAPI file to be uploaded                  |
| `sdkClassName`                                   | *Optional\<String>*                              | :heavy_minus_sign:                               | The SDK class name                               |