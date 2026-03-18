package br.com.microservices.orchestrated.productvalidationservice.core.repository;

import br.com.microservices.orchestrated.productvalidationservice.core.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Criado por VINICIUS em 17/03/2026
 * base_files
 */
public interface ProductRepository extends JpaRepository<Product,Integer> {

    Boolean existsByCode(String code);
}
