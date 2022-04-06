package com.example.tpecommerce001.repositories;

import com.example.tpecommerce001.entities.Category;
import com.example.tpecommerce001.security.AppUser;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AppUserRepository extends JpaRepository<AppUser, Long> {
    public AppUser findByUsername(String username);
}
