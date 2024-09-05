/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package io.github.speakeasy_sdks_staging.javaclientsdk.models.operations;

import io.github.speakeasy_sdks_staging.javaclientsdk.models.shared.GithubConfigureCodeSamplesRequest;
import io.github.speakeasy_sdks_staging.javaclientsdk.utils.Utils;

public class ConfigureCodeSamplesRequestBuilder {

    private GithubConfigureCodeSamplesRequest request;
    private final SDKMethodInterfaces.MethodCallConfigureCodeSamples sdk;

    public ConfigureCodeSamplesRequestBuilder(SDKMethodInterfaces.MethodCallConfigureCodeSamples sdk) {
        this.sdk = sdk;
    }

    public ConfigureCodeSamplesRequestBuilder request(io.github.speakeasy_sdks_staging.javaclientsdk.models.shared.GithubConfigureCodeSamplesRequest request) {
        Utils.checkNotNull(request, "request");
        this.request = request;
        return this;
    }

    public ConfigureCodeSamplesResponse call() throws Exception {

        return sdk.configureCodeSamples(
            request);
    }
}