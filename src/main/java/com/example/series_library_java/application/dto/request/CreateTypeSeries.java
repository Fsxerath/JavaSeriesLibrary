package com.example.series_library_java.application.dto.request;


import com.example.series_library_java.application.util.CreateTypeSeriesConstants;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@Getter
@NoArgsConstructor
@Setter
public class CreateTypeSeries {
    @NotNull(message = CreateTypeSeriesConstants.TYPE_IS_MANDATORY)
    @NotBlank(message = CreateTypeSeriesConstants.TYPE_IS_MANDATORY)
    @Size(min = CreateTypeSeriesConstants.TYPE_MIN_LENGTH, max = CreateTypeSeriesConstants.TYPE_MAX_LENGTH)
    private String type;
    @NotNull(message = CreateTypeSeriesConstants.DESCRIPTION_IS_MANDATORY)
    @NotBlank(message = CreateTypeSeriesConstants.DESCRIPTION_IS_MANDATORY)
    @Size(min = CreateTypeSeriesConstants.DESCRIPTION_MIN_LENGTH, max = CreateTypeSeriesConstants.DESCRIPTION_MAX_LENGTH)
    private String description;
}
