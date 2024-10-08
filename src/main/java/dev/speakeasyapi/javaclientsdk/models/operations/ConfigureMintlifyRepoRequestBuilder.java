/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package dev.speakeasyapi.javaclientsdk.models.operations;

import dev.speakeasyapi.javaclientsdk.models.shared.GithubConfigureMintlifyRepoRequest;
import dev.speakeasyapi.javaclientsdk.utils.Utils;

public class ConfigureMintlifyRepoRequestBuilder {

    private GithubConfigureMintlifyRepoRequest request;
    private final SDKMethodInterfaces.MethodCallConfigureMintlifyRepo sdk;

    public ConfigureMintlifyRepoRequestBuilder(SDKMethodInterfaces.MethodCallConfigureMintlifyRepo sdk) {
        this.sdk = sdk;
    }

    public ConfigureMintlifyRepoRequestBuilder request(dev.speakeasyapi.javaclientsdk.models.shared.GithubConfigureMintlifyRepoRequest request) {
        Utils.checkNotNull(request, "request");
        this.request = request;
        return this;
    }

    public ConfigureMintlifyRepoResponse call() throws Exception {

        return sdk.configureMintlifyRepo(
            request);
    }
}
