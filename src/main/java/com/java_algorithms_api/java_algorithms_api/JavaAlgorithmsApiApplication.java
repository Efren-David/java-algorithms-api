package com.java_algorithms_api.java_algorithms_api;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication @EnableFeignClients(
        basePackages = "com.java_algorithms_api.java_algorithms_apiclient")
public class JavaAlgorithmsApiApplication {

    public static void main(String[] args) {
        SpringApplication.run(JavaAlgorithmsApiApplication.class,
                args);
    }

}
