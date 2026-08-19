package com.java_algorithms_api.java_algorithms_api.model.response;

import java.util.HashMap;
import java.util.Map;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor @NoArgsConstructor @Getter @Setter
public class ErrorResponse {

    private String codigo;
    private String mensjae;
    private String folio;
    private String info;
    private Map<String, String> detalles = new HashMap<>();

}
