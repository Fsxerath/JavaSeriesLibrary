package com.example.series_library_java.infrastructure.driven.jpa.postgresql.entity;

import jakarta.persistence.*;

import java.util.List;
import java.util.UUID;

@Entity
@Table(name = "_user")
public class UserEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;
    @Column()
    private String username;
    @Column(unique = true)
    private String email;
    @Column()
    private String password;
    @OneToMany(mappedBy = "user")
    private List<ProgressEntity> progress;
}
