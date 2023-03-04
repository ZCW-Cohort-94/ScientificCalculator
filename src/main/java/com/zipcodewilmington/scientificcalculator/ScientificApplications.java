package com.zipcodewilmington.scientificcalculator;
import java.lang.Math;
import java.util.Scanner;



public class ScientificApplications {

    /*    Scientific Features
        Switch display mode (binary, octal, decimal, hexadecimal)
        switchDisplayMode() should rotate through the options
        switchDisplayMode(String mode) should set the display to the mode given
    */

        System.out.println("Please select one of the following functions:");
        System.out.println("Enter \"1\" for Binary Mode");
        System.out.println("Enter \"2\" for Octal Mode");
        System.out.println("Enter \"3\" for Decimal Mode");
        System.out.println("Enter \"4\" for Hexadecimal Mode");
        Scanner choice = new Scanner(System.in);
        System.out.println();
        int entryMode = choice.nextInt();
        if (entryMode<1 || entryMode>4) {
            System.out.println("Invalid Choice");
            break;
        } else
        {
            switch (entryMode){
                case 1:
                    return 1;
                case 2:
                    return 2;
                case 3:
                    return 3;
                case 4:
                    return 4;
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


//Sine function
    public static double Sine(double x) {
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