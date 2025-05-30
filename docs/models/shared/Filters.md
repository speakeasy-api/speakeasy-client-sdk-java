# Filters

Filters are used to query requests.


## Fields

| Field                                          | Type                                           | Required                                       | Description                                    |
| ---------------------------------------------- | ---------------------------------------------- | ---------------------------------------------- | ---------------------------------------------- |
| `filters`                                      | List\<[Filter](../../models/shared/Filter.md)> | :heavy_check_mark:                             | A list of filters to apply to the query.       |
| `limit`                                        | *long*                                         | :heavy_check_mark:                             | The maximum number of results to return.       |
| `offset`                                       | *long*                                         | :heavy_check_mark:                             | The offset to start the query from.            |
| `operator`                                     | *String*                                       | :heavy_check_mark:                             | The operator to use when combining filters.    |