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
        double input1 = 0;
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
                    System.out.println(CoreFeatures.add(input1, input2));
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
                    System.out.println(CoreFeatures.subtract(input1, input2));
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

                    System.out.println(CoreFeatures.multiply(input1, input2));
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
                    System.out.println(CoreFeatures.divide(input1, input2));
                    currentNumber = CoreFeatures.currentState;
                    input1 = currentNumber;
                    scan.nextLine();
                    break;

                case'r':
                    System.out.println(CoreFeatures.square(input1));
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
                    System.out.println(CoreFeatures.exponent(input1, input2));
                    currentNumber = CoreFeatures.currentState;
                    input1 = currentNumber;
                    scan.nextLine();
                    break;

                case'u':
                    System.out.println(CoreFeatures.inverse(input1));
                    currentNumber = CoreFeatures.currentState;
                    input1 = currentNumber;
                    break;

                case'i':
                    System.out.println(CoreFeatures.invert(input1));
                    currentNumber = CoreFeatures.currentState;
                    input1 = currentNumber;
                    break;

                default:
                    System.out.println("Invalid input");
                    CoreFeatures.help();
                    break;


            }

        }
    }
}
