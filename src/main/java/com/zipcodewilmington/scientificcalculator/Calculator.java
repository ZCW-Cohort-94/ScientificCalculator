package com.zipcodewilmington.scientificcalculator;

import java.util.Scanner;
import java.util.*;

public class Calculator {
    Scanner scanner = null;
    double firstNumber = 0; //reads the input as a 'double' value
    String operator = null; // reads the input as a string
    double result = 0; // variable used to store the result of operation

    ScientificApplication sa = new ScientificApplication();

    public void userInput() {
        System.out.println("Enter first number:"); //prompting user to input the first number
        scanner = new Scanner(System.in); // Scanner named scanner for user input

        firstNumber = scanner.nextDouble();

        System.out.println("Enter operator ( + , - , * , / , sqrt, square, exp, sin, cos, tan, invsine, invcos, invtan, log, invlog, ln, invnatlog,!,)  or Enter \"X\" to exit program :"); // prompting the user to enter the operator

        operator = scanner.next(); // reads the input as a string
        checkOperation();
        System.out.println(result);

        while (!operator.equalsIgnoreCase("X")) {
            System.out.println("Enter operator ( + , - , * , / , sqrt, square, exp ) or Enter \"X\" to exit program :"); // prompting the user to enter the operator
            operator = scanner.next(); // reads the input as a string
            if (operator.equalsIgnoreCase("X")) {
                System.out.println("Good Bye");
            } else {
                firstNumber=result;
                checkOperation();
                System.out.println(result);
            }
        }
    }

    /* Switch statement is used to perform the operation based on the input. user is asked to input the second number as
    a double and store it in the result variable.  */
    public void checkOperation() {
        scanner = new Scanner(System.in); // Scanner named scanner for user input
        double secondNumber = 0;
        switch (operator) {
            case "+":
                System.out.println("Enter second number:");
                secondNumber = scanner.nextDouble();
                result = add(firstNumber, secondNumber);
                break;
            case "-":
                System.out.println("Enter second number:");
                secondNumber = scanner.nextDouble();
                result = subtract(firstNumber, secondNumber);
                break;
            case "*":
                System.out.println("Enter second number:");
                secondNumber = scanner.nextDouble();
                result = multiply(firstNumber, secondNumber);
                break;
            case "/":
                System.out.println("Enter second number:");
                secondNumber = scanner.nextDouble();
                if(secondNumber==0){
                    System.out.println("Invalid Operation");
                } else {
                    result = divide(firstNumber, secondNumber);
                }
                break;
            case "sqrt":
                result = sqrt(firstNumber);
                break;
            case  "square":
                result = square(firstNumber);
                break;
            case "exp":
                System.out.println("Enter second number:");
                secondNumber = scanner.nextDouble();
                result = power(firstNumber, secondNumber);
                break;
            case "inv":
                result = inverse(firstNumber);
                if (result == 0.0){
                    System.out.println("Invalid Operation");
                }
                break;
            case "invsign":
                result  = inverseSign(firstNumber);
                break;
            case "sin":
                result = ScientificApplication.sine(firstNumber);
                break;
            case "cos":
                result = ScientificApplication.cosine(firstNumber);
                break;
            case "tan":
                result = ScientificApplication.tangent(firstNumber);
                break;
            case "invsine":
                result = ScientificApplication.inverseSine(firstNumber);
                break;
            case "invcos":
                result = ScientificApplication.inverseCosine(firstNumber);
                break;
            case "invtan":
                result = ScientificApplication.inverseTangent(firstNumber);
                break;
            case "log":
                result = ScientificApplication.log(firstNumber);
                break;
            case "invlog":
                result = ScientificApplication.inverseLog(firstNumber);
                break;
            case "ln":
                result = ScientificApplication.ln(firstNumber);
                break;
            case "invnatlog":
                result = ScientificApplication.inverseNaturalLog(firstNumber);
                break;
            case "!":
                result = ScientificApplication.factorial((int)firstNumber);
                break;
            default:
                System.out.println("Error");
                break;

        }
    }

    public double add(double num1, double num2) {
        return num1 + num2;
    }

    public double subtract(double num1, double num2) {
        return num1 - num2;
    }

    public double multiply(double num1, double num2) {
        return num1 * num2;
    }

    public double divide(double num1, double num2) {
        return num1 / num2;
    }

    public double sqrt(double num) {
        return Math.sqrt(num);
    }
    public double square(double num){
        return num * num;
    }

    public double power(double num1, double num2) {
        return Math.pow(num1,num2);
    }

    public double inverse(double num1) {
        if (num1 != 0) {
            return 1 / num1;
        } else {
            return 0.0 ;
        }
    }
    public double inverseSign(double num1){
        return num1 * -1;
    }
}

