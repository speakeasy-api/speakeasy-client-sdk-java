/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package dev.speakeasyapi.javaclientsdk.models.operations;

import dev.speakeasyapi.javaclientsdk.utils.Utils;

public class GetAccessTokenRequestBuilder {

    private GetAccessTokenRequest request;
    private final SDKMethodInterfaces.MethodCallGetAccessToken sdk;

    public GetAccessTokenRequestBuilder(SDKMethodInterfaces.MethodCallGetAccessToken sdk) {
        this.sdk = sdk;
    }

    public GetAccessTokenRequestBuilder request(dev.speakeasyapi.javaclientsdk.models.operations.GetAccessTokenRequest request) {
        Utils.checkNotNull(request, "request");
        this.request = request;
        return this;
    }

    public GetAccessTokenResponse call() throws Exception {

        return sdk.getAccessToken(
            request);
    }
}
