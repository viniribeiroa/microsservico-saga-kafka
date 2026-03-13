package br.com.microservices.orchestrated.orderservice.config.exception;

/**
 * Criado por VINICIUS em 12/03/2026
 * base_files
 */
public record ExceptionDetails(

        int status,
        String message
){}
