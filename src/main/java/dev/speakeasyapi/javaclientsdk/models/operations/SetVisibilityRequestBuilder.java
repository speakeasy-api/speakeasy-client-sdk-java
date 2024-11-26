/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package dev.speakeasyapi.javaclientsdk.models.operations;

import dev.speakeasyapi.javaclientsdk.utils.Utils;

public class SetVisibilityRequestBuilder {

    private SetVisibilityRequest request;
    private final SDKMethodInterfaces.MethodCallSetVisibility sdk;

    public SetVisibilityRequestBuilder(SDKMethodInterfaces.MethodCallSetVisibility sdk) {
        this.sdk = sdk;
    }

    public SetVisibilityRequestBuilder request(SetVisibilityRequest request) {
        Utils.checkNotNull(request, "request");
        this.request = request;
        return this;
    }

    public SetVisibilityResponse call() throws Exception {

        return sdk.setVisibility(
            request);
    }
}
