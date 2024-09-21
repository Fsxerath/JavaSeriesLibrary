package com.example.series_library_java.application.mapper;


import com.example.series_library_java.application.dto.request.CreateTypeSeries;
import com.example.series_library_java.application.dto.response.TypeSeriesResponse;
import com.example.series_library_java.domain.model.TypeSeries;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import java.util.List;

@Mapper (componentModel = "spring")
public interface TypeSeriesMapper {
    @Mapping(target = "id", ignore = true)
    TypeSeries requestToModel (CreateTypeSeries newTypeSeries);
    TypeSeriesResponse modelToTypeSeriesResponse (TypeSeries typeSeries);
    List<TypeSeriesResponse> modelToTypeResponseList (List<TypeSeries> typeSeries);
}
