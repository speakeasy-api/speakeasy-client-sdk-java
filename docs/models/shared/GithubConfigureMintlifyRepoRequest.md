# GithubConfigureMintlifyRepoRequest

A request to configure a GitHub repository for mintlify


## Fields

| Field                                    | Type                                     | Required                                 | Description                              |
| ---------------------------------------- | ---------------------------------------- | ---------------------------------------- | ---------------------------------------- |
| `input`                                  | *String*                                 | :heavy_check_mark:                       | The input OpenAPI document               |
| `org`                                    | *String*                                 | :heavy_check_mark:                       | The GitHub organization name             |
| `overlays`                               | List\<*String*>                          | :heavy_check_mark:                       | The overlays to apply                    |
| `repo`                                   | *String*                                 | :heavy_check_mark:                       | The GitHub repository name               |
| `subdirectory`                           | *Optional\<String>*                      | :heavy_minus_sign:                       | The subdirectory (location of mint.json) |