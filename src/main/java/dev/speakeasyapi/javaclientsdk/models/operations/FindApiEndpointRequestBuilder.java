/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package dev.speakeasyapi.javaclientsdk.models.operations;

import dev.speakeasyapi.javaclientsdk.utils.Utils;

public class FindApiEndpointRequestBuilder {

    private FindApiEndpointRequest request;
    private final SDKMethodInterfaces.MethodCallFindApiEndpoint sdk;

    public FindApiEndpointRequestBuilder(SDKMethodInterfaces.MethodCallFindApiEndpoint sdk) {
        this.sdk = sdk;
    }

    public FindApiEndpointRequestBuilder request(FindApiEndpointRequest request) {
        Utils.checkNotNull(request, "request");
        this.request = request;
        return this;
    }

    public FindApiEndpointResponse call() throws Exception {

        return sdk.findApiEndpoint(
            request);
    }
}
