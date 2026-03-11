package com.example;

import org.testng.annotations.Test;
import static org.testng.Assert.*;

public class LucasTest {

    Calculator calc = new Calculator();

    @Test(priority = 1, groups = {"valid"})
    public void testLucas0() {
        assertEquals(calc.lucas(0), 2);
    }

    @Test(priority = 2, groups = {"valid"})
    public void testLucas1() {
        assertEquals(calc.lucas(1), 1);
    }

    @Test(priority = 3, groups = {"valid"})
    public void testLucas5() {
        assertEquals(calc.lucas(5), 11);
    }

    @Test(priority = 4, groups = "invalid")
    public void testLucasNegative() {

        try {
            calc.lucas(-1);
            fail("Exception expected");
        } catch (IllegalArgumentException e) {
            assertTrue(true);
        }
    }
}