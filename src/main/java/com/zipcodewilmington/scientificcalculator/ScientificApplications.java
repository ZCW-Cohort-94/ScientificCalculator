package com.zipcodewilmington.scientificcalculator;
import java.lang.Math;
import java.util.Scanner;



public class ScientificApplications {

//menu scientific trigonometry functions
    public static void trigMenu() {
        System.out.println("Please choose unit. \"1\" for Radian. \"2\" for Degree");
        Scanner choice = new Scanner(System.in);
        int unitChoice = choice.nextInt();

        double y = getInputX();

        if (unitChoice!=1||unitChoice!=2) {
            System.out.println("Invalid Choice");
            Break;
        }
        if (unitChoice==2) {
            y = y*Math.PI/180;
        }

        System.out.println("Please select one of the following trigonometry functions:");
        System.out.println("Enter \"1\" for Sine Function");
        System.out.println("Enter \"2\" for Cosine Function");
        System.out.println("Enter \"3\" for Tangent Function");
        System.out.println("Enter \"4\" for Inverse Sine Function");
        System.out.println("Enter \"5\" for Inverse cosine Function");
        System.out.println("Enter \"6\" for Inverse Tangent Function");

        System.out.println();

        int entryMode = choice.nextInt();
        if (entryMode < 1 || entryMode > 6) {
            System.out.println("Invalid Choice");
            break;
        } else {
            switch (entryMode) {
                case 1:
                    System.out.println("Sine Function");
                    Sine(y);

                case 2:
                    System.out.println("Cosine Function");
                    Cosine(y);
                case 3:
                    System.out.println("Tangent Function");
                    Tangent(y);
                case 4:
                    System.out.println("Inverse Sine Function");
                    InverseSine(y);
                case 5:
                    System.out.println("Inverse Cosine Function");
                    InverseCosine(y);
                case 6:
                    System.out.println("Inverse Tangent Function");
                    InverseTangent(y);
            }
        }
    }


//menu scientific logarithmic and factorial functions
    public static void logarithmicMenu() {
        double y = getInputX();

        System.out.println("Please select one of the following logarithmic or factorial functions:");
        System.out.println("Enter \"1\" for Log Function");
        System.out.println("Enter \"3\" for Inverse Log Function");
        System.out.println("Enter \"4\" for Ln Function");
        System.out.println("Enter \"5\" for Inverse Ln Function");

        System.out.println();

        int entryMode = choice.nextInt();
        if (entryMode < 1 || entryMode > 6) {
            System.out.println("Invalid Choice");
            break;
        } else {
            switch (entryMode) {
                case 1:
                    System.out.println("Sine Function");
                    Sine(y);

                case 2:
                    System.out.println("Cosine Function");
                    Cosine(y);
                case 3:
                    System.out.println("Tangent Function");
                    Tangent(y);
                case 4:
                    System.out.println("Inverse Sine Function");
                    InverseSine(y);
                case 5:
                    System.out.println("Inverse Cosine Function");
                    InverseCosine(y);
                case 6:
                    System.out.println("Inverse Tangent Function");
                    InverseTangent(y);
            }
        }
    }
// Ask for input number
    private static double getInputX() {
            Scanner inScan = new Scanner(System.in);
            System.out.println("Please enter x value for calculation:");
            double x = inScan.nextDouble();
            inScan.close();
            return x;
        }
    }

//Sine function
    private static double Sine(double x) {
        System.out.println("Sine results of "+x+" is:");
        return Math.sin(x);
    }

//Cosine function
    public static double Cosine(double x) {
        System.out.println("Cosine results of "+x+" is:");
        return Math.cos(x);
    }

//Tangent Function
    public static double Tangent(double x) {
        System.out.println("Tangent results of "+x+" is:");
        return Math.tan(x);
    }

    //Inversine Function
    public static double InverseSine(double x) {
        System.out.println("Inverse Sine results of "+x+" is:");
        return Math.asin(x);
    }

    //Inverse Cosine Function
    public static double InverseCosine(double x) {
        System.out.println("Inverse Cosine results of "+x+" is:");
        return Math.acos(x);
    }

    //Inverse Tangent Function
    public static double InverseTangent(double x) {
        System.out.println("Inverse Tangent results of "+x+" is:");
        return Math.atan(x);
    }




// menu binary , octal, decimal, hexadecimal
public static void modeMenu(); {
        Scanner choice = new Scanner(System.in);
        System.out.println("Please select one of the following functions:");
        System.out.println("Enter \"1\" for Binary Mode");
        System.out.println("Enter \"2\" for Octal Mode");
        System.out.println("Enter \"3\" for Decimal Mode");
        System.out.println("Enter \"4\" for Hexadecimal Mode");
        System.out.println();
        int entryMode = choice.nextInt();
        if (entryMode < 1 || entryMode > 4) {
        System.out.println("Invalid Choice");
        break;
        } else {
        switch (entryMode) {
        case 1:
        System.out.println("Welcome to Binary Mode");
        case 2:
        System.out.println("Welcome to Octal Mode");
        case 3:
        System.out.println("Welcome to Decimal Mode");
        case 4:
        System.out.println("Welcome to Hexadecimal Mode");
        }
        }
        }

    public static void switchDisplayMode() {





    } //switch display mode

    public class String switchDisplayMode() {


    } //switch display mode string




/*
Memory - Store up to one numeric value in memory for recall later (default to 0) *
        (M+ key) Add the currently displayed value to the value in memory (store in memory and update display) *
        (MC key) Reset memory *
        (MRC key) Recall the current value from memory to the display *
*/
    public class Memory() { }











    public class switchUnitsMode() {}
    public class String switchUnitsMode() {}

//Logarithm
    public static double calLog(int x) {
        System.out.println("Logarithm results of "+x+" is:");
        return Math.log(x);
}

// Inverse Logarithm
    public static double InverseLogarithm(int x) {
        System.out.println("Inverse Logarithm results of "+x+" is:");
        return Math.exp(x);
    }

//Natural Logarithm
    public static double NaturalLogarithm(double x) {
        System.out.println("Natural Logarithm results of "+x+" is:");
        return Math.log(x);
    }


//Factorial calculation
    public static int FactorialFunction(int n) {
        int factorialResult = 1;
        for (int i = n; i>0; i--) {
            factorialResult = factorialResult*i;
        }
        System.out.println("Factorial results of "+n+" is:");
        return factorialResult;
        }
    }





} //Scientific Applications