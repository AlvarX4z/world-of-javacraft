package com.alvarx4z.woja.infrastructure.controller.dto.response;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonInclude(JsonInclude.Include.NON_NULL)
public final class ExpansionResponseDTO {

    @JsonProperty("order")
    private final String order;
    @JsonProperty("year")
    private final String year;
    @JsonProperty("title")
    private final String title;

    private ExpansionResponseDTO(String order, String year, String title) {
        this.order = order;
        this.year = year;
        this.title = title;
    }

    public static ExpansionResponseDTO of(String order, String year, String title) {
        return new ExpansionResponseDTO(order, year, title);
    }
}
