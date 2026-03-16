package br.com.microservices.orchestrated.orderservice.core.repository;

import br.com.microservices.orchestrated.orderservice.core.document.Event;
import br.com.microservices.orchestrated.orderservice.core.document.Order;
import org.springframework.data.mongodb.repository.MongoRepository;

/**
 * Criado por VINICIUS em 15/03/2026
 * base_files
 */
public interface EventRepository extends MongoRepository<Event, String> {
}
