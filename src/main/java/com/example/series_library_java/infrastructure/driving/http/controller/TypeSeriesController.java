package com.example.series_library_java.infrastructure.driving.http.controller;

import com.example.series_library_java.application.dto.request.CreateTypeSeries;
import com.example.series_library_java.application.dto.response.TypeSeriesResponse;
import com.example.series_library_java.application.handler.TypeSeriesHandler;
import jakarta.validation.Valid;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/type")
@AllArgsConstructor
public class TypeSeriesController {
    private final TypeSeriesHandler typeSeriesHandler;

    @PostMapping
    public ResponseEntity<Void> saveType (@Valid @RequestBody CreateTypeSeries newType){
        this.typeSeriesHandler.create(newType);
        return ResponseEntity.status(HttpStatus.CREATED).build();
    }

    @GetMapping("/{id}")
    public ResponseEntity<TypeSeriesResponse> obtainType(@PathVariable("id") Long id){
        return ResponseEntity.ok(this.typeSeriesHandler.findOne(id));
    }

    @GetMapping
    public ResponseEntity<List<TypeSeriesResponse>> obtainTypeList(){
        return ResponseEntity.ok(this.typeSeriesHandler.findAll());
    }
}
