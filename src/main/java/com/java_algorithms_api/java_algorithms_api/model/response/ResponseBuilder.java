package com.java_algorithms_api.java_algorithms_api.model.response;

import org.springframework.http.HttpStatus;

/**
 * Builder para crear respuestas estandarizadas para servicios REST
 */
public final class ResponseBuilder {

    public static ParamResponseData buildErrorResponse(String mensaje, HttpStatus status) {
        ParamResponseData responseData = new ParamResponseData();
        responseData.setCodigo(String.valueOf(status.value()));
        responseData.setMsj(mensaje);
        return responseData;
    }

}
