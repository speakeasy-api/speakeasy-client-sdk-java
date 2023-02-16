package dev.speakeasyapi.javaclientsdk.models.operations;



public class GetValidEmbedAccessTokensResponse {
    public String contentType;
    public GetValidEmbedAccessTokensResponse withContentType(String contentType) {
        this.contentType = contentType;
        return this;
    }
    
    public dev.speakeasyapi.javaclientsdk.models.shared.EmbedToken[] embedTokens;
    public GetValidEmbedAccessTokensResponse withEmbedTokens(dev.speakeasyapi.javaclientsdk.models.shared.EmbedToken[] embedTokens) {
        this.embedTokens = embedTokens;
        return this;
    }
    
    public dev.speakeasyapi.javaclientsdk.models.shared.Error error;
    public GetValidEmbedAccessTokensResponse withError(dev.speakeasyapi.javaclientsdk.models.shared.Error error) {
        this.error = error;
        return this;
    }
    
    public Integer statusCode;
    public GetValidEmbedAccessTokensResponse withStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    
}
