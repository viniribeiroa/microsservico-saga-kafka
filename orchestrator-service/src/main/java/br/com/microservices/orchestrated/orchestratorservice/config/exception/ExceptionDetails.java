package br.com.microservices.orchestrated.orchestratorservice.config.exception;

/**
 * Criado por VINICIUS em 12/03/2026
 * base_files
 */
public record ExceptionDetails(

        int status,
        String message
){}
