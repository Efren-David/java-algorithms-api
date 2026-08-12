package com.java_algorithms_api.java_algorithms_api.model.response;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.google.gson.Gson;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data

@JsonPropertyOrder({ "codigo", "msj", "input",
        "output" }) 
@JsonInclude(JsonInclude.Include.NON_NULL)
public class ParamResponseData {

    private String codigo;
    private String msj;
    private Integer input;
    private List<Integer> output;

    @Override
    public String toString() {
        return new Gson().toJson(this);
    }

}
