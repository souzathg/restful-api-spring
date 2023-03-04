package br.com.souzathg.restfulapispring.repository;

import br.com.souzathg.restfulapispring.model.entities.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order, Long> {
}
