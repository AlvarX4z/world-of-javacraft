package com.alvarx4z.woja.infrastructure.controller.dto.response;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

@JsonInclude(JsonInclude.Include.NON_NULL)
public final class ExpansionsResponseDTO {

    @JsonProperty("expansions")
    private final List<ExpansionResponseDTO> expansions;

    private ExpansionsResponseDTO(List<ExpansionResponseDTO> expansions) {
        this.expansions = expansions;
    }

    public static ExpansionsResponseDTO of(List<ExpansionResponseDTO> expansions) {
        return new ExpansionsResponseDTO(expansions);
    }
}
