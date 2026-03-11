
# Java Calculator Testing Project Using JUnit, TestNG using Maven

![Java](https://img.shields.io/badge/Java-21-blue)
![Maven](https://img.shields.io/badge/Maven-Build-orange)
![JUnit](https://img.shields.io/badge/JUnit-5-green)
![TestNG](https://img.shields.io/badge/TestNG-Testing-red)
![License](https://img.shields.io/badge/License-MIT-lightgrey)

This project demonstrates **unit testing in Java using multiple testing frameworks**.

The project implements a **Calculator application** and tests it using:

- **JUnit 5**
- **AssertJ**
- **TestNG**
- **Maven**

---

# Project Overview

The goal of this project is to demonstrate:

- Basic **unit testing**
- Multiple **testing frameworks**
- **Test priorities**
- **Test grouping**
- **Automated testing using Maven**

---

# Project Structure


calculator-project
│
├── pom.xml
├── testng.xml
│
└── src
├── main
│ └── java
│ └── com/example
│ └── Calculator.java
│
└── test
└── java
└── com/example
├── CalculatorJUnitTest.java
├── FibonacciTest.java
└── LucasTest.java


---

# Calculator Features

The calculator includes the following operations:

| Function | Description |
|--------|-------------|
| add | Adds two numbers |
| subtract | Subtracts two numbers |
| multiply | Multiplies two numbers |
| divide | Divides two numbers |
| fibonacci | Calculates Fibonacci number |
| lucas | Calculates Lucas number |

---

# Fibonacci Sequence

The Fibonacci sequence is defined as:


F(0) = 0
F(1) = 1
F(n) = F(n-1) + F(n-2)


Example sequence:


0, 1, 1, 2, 3, 5, 8, 13


---

# Lucas Sequence

The Lucas sequence is similar to Fibonacci but starts with different values:


L(0) = 2
L(1) = 1
L(n) = L(n-1) + L(n-2)


Example sequence:


2, 1, 3, 4, 7, 11, 18


---

# Testing Frameworks

## JUnit 5

Used for **basic unit testing**.

Example:

```java
assertEquals(10, calc.add(5,5));
AssertJ

Provides fluent assertions.

Example:

assertThat(calc.fibonacci(5)).isEqualTo(5);
TestNG

Used for advanced features like:

Test priorities

Test grouping

XML configuration

Example:

@Test(priority = 1, groups = {"valid"})
Running the Project

Run all tests:

mvn clean test

Run TestNG suite:

mvn -DsuiteXmlFile=testng.xml test
Example Test Output
Running CalculatorJUnitTest
Running FibonacciTest
Running LucasTest

Tests run: 11
Failures: 0
Errors: 0

BUILD SUCCESS
Technologies Used

Java 21

Maven

JUnit 5

AssertJ

TestNG

IntelliJ IDEA

Author

Saurav Dangi

GitHub Profile:
https://github.com/saurav26022003
