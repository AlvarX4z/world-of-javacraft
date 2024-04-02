package com.alvarx4z.woja.domain;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static com.alvarx4z.woja.helper.NameHelper.A_VALUE;
import static com.alvarx4z.woja.helper.NameHelper.aName;
import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertThrows;

final class NameTest {

    @Test
    @DisplayName("Should instantiate correctly a Name")
    void givenName_whenInstantiating_thenInstantiatedCorrectly() {
        Name name = aName(A_VALUE);

        assertThat(name).isInstanceOf(Name.class);
        assertThat(name.getValue()).isEqualTo(A_VALUE);
    }

    @Test
    @DisplayName("Should throw IllegalArgumentException when null value")
    void givenNameWithNullValue_whenInstantiating_thenThrowIllegalArgumentException() {
        assertThrows(
            IllegalArgumentException.class,
            () -> aName(null)
        );
    }

    @Test
    @DisplayName("Should throw IllegalArgumentException when blank value")
    void givenNameWithBlankValue_whenInstantiating_thenThrowIllegalArgumentException() {
        assertThrows(
            IllegalArgumentException.class,
            () -> aName("")
        );
    }
}
