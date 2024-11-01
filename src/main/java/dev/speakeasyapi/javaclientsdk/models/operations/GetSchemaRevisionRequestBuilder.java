/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package dev.speakeasyapi.javaclientsdk.models.operations;

import dev.speakeasyapi.javaclientsdk.utils.Utils;

public class GetSchemaRevisionRequestBuilder {

    private GetSchemaRevisionRequest request;
    private final SDKMethodInterfaces.MethodCallGetSchemaRevision sdk;

    public GetSchemaRevisionRequestBuilder(SDKMethodInterfaces.MethodCallGetSchemaRevision sdk) {
        this.sdk = sdk;
    }

    public GetSchemaRevisionRequestBuilder request(GetSchemaRevisionRequest request) {
        Utils.checkNotNull(request, "request");
        this.request = request;
        return this;
    }

    public GetSchemaRevisionResponse call() throws Exception {

        return sdk.getSchemaRevision(
            request);
    }
}
