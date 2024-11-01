# GithubTriggerActionRequest

A request to trigger an action on a GitHub target


## Fields

| Field                                                  | Type                                                   | Required                                               | Description                                            |
| ------------------------------------------------------ | ------------------------------------------------------ | ------------------------------------------------------ | ------------------------------------------------------ |
| `force`                                                | *Optional\<Boolean>*                                   | :heavy_minus_sign:                                     | Force an SDK generation                                |
| `genLockId`                                            | *String*                                               | :heavy_check_mark:                                     | The generation lock ID                                 |
| `org`                                                  | *String*                                               | :heavy_check_mark:                                     | The GitHub organization name                           |
| `repoName`                                             | *String*                                               | :heavy_check_mark:                                     | The GitHub repository name                             |
| `setVersion`                                           | *Optional\<String>*                                    | :heavy_minus_sign:                                     | A version to override the SDK too in workflow dispatch |
| `targetName`                                           | *Optional\<String>*                                    | :heavy_minus_sign:                                     | The target name for the action                         |