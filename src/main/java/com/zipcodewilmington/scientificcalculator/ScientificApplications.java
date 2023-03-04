package com.zipcodewilmington.scientificcalculator;
import java.lang.Math;
import java.util.Scanner;
import org.codehaus.plexus.util.StringUtils;



public class ScientificApplications {

    //MAIN METHOD
    public static void main(String[] args) {
        trungsCalculator();
        scientificFunc();
    }



    //DRAW A CALCULATOR
    public static String trungsCalculator() {
        String str1 = "";
        str1 = str1 + StringUtils.repeat("-",55) + "\n" + "\n";
        str1 = str1 + "    0 \n \n";
        str1 = str1 + StringUtils.repeat("-",55) + "\n" + "\n";
        str1 = str1 + "[RAD]  [DEG]  [  x!]  [ ( ]   [ ) ]   [ % ]   [ AC]\n";
        str1 = str1 + "[SIN]  [LOG]  [ASIN]  [ 7 ]   [ 8 ]   [ 9 ]   [ / ]\n";
        str1 = str1 + "[COS]  [ LN]  [ACOS]  [ 4 ]   [ 5 ]   [ 6 ]   [ * ]\n";
        str1 = str1 + "[TAN]  [EXP]  [ATAN]  [ 1 ]   [ 2 ]   [ 3 ]   [ - ]\n";
        str1 = str1 + "[10X]  [SQR]  [SQRT]  [ 0 ]   [ . ]   [ = ]   [ + ]\n";
        System.out.println(str1);
                return str1;
    }

    //SCIENTIFIC CALCULATOR FUNCTION
    public static void scientificFunc() {
        Scanner in1 = new Scanner(System.in);

        System.out.println("Plese select Radian or Degree Mode (Key in rad or deg)");
        String modeIn = in1.nextLine();

        System.out.println("Please key in Function name (in lowercase):");
        String funcIn = in1.nextLine();

        System.out.println("Please enter value to calculate:");
        double douIn = in1.nextDouble();
        if (in1.equals("deg")) {
            douIn = douIn*Math.PI/180;
        }

        switch (funcIn) {
            case "sin":
                System.out.println("Sine results of "+douIn+" is:"+Math.sin(douIn));
                break;
            case "cos":
                System.out.println("Cosine results of "+douIn+" is:"+Math.cos(douIn));
                break;
            case "tan":
                System.out.println("Tangent results of "+douIn+" is:"+Math.tan(douIn));
                break;
            case "asin":
                System.out.println("Inverse Sine results of "+douIn+" is:"+Math.asin(douIn));
                break;
            case "acos":
                System.out.println("Inverse Cosine results of "+douIn+" is:"+Math.asin(douIn));
                break;
            case "atan":
                System.out.println("Inverse Tan results of "+douIn+" is:"+Math.atan(douIn));
                break;
            case "log":
                int y = getInInput();
                System.out.println("Logarithm results of "+y+" is:"+ Math.log10(y));
                break;

            case "10x":
                y = getInInput();
                System.out.println("Inverse Log results of "+y+" is:"+ Math.pow(10,y));
                break;

            case "ln":
                y = getInInput();
                System.out.println("Natural Log results of "+y+" is:"+ Math.log(y));
                break;

            case "exp":
                y = getInInput();
                System.out.println("Inverse Natural Log results of "+y+" is:"+ Math.exp(y));
                break;

            case "x!":
                y = getInInput();
                FactorialFunction(y);
                break;

            case "sqr":
                System.out.println("Square results of "+douIn+" is:"+ douIn*douIn);
                break;

            case "sqrt":
                y = getInInput();
                System.out.println("Square Root  results of "+douIn+" is:"+ Math.sqrt(douIn));
                break;
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
        System.out.println("Please enter INTEGER value for calculation:");
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



    // meme is memory variable
    public static int meme=0;

    public void saveMeme(int valueToStore) {
        System.out.print("Key M+ to store your results");
        Scanner store = new Scanner(System.in);
        String memo = store.nextLine();
        if (memo == "M+") {
            ScientificApplications.meme = valueToStore;
        }
    }
    public int callMeme() {
        System.out.println(ScientificApplications.meme);
        return ScientificApplications.meme;
    }

//// menu binary , octal, decimal, hexadecimal
//public static modeMenu() {
//
//        } //switch display mode
//
//    public class String switchDisplayMode() {}







} //Scientific Applications








