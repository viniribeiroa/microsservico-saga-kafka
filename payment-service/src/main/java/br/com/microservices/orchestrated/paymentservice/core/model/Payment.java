package br.com.microservices.orchestrated.paymentservice.core.model;


import br.com.microservices.orchestrated.paymentservice.core.enums.EPaymentStatus;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

/**
 * Criado por VINICIUS em 18/03/2026
 * base_files
 */
@Data
@Entity
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "payment")
public class Payment {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(nullable = false)
    private String orderId;

    @Column(nullable = false)
    private String transactionId;

    @Column(nullable = false)
    private LocalDateTime createdAt;

    @Column(nullable = false)
    private LocalDateTime updateAt;

    @Column(nullable = false)
    private int totalItems;

    @Column(nullable = false)
    private double totalAmount;

    @Column(nullable = false)
    @Enumerated(EnumType.STRING)
    private EPaymentStatus status;

    @PrePersist
    public void prePersist(){
        var now = LocalDateTime.now();
        createdAt = now;
        updateAt = now;
        status = EPaymentStatus.PENDING;
    }

    @PreUpdate
    public void preUpdate(){
        updateAt = LocalDateTime.now();
    }
}
