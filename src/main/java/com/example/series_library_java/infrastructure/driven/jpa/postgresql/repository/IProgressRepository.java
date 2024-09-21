package com.example.series_library_java.infrastructure.driven.jpa.postgresql.repository;

import com.example.series_library_java.infrastructure.driven.jpa.postgresql.entity.ProgressEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface IProgressRepository extends JpaRepository<ProgressEntity, UUID> {
}
