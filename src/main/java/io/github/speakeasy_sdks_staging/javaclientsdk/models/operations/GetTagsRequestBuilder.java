/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package io.github.speakeasy_sdks_staging.javaclientsdk.models.operations;

import io.github.speakeasy_sdks_staging.javaclientsdk.utils.Utils;

public class GetTagsRequestBuilder {

    private GetTagsRequest request;
    private final SDKMethodInterfaces.MethodCallGetTags sdk;

    public GetTagsRequestBuilder(SDKMethodInterfaces.MethodCallGetTags sdk) {
        this.sdk = sdk;
    }

    public GetTagsRequestBuilder request(io.github.speakeasy_sdks_staging.javaclientsdk.models.operations.GetTagsRequest request) {
        Utils.checkNotNull(request, "request");
        this.request = request;
        return this;
    }

    public GetTagsResponse call() throws Exception {

        return sdk.getTags(
            request);
    }
}
