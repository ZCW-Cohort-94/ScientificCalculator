package com.zipcodewilmington.scientificcalculator;

public class ScientificApplication {

    private int currentMode = 0;

    private double memory = 0.0;
  //  private double display = 0;
    private static boolean isRadians = true;

    //getter setter
    public int getCurrentMode() {
        return currentMode;
    }
    public void setCurrentMode(int currentMode) {
         this.currentMode = currentMode;
    }

    public double getMemory() {
        return memory;
    }

    public void setMemory(double memory) {
        this.memory = memory;
    }

    public void switchDisplayMode() {
        // binary, octal, decimal, hexadecimal
        currentMode++;
        if (currentMode > 3) {
            currentMode = 0;
        }
    }

    public String convertToDisplayMode(int value) {
        switch (currentMode) {
            case 0:
                return Integer.toString(value); // decimal mode
            case 1:
                return Integer.toBinaryString(value); // binary mode
            case 2:
                return Integer.toOctalString(value); // octal mode
            case 3:
                return Integer.toHexString(value); // hexadecimal mode
            default:
                return ""; // unknown mode
        }
    }

    //switchDisplayOptions should rotate through options
    // convertToDisplayStringMode - sets display to mode given

//    public void addToMemory() {
//        memory += display;
//        display = memory;
//    }
//
//    public void resetMemory() {
//        memory = 0;
//    }
//
//    public void recallFromMemory() {
//        display = memory;
//    }


    //M+key add current displayed value to value in memory, store and update displau
    //Mc key reset memory
    //Mrc key Recall current value from memory to display


    public static double sine(double x) {
        return Math.sin(x);
    }

    public static double cosine(double x) {
        return Math.cos(x);
    }

    public static double tangent(double x) {
        return Math.tan(x);
    }

    public static double inverseSine(double x) {
        return Math.asin(x);
    }

    public static double inverseCosine(double x) {
        return Math.acos(x);
    }

    public static double inverseTangent(double x) {
        return Math.atan(x);
    }


    //Sine    //These should take displayed value(x) and update it according to given formula
    //Cosine
    //Tangent
    //InverseSine
    //InverseCosine
    //InverseTangent


    public static void switchUnitsMode() {
        isRadians = !isRadians; // toggle between radians and degrees mode
        System.out.println("Trig units mode set to " + (isRadians ? "radians" : "degrees"));
    }

    public static double radiansToDegrees(double radians) {
        return Math.toDegrees(radians);
    }

    public static double degreesToRadians(double degrees) {
        return Math.toRadians(degrees);
    }

    //switchUnitsMode ()rotate through options
    //switchUnitsMode (String mode) set trig units to type given


    public static double log(double value) {
        return Math.log10(value);
    }

    public static double inverseLog(double value) {
        return Math.exp(value);
    }

    public static double ln(double value) {
        return Math.log(value);
    }

    public static double inverseNaturalLog(double value) {
        return Math.exp(value);
    }

    //log
    //10^x inverse logarithm
    //Ln natural logarithm
    //e^x inverse natural logarithm


    public static int factorial(int x) {
        if (x == 0)
            return 1;
        else
            return x * factorial(x - 1);  // recursive function
    }

    public static double getPi() {
        return Math.PI;
    }

    //method to provide the constant Pi

    public static double getE() {
        return Math.E;
    }

    //method to provide the constant e

}


