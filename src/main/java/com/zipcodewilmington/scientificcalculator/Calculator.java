package com.zipcodewilmington.scientificcalculator;

import java.util.Scanner;

public class Calculator {
    Scanner scanner = null;
    double previousAnswer = 0.0;
    double currentNumber = 0; //reads the input as a 'double' value
    String operator = ""; // reads the input as a string
    double result = 0; // variable used to store the result of operation
    boolean isRad = true;
    boolean isErr = false;


    ScientificApplication sa = new ScientificApplication();

    public void run() {
        printCurrentAns(String.valueOf(currentNumber));

        // get first number
        currentNumber = askUserInput();
        printCurrentAns(String.valueOf(currentNumber));

        while (!operator.equalsIgnoreCase("X")) {
            //if current display showing error, user will need to clear it
            if (isErr) {
                printCurrentAns("______________ ___________ \n" +
                                "|  ___| ___ \\ ___ \\  _  | ___ \\\n" +
                                "| |__ | |_/ / |_/ / | | | |_/ /\n" +
                                "|  __||    /|    /| | | |    / \n" +
                                "| |___| |\\ \\| |\\ \\\\ \\_/ / |\\ \\ \n" +
                                "\\____/\\_| \\_\\_| \\_|\\___/\\_| \\_|");
                System.out.print("Enter 'c' to clear the output! :");
                String clearInput = scanner.next();
                while (!clearInput.equalsIgnoreCase("c")) {
                    printCurrentAns("Err");
                    System.out.print("Enter 'c' to clear the output! :");
                    clearInput = scanner.next();
                }
                isErr = false;
                currentNumber = 0.0;
                printCurrentAns(String.valueOf(currentNumber));
                currentNumber = askUserInput();
            }

            // prompt user for input
            printOperatorPrompt();
            operator = scanner.next(); // reads the input as a string

            //check the operator type
            //exit program
            if (operator.equalsIgnoreCase("X")) {
                System.out.println("Good Bye");
            }
            // clear console
            else if (operator.equalsIgnoreCase("c")) {
                previousAnswer = currentNumber;
                currentNumber = 0.0;
                printCurrentAns(String.valueOf(currentNumber));
            }
            //show previous value
            else if (operator.equalsIgnoreCase("prev")) {
                currentNumber = previousAnswer;
                printCurrentAns(String.valueOf(currentNumber));
            }
            //save value into memory
            else if (operator.equalsIgnoreCase("M+")) {
                sa.setMemory(currentNumber);
                printCurrentAns(String.valueOf(currentNumber));
            }
            //reset memory
            else if (operator.equalsIgnoreCase("MC")) {
                sa.setMemory(0.0);
                printCurrentAns(String.valueOf(currentNumber));
            }
            //perform operation
            else {
                checkOperation();
                if (!isErr) {
                    if (sa.getCurrentMode() != 0) {
                        printCurrentAns(String.valueOf(sa.convertToDisplayMode((int) currentNumber)));
                    } else {
                        printCurrentAns(String.valueOf(currentNumber));
                    }
                }
            }
        }
    }

    public double askUserInput() {
        System.out.print("Enter a number | (e) for e | (pi) for pi | or (MRC) for a saved value: ");
        scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        if (input.equalsIgnoreCase("MRC")) {
            return sa.getMemory();
        } if(input.equalsIgnoreCase("e")){
            return ScientificApplication.getE();
        } if(input.equalsIgnoreCase("pi")){
            return ScientificApplication.getPi();
        } else {
            return Double.parseDouble(input);
        }
    }

    public void printOperatorPrompt(){
        System.out.println("-------------------------------------------------------------------------------");
        System.out.println("Enter an operator ( + , - , * , / )"); // prompting the user to enter the operator
        System.out.println("\tor a scientific function (sqrt, square, exp, sin, cos, tan, invsine, invcos, invtan, log, invlog, ln, invnatlog, !) ");
        System.out.println("\tor enter (prev) for previous value | (M+) for add current val to memory | (MC) to clear memory ");
        System.out.print("\tor enter (mode) to switch mode | (c) to clear current number | (X) to exit program: ");
    }
    public void printCurrentAns(String result){
        System.out.println("-------------------------------------------------------------------------------");
        System.out.println("Ans: "+result);
    }
    /* Switch statement is used to perform the operation based on the input. user is asked to input the second number as
    a double and store it in the result variable.  */
    public void checkOperation() {
        scanner = new Scanner(System.in); // Scanner named scanner for user input
        double secondNumber = 0;
        switch (operator) {
            case "+":
                previousAnswer = currentNumber;
                currentNumber = add(currentNumber, askUserInput());
                break;
            case "-":
                previousAnswer = currentNumber;
                currentNumber = subtract(currentNumber, askUserInput());
                break;
            case "*":
                previousAnswer = currentNumber;
                currentNumber = multiply(currentNumber, askUserInput());
                break;
            case "/":
                secondNumber = askUserInput();
                if(secondNumber==0){
                    isErr = true;
                } else {
                    previousAnswer = currentNumber;
                    currentNumber = divide(currentNumber, secondNumber);
                }
                break;
            case "sqrt":
                previousAnswer = currentNumber;
                currentNumber = sqrt(currentNumber);
                break;
            case  "square":
                previousAnswer = currentNumber;
                currentNumber = square(currentNumber);
                break;
            case "exp":
                previousAnswer = currentNumber;
                currentNumber = power(currentNumber, askUserInput());
                break;
            case "inv":
                previousAnswer = currentNumber;
                currentNumber = inverse(currentNumber);
                if (result == 0.0){
                    isErr = true;
                    currentNumber = 0.0;
                }
                break;
            case "invsign":
                previousAnswer = currentNumber;
                currentNumber  = inverseSign(currentNumber);
                break;
            case "sin":
                previousAnswer = currentNumber;
                currentNumber = ScientificApplication.sine(currentNumber);
                checkDegreeOrRadian();
                break;
            case "cos":
                previousAnswer = currentNumber;
                currentNumber = ScientificApplication.cosine(currentNumber);
                checkDegreeOrRadian();
                break;
            case "tan":
                previousAnswer = currentNumber;
                currentNumber = ScientificApplication.tangent(currentNumber);
                checkDegreeOrRadian();
                break;
            case "invsine":
                previousAnswer = currentNumber;
                currentNumber = ScientificApplication.inverseSine(currentNumber);
                checkDegreeOrRadian();
                break;
            case "invcos":
                previousAnswer = currentNumber;
                currentNumber = ScientificApplication.inverseCosine(currentNumber);
                checkDegreeOrRadian();
                break;
            case "invtan":
                previousAnswer = currentNumber;
                currentNumber = ScientificApplication.inverseTangent(currentNumber);
                checkDegreeOrRadian();
                break;
            case "log":
                previousAnswer = currentNumber;
                currentNumber = ScientificApplication.log(currentNumber);
                break;
            case "invlog":
                result = ScientificApplication.inverseLog(currentNumber);
                previousAnswer = currentNumber;
                currentNumber = result;
                break;
            case "ln":
                previousAnswer = currentNumber;
                currentNumber = ScientificApplication.ln(currentNumber);
                break;
            case "invnatlog":
                previousAnswer = currentNumber;
                currentNumber = ScientificApplication.inverseNaturalLog(currentNumber);
                break;
            case "!":
                previousAnswer = currentNumber;
                currentNumber = ScientificApplication.factorial((int) currentNumber);
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
                isErr = true;
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

