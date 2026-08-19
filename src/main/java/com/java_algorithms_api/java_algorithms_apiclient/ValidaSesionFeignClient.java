package com.java_algorithms_api.java_algorithms_apiclient;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.java_algorithms_api.java_algorithms_api.model.request.ParamRequestData;

@FeignClient(
        name = "mw-core-insesion",
        url = "${servicio.validacion.url}")
public interface ValidaSesionFeignClient {

    @PostMapping(
            value = "/validar",
            consumes = MediaType.APPLICATION_JSON_VALUE)
    boolean sesionValida(@RequestBody ParamRequestData<Integer> request);
}