package com.example.series_library_java.infrastructure.driven.jpa.postgresql.mapper;

import com.example.series_library_java.domain.model.TypeSeries;
import com.example.series_library_java.infrastructure.driven.jpa.postgresql.entity.TypeSeriesEntity;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring")
public interface TypeSeriesEntityMapper {
    TypeSeriesEntity modelToTypeEntity(TypeSeries typeSeries);
    TypeSeries entityToTypeModel(TypeSeriesEntity typeEntity);
    List<TypeSeries> listTypeEntityToListTypeSeries(List<TypeSeriesEntity> typeSeriesEntities);
}
