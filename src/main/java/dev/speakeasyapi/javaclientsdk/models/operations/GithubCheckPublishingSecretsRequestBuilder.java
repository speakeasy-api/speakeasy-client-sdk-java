/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package dev.speakeasyapi.javaclientsdk.models.operations;

import dev.speakeasyapi.javaclientsdk.utils.Utils;

public class GithubCheckPublishingSecretsRequestBuilder {

    private GithubCheckPublishingSecretsRequest request;
    private final SDKMethodInterfaces.MethodCallGithubCheckPublishingSecrets sdk;

    public GithubCheckPublishingSecretsRequestBuilder(SDKMethodInterfaces.MethodCallGithubCheckPublishingSecrets sdk) {
        this.sdk = sdk;
    }

    public GithubCheckPublishingSecretsRequestBuilder request(dev.speakeasyapi.javaclientsdk.models.operations.GithubCheckPublishingSecretsRequest request) {
        Utils.checkNotNull(request, "request");
        this.request = request;
        return this;
    }

    public GithubCheckPublishingSecretsResponse call() throws Exception {

        return sdk.githubCheckPublishingSecrets(
            request);
    }
}
