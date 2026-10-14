package com.algaworks.argashop.ordering.domain.valueobject;

import com.algaworks.argashop.ordering.domain.validator.FieldValidations;

public record ProductName(String value) {

    public ProductName {
        FieldValidations.requiresNonBlank(value);
    }

    @Override
    public String toString() {
        return value;
    }
}
