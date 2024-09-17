package com.example.series_library_java.infrastructure.driven.jpa.postgresql.entity;

import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "type_series")
public class TypeSeriesEntity {
    @Id
    @GeneratedValue()
    private long id;
    @Column(length = 100)
    private String type;
    private String description;
    @OneToMany(mappedBy = "type")
    private List<SeriesEntity> seriesEntity;
}
