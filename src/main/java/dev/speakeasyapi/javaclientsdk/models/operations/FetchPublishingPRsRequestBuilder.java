/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package dev.speakeasyapi.javaclientsdk.models.operations;

import dev.speakeasyapi.javaclientsdk.utils.Utils;

public class FetchPublishingPRsRequestBuilder {

    private FetchPublishingPRsRequest request;
    private final SDKMethodInterfaces.MethodCallFetchPublishingPRs sdk;

    public FetchPublishingPRsRequestBuilder(SDKMethodInterfaces.MethodCallFetchPublishingPRs sdk) {
        this.sdk = sdk;
    }

    public FetchPublishingPRsRequestBuilder request(dev.speakeasyapi.javaclientsdk.models.operations.FetchPublishingPRsRequest request) {
        Utils.checkNotNull(request, "request");
        this.request = request;
        return this;
    }

    public FetchPublishingPRsResponse call() throws Exception {

        return sdk.fetchPublishingPRs(
            request);
    }
}
