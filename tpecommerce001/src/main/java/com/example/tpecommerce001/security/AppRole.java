package com.example.tpecommerce001.security;

import lombok.Data;

import javax.persistence.*;
@Data
@Entity
public class AppRole {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idAppRole;

    @Enumerated(EnumType.STRING)
    private Role role;

}
