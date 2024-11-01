/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package dev.speakeasyapi.javaclientsdk.models.operations;

import dev.speakeasyapi.javaclientsdk.utils.Utils;

public class GithubCheckPublishingPRsRequestBuilder {

    private GithubCheckPublishingPRsRequest request;
    private final SDKMethodInterfaces.MethodCallGithubCheckPublishingPRs sdk;

    public GithubCheckPublishingPRsRequestBuilder(SDKMethodInterfaces.MethodCallGithubCheckPublishingPRs sdk) {
        this.sdk = sdk;
    }

    public GithubCheckPublishingPRsRequestBuilder request(GithubCheckPublishingPRsRequest request) {
        Utils.checkNotNull(request, "request");
        this.request = request;
        return this;
    }

    public GithubCheckPublishingPRsResponse call() throws Exception {

        return sdk.checkPublishingPRs(
            request);
    }
}
