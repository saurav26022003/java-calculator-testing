package com.example;

import org.testng.annotations.Test;
import static org.testng.Assert.*;

public class CalculatorTest {

    Calculator calc = new Calculator();

    @Test
    public void testAddition(){

        int result = calc.add(5,5);

        assertEquals(result,10);

    }
}