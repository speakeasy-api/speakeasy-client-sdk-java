# GithubPublishingPRResponse

Open generation PRs pending publishing


## Fields

| Field                                                                        | Type                                                                         | Required                                                                     | Description                                                                  |
| ---------------------------------------------------------------------------- | ---------------------------------------------------------------------------- | ---------------------------------------------------------------------------- | ---------------------------------------------------------------------------- |
| `pendingVersion`                                                             | *Optional\<String>*                                                          | :heavy_minus_sign:                                                           | N/A                                                                          |
| `pullRequest`                                                                | *Optional\<String>*                                                          | :heavy_minus_sign:                                                           | N/A                                                                          |
| `pullRequestMetadata`                                                        | [Optional\<PullRequestMetadata>](../../models/shared/PullRequestMetadata.md) | :heavy_minus_sign:                                                           | This can only be populated when the github app is installed for a repo       |