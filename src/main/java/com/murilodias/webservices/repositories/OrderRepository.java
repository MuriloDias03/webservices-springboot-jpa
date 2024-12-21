package com.murilodias.webservices.repositories;

import com.murilodias.webservices.entities.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order, Long> {

}