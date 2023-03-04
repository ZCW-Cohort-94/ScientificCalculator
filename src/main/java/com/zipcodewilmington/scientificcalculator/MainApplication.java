package com.zipcodewilmington.scientificcalculator;

/**
 * Created by leon on 2/9/18.
 */
public class MainApplication {
    public static void main(String[] args) {
        Console.println("Welcome to my calculator!");
        String s = Console.getStringInput("Enter a string");
        Integer i = Console.getIntegerInput("Enter an integer");
        Double d = Console.getDoubleInput("Enter a double.");

        Console.println("The user input %s as a string", s);
        Console.println("The user input %s as a integer", i);
        Console.println("The user input %s as a double", d);
    }
    //Main Math
    public int addition(int x, int y) {
        return x + y;
    }

    public int subtraction(int x, int y) {
        return x - y;
    }

    public int multiplication(int x, int y) {
        return x * y;
    }

    public int divide(int x, int y) {
        return x / y;
    }

    public int square(int x) {
        return x * x;
    }

    public double squareRoot(double x) {
        return Math.sqrt(x);
    }

    public double inverse(double x) {
        return (1 / x);
    }

    public double exponent(double x, double y) {
        return Math.pow(x, y);
    }

    public double switchSign(double x){
        return(x *-1.0);
    }

    //Error
    public String err() {
        String message = "Err";
        return message;
    }

    //Trig Functions
    public double sin(double x) {
        return Math.sin(x);
    }

    public double cos(double x) {
        return Math.cos(x);
    }

    public double tan(double x) {
        return Math.tan(x);
    }

    public double inverseSin(double x) {
        return Math.toDegrees(Math.asin(x));
    }
    public double inverseCos(double x) {
        return Math.toDegrees(Math.acos(x));
    }
    public double inverseTan(double x) {
        return Math.toDegrees(Math.atan(x));
    }

    //Log Functions
    public double log(double x) {
        return Math.log(x);
    }

    public double inverseLog(double x){
        return Math.pow(10, x);
    }

    public double naturalLog(double x) {
        return Math.log1p(x);
    }

    public double inverseNatLog(double x) {
        return Math.pow(Math.E, x);
    }

    //Factorial
    public int factorial(int x) {
        int total = 0;
        for(int i = x; i >= 1; i--) {
            total = (total * i);
        }
        return total;
    }

    //Switch Units
    public double toDegrees(double x) {
        return Math.toDegrees(x);
    }

    public double toRadians(double x) {
        return Math.toRadians(x);
    }








    //Display Mode


} // class


