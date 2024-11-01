/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package dev.speakeasyapi.javaclientsdk.models.operations;

import dev.speakeasyapi.javaclientsdk.utils.Utils;

public class GetRevisionsRequestBuilder {

    private GetRevisionsRequest request;
    private final SDKMethodInterfaces.MethodCallGetRevisions sdk;

    public GetRevisionsRequestBuilder(SDKMethodInterfaces.MethodCallGetRevisions sdk) {
        this.sdk = sdk;
    }

    public GetRevisionsRequestBuilder request(GetRevisionsRequest request) {
        Utils.checkNotNull(request, "request");
        this.request = request;
        return this;
    }

    public GetRevisionsResponse call() throws Exception {

        return sdk.getRevisions(
            request);
    }
}
