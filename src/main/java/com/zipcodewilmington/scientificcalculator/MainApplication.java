package com.zipcodewilmington.scientificcalculator;

/**
 * Created by leon on 2/9/18.
 */
public class MainApplication {

    //variables
    public static void main(String[] args) {
        Console.println("Welcome to my calculator!");
//        String s = Console.getStringInput("Enter a function");
//        Integer i = Console.getIntegerInput("Enter an integer");
//        Double d = Console.getDoubleInput("Enter a double.");

//        Console.println("The user input %s as a string", s);
////        Console.println("The user input %s as a integer", i);
//        Console.println("The user input %s as a double", d);


        Calculator mainCalc = new Calculator();
        boolean isOn = true;
        Console.println("Type ~ to exit.😇");
        while (isOn) {
            String whatFunction = Console.getStringInput("Enter a function");
            double number;

            switch (whatFunction) {
                case "~":
                    isOn = false;
                    return;
                case "+":
                    number = Console.getDoubleInput("Enter a number");
                    mainCalc.addition(number);
                    break;
                case "-":
                    number = Console.getDoubleInput("Enter a number");
                    mainCalc.subtraction(number);
                    break;
//                case "/":
//                    division(x, y);
//                    break;
                case "*":
                    number = Console.getDoubleInput("Enter a number");
                    mainCalc.multiplication(number);
                    break;
                case "square":
                    mainCalc.square(mainCalc.memoryValue);
                    break;
            } // switch ends

            Console.println("The value is now: %f", mainCalc.memoryValue);
        }

    } // void main

    // Main Calculator
    public static class Calculator {
        // this is the number on the screen of the calculator

        public double memoryValue = 0.0;

        //Main Math
        public void addition(double x) {
            this.memoryValue += x;
        }

        public void subtraction(double x) {
            this.memoryValue -= x;
        }

        public void multiplication(double x) {
            this.memoryValue = memoryValue * x;
        }

        public static int division(int x, int y) {
            return x / y;
        }

        public void square(double x) {
            this.memoryValue = memoryValue * memoryValue;
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

        public double switchSign(double x) {
            return (x * -1.0);
        }

        //Error
        public String err() {
            String message = "Err";
            return message;
        }

        //Trig Functions
        public double sine(double x) {
            return Math.sin(x);
        }

        public double cosine(double x) {
            return Math.cos(x);
        }

        public double tangent(double x) {
            return Math.tan(x);
        }

        // outputs in radians
        public double inverseSine(double x) {
            return Math.asin(x);
        }

        public double inverseCosine(double x) {
            return Math.acos(x);
        }

        public double inverseTangent(double x) {
            return Math.atan(x);
        }

        //Log Functions
        public double log(double x) {
            return Math.log10(x);
        }

        public double inverseLog(double x) {
            return Math.pow(10, x);
        }

        public double naturalLog(double x) {
            return Math.log(x);
        }

        public double inverseNatLog(double x) {
            return Math.exp(x);
        }

        //Factorial
        public int factorial(int x) {
            int total = 1;
            for (int i = x; i >= 1; i--) {
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
        public String toOctal(int x) {
            return Integer.toOctalString(x);
        }

        public String toBinary(int x) {
            return Integer.toBinaryString(x);
        }

        public double binaryToDecimal(String binary) {
            return Integer.parseInt(binary);
        }

        public String toHexa(int x) {
            return Integer.toHexString(x);
        }

        //Additional Functions
        public double cubed(double x) {
            return Math.cbrt(x);
        }

        public String hello() {
            String message = "01134";
            return message;
        }


    }
} // class


