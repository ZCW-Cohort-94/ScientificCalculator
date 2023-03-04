package com.zipcodewilmington.scientificcalculator;
import java.lang.Math;
import java.util.Scanner;
import java.io.*;




public class ScientificApplications {

//menu scientific trigonometry functions
    public static void trigMenu() {
        System.out.println("Please choose unit. \"1\" for Radian. \"2\" for Degree");
        Scanner choice = new Scanner(System.in);
        int unitChoice = choice.nextInt();

        if ((unitChoice!=1) || (unitChoice!=2)) {
            System.out.println("Invalid Choice");
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
        } else {
            double x = getDoubleInputX();
            if (unitChoice==2) {
                x = x*Math.PI/180;
            }
            switch (entryMode) {
                case 1:
                    System.out.println("Sine results of "+x+" is:"+Math.sin(x));
                case 2:
                    System.out.println("Cosine results of "+x+" is:"+Math.cos(x));
                case 3:
                    System.out.println("Tangent results of "+x+" is:"+Math.tan(x));
                case 4:
                    System.out.println("Inverse Sine results of "+x+" is:"+Math.asin(x));
                case 5:
                    System.out.println("Inverse Cosine results of "+x+" is:"+Math.asin(x));
                case 6:
                    System.out.println("Inverse Tan results of "+x+" is:"+Math.atan(x));
            }
        }
    }


//menu scientific logarithmic and factorial functions
    public static void logarithmicMenu() {

        System.out.println("Please select one of the following logarithmic or factorial functions:");
        System.out.println("Enter \"1\" for Log Function");
        System.out.println("Enter \"3\" for Inverse Log Function");
        System.out.println("Enter \"4\" for Ln Function");
        System.out.println("Enter \"5\" for Inverse Ln Function");

        System.out.println();
        Scanner choice = new Scanner(System.in);
        int entryMode = choice.nextInt();
        if (entryMode < 1 || entryMode > 5) {
            System.out.println("Invalid Choice");
        } else {
            switch (entryMode) {
                case 1:
                    int y = getInInput();
                    System.out.println("Logarithm results of "+y+" is:"+ Math.log10(y));

                case 2:
                    y = getInInput();
                    System.out.println("Inverse Log results of "+y+" is:"+ Math.pow(10,y));

                case 3:
                    y = getInInput();
                    System.out.println("Natural Log results of "+y+" is:"+ Math.log(y));

                case 4:
                    y = getInInput();
                    System.out.println("Inverse Natural Log results of "+y+" is:"+ Math.exp(y));
                case 5:
                    y = getInInput();
                    FactorialFunction(y);
            }
        }
    }

// Ask for input  double number
    private static double getDoubleInputX() {
            Scanner inScan = new Scanner(System.in);
            System.out.println("Please enter x value for calculation:");
            return inScan.nextDouble();
        }
// Ask for input int number
    private static int getInInput() {
        Scanner inScan = new Scanner(System.in);
        System.out.println("Please enter x value for calculation:");
        return inScan.nextInt();
    }

//Factorial calculation
    public static int FactorialFunction(int n) {
        int factorialResult = 1;
        for (int i = n; i > 0; i--) {
            factorialResult = factorialResult * i;
        }
        System.out.println("Factorial results of " + n + " is:"+factorialResult);
        return factorialResult;
    }

/*
Memory - Store up to one numeric value in memory for recall later (default to 0) *
    (M+ key) Add the currently displayed value to the value in memory (store in memory and update display) *
    (MC key) Reset memory *
    (MRC key) Recall the current value from memory to the display *
*/

    public class Memory {
        public static int m;
        m =0;
    }
    public void saveMeme(int valueToStore) {
        System.out.print("Key M+ to store your results");
        Scanner store = new Scanner(System.in);
        String meme = store.nextLine();
        if (meme == "M+") {
            Memory.m = valueToStore;
        }
    }
    public int callMeme() {
        System.out.println(Memory.m);
        return Memory.m;
    }

//// menu binary , octal, decimal, hexadecimal
//public static modeMenu() {
//
//        } //switch display mode
//
//    public class String switchDisplayMode() {}







} //Scientific Applications

