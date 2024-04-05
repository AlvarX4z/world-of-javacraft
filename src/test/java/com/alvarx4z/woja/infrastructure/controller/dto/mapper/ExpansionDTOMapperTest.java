package com.alvarx4z.woja.infrastructure.controller.dto.mapper;

import com.alvarx4z.woja.domain.Expansion;
import com.alvarx4z.woja.infrastructure.controller.dto.response.ExpansionsResponseDTO;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

final class ExpansionDTOMapperTest {

    @Test
    @DisplayName("Should map correctly from Expansion[] to ExpansionsResponseDTO")
    void givenExpansionArray_whenMappingToDTO_thenReturnsExpansionsResponseDTO() {
        ExpansionsResponseDTO response = ExpansionDTOMapper.toResponse(Expansion.values());

        assertThat(response).isInstanceOf(ExpansionsResponseDTO.class);
        assertThat(response.getExpansions()).isInstanceOf(List.class);
        assertThat(response.getExpansions().size()).isEqualTo(Expansion.TOTAL_EXPANSIONS);
    }
}