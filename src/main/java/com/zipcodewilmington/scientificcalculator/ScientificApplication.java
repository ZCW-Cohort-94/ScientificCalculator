package com.zipcodewilmington.scientificcalculator;

public class ScientificApplication {


    private int currentMode = 0;
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

    private static void memory(){
    }
    //M+key add current displayed value to value in memory, store and update displau
    //Mc key reset memory
    //Mrc key Recall current value from memory to display

    private static void trigFunctions(){
     }
     //Sine    //These should take displayed value(x) and update it according to given formula
    //Cosine
    //Tangent
    //InverseSine
    //InverseCosine
    //InverseTangent
    private static void switchTrigUnitsModeDegreesRadians(){
    }
    //switchUnitsMode ()rotate through options
    //switchUnitsMode (String mode) set trig units to type given
    private static void logarithmicFunctions (){
    }
    //log
    //10^x inverse logarithm
    //Ln natural logarithm
    //e^x inverse natural logarithm

    private static void factorialFunction (){
    }
    //should take displayed value(x) and update it according to given formula
}