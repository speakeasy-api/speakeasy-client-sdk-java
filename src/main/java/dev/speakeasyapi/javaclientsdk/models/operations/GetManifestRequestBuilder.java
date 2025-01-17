/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package dev.speakeasyapi.javaclientsdk.models.operations;

import dev.speakeasyapi.javaclientsdk.utils.Utils;

public class GetManifestRequestBuilder {

    private GetManifestRequest request;
    private final SDKMethodInterfaces.MethodCallGetManifest sdk;

    public GetManifestRequestBuilder(SDKMethodInterfaces.MethodCallGetManifest sdk) {
        this.sdk = sdk;
    }

    public GetManifestRequestBuilder request(GetManifestRequest request) {
        Utils.checkNotNull(request, "request");
        this.request = request;
        return this;
    }

    public GetManifestResponse call() throws Exception {

        return sdk.getManifest(
            request);
    }
}
