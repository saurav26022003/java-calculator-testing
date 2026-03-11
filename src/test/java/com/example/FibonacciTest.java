package com.example;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.*;

public class FibonacciTest {

    Calculator calc = new Calculator();

    @Test
    void testFibonacci0() {
        assertThat(calc.fibonacci(0)).isEqualTo(0);
    }

    @Test
    void testFibonacci1() {
        assertThat(calc.fibonacci(1)).isEqualTo(1);
    }

    @Test
    void testFibonacci5() {
        assertThat(calc.fibonacci(5)).isEqualTo(5);
    }

    @Test
    void testFibonacci10() {
        assertThat(calc.fibonacci(10)).isEqualTo(55);
    }

    @Test
    void testFibonacciNegative() {
        assertThatThrownBy(() -> calc.fibonacci(-1))
                .isInstanceOf(IllegalArgumentException.class);
    }
}