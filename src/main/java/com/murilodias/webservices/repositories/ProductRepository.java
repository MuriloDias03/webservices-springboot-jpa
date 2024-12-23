package com.murilodias.webservices.repositories;

import com.murilodias.webservices.entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {

}