package com.alba;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class HolaMundoApplication {
    public static void main(String[] args) {
        SpringApplication.run(HolaMundoApplication.class, args);
        System.out.println("=========================================");
        System.out.println("✅ HOLA MUNDO DE ALBA - BACKEND INICIADO");
        System.out.println("✅ Java 25 + Spring Boot 3.3");
        System.out.println("✅ URL: http://localhost:8080");
        System.out.println("=========================================");
    }
}