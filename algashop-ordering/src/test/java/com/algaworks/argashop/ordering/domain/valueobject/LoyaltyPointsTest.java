package com.algaworks.argashop.ordering.domain.valueobject;

import org.junit.jupiter.api.Test;
import org.springframework.test.context.cache.ContextCache;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatExceptionOfType;
import static org.junit.jupiter.api.Assertions.*;

class LoyaltyPointsTest {
    @Test
    void shouldGenerateWithValue() {
        LoyaltyPoints loyaltyPoints = new LoyaltyPoints(10);

        assertThat(loyaltyPoints.value()).isEqualTo(10);
    }

    @Test
    void shouldAddValue() {
        LoyaltyPoints loyaltyPoints = new LoyaltyPoints(10);

        assertThat(loyaltyPoints.add(5).value()).isEqualTo(15);
    }

    @Test
    void shouldNotAddValue() {
        LoyaltyPoints loyaltyPoints = new LoyaltyPoints(10);

        assertThatExceptionOfType(IllegalArgumentException.class).isThrownBy(() -> loyaltyPoints.add(-5));

        assertThat(loyaltyPoints.value()).isEqualTo(10);
    }
}