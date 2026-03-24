package br.com.microservices.orchestrated.inventoryservice.core.repository;

import br.com.microservices.orchestrated.inventoryservice.core.model.Inventory;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

/**
 * Criado por VINICIUS em 23/03/2026
 * base_files
 */
public interface InventoryRepository extends JpaRepository<Inventory, Integer> {


    Optional<Inventory> findByProductCode(String productCode);
}
