package com.zipcodewilmington.scientificcalculator;
import java.lang.Math;
import java.util.Scanner;

import com.sun.tools.javac.Main;
import org.codehaus.plexus.util.StringUtils;



public class ScientificApplications extends MainApplication{
    double douIn;

    MainApplication mainApp = new MainApplication();
    //MAIN METHOD
    //public static void main(String[] args) {
        //scientificFunc();
    //}



//DRAW A CALCULATOR
//    public static String trungsCalculator() {
//        String str1 = "";
//        str1 = str1 + " \n \n SCIENTIFIC CALCULATOR - DELTA GROUP \n";
//        str1 = str1 + StringUtils.repeat("-",55) + "\n" + "\n";
//        str1 = str1 + "    0.0 \n \n";
//        str1 = str1 + StringUtils.repeat("-",55) + "\n" + "\n";
//        str1 = str1 + "[RAD]  [DEG]  [  x!]  [ ( ]   [ ) ]   [ % ]   [ AC]\n";
//        str1 = str1 + "[SIN]  [LOG]  [ASIN]  [ 7 ]   [ 8 ]   [ 9 ]   [ / ]\n";
//        str1 = str1 + "[COS]  [ LN]  [ACOS]  [ 4 ]   [ 5 ]   [ 6 ]   [ * ]\n";
//        str1 = str1 + "[TAN]  [EXP]  [ATAN]  [ 1 ]   [ 2 ]   [ 3 ]   [ - ]\n";
//        str1 = str1 + "[10X]  [SQR]  [SQRT]  [ 0 ]   [ . ]   [ = ]   [ + ]\n";
//        System.out.println(str1);
//                return str1;
//    }


// CHECK if users want to do it again
    public void doAgain() {
        Scanner in2 = new Scanner(System.in);
        System.out.println("\n \n \n Key ac to start over (enter to quit)");
        boolean again = true;
        String checkAgain = in2.nextLine();
        if (checkAgain.equals("ac")) {
            scientificFunc();
        }
    }


// meme is memory variable
    public static double meme = 0;


// save memory
    public static void saveMeme(double valueToStore) {
        System.out.print("\n \n \n Key m to store your results (or enter to skip)");
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


// PRINT RESULT STRING
    public void resultPrint(String str11, double doub11) {
        str11 = str11.replaceAll("==", "=" + doub11);
        System.out.println(str11);
    }



//SCIENTIFIC CALCULATOR FUNCTION
    public void scientificFunc() {

            String str2 = mainApp.trungsCalculator();

            Scanner in1 = new Scanner(System.in);

            System.out.println("Please select normal (n), or scientific mode(sc):");
            String modeIn1 = in1.nextLine();
            if(modeIn1.equals("n")) {
                CoreApplications coreApps = new CoreApplications();
                coreApps.calculate();

            }else if(modeIn1.equals("sc")){

                System.out.println("Please select Radian or Degree Mode (Key in rad or deg)");
                String modeIn = in1.nextLine();

                System.out.println("Please key in Function name (in lowercase):");
                String funcIn = in1.nextLine();
                str2 = str2.replaceAll("0.0", funcIn + ".");
                System.out.println(str2);

                System.out.println("Please enter value to calculate, or mc to recall");
                String mm = in1.nextLine();
                //double douIn;
                if (mm.equals("mc")) {
                    douIn = callMeme();
                } else if(mm.equals("ac")){
                    doAgain();
                }
                else{
                    douIn = Double.parseDouble(mm);
                }
                str2 = str2.replaceAll(funcIn, funcIn + "(" + douIn + ")==");
                System.out.println(str2);

                if (modeIn.equals("deg")) {
                    douIn = douIn * Math.PI / 180;
                }

                switch (funcIn) {
                    case "sin":
                        System.out.println("Sine results of " + douIn + " is:" + Math.sin(douIn));
                        resultPrint(str2,Math.sin(douIn));
                        saveMeme(Math.sin(douIn));
                        doAgain();
                        break;

                    case "cos":
                        System.out.println("Cosine results of " + douIn + " is:" + Math.cos(douIn));
                        resultPrint(str2,Math.cos(douIn));
                        saveMeme(Math.cos(douIn));
                        doAgain();
                        break;

                    case "tan":
                        System.out.println("Tangent results of " + douIn + " is:" + Math.tan(douIn));
                        resultPrint(str2,Math.tan(douIn));
                        saveMeme(Math.tan(douIn));
                        doAgain();
                        break;

                    case "asin":
                        System.out.println("Inverse Sine results of " + douIn + " is:" + Math.asin(douIn));
                        resultPrint(str2,Math.asin(douIn));
                        saveMeme(Math.asin(douIn));
                        doAgain();
                        break;

                    case "acos":
                        System.out.println("Inverse Cosine results of " + douIn + " is:" + Math.acos(douIn));
                        resultPrint(str2,Math.acos(douIn));
                        saveMeme(Math.asin(douIn));
                        doAgain();
                    case "atan":
                        System.out.println("Inverse Tan results of " + douIn + " is:" + Math.atan(douIn));
                        resultPrint(str2,Math.atan(douIn));
                        saveMeme(Math.atan(douIn));
                        doAgain();
                        break;

                    case "log":
                        int y = getInInput();
                        System.out.println("Logarithm results of " + y + " is:" + Math.log10(y));
                        resultPrint(str2,Math.log10(y));
                        saveMeme(Math.log10(y));
                        doAgain();
                        break;

                    case "10x":
                        y = getInInput();
                        System.out.println("Inverse Log results of " + y + " is:" + Math.pow(10, y));
                        resultPrint(str2,Math.pow(10,y));
                        Math.pow(10, y);
                        doAgain();
                        break;

                    case "ln":
                        y = getInInput();
                        System.out.println("Natural Log results of " + y + " is:" + Math.log(y));
                        resultPrint(str2,Math.log(y));
                        saveMeme(Math.log(y));
                        doAgain();
                        break;

                    case "exp":
                        y = getInInput();
                        System.out.println("Inverse Natural Log results of " + y + " is:" + Math.exp(y));
                        resultPrint(str2,Math.exp(y));
                        saveMeme(Math.exp(y));
                        doAgain();
                        break;

                    case "x!":
                        y = getInInput();
                        FactorialFunction(y);
                        resultPrint(str2, FactorialFunction(y));
                        saveMeme(FactorialFunction(y));
                        doAgain();
                        break;

                    case "sqr":
                        System.out.println("Square results of " + douIn + " is:" + douIn * douIn);
                        resultPrint(str2,douIn * douIn);
                        saveMeme(douIn * douIn);
                        doAgain();
                        break;

                    case "sqrt":
                        System.out.println("Square Root  results of " + douIn + " is:" + Math.sqrt(douIn));
                        resultPrint(str2,Math.sqrt(douIn));
                        saveMeme(Math.sqrt(douIn));
                        doAgain();
                        break;
                }
            }else {
                System.out.println("Please select a correct mode");
                doAgain();
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


//// menu binary , octal, decimal, hexadecimal
//public static modeMenu() {
//
//        } //switch display mode
//
//    public class String switchDisplayMode() {}







} //Scientific Applications








