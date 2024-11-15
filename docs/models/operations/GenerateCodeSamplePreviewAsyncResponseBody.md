# GenerateCodeSamplePreviewAsyncResponseBody

Job accepted, returns a job ID to poll for status and result


## Fields

| Field                                                                      | Type                                                                       | Required                                                                   | Description                                                                |
| -------------------------------------------------------------------------- | -------------------------------------------------------------------------- | -------------------------------------------------------------------------- | -------------------------------------------------------------------------- |
| `jobID`                                                                    | *String*                                                                   | :heavy_check_mark:                                                         | The job ID for polling                                                     |
| `status`                                                                   | [CodeSamplesJobStatus](../../models/shared/CodeSamplesJobStatus.md)        | :heavy_check_mark:                                                         | The current status of the job. Possible values are `pending` or `running`. |