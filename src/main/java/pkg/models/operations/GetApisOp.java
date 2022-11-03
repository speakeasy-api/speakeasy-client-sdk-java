package pkg.models.operations;

import pkg.models.shared.QueryParamsMetadata;

public class GetApisOp {
    @QueryParamsMetadata(name = "and")
    public boolean and;

    public GetApisOp(boolean and) {
        this.and = and;
    }
}
