package com.example.series_library_java.domain.spi;

import com.example.series_library_java.domain.model.TypeSeries;

import java.util.List;
import java.util.Optional;


public interface ITypeSeriesPersistencePort {
    void saveType(TypeSeries typeSeries);
    List<TypeSeries> getAllTypes();
    Optional <TypeSeries> getTypeById(Long typeId);
}
