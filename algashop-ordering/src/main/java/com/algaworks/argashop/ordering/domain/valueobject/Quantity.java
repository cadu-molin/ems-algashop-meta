package com.algaworks.argashop.ordering.domain.valueobject;

import java.util.Objects;

public record Quantity(Integer value) implements Comparable<Quantity> {

    private static final Quantity ZERO = new Quantity(0);

    public Quantity {
        Objects.requireNonNull(value);

        if (value < 0) {
            throw new IllegalArgumentException();
        }
    }

    public Quantity add(Quantity quantity) {
        Objects.requireNonNull(quantity);

        return new Quantity(this.value + quantity.value);
    }

    @Override
    public String toString() {
        return value.toString();
    }

    @Override
    public int compareTo(Quantity o) {
        return this.value.compareTo(o.value);
    }
}
