package com.example.series_library_java.infrastructure.driven.jpa.postgresql.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Entity
@Table(name = "type_series")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class TypeSeriesEntity {
    @Id
    @GeneratedValue()
    private Long id;
    @Column( length = 100)
    private String type;
    @Column()
    private String description;
    @OneToMany(mappedBy = "type")
    private List<SeriesEntity> seriesEntity;
}
