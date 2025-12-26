package com.tendomloop;

import java.util.Scanner;

public class Program1 {
    public double calculate(double a, double b, String operation) {
        switch (operation.toLowerCase()) {
            case "addition":
                return a + b;

            case "subtraction":
                return a - b;

            case "multiplication":
                return a * b;

            case "division":
                if (b != 0) {
                    return a / b;
                } else {
                    System.out.println("Error: Division by zero is not allowed.");
                    return 0;
                }

            default:
                System.out.println("Invalid operation type.");
                return 0;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Program1 calculator = new Program1();

        System.out.print("Enter value of a: ");
        double a = sc.nextDouble();

        System.out.print("Enter value of b: ");
        double b = sc.nextDouble();

        sc.nextLine(); 

        System.out.print("Enter operation (Addition / Subtraction / Multiplication / Division): ");
        String operation = sc.nextLine();

        double result = calculator.calculate(a, b, operation);

        System.out.println("Result: " + result);

        sc.close();
    }
}
