package com.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CalculatorJUnitTest {

    Calculator calc = new Calculator();

    // Positive partition
    @Test
    void testAdditionPositive() {
        assertEquals(10, calc.add(5,5));
    }

    // Negative partition
    @Test
    void testAdditionNegative() {
        assertEquals(-10, calc.add(-5,-5));
    }
}