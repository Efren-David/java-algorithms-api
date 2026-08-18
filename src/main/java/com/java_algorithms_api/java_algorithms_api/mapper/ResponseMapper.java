package com.java_algorithms_api.java_algorithms_api.mapper;

import org.springframework.stereotype.Component;

import com.java_algorithms_api.java_algorithms_api.model.request.ParamRequestString;
import com.java_algorithms_api.java_algorithms_api.model.response.ParamResponseString;

@Component
public class ResponseMapper {

    public ParamResponseString toResponse(ParamRequestString request, String result) {

        ParamResponseString response = new ParamResponseString();

        response.setCodigo("0");
        response.setMsj("Cadena invertida exitosamente");
        response.setCadenaEntrada(request.getCadena());
        response.setCadenaSalisa(result);

        return response;
    }

}
