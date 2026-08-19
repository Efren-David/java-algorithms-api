package com.java_algorithms_api.java_algorithms_api.model.request;

import com.google.gson.Gson;
import lombok.Data;

@Data
public class ParamRequestData<T> extends BaseRequest {

    private T input;

    @Override
    public String toString() {
        return new Gson().toJson(this);
    }
}
