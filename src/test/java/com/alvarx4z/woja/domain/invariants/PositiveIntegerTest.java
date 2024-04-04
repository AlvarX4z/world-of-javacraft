package com.alvarx4z.woja.domain.invariants;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertThrows;

final class PositiveIntegerTest {

    @Test
    @DisplayName("Should instantiate correctly a PositiveInteger")
    void givenPositiveInteger_whenInstantiating_thenInstantiatesCorrectly() {
        PositiveInteger number = PositiveInteger.of(1);

        assertThat(number).isInstanceOf(PositiveInteger.class);
        assertThat(number.getValue()).isEqualTo(1);
    }

    @Test
    @DisplayName("Should throw IllegalArgumentException when value is 0 or lower")
    void givenInvalidPositiveInteger_whenInstantiating_thenThrowIllegalArgumentException() {
        assertThrows(
            IllegalArgumentException.class,
            () -> PositiveInteger.of(0)
        );
    }
}
