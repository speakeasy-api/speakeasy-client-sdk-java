/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package dev.speakeasyapi.javaclientsdk.models.operations;

import dev.speakeasyapi.javaclientsdk.utils.Utils;

public class GetBlobRequestBuilder {

    private GetBlobRequest request;
    private final SDKMethodInterfaces.MethodCallGetBlob sdk;

    public GetBlobRequestBuilder(SDKMethodInterfaces.MethodCallGetBlob sdk) {
        this.sdk = sdk;
    }

    public GetBlobRequestBuilder request(dev.speakeasyapi.javaclientsdk.models.operations.GetBlobRequest request) {
        Utils.checkNotNull(request, "request");
        this.request = request;
        return this;
    }

    public GetBlobResponse call() throws Exception {

        return sdk.getBlob(
            request);
    }
}
