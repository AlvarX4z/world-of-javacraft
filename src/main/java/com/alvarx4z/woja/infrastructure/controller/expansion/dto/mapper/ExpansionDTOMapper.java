package com.alvarx4z.woja.infrastructure.controller.expansion.dto.mapper;

import com.alvarx4z.woja.domain.Expansion;
import com.alvarx4z.woja.infrastructure.controller.expansion.dto.response.ExpansionResponseDTO;
import com.alvarx4z.woja.infrastructure.controller.expansion.dto.response.ExpansionsResponseDTO;

import java.util.Arrays;

public final class ExpansionDTOMapper {

    public static ExpansionsResponseDTO toResponse(Expansion[] expansions) {
        return ExpansionsResponseDTO.of(
            Arrays
                .stream(expansions)
                .map(
                    exp -> ExpansionResponseDTO.of(
                        String.valueOf(exp.getOrder().getValue()),
                        String.valueOf(exp.getYear().getValue()),
                        exp.getTitle().getValue()
                    )
                ).toList()
        );
    }
}
