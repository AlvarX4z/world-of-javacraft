package com.alvarx4z.woja.domain;

import com.alvarx4z.woja.domain.shared.Name;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.UUID;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertThrows;

final class ExpansionTest {

    @Test
    @DisplayName("Should contain valid data in the Expansion Enum")
    void givenExpansions_whenCheckingProperties_thenAreValid() {
        Expansion expansion = Expansion.valueOf(Expansion.VANILLA.toString());

        assertThat(expansion).isInstanceOf(Expansion.class);
        assertThat(expansion.getId()).isInstanceOf(UUID.class);
        assertThat(expansion.getOrder()).isEqualTo(Expansion.VANILLA.getOrder());
        assertThat(expansion.getTitle()).isInstanceOf(Name.class);
        assertThat(expansion.getTitle().getValue()).isEqualTo(Expansion.VANILLA.getTitle().getValue());
    }

    @Test
    @DisplayName("Should there be a total of 10 Expansions")
    void givenExpansions_whenCheckingAmountExpansions_thenReturn10() {
        int numberOfExpansions = Expansion.values().length;

        assertThat(numberOfExpansions).isEqualTo(10);
    }

    @Test
    @DisplayName("Should throw IllegalArgumentException when Expansion doesn't exist")
    void givenNonExistingExpansion_whenChecking_thenThrowIllegalArgumentException() {
        assertThrows(
            IllegalArgumentException.class,
            () -> Expansion.valueOf("FAKE")
        );
    }
}
