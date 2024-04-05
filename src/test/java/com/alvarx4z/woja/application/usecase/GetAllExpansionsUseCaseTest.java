package com.alvarx4z.woja.application.usecase;

import com.alvarx4z.woja.domain.Expansion;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

final class GetAllExpansionsUseCaseTest {

    @Test
    @DisplayName("Should return all Expansions")
    void givenUseCase_whenExecute_thenReturnsAllExpansions() {
        GetAllExpansionsUseCase useCase = new GetAllExpansionsUseCase();
        Expansion[] result = useCase.execute();

        assertThat(result).isInstanceOf(Expansion[].class);
        assertThat(result.length).isEqualTo(10);
    }
}
