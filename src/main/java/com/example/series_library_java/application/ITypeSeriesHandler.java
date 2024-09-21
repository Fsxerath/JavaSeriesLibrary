package com.example.series_library_java.application;

import com.example.series_library_java.application.dto.request.CreateTypeSeries;
import com.example.series_library_java.application.dto.response.TypeSeriesResponse;

import java.util.List;

public interface ITypeSeriesHandler {
    void create (CreateTypeSeries createTypeSeries);
    List<TypeSeriesResponse> findAll();
    TypeSeriesResponse findOne(Long id);
}
