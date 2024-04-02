package com.alvarx4z.woja.domain;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static com.alvarx4z.woja.helper.CharacterHelper.aCharacter;
import static org.assertj.core.api.Assertions.assertThat;

final class CharacterTest {

    @Test
    @DisplayName("Should instantiate correctly a Character")
    void givenCharacter_whenInstantiating_thenInstantiatedCorrectly() {
        Character character = aCharacter();

        assertThat(character).isInstanceOf(Character.class);
        assertThat(character.getName()).isInstanceOf(Name.class);
    }
}