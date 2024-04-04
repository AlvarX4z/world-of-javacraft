package com.alvarx4z.woja.domain;

import com.alvarx4z.woja.domain.shared.Name;

public class Character {

    private final Name name;

    public Character(Name name) {
        validate(name);
        this.name = name;
    }

    public Name getName() {
        return name;
    }

    private void validate(Name name) {
        if (name == null) throw new IllegalArgumentException();
    }
}
