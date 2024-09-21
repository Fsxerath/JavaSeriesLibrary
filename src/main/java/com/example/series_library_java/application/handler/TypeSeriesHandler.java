package com.example.series_library_java.application.handler;

import com.example.series_library_java.application.ITypeSeriesHandler;
import com.example.series_library_java.application.dto.request.CreateTypeSeries;
import com.example.series_library_java.application.dto.response.TypeSeriesResponse;
import com.example.series_library_java.application.mapper.TypeSeriesMapper;
import com.example.series_library_java.domain.api.ITypeSeriesServicePort;
import com.example.series_library_java.domain.model.TypeSeries;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
@Transactional
public class TypeSeriesHandler implements ITypeSeriesHandler {
    private final TypeSeriesMapper typeSeriesMapper;
    private final ITypeSeriesServicePort typeSeriesServicePort;


    @Override
    public void create(CreateTypeSeries createTypeSeries) {
        this.typeSeriesServicePort.saveTypeSeries(typeSeriesMapper.requestToModel(createTypeSeries));
    }

    @Override
    public List<TypeSeriesResponse> findAll() {
        List<TypeSeries> allTypes = this.typeSeriesServicePort.getAllTypeSeries();
        return this.typeSeriesMapper.modelToTypeResponseList(allTypes);
    }

    @Override
    public TypeSeriesResponse findOne(Long id) {
        Optional<TypeSeries> find = this.typeSeriesServicePort.getTypeSeries(id);
        return find.map(this.typeSeriesMapper::modelToTypeSeriesResponse).orElse(null);
    }
}
