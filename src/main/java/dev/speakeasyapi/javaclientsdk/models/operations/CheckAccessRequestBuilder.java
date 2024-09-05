/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package dev.speakeasyapi.javaclientsdk.models.operations;

import dev.speakeasyapi.javaclientsdk.utils.Utils;

public class CheckAccessRequestBuilder {

    private CheckAccessRequest request;
    private final SDKMethodInterfaces.MethodCallCheckAccess sdk;

    public CheckAccessRequestBuilder(SDKMethodInterfaces.MethodCallCheckAccess sdk) {
        this.sdk = sdk;
    }

    public CheckAccessRequestBuilder request(dev.speakeasyapi.javaclientsdk.models.operations.CheckAccessRequest request) {
        Utils.checkNotNull(request, "request");
        this.request = request;
        return this;
    }

    public CheckAccessResponse call() throws Exception {

        return sdk.checkAccess(
            request);
    }
}
