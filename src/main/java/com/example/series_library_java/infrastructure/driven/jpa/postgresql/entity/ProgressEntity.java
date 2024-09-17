package com.example.series_library_java.infrastructure.driven.jpa.postgresql.entity;

import jakarta.persistence.*;
import org.springframework.data.annotation.CreatedDate;

import java.util.Date;
import java.util.UUID;

@Entity
@Table (name = "progress")
public class ProgressEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;
    private int chapter;
    private String resume;
    @CreatedDate
    private Date date;
    @ManyToOne
    @JoinColumn (name = "user_id", nullable = false)
    private UserEntity user;
    @ManyToOne
    @JoinColumn(name = "series_id", nullable = false)
    private SeriesEntity series;
}
