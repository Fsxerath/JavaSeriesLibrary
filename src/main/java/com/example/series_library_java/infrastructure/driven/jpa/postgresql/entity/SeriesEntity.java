package com.example.series_library_java.infrastructure.driven.jpa.postgresql.entity;

import jakarta.persistence.*;

import java.util.List;
import java.util.UUID;

@Entity
@Table(name = "series")
public class SeriesEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;
    private String title;
    @Column(columnDefinition = "TEXT")
    private String synopsis;
    @Column(length = 12)
    private String publicationDate;
    private int totalChapters;
    @Column(columnDefinition = "TEXT")
    private String thumbnail;
    @ManyToOne()
    @JoinColumn(name = "type_id", nullable = false)
    private TypeSeriesEntity type;
    @OneToMany(mappedBy = "series")
    private List<ProgressEntity> progress;
}
