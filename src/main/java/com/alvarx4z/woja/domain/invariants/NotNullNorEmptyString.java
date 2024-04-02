package com.alvarx4z.woja.domain.invariants;

public abstract class NotNullNorEmptyString {

    protected NotNullNorEmptyString(String value) {
        validate(value);
    }

    private void validate(String value) {
        if (value == null || value.isEmpty()) throw new IllegalArgumentException();
    }
}
