package com.example.tpecommerce001.repositories;


import com.example.tpecommerce001.entities.Category;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository extends JpaRepository<Category, Long> {
    public Category findByName(String nomc);
}
