package com.calculator;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in); //created a new scanner for system input

        System.out.println("Enter the first number: ");
        double num1 = scanner.nextDouble(); //reads and returns the entered first number

        System.out.println("Enter an operator: (+ OR - OR * OR /) ");
        char operation = scanner.next().charAt(0); //charAt(0) for giving only one char?

        if (!(operation == '+' || operation == '-' || operation == '*' || operation == '/')) {
            System.err.println("Invalid Operator. Please use only + or - or * or /");
        } // ! - logical negotiation. Means that operator OR || was changed on operator AND & ?

        System.out.println("Enter the second number: ");
        double num2 = scanner.nextDouble();// reads and returns the entered second number

        if (operation == '/' && num2 == 0.0) {
            System.err.println("The second number cannot be zero for division operation.");
        }

        if (operation == '+') {
            System.out.println(num1 + " + " + num2 + " = " + (num1 + num2)); // why we can use only (num1 + num2)?
        } else if (operation == '-') {
            System.out.println(num1 + " - " + num2 + " = " + (num1 - num2));
        } else if (operation == '*') {
            System.out.println(num1 + " x " + num2 + " = " + (num1 * num2));
        } else if (operation == '/') {
            System.out.println(num1 + " / " + num2 + " = " + (num1 / num2));
        } else {
            System.err.println("Invalid Operator Specified.");
        }

    }
}
