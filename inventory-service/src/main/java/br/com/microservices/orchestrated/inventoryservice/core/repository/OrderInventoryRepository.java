package br.com.microservices.orchestrated.inventoryservice.core.repository;

import br.com.microservices.orchestrated.inventoryservice.core.model.OrderInventory;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 * Criado por VINICIUS em 23/03/2026
 * base_files
 */
public interface OrderInventoryRepository extends JpaRepository<OrderInventory, Integer> {

    Boolean existsByOrderIdAndTransactionId(String orderId, String transactionId);

    List<OrderInventory> findByOrderIdAndTransactionId(String orderId, String transactionId);
}
