/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package dev.speakeasyapi.javaclientsdk.models.operations;

import dev.speakeasyapi.javaclientsdk.models.shared.GithubConfigureTargetRequest;
import dev.speakeasyapi.javaclientsdk.utils.Utils;

public class ConfigureTargetRequestBuilder {

    private GithubConfigureTargetRequest request;
    private final SDKMethodInterfaces.MethodCallConfigureTarget sdk;

    public ConfigureTargetRequestBuilder(SDKMethodInterfaces.MethodCallConfigureTarget sdk) {
        this.sdk = sdk;
    }

    public ConfigureTargetRequestBuilder request(dev.speakeasyapi.javaclientsdk.models.shared.GithubConfigureTargetRequest request) {
        Utils.checkNotNull(request, "request");
        this.request = request;
        return this;
    }

    public ConfigureTargetResponse call() throws Exception {

        return sdk.configureTarget(
            request);
    }
}