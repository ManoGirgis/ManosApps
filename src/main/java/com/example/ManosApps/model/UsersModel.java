package com.example.ManosApps.model;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "users")
public class UsersModel {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column
    private String name;

    private String email;
    private String password;
    private int roleId;
    private String createdAt;

    // Getters and setters
}


