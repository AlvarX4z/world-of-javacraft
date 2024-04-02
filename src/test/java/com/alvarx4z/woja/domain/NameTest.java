package com.alvarx4z.woja.domain;

import com.alvarx4z.woja.helper.NameHelper;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertThrows;

final class NameTest {

    @Test
    @DisplayName("Should instantiate correctly a Name")
    void givenName_whenInstantiating_thenInstantiatedCorrectly() {
        Name name = NameHelper.A_NAME;

        assertThat(name).isInstanceOf(Name.class);
        assertThat(name.getValue()).isEqualTo(NameHelper.A_NAME.getValue());
    }

    @Test
    @DisplayName("Should throw IllegalArgumentException when null value")
    void givenNameWithNullValue_whenInstantiating_thenThrowIllegalArgumentException() {
        assertThrows(
            IllegalArgumentException.class,
            () -> new Name(null)
        );
    }

    @Test
    @DisplayName("Should throw IllegalArgumentException when blank value")
    void givenNameWithBlankValue_whenInstantiating_thenThrowIllegalArgumentException() {
        assertThrows(
            IllegalArgumentException.class,
            () -> new Name("")
        );
    }
}
