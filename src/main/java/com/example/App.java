package com.example;

import java.util.Scanner;

public class App {

    public static void main(String[] args) {

        Calculator calc = new Calculator();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Simple Calculator");
        System.out.println("1. Add");
        System.out.println("2. Subtract");
        System.out.println("3. Multiply");
        System.out.println("4. Divide");
        System.out.println("5. Fibonacci");
        System.out.println("6. Lucas");

        System.out.print("Choose operation: ");
        int choice = scanner.nextInt();

        if(choice <= 4) {

            System.out.print("Enter first number: ");
            int a = scanner.nextInt();

            System.out.print("Enter second number: ");
            int b = scanner.nextInt();

            switch(choice) {

                case 1:
                    System.out.println("Result: " + calc.add(a,b));
                    break;

                case 2:
                    System.out.println("Result: " + calc.subtract(a,b));
                    break;

                case 3:
                    System.out.println("Result: " + calc.multiply(a,b));
                    break;

                case 4:
                    System.out.println("Result: " + calc.divide(a,b));
                    break;
            }
        }

        else if(choice == 5) {

            System.out.print("Enter n for Fibonacci: ");
            int n = scanner.nextInt();

            System.out.println("Result: " + calc.fibonacci(n));
        }

        else if(choice == 6) {

            System.out.print("Enter n for Lucas: ");
            int n = scanner.nextInt();

            System.out.println("Result: " + calc.lucas(n));
        }

        else {
            System.out.println("Invalid choice");
        }

        scanner.close();
    }
}