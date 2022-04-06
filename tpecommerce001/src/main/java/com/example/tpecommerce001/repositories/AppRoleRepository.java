package com.example.tpecommerce001.repositories;

import com.example.tpecommerce001.security.AppRole;
import com.example.tpecommerce001.security.Role;
import org.springframework.data.jpa.repository.JpaRepository;


public interface AppRoleRepository extends JpaRepository<AppRole, Long> {
  public AppRole findByRole(Role r);

}
