/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package dev.speakeasyapi.javaclientsdk.models.operations;

import dev.speakeasyapi.javaclientsdk.utils.Utils;

public class CreateRequestBuilder {

    private CreateRequestBody request;
    private final SDKMethodInterfaces.MethodCallCreate sdk;

    public CreateRequestBuilder(SDKMethodInterfaces.MethodCallCreate sdk) {
        this.sdk = sdk;
    }

    public CreateRequestBuilder request(CreateRequestBody request) {
        Utils.checkNotNull(request, "request");
        this.request = request;
        return this;
    }

    public CreateResponse call() throws Exception {

        return sdk.create(
            request);
    }
}
