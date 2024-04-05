package com.alvarx4z.woja.domain;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertThrows;

final class OrderTest {

    @Test
    @DisplayName("Should instantiate correctly an Order")
    void givenOrder_whenInstantiating_thenInstantiatesCorrectly() {
        Order order = Order.of(1);

        assertThat(order).isInstanceOf(Order.class);
        assertThat(order.getValue()).isEqualTo(1);
    }

    @Test
    @DisplayName("Should throw IllegalArgumentException when value is 0 or lower")
    void givenInvalidOrder_whenInstantiating_thenThrowIllegalArgumentException() {
        assertThrows(
            IllegalArgumentException.class,
            () -> Order.of(0)
        );
    }
}
