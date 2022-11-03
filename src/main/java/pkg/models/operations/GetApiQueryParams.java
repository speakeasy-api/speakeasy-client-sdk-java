package pkg.models.operations;

import pkg.models.shared.QueryParamsMetadata;

import java.util.*;
import java.util.Map;

public class GetApiQueryParams {
    @QueryParamsMetadata(style = "deepObject", explode = true, name = "metadata")
    public Map<String, List<String>> metadata;
    @QueryParamsMetadata(style = "deepObject", explode = true, name = "op")
    public GetApisOp op;

    public GetApiQueryParams(Map<String, List<String>> metadata, GetApisOp op) {
        this.metadata = metadata;
        this.op = op;
    }
}
