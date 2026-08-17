package com.java_algorithms_api.java_algorithms_api.model.response;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter @Getter @NoArgsConstructor @AllArgsConstructor @JsonPropertyOrder({ "codigo", "msj", "cadenaEntrada",
        "cadenaSalisa" }) @JsonInclude(JsonInclude.Include.NON_NULL)
public class ParamResponseString extends BaseResponse {

    private String cadenaEntrada;
    private String cadenaSalisa;

}
