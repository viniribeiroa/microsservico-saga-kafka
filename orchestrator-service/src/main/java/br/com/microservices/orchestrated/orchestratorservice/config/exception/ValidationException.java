package br.com.microservices.orchestrated.orchestratorservice.config.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

/**
 * Criado por VINICIUS em 12/03/2026
 * base_files
 */
@ResponseStatus(HttpStatus.BAD_REQUEST)
public class ValidationException extends RuntimeException{
    public ValidationException(String message){
        super(message);
    }
}
