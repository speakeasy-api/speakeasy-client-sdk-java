/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package io.github.speakeasy_sdks_staging.javaclientsdk.models.operations;

import com.fasterxml.jackson.core.type.TypeReference;
import io.github.speakeasy_sdks_staging.javaclientsdk.models.errors.SDKError;
import io.github.speakeasy_sdks_staging.javaclientsdk.utils.LazySingletonValue;
import io.github.speakeasy_sdks_staging.javaclientsdk.utils.Utils;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.time.LocalDate;
import java.time.OffsetDateTime;
import java.util.Optional;
import java.util.stream.Stream;
import org.openapitools.jackson.nullable.JsonNullable;


public class GetTagsRequestBuilder {

    private GetTagsRequest request;
    private final SDKMethodInterfaces.MethodCallGetTags sdk;

    public GetTagsRequestBuilder(SDKMethodInterfaces.MethodCallGetTags sdk) {
        this.sdk = sdk;
    }

    public GetTagsRequestBuilder request(GetTagsRequest request) {
        Utils.checkNotNull(request, "request");
        this.request = request;
        return this;
    }

    public GetTagsResponse call() throws Exception {

        return sdk.getTags(
            request);
    }
}
