package com.example.series_library_java.infrastructure.driven.jpa.postgresql.adapter;

import com.example.series_library_java.domain.model.TypeSeries;
import com.example.series_library_java.domain.spi.ITypeSeriesPersistencePort;
import com.example.series_library_java.infrastructure.driven.jpa.postgresql.mapper.TypeSeriesEntityMapper;
import com.example.series_library_java.infrastructure.driven.jpa.postgresql.repository.ITypeSeriesRepository;
import lombok.RequiredArgsConstructor;

import java.util.List;
import java.util.Optional;

@RequiredArgsConstructor
public class TypeSeriesAdapter implements ITypeSeriesPersistencePort {
    private final ITypeSeriesRepository typerepository;
    private final TypeSeriesEntityMapper typeseriesmapper;
    @Override
    public void saveType(TypeSeries typeSeries) {
        typerepository.save(typeseriesmapper.modelToTypeEntity(typeSeries));
    }

    @Override
    public List<TypeSeries> getAllTypes() {
        return  typeseriesmapper.listTypeEntityToListTypeSeries(typerepository.findAll());
    }

    @Override
    public Optional<TypeSeries> getTypeById(Long typeId) {
        return typerepository.findById(typeId).map(typeseriesmapper::entityToTypeModel);
    }
}
