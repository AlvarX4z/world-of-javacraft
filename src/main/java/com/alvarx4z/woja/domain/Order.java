package com.alvarx4z.woja.domain;

import com.alvarx4z.woja.domain.invariants.PositiveInteger;

public final class Order extends PositiveInteger {

    private final int value;

    private Order(int value) {
        super(value);
        this.value = value;
    }

    public int getValue() {
        return value;
    }

    public static Order of(int value) {
        return new Order(value);
    }
}
