package io.github.openapi_sdks.javaclientsdk.models.operations;

import io.github.openapi_sdks.javaclientsdk.utils.SpeakeasyMetadata;

public class QueryEventLogQueryParams {
    @SpeakeasyMetadata("queryParam:serialization=json,name=filters")
    public io.github.openapi_sdks.javaclientsdk.models.shared.Filters filters;
    public QueryEventLogQueryParams withFilters(io.github.openapi_sdks.javaclientsdk.models.shared.Filters filters) {
        this.filters = filters;
        return this;
    }
    
}