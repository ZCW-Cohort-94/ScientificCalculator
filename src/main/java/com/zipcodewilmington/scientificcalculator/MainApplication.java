package com.zipcodewilmington.scientificcalculator;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Created by leon on 2/9/18.
 */
public class MainApplication {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        char mathInput;
        double input1 = -2;
        double input2 = 0;
        double currentNumber = -1;
        boolean on = true;

       /* Console.println("Welcome to my calculator!");
        String s = Console.getStringInput("Enter a string");
        Integer i = Console.getIntegerInput("Enter an integer");
        Double d = Console.getDoubleInput("Enter a double.");

        Console.println("The user input %s as a string", s);
        Console.println("The user input %s as a integer", i);
        Console.println("The user input %s as a d", d);


      */
        CoreFeatures.help();
        System.out.print("Please input a number: ");

        while(true) {
            try {
                input1 = scan.nextDouble(); break;
            } catch (InputMismatchException e) {
                System.out.print("Invalid number, Please input Number: ");
                scan.nextLine();
            }
        }

            scan.nextLine();
        while (on) {
            System.out.print("Please input an arithmetic expression: ");
            mathInput = scan.nextLine().charAt(0);


            switch(mathInput){
                case'q':
                    System.out.print("Good bye");
                    on = false;
                    break;

                case'c':
                    currentNumber = 0;
                    on = true;
                    System.out.print("System is clear, input new value: ");
                    currentNumber = CoreFeatures.currentState;
                    while(true) {
                        try {
                            input1 = scan.nextDouble(); break;
                        } catch (InputMismatchException e) {
                            System.out.println("Invalid Input");
                            scan.nextLine();
                        }
                    }
                    scan.nextLine();
                    break;

                case '+':
                    System.out.print("Enter your second number: ");
                    while(true){
                        try {
                            input2 = scan.nextDouble(); break;
                        } catch (InputMismatchException e) {
                            System.out.println("Invalid Input");
                            scan.nextLine();
                        }
                    }
                    printThisOut(CoreFeatures.add(input1, input2));
                    currentNumber = CoreFeatures.currentState;
                    input1 = currentNumber;
                    scan.nextLine();
                    break;

                case '-':
                    System.out.print("Enter your second number: ");
                    while(true) {
                        try {
                            input2 = scan.nextDouble(); break;
                        } catch (InputMismatchException e) {
                            System.out.println("Invalid Input");
                            scan.nextLine();
                        }
                    }
                    printThisOut(CoreFeatures.subtract(input1, input2));
                    currentNumber = CoreFeatures.currentState;
                    input1 = currentNumber;
                    scan.nextLine();
                    break;

                case '*':
                    System.out.print("Enter your second number: ");
                    while(true){
                        try {
                            input2 = scan.nextDouble(); break;
                        } catch (InputMismatchException e) {
                            System.out.println("Invalid Input");
                            scan.nextLine();
                        }
                    }

                    printThisOut(CoreFeatures.multiply(input1, input2));
                    currentNumber = CoreFeatures.currentState;
                    input1 = currentNumber;
                    scan.nextLine();
                    break;

                case'/':
                    System.out.print("Enter your second number: ");
                    while(true) {
                        try {
                            input2 = scan.nextDouble(); break;
                        } catch (InputMismatchException e) {
                            System.out.println("Invalid Input");
                            scan.nextLine();
                        }
                    }
                    printThisOut(CoreFeatures.divide(input1, input2));
                    currentNumber = CoreFeatures.currentState;
                    input1 = currentNumber;
                    scan.nextLine();
                    break;

                case'r':
                    printThisOut(CoreFeatures.square(input1));
                    currentNumber = CoreFeatures.currentState;
                    input1 = currentNumber;
                    break;

                case't':
                    System.out.println(CoreFeatures.sqrt(input1));
                    currentNumber = CoreFeatures.currentState;
                    input1 = currentNumber;
                    break;

                case'y':
                    System.out.println("Enter your second number: ");
                    while(true) {
                        try {
                            input2 = scan.nextDouble(); break;
                        } catch (InputMismatchException e) {
                            System.out.println("Invalid Input");
                            scan.nextLine();
                        }
                    }
                    printThisOut(CoreFeatures.exponent(input1, input2));
                    currentNumber = CoreFeatures.currentState;
                    input1 = currentNumber;
                    scan.nextLine();
                    break;

                case'u':
                    printThisOut(CoreFeatures.inverse(input1));
                    currentNumber = CoreFeatures.currentState;
                    input1 = currentNumber;
                    break;

                case'i':
                    printThisOut(CoreFeatures.invert(input1));
                    currentNumber = CoreFeatures.currentState;
                    input1 = currentNumber;
                    break;
                case'a':
                    printThisOut(ScientificFeatures.getSin(input1));
                    input1 = ScientificFeatures.getSin(input1);
                    break;
                case'b':
                    printThisOut(ScientificFeatures.getCos(input1));
                    input1 = ScientificFeatures.getCos(input1);
                    break;
                case'd':
                    printThisOut(ScientificFeatures.getTan(input1));
                    input1 = ScientificFeatures.getTan(input1);
                    break;
                case'f':
                    printThisOut(ScientificFeatures.getInvSin(input1));
                    input1 = ScientificFeatures.getInvSin(input1);
                    break;
                case'g':
                    printThisOut(ScientificFeatures.getInvCos(input1));
                    input1 = ScientificFeatures.getInvCos(input1);
                    break;
                case'h':
                    printThisOut(ScientificFeatures.getInvTan(input1));
                    input1 = ScientificFeatures.getInvTan(input1);
                    break;
                case'j':
                    printThisOut(ScientificFeatures.getLog(input1));
                    input1 = ScientificFeatures.getLog(input1);
                    break;
                case'k':
                    printThisOut(ScientificFeatures.invLog(input1));
                    input1 = ScientificFeatures.invLog(input1);
                    break;
                case'm':
                    printThisOut(ScientificFeatures.getNatLog(input1));
                    input1 = ScientificFeatures.getNatLog(input1);
                    break;
                case'z':
                    printThisOut(ScientificFeatures.getFactorial(input1));
                    input1 = ScientificFeatures.getFactorial(input1);
                    break;
                case'x':
                    System.out.print("Enter your second number: ");
                    input2 = scan.nextDouble();
                    printThisOut(ScientificFeatures.getPythagoreanTheorem(input1,input2));
                    input1 = ScientificFeatures.getPythagoreanTheorem(input1,input2);
                    scan.nextLine();
                    break;
                case'v':
                    printThisOut(ScientificFeatures.getCircleFromRadius(input1));
                    input1 = ScientificFeatures.getCircleFromRadius(input1);
                    break;

                default:
                    System.out.println("Invalid input");
                    CoreFeatures.help();
                    break;


            }

        }
    }
    private static void printThisOut(double value) {
        System.out.println(value);

    }
}
