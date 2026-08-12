package com.java_algorithms_api.java_algorithms_api.model.request;

import com.google.gson.Gson;
import lombok.Data;

@Data
public class ParamRequestData {

    private Integer input;

    @Override
    public String toString() {
        return new Gson().toJson(this);
    }
}
