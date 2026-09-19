package com.algaworks.argashop.ordering.domain.valueobject;

import com.algaworks.argashop.ordering.domain.utility.IdGenerator;

import java.io.Serializable;
import java.util.Objects;
import java.util.UUID;

public record CustomerId(UUID value) {

    public CustomerId() {
        this(IdGenerator.generateTimeBasedUUID());
    }

    public CustomerId(UUID value) {
        this.value = Objects.requireNonNull(value);
    }

    @Override
    public String toString() {
        return value.toString();
    }
}
