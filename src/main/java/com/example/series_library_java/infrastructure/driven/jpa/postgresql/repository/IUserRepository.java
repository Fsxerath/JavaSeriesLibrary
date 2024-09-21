package com.example.series_library_java.infrastructure.driven.jpa.postgresql.repository;

import com.example.series_library_java.infrastructure.driven.jpa.postgresql.entity.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface IUserRepository extends JpaRepository<UserEntity, UUID> {
}
