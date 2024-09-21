package com.example.series_library_java.infrastructure.driven.jpa.postgresql.repository;

import com.example.series_library_java.infrastructure.driven.jpa.postgresql.entity.TypeSeriesEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface ITypeSeriesRepository extends JpaRepository<TypeSeriesEntity, Long> {
    Optional<TypeSeriesEntity> findById(Long typeId);
}
