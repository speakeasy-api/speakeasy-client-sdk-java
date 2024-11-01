# GithubStorePublishingSecretsRequest

A request to store publishing secrets for a github target


## Fields

| Field                                          | Type                                           | Required                                       | Description                                    |
| ---------------------------------------------- | ---------------------------------------------- | ---------------------------------------------- | ---------------------------------------------- |
| `generateGenLockId`                            | *String*                                       | :heavy_check_mark:                             | The generation lock ID                         |
| `secrets`                                      | Map\<String, *String*>                         | :heavy_minus_sign:                             | A map of secrets to store in the GitHub target |