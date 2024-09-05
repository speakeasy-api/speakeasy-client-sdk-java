/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package dev.speakeasyapi.javaclientsdk.models.operations;

import dev.speakeasyapi.javaclientsdk.utils.Utils;

public class GetAllApiEndpointsRequestBuilder {

    private GetAllApiEndpointsRequest request;
    private final SDKMethodInterfaces.MethodCallGetAllApiEndpoints sdk;

    public GetAllApiEndpointsRequestBuilder(SDKMethodInterfaces.MethodCallGetAllApiEndpoints sdk) {
        this.sdk = sdk;
    }

    public GetAllApiEndpointsRequestBuilder request(dev.speakeasyapi.javaclientsdk.models.operations.GetAllApiEndpointsRequest request) {
        Utils.checkNotNull(request, "request");
        this.request = request;
        return this;
    }

    public GetAllApiEndpointsResponse call() throws Exception {

        return sdk.getAllApiEndpoints(
            request);
    }
}
