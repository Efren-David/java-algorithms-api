package com.java_algorithms_api.java_algorithms_api.service.impl;

import com.java_algorithms_api.java_algorithms_api.model.request.ParamRequestData;
import com.java_algorithms_api.java_algorithms_api.model.response.ParamResponseData;
import com.java_algorithms_api.java_algorithms_api.model.response.ResponseBuilder;
import com.java_algorithms_api.java_algorithms_api.service.AlgorithmService;

import lombok.extern.slf4j.Slf4j;

import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;

/**
 * Implementación del servicio de algoritmos matemáticos. Contiene la lógica de
 * validación, procesamiento y construcción de respuestas para las operaciones
 * disponibles.
 */
@Service @Slf4j
public class AlgorithmServiceImpl implements AlgorithmService {

    @Override
    public ParamResponseData fibonacci(ParamRequestData data) {

        log.info(
                "Entrando a: << procesarSolicitud >> || request: {}", data);

        return procesarSolicitud(
                data, this::procesarResultado);
    }

    private ParamResponseData procesarSolicitud(
            ParamRequestData data,
            Function<ParamRequestData, ParamResponseData> procesador) {

        log.info(
                "Inicio de procesamiento de solicitud. request={}", data);

        try {

            if (data == null || data.getInput() == null) {

                log.warn(
                        "Validación fallida. request={}", data);

                return ResponseBuilder.buildErrorResponse(
                        "ERROR EN EL JSON", HttpStatus.BAD_REQUEST);
            }

            log.info(
                    "Validación exitosa. input={}", data.getInput());

            return procesador.apply(
                    data);

        }
        catch (Exception e) {

            log.error(
                    "Error interno al procesar la solicitud", e);

            return ResponseBuilder.buildErrorResponse(
                    "Error interno del servidor", HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    private ParamResponseData procesarResultado(ParamRequestData data) {

        ParamResponseData response = new ParamResponseData();

        List<Integer> numeros = new ArrayList<>();

        int a = 0;
        int b = 1;

        for (int i = 0; i < data.getInput(); i++) {
            numeros.add(
                    a);

            int siguiente = a + b;
            a = b;
            b = siguiente;
        }

        log.info(
                "Algoritmo fibonacci ejecutado correctamente. elementosGenerados={}", numeros.size());

        response.setCodigo(
                "0");
        response.setMsj(
                "Operacion fibonacci exitosa");
        response.setInput(
                data.getInput());
        response.setOutput(
                numeros);

        return response;
    }

}
