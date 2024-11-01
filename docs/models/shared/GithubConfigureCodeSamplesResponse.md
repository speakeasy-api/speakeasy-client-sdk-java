# GithubConfigureCodeSamplesResponse

A response to configure GitHub code samples


## Fields

| Field                                                       | Type                                                        | Required                                                    | Description                                                 |
| ----------------------------------------------------------- | ----------------------------------------------------------- | ----------------------------------------------------------- | ----------------------------------------------------------- |
| `codeSampleOverlayRegistryURL`                              | *String*                                                    | :heavy_check_mark:                                          | The URL of the code sample overlay registry                 |
| `ghActionID`                                                | *Optional\<String>*                                         | :heavy_minus_sign:                                          | The ID of the GitHub action that was dispatched             |
| `source`                                                    | [WorkflowDocument](../../models/shared/WorkflowDocument.md) | :heavy_check_mark:                                          | A document referenced by a workflow                         |