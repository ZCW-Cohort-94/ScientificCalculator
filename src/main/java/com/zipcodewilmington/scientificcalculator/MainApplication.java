package com.zipcodewilmington.scientificcalculator;

/**
 * Created by leon on 2/9/18.
 */
import org.codehaus.plexus.util.StringUtils;

import java.util.Scanner;
//Adam
public class MainApplication {


    public static void main(String[] args) {
//        Console.println("Welcome to my calculator!");
//        String s = Console.getStringInput("Enter a string");
//        Integer i = Console.getIntegerInput("Enter an integer");
//        Double d = Console.getDoubleInput("Enter a double.");
//
//        Console.println("The user input %s as a string", s);
//        Console.println("The user input %s as a integer", i);
//        Console.println("The user input %s as a d", d);
        trungsCalculator();
        ScientificApplications scientificApplications = new ScientificApplications();
        scientificApplications.scientificFunc();

        //don't need any of the below
        //CoreApplications coreApplications = new CoreApplications();
        //System.out.println(coreApplications.defaultState());
        //coreApplications.getNumbers();
        //System.out.println(coreApplications.calculate());

    }
    public static String trungsCalculator() {
        String str1 = "";
        str1 = str1 + " \n \n SCIENTIFIC CALCULATOR - DELTA GROUP \n";
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
//    public static void saveMeme(double valueToStore) {
//        System.out.print("\n \n \n Key m to store your results (or enter to skip)");
//        Scanner store = new Scanner(System.in);
//        String memo = store.nextLine();
//        if (memo.equals("m")) {
//            ScientificApplications.meme = valueToStore;
//        }
//    }
//
//    //call memory
//    public static double callMeme() {
//        System.out.println("Memory value is:"+ ScientificApplications.meme);
//        return ScientificApplications.meme;
//    }
}
