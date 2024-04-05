package com.alvarx4z.woja.domain;

import com.alvarx4z.woja.domain.shared.Name;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.time.Year;
import java.util.Arrays;
import java.util.UUID;

import static com.alvarx4z.woja.domain.Expansion.VANILLA;
import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertThrows;

final class ExpansionTest {

    @Test
    @DisplayName("Should contain valid data in the Expansion Enum")
    void givenExpansions_whenCheckingProperties_thenAreValid() {
        Expansion expansion = Expansion.valueOf(VANILLA.toString());

        assertThat(expansion).isInstanceOf(Expansion.class);
        assertThat(expansion.getId()).isInstanceOf(UUID.class);
        assertThat(expansion.getOrder()).isEqualTo(VANILLA.getOrder());
        assertThat(expansion.getTitle()).isInstanceOf(Name.class);
        assertThat(expansion.getTitle().getValue()).isEqualTo(VANILLA.getTitle().getValue());
        assertThat(expansion.getYear()).isInstanceOf(Year.class);
        assertThat(expansion.getYear().getValue()).isEqualTo(VANILLA.getYear().getValue());
    }

    @Test
    @DisplayName("Should there be a total of 10 Expansions")
    void givenExpansions_whenCheckingAmountExpansions_thenReturn10() {
        int numberOfExpansions = Expansion.values().length;

        assertThat(numberOfExpansions).isEqualTo(10);
    }

    @Test
    @DisplayName("Should be all the Expansions' Year from 2004 onwards")
    void givenExpansions_whenCheckingYears_thenAreValid() {
        boolean result =
            Arrays
                .stream(Expansion.values())
                .allMatch(exp -> exp.getYear().isAfter(Year.of(VANILLA.getYear().getValue() - 1)));

        assertThat(result).isTrue();
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
