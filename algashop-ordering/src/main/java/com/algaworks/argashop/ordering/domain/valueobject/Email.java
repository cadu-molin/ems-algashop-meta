package com.algaworks.argashop.ordering.domain.valueobject;

import com.algaworks.argashop.ordering.domain.validator.FieldValidations;

import static com.algaworks.argashop.ordering.domain.exception.ErrorMessages.VALIDATION_ERROR_EMAIL_IS_INVALID;

public record Email(String value) {

    public Email {
        FieldValidations.requiresValidEmail(value, VALIDATION_ERROR_EMAIL_IS_INVALID);
    }

    @Override
    public String toString() {
        return value;
    }
}
