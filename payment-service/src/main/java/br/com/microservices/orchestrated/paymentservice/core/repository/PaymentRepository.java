package br.com.microservices.orchestrated.paymentservice.core.repository;


import br.com.microservices.orchestrated.paymentservice.core.model.Payment;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

/**
 * Criado por VINICIUS em 18/03/2026
 * base_files
 */
public interface PaymentRepository extends JpaRepository<Payment, Integer> {

    Boolean existsByOrderIdAndTransactionId(String orderId, String transactionID);
    Optional<Payment> findByOrderIdAndTransactionId(String orderId, String transactionID);
}
