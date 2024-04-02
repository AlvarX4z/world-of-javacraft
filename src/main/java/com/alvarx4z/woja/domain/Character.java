package com.alvarx4z.woja.domain;

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
