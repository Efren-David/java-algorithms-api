package com.java_algorithms_api.java_algorithms_api.controller;

import com.java_algorithms_api.java_algorithms_api.model.request.ParamRequestData;
import com.java_algorithms_api.java_algorithms_api.model.response.ParamResponseData;
import com.java_algorithms_api.java_algorithms_api.service.AlgorithmService;

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

    public AlgorithmsApiController(AlgorithmService algorithmService) {
        this.algorithmService = algorithmService;
    }

    @PostMapping("/fibonacci")
    public ResponseEntity<ParamResponseData> fibonacci(@RequestBody ParamRequestData data) {
        ParamResponseData responseData = algorithmService.fibonacci(data);
        return ResponseEntity.status(HttpStatus.OK).body(responseData);

    }
}
