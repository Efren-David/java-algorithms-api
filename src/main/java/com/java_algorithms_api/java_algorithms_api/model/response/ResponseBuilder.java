package com.java_algorithms_api.java_algorithms_api.model.response;

import org.springframework.http.HttpStatus;

import com.java_algorithms_api.java_algorithms_api.model.request.BaseRequest;

import lombok.extern.slf4j.Slf4j;

/**
 * Builder para crear respuestas estandarizadas para servicios REST
 */

@Slf4j
public final class ResponseBuilder {

    public static final String CODIGO = "400.cajeros-automatica-aclaraciones.4000";
    public static final String MENSAJE = "Solicitud mal formada, favor de valida";
    public static final String FOLIO = "N/A";
    public static final String INFO = "N/A";

    public static ParamResponseData buildErrorResponse(String mensaje, HttpStatus status) {
        ParamResponseData responseData = new ParamResponseData();
        responseData.setCodigo(String.valueOf(status.value()));
        responseData.setMsj(mensaje);
        return responseData;
    }

    public static ParamResponseString buildErrorString(String mensaje, HttpStatus status) {
        ParamResponseString responseData = new ParamResponseString();
        responseData.setCodigo(String.valueOf(status.value()));
        responseData.setMsj(mensaje);
        return responseData;
    }

    public static ErrorResponse buildError(HttpStatus status, BaseRequest data) {

        ErrorResponse errorResponse = new ErrorResponse();
        errorResponse.setCodigo(String.valueOf(status.value()));
        errorResponse.setMensjae(MENSAJE);
        errorResponse.setFolio(FOLIO);
        errorResponse.setInfo(INFO);
        errorResponse.getDetalles().put("detalle",
                "Error: Verificar el cuerpo de la solicitud: ");

        log.warn("Solicitud inválida. noEmpleadoSession={}",
                data.getNoEmpleadoSession());

        return errorResponse;

    }
}
