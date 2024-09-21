package com.example.series_library_java.domain.api.usecase;

import com.example.series_library_java.domain.api.ITypeSeriesServicePort;
import com.example.series_library_java.domain.model.TypeSeries;
import com.example.series_library_java.domain.spi.ITypeSeriesPersistencePort;

import java.util.List;
import java.util.Optional;

public class TypeSeriesUseCase implements ITypeSeriesServicePort {

    private final ITypeSeriesPersistencePort typeSeriesPersistencePort;

    public TypeSeriesUseCase(ITypeSeriesPersistencePort typePersistencePort) {
        this.typeSeriesPersistencePort = typePersistencePort;
    }

    @Override
    public void saveTypeSeries(TypeSeries typeSeries) {
        this.typeSeriesPersistencePort.saveType(typeSeries);
    }

    @Override
    public Optional<TypeSeries> getTypeSeries(Long typeSeriesId) {
        return this.typeSeriesPersistencePort.getTypeById(typeSeriesId);
    }

    @Override
    public List<TypeSeries> getAllTypeSeries() {
        return this.typeSeriesPersistencePort.getAllTypes();
    }
}
