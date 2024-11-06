/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package dev.speakeasyapi.javaclientsdk.models.operations;

import dev.speakeasyapi.javaclientsdk.models.shared.GithubConfigureCodeSamplesRequest;
import dev.speakeasyapi.javaclientsdk.utils.Utils;

public class GithubConfigureCodeSamplesRequestBuilder {

    private GithubConfigureCodeSamplesRequest request;
    private final SDKMethodInterfaces.MethodCallGithubConfigureCodeSamples sdk;

    public GithubConfigureCodeSamplesRequestBuilder(SDKMethodInterfaces.MethodCallGithubConfigureCodeSamples sdk) {
        this.sdk = sdk;
    }

    public GithubConfigureCodeSamplesRequestBuilder request(GithubConfigureCodeSamplesRequest request) {
        Utils.checkNotNull(request, "request");
        this.request = request;
        return this;
    }

    public GithubConfigureCodeSamplesResponse call() throws Exception {

        return sdk.configureCodeSamples(
            request);
    }
}