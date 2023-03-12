package com.zipcodewilmington.scientificcalculator;

import java.util.Scanner;

/**
 * Created by leon on 2/9/18.
 */
public class MainApplication {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Please Enter the first number: ");
        int z = scan.nextInt();

        String op = Console.getStringInput("Enter an operator");

        if (op.equals("sqr")) {
            MainApplication.Square(z);
        }
        else if(op.equals("sqrt")){
            MainApplication.SquareRoot(z);
        }

        else {

            System.out.println("Please Enter the second number: ");
            int y = scan.nextInt();

            if (op.equals("-")) {
                MainApplication.Subtraction(z, y);
            }

            if (op.equals("+")) {
                MainApplication.Addition(z, y);
            }

            if (op.equals("/")){
                MainApplication.Division(z, y);
            }
        }




        /* Console.println("Welcome to my calculator!");
        String s = Console.getStringInput("Enter a string");
        Integer i = Console.getIntegerInput("Enter an integer");
        Double d = Console.getDoubleInput("Enter a double.");

        Console.println("The user input %s as a string", s);
        Console.println("The user input %s as a integer", i);
        Console.println("The user input %s as a d", d); */

    }
    /*static void Addition(){
        Scanner scan = new Scanner(System.in);
        System.out.println("Please Enter Numbers: ");
        int z = scan.nextInt();
        System.out.println("and :");
        int y = scan.nextInt();
        int x = z+y;
        System.out.println("Addition: "+x);


    }

    /* static void Subtraction(){
        Scanner scan = new Scanner(System.in);
        System.out.println("Please Enter Numbers: ");
        int z = scan.nextInt();
        System.out.println("and :");
        int y = scan.nextInt();
        int x = z-y;
        System.out.println("Addition: "+x);
    } */

    static void Addition(int z, int y) {
        int x = z + y;
        System.out.println("The answer is " + x);
    }


    static void Subtraction(int z, int y){
        int x = z - y;
        System.out.println("The answer is " + x);
    }

    static void Square(int z) {
        int x = z * z;
        System.out.println("The answer is " + x);
    }

    static void SquareRoot(int z) {
        double x = Math.sqrt(z);
        int y = (int)x;
        System.out.println("The answer is " + y);
    }

    static void Division(float z,float y){
         float x = z / y;
        System.out.println("The answer is " + x);
    }

}
