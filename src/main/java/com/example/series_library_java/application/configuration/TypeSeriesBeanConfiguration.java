package com.example.series_library_java.application.configuration;

import com.example.series_library_java.domain.api.ITypeSeriesServicePort;
import com.example.series_library_java.domain.api.usecase.TypeSeriesUseCase;
import com.example.series_library_java.domain.spi.ITypeSeriesPersistencePort;
import com.example.series_library_java.infrastructure.driven.jpa.postgresql.adapter.TypeSeriesAdapter;
import com.example.series_library_java.infrastructure.driven.jpa.postgresql.mapper.TypeSeriesEntityMapper;
import com.example.series_library_java.infrastructure.driven.jpa.postgresql.repository.ITypeSeriesRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@RequiredArgsConstructor
public class TypeSeriesBeanConfiguration {
    private final ITypeSeriesRepository typeSeriesRepository;
    private final TypeSeriesEntityMapper typeSeriesMapper;

    @Bean
    public ITypeSeriesPersistencePort typeSeriesPersistencePort() {
        return new TypeSeriesAdapter(typeSeriesRepository, typeSeriesMapper);
    }
    @Bean
    public ITypeSeriesServicePort typeSeriesServicePort (){
        return new TypeSeriesUseCase(typeSeriesPersistencePort());
    }
}
