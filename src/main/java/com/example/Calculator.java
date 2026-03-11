package com.example;

public class Calculator {

    // Addition
    public int add(int a, int b) {
        return a + b;
    }

    // Subtraction
    public int subtract(int a, int b) {
        return a - b;
    }

    // Multiplication
    public int multiply(int a, int b) {
        return a * b;
    }

    // Division
    public int divide(int a, int b) {

        if (b == 0) {
            throw new IllegalArgumentException("Division by zero not allowed");
        }

        return a / b;
    }

    // Fibonacci Method
    public int fibonacci(int n) {

        if (n < 0) {
            throw new IllegalArgumentException("Negative number");
        }

        if (n == 0) return 0;
        if (n == 1) return 1;

        int a = 0;
        int b = 1;
        int result = 0;

        for (int i = 2; i <= n; i++) {
            result = a + b;
            a = b;
            b = result;
        }

        return result;
    }

    // Lucas Method
    public int lucas(int n) {

        if (n < 0) {
            throw new IllegalArgumentException("Negative number");
        }

        if (n == 0) return 2;
        if (n == 1) return 1;

        int a = 2;
        int b = 1;
        int result = 0;

        for (int i = 2; i <= n; i++) {
            result = a + b;
            a = b;
            b = result;
        }

        return result;
    }
}