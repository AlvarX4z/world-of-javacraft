package com.alvarx4z.woja.domain.invariants;

public abstract class PositiveInteger {

    protected PositiveInteger(int value) {
        validate(value);
    }

    private void validate(int value) {
        if (value <= 0) throw new IllegalArgumentException();
    }
}
