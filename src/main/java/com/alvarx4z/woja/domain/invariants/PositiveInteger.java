package com.alvarx4z.woja.domain.invariants;

public final class PositiveInteger {

    private final int value;

    private PositiveInteger(int value) {
        validate(value);
        this.value = value;
    }

    public int getValue() {
        return value;
    }

    public static PositiveInteger of(int value) {
        return new PositiveInteger(value);
    }

    private void validate(int value) {
        if (value <= 0) throw new IllegalArgumentException();
    }
}
