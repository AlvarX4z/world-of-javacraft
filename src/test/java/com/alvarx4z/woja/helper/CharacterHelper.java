package com.alvarx4z.woja.helper;

import com.alvarx4z.woja.domain.Character;

public final class CharacterHelper {

    public static Character aCharacter() {
        return new Character(NameHelper.aName());
    }
}
