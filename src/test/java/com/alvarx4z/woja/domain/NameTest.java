package com.alvarx4z.woja.domain;

import com.alvarx4z.woja.helper.NameHelper;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.NullAndEmptySource;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertThrows;

final class NameTest {

    @Test
    @DisplayName("Should instantiate correctly a Name")
    void givenName_whenInstantiating_thenInstantiatedCorrectly() {
        Name name = NameHelper.aName();

        assertThat(name).isInstanceOf(Name.class);
        assertThat(name.getValue()).isEqualTo(NameHelper.A_VALUE);
    }

    @ParameterizedTest
    @NullAndEmptySource
    @DisplayName("Should throw IllegalArgumentException when invalid values")
    void givenInvalidNameValues_whenInstantiating_thenThrowIllegalArgumentException(String value) {
        assertThrows(
            IllegalArgumentException.class,
            () -> Name.of(value)
        );
    }
}
