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
                case'a':
                    System.out.println(ScientificFeatures.getSin(input1));
                    input1 = ScientificFeatures.getSin(input1);
                    break;
                case'b':
                    System.out.println(ScientificFeatures.getCos(input1));
                    input1 = ScientificFeatures.getCos(input1);
                    break;
                case'd':
                    System.out.println(ScientificFeatures.getTan(input1));
                    input1 = ScientificFeatures.getTan(input1);
                    break;
                case'f':
                    System.out.println(ScientificFeatures.getInvSin(input1));
                    input1 = ScientificFeatures.getInvSin(input1);
                    break;
                case'g':
                    System.out.println(ScientificFeatures.getInvCos(input1));
                    input1 = ScientificFeatures.getInvCos(input1);
                    break;
                case'h':
                    System.out.println(ScientificFeatures.getInvTan(input1));
                    input1 = ScientificFeatures.getInvTan(input1);
                    break;
                case'j':
                    System.out.println(ScientificFeatures.getLog(input1));
                    input1 = ScientificFeatures.getLog(input1);
                    break;
                case'k':
                    System.out.println(ScientificFeatures.invLog(input1));
                    input1 = ScientificFeatures.invLog(input1);
                    break;
                case'm':
                    System.out.println(ScientificFeatures.getNatLog(input1));
                    input1 = ScientificFeatures.getNatLog(input1);
                    break;
                case'z':
                    System.out.println(ScientificFeatures.getFactorial(input1));
                    input1 = ScientificFeatures.getFactorial(input1);
                    break;
                case'x':
                    System.out.print("Enter your second number: ");
                    input2 = scan.nextDouble();
                    System.out.println(ScientificFeatures.getPythagoreanTheorem(input1,input2));
                    input1 = ScientificFeatures.getPythagoreanTheorem(input1,input2);
                    scan.nextLine();
                    break;
                case'v':
                    System.out.println(ScientificFeatures.getCircleFromRadius(input1));
                    input1 = ScientificFeatures.getCircleFromRadius(input1);
                    break;

                default:
                    System.out.println("Invalid input");
                    CoreFeatures.help();
                    break;


            }

        }
    }
}
