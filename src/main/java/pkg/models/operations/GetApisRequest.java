package pkg.models.operations;

public class GetApisRequest {
    public GetApiQueryParams queryParams;

    public GetApisRequest(GetApiQueryParams queryParams) {
        this.queryParams = queryParams;
    }
}
