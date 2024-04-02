package com.alvarx4z.woja.domain;

import com.alvarx4z.woja.domain.invariants.NotNullNorEmptyString;

public class Name extends NotNullNorEmptyString {

    private final String value;

    public Name(String value) {
        super(value);
        this.value = value;
    }

    public String getValue() {
        return value;
    }
}
