package com.alvarx4z.woja.domain.shared;

import com.alvarx4z.woja.domain.invariants.NotNullNorEmptyString;

public final class Name extends NotNullNorEmptyString {

    private final String value;

    private Name(String value) {
        super(value);
        this.value = value;
    }

    public String getValue() {
        return value;
    }

    public static Name of(String value) {
        return new Name(value);
    }
}
