package com.example.series_library_java.infrastructure.driven.jpa.postgresql.repository;

import com.example.series_library_java.infrastructure.driven.jpa.postgresql.entity.SeriesEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface ISeriesRepository extends JpaRepository<SeriesEntity, UUID> {
}
