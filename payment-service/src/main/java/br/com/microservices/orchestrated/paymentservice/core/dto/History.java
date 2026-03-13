package br.com.microservices.orchestrated.paymentservice.core.dto;


import br.com.microservices.orchestrated.paymentservice.core.enums.ESagaStatus;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

/**
 * Criado por VINICIUS em 12/03/2026
 * base_files
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class History {

    private String source;
    private ESagaStatus status;
    private String message;
    private LocalDateTime createdAt;

}
