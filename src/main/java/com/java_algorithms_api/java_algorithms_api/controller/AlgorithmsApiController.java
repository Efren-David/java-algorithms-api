package com.java_algorithms_api.java_algorithms_api.controller;

import com.java_algorithms_api.java_algorithms_api.model.request.ParamRequestData;
import com.java_algorithms_api.java_algorithms_api.model.request.ParamRequestString;
import com.java_algorithms_api.java_algorithms_api.model.response.ParamResponseData;
import com.java_algorithms_api.java_algorithms_api.model.response.ParamResponseString;
import com.java_algorithms_api.java_algorithms_api.model.response.ResponseBuilder;
import com.java_algorithms_api.java_algorithms_api.service.AlgorithmService;
import com.java_algorithms_api.java_algorithms_apiclient.ValidaSesionFeignClient;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Controlador REST encargado de exponer los endpoints para la ejecución de
 * algoritmos disponibles en la API.
 */
@RestController @RequestMapping("/v1/core/algorithms")
public class AlgorithmsApiController {

    private final AlgorithmService algorithmService;
    private final ValidaSesionFeignClient feignClient;

    public AlgorithmsApiController(AlgorithmService algorithmService, ValidaSesionFeignClient feignClient) {
        this.algorithmService = algorithmService;
        this.feignClient = feignClient;

    }

    @PostMapping("/fibonacci")
    public ResponseEntity<?> fibonacci(@RequestBody ParamRequestData<Integer> data) {

        boolean sesionValida = feignClient.sesionValida(data);

        if (!sesionValida) {
            return ResponseEntity.status(HttpStatus.UNAUTHORIZED)
                    .body(ResponseBuilder.buildError(HttpStatus.UNAUTHORIZED,
                            data));
        }

        ParamResponseData responseData = algorithmService.fibonacci(data);
        return ResponseEntity.status(HttpStatus.OK).body(responseData);

    }

    @PostMapping("/stringReversal")
    public ResponseEntity<?> stringReversal(@RequestBody ParamRequestString cadena) {

        ParamResponseString response = algorithmService.stringReversal(cadena);
        return ResponseEntity.status(HttpStatus.OK).body(response);
    }

}
