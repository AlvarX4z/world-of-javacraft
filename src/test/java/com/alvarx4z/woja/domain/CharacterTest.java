package com.alvarx4z.woja.domain;

import com.alvarx4z.woja.domain.shared.Name;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertThrows;

final class CharacterTest {

    @Test
    @DisplayName("Should instantiate correctly a Character")
    void givenCharacter_whenInstantiating_thenInstantiatedCorrectly() {
        Character character = new Character(Name.of("Vol'jin"));

        assertThat(character).isInstanceOf(Character.class);
        assertThat(character.getName()).isInstanceOf(Name.class);
    }

    @Test
    @DisplayName("Should throw IllegalArgumentException when any null value")
    void givenCharacterWithANullValue_whenInstantiating_thenThrowIllegalArgumentException() {
        assertThrows(
            IllegalArgumentException.class,
            () -> new Character(null)
        );
    }
}