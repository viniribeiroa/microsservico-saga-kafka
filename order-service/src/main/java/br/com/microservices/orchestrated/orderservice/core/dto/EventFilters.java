package br.com.microservices.orchestrated.orderservice.core.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Criado por VINICIUS em 15/03/2026
 * base_files
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class EventFilters {

    private String orderId;
    private String TransactionId;
}
