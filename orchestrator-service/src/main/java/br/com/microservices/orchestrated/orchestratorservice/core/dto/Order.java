package br.com.microservices.orchestrated.orchestratorservice.core.dto;

import br.com.microservices.orchestrated.orderservice.core.document.OrderProducts;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;
import java.util.List;

/**
 * Criado por VINICIUS em 12/03/2026
 * base_files
 */
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Order {

    private String id;
    private List<OrderProducts> products;
    private LocalDateTime createdAt;
    private String TransactionId;
    private double totalAmount;
    private int totalItems;
}
