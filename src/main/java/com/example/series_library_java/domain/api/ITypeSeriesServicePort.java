package com.example.series_library_java.domain.api;

import com.example.series_library_java.domain.model.TypeSeries;

import java.util.List;
import java.util.Optional;

public interface ITypeSeriesServicePort {
    void saveTypeSeries(TypeSeries typeSeries);
    Optional<TypeSeries> getTypeSeries(Long typeSeriesId);
    List<TypeSeries> getAllTypeSeries();
}
