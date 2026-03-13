package br.com.microservices.orchestrated.productvalidationservice.core.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Criado por VINICIUS em 12/03/2026
 * base_files
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Product {

    private String code;
    private double unitValue;
}
