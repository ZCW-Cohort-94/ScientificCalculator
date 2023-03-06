package com.zipcodewilmington.scientificcalculator;

/**
 * Created by leon on 2/9/18.
 */
import org.codehaus.plexus.util.StringUtils;

import java.util.Scanner;
//Adam
public class MainApplication {


    public static void main(String[] args) {
        trungsCalculator();
        ScientificApplications scientificApplications = new ScientificApplications();
        scientificApplications.scientificFunc();

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
}
