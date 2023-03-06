package com.zipcodewilmington.scientificcalculator;

import java.util.Scanner;

public class Calculator {
    Scanner scanner = null;
    double previousAnswer = 0.0;
    double currentNumber = 0; //reads the input as a 'double' value
    String operator = null; // reads the input as a string
    double result = 0; // variable used to store the result of operation
    boolean isRad = true;

    ScientificApplication sa = new ScientificApplication();

    public void run() {
        printCurrentAns(currentNumber);
        System.out.println("Enter a number:"); //prompting user to input the first number
        scanner = new Scanner(System.in); // Scanner named scanner for user input

        currentNumber = scanner.nextDouble();

        System.out.println("Enter operator ( + , - , * , / )"); // prompting the user to enter the operator
        System.out.println("or choose scientific function (sqrt, square, exp, sin, cos, tan, invsine, invcos, invtan, log, invlog, ln, invnatlog, !) ");
        System.out.println("or enter 'mode' to switch mode");
        System.out.println("or enter 'X' to exit program");
        operator = scanner.next(); // reads the input as a string
        checkOperation();
        System.out.println(result);

        while (!operator.equalsIgnoreCase("X")) {
            System.out.println("Enter operator ( + , - , * , / )"); // prompting the user to enter the operator
            System.out.println("or choose scientific function (sqrt, square, exp, sin, cos, tan, invsine, invcos, invtan, log, invlog, ln, invnatlog, !) ");
            System.out.println("or enter 'mode' to switch mode");
            System.out.println("or enter 'X' to exit program");
            operator = scanner.next(); // reads the input as a string
            if (operator.equalsIgnoreCase("X")) {
                System.out.println("Good Bye");
            } else {
                currentNumber = result;
                checkOperation();

                System.out.println("Ans: "+sa.convertToDisplayMode((int) result));
            }
        }
    }

    public void printCurrentAns(double result){
        System.out.println("Ans: "+sa.convertToDisplayMode((int) result));
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
                result = add(currentNumber, secondNumber);
                break;
            case "-":
                System.out.println("Enter second number:");
                secondNumber = scanner.nextDouble();
                result = subtract(currentNumber, secondNumber);
                break;
            case "*":
                System.out.println("Enter second number:");
                secondNumber = scanner.nextDouble();
                result = multiply(currentNumber, secondNumber);
                break;
            case "/":
                System.out.println("Enter second number:");
                secondNumber = scanner.nextDouble();
                if(secondNumber==0){
                    System.out.println("Invalid Operation");
                } else {
                    result = divide(currentNumber, secondNumber);
                }
                break;
            case "sqrt":
                result = sqrt(currentNumber);
                break;
            case  "square":
                result = square(currentNumber);
                break;
            case "exp":
                System.out.println("Enter second number:");
                secondNumber = scanner.nextDouble();
                result = power(currentNumber, secondNumber);
                break;
            case "inv":
                result = inverse(currentNumber);
                if (result == 0.0){
                    System.out.println("Invalid Operation");
                }
                break;
            case "invsign":
                result  = inverseSign(currentNumber);
                break;
            case "sin":
                result = ScientificApplication.sine(currentNumber);
                checkDegreeOrRadian();
                break;
            case "cos":
                result = ScientificApplication.cosine(currentNumber);
                checkDegreeOrRadian();
                break;
            case "tan":
                result = ScientificApplication.tangent(currentNumber);
                checkDegreeOrRadian();
                break;
            case "invsine":
                result = ScientificApplication.inverseSine(currentNumber);
                checkDegreeOrRadian();
                break;
            case "invcos":
                result = ScientificApplication.inverseCosine(currentNumber);
                checkDegreeOrRadian();
                break;
            case "invtan":
                result = ScientificApplication.inverseTangent(currentNumber);
                checkDegreeOrRadian();
                break;
            case "log":
                result = ScientificApplication.log(currentNumber);
                break;
            case "invlog":
                result = ScientificApplication.inverseLog(currentNumber);
                break;
            case "ln":
                result = ScientificApplication.ln(currentNumber);
                break;
            case "invnatlog":
                result = ScientificApplication.inverseNaturalLog(currentNumber);
                break;
            case "!":
                result = ScientificApplication.factorial((int) currentNumber);
                break;
            case "mode":
                sa.switchDisplayMode();
                if(sa.getCurrentMode() == 0){
                    System.out.println("decimal mode");
                }else if (sa.getCurrentMode() == 1){
                    System.out.println("binary mode");
                }else if (sa.getCurrentMode() == 2){
                    System.out.println("octal mode");
                }else if (sa.getCurrentMode() == 3) {
                    System.out.println("hexadecimal mode");
                }
                 break;
            default:
                System.out.println("Error");
                break;

        }
    }

    public void checkDegreeOrRadian(){
        scanner = new Scanner(System.in);
        System.out.println("Enter 'rad' for radian unit or 'deg' for degree unit:");
        String userInput = scanner.nextLine();
        if(userInput.equalsIgnoreCase("rad")){
            if(!isRad){
                result = sa.degreesToRadians(result);
                isRad = true;
            }
        } else {
            if(isRad){
                result = sa.radiansToDegrees(result);
                isRad = false;
            }
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

