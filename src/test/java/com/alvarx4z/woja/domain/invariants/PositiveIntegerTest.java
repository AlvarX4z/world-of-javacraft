package com.alvarx4z.woja.domain.invariants;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

final class PositiveIntegerTest {

    @Test
    @DisplayName("Should instantiate correctly a PositiveInteger")
    void givenPositiveInteger_whenInstantiating_thenInstantiatesCorrectly() {
        PositiveInteger number = PositiveInteger.of(1);

        assertThat(number).isInstanceOf(PositiveInteger.class);
        assertThat(number.getValue()).isEqualTo(1);
    }
}
