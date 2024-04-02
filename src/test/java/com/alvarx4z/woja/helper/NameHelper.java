package com.alvarx4z.woja.helper;

import com.alvarx4z.woja.domain.Name;

public final class NameHelper {

    public static final String A_VALUE = "Vol'jin";

    public static Name aName() {
        return new Name(A_VALUE);
    }
}
