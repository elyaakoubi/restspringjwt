package com.example.tpecommerce001.repositories;

import com.example.tpecommerce001.entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {
    public Product findByName(String nomp);
}
