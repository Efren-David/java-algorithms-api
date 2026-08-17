package com.java_algorithms_api.java_algorithms_api.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

import lombok.extern.slf4j.Slf4j;

/**
 * Aspecto encargado de registrar logs de entrada, salida y resultados de los
 */
@Slf4j @Aspect @Component
public class LoggingAspect {

    @Before("execution(* com.java_algorithms_api.java_algorithms_api.service.impl.*.*(..))")
    public void antesDeEjecutar(JoinPoint joinPoint) {

        String clase = joinPoint.getTarget().getClass().getSimpleName();
        String metodo = joinPoint.getSignature().getName();

        // Obtiene la línea del método interceptado
        StackTraceElement elemento = Thread.currentThread().getStackTrace()[3];

        log.info("Entrando a {}.{}.{}",
                clase,
                metodo);
    }

    @AfterReturning(
            pointcut = "execution(* com.java_algorithms_api.java_algorithms_api.service.impl.*.*(..))",
            returning = "resultado")
    public void despuesDeEjecutar(JoinPoint joinPoint, Object resultado) {

        String clase = joinPoint.getTarget().getClass().getSimpleName();
        String metodo = joinPoint.getSignature().getName();

        StackTraceElement elemento = Thread.currentThread().getStackTrace()[3];

        log.info("Saliendo de {}.{}()",
                clase,
                metodo);

        log.info("Resultado: {}",
                resultado);
    }

    @Before("execution(* com.java_algorithms_api.java_algorithms_api.controller.*.*(..))")
    public void antesDeEjecutarController(JoinPoint joinPoint) {

        String clase = joinPoint.getTarget().getClass().getSimpleName();
        String metodo = joinPoint.getSignature().getName();

        // Obtiene la línea del método interceptado
        StackTraceElement elemento = Thread.currentThread().getStackTrace()[3];

        log.info("Entrando a el controlador {}.{}.{}",
                clase,
                metodo);
    }
}