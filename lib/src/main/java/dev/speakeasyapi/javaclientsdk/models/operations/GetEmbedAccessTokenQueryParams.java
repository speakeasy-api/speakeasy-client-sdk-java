package dev.speakeasyapi.javaclientsdk.models.operations;

import dev.speakeasyapi.javaclientsdk.utils.SpeakeasyMetadata;

public class GetEmbedAccessTokenQueryParams {
    @SpeakeasyMetadata("queryParam:style=form,explode=true,name=description")
    public java.util.Optional<String> description;

    @SpeakeasyMetadata("queryParam:style=form,explode=true,name=duration")
    public java.util.Optional<Long> duration;

    @SpeakeasyMetadata("queryParam:serialization=json,name=filters")
    public java.util.Optional<dev.speakeasyapi.javaclientsdk.models.shared.Filters> filters;
}