package com.zipcodewilmington.scientificcalculator;
import java.lang.Math;
import java.util.Scanner;
import org.codehaus.plexus.util.StringUtils;



public class ScientificApplications {

    //MAIN METHOD
    public static void main(String[] args) {
        scientificFunc();
    }



    //DRAW A CALCULATOR
    public static String trungsCalculator() {
        String str1 = "";
        str1 = str1 + "SCIENTIFIC CALCULATOR - DELTA GROUP \n";
        str1 = str1 + StringUtils.repeat("-",55) + "\n" + "\n";
        str1 = str1 + "    0.0 \n \n";
        str1 = str1 + StringUtils.repeat("-",55) + "\n" + "\n";
        str1 = str1 + "[RAD]  [DEG]  [  x!]  [ ( ]   [ ) ]   [ % ]   [ AC]\n";
        str1 = str1 + "[SIN]  [LOG]  [ASIN]  [ 7 ]   [ 8 ]   [ 9 ]   [ / ]\n";
        str1 = str1 + "[COS]  [ LN]  [ACOS]  [ 4 ]   [ 5 ]   [ 6 ]   [ * ]\n";
        str1 = str1 + "[TAN]  [EXP]  [ATAN]  [ 1 ]   [ 2 ]   [ 3 ]   [ - ]\n";
        str1 = str1 + "[10X]  [SQR]  [SQRT]  [ 0 ]   [ . ]   [ = ]   [ + ]\n";
        System.out.println(str1);
                return str1;
    }

    public static void doAgain() {
        Scanner in2 = new Scanner(System.in);
        System.out.println("\n \n \n Do again? (y or n)");
        boolean again = true;
        String checkAgain = in2.nextLine();
        if (checkAgain.equals("y")) {
            scientificFunc();
        }
    }
    //SCIENTIFIC CALCULATOR FUNCTION
    public static void scientificFunc() {

            String str2 = trungsCalculator();

            Scanner in1 = new Scanner(System.in);

            System.out.println("Please select Radian or Degree Mode (Key in rad or deg)");
            String modeIn = in1.nextLine();

            System.out.println("Please key in Function name (in lowercase):");
            String funcIn = in1.nextLine();
            str2 = str2.replaceAll("0.0", funcIn + ".");
            System.out.println(str2);

            System.out.println("Please enter value to calculate, or mc to recall");
            String mm = in1.nextLine();
            double douIn;
            if (mm.equals("mc")) {
                douIn=callMeme();
            }
            else {
                douIn = Double.parseDouble(mm);
            }
            str2 = str2.replaceAll(funcIn, funcIn + "(" + douIn + ")");
            System.out.println(str2);

            if (modeIn.equals("deg")) {
                douIn = douIn * Math.PI / 180;
            }

            switch (funcIn) {
                case "sin":
                    System.out.println("Sine results of " + douIn + " is:" + Math.sin(douIn));
                    saveMeme(Math.sin(douIn));
                    doAgain();
                    break;

                case "cos":
                    System.out.println("Cosine results of " + douIn + " is:" + Math.cos(douIn));
                    saveMeme(Math.cos(douIn));
                    doAgain();
                    break;

                case "tan":
                    System.out.println("Tangent results of " + douIn + " is:" + Math.tan(douIn));
                    saveMeme(Math.tan(douIn));
                    doAgain();
                    break;

                case "asin":
                    System.out.println("Inverse Sine results of " + douIn + " is:" + Math.asin(douIn));
                    saveMeme(Math.asin(douIn));
                    doAgain();
                    break;

                case "acos":
                    System.out.println("Inverse Cosine results of " + douIn + " is:" + Math.asin(douIn));
                    saveMeme(Math.asin(douIn));
                    doAgain();
                case "atan":
                    System.out.println("Inverse Tan results of " + douIn + " is:" + Math.atan(douIn));
                    saveMeme(Math.atan(douIn));
                    doAgain();
                    break;

                case "log":
                    int y = getInInput();
                    System.out.println("Logarithm results of " + y + " is:" + Math.log10(y));
                    saveMeme(Math.log10(y));
                    doAgain();
                    break;

                case "10x":
                    y = getInInput();
                    System.out.println("Inverse Log results of " + y + " is:" + Math.pow(10, y));
                    Math.pow(10, y);
                    doAgain();
                    break;

                case "ln":
                    y = getInInput();
                    System.out.println("Natural Log results of " + y + " is:" + Math.log(y));
                    saveMeme(Math.log(y));
                    doAgain();
                    break;

                case "exp":
                    y = getInInput();
                    System.out.println("Inverse Natural Log results of " + y + " is:" + Math.exp(y));
                    saveMeme(Math.exp(y));
                    doAgain();
                    break;

                case "x!":
                    y = getInInput();
                    FactorialFunction(y);
                    saveMeme(FactorialFunction(y));
                    doAgain();
                    break;

                case "sqr":
                    System.out.println("Square results of " + douIn + " is:" + douIn * douIn);
                    saveMeme(douIn*douIn);
                    doAgain();
                    break;

                case "sqrt":
                    System.out.println("Square Root  results of " + douIn + " is:" + Math.sqrt(douIn));
                    saveMeme(Math.sqrt(douIn));
                    doAgain();
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
        System.out.println("Please re-enter INTEGER value for calculation:");
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


// meme is memory variable
    public static double meme = 0;

    // save memory
    public static void saveMeme(double valueToStore) {
        System.out.print("\n \n \n Key m to store your results");
        Scanner store = new Scanner(System.in);
        String memo = store.nextLine();
        if (memo.equals("m")) {
            ScientificApplications.meme = valueToStore;
        }
    }

    //call memory
    public static double callMeme() {
        System.out.println("Memory value is:"+ ScientificApplications.meme);
        return ScientificApplications.meme;
    }

//// menu binary , octal, decimal, hexadecimal
//public static modeMenu() {
//
//        } //switch display mode
//
//    public class String switchDisplayMode() {}







} //Scientific Applications








