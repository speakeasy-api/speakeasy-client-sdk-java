# RegisterSchemaRequest


## Fields

| Field                                                                             | Type                                                                              | Required                                                                          | Description                                                                       |
| --------------------------------------------------------------------------------- | --------------------------------------------------------------------------------- | --------------------------------------------------------------------------------- | --------------------------------------------------------------------------------- |
| `requestBody`                                                                     | [RegisterSchemaRequestBody](../../models/operations/RegisterSchemaRequestBody.md) | :heavy_check_mark:                                                                | The schema file to upload provided as a multipart/form-data file segment.         |
| `apiID`                                                                           | *String*                                                                          | :heavy_check_mark:                                                                | The ID of the Api to get the schema for.                                          |
| `versionID`                                                                       | *String*                                                                          | :heavy_check_mark:                                                                | The version ID of the Api to delete metadata for.                                 |