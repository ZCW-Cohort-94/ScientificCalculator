package com.zipcodewilmington.scientificcalculator;

public class ScientificCalculator {
    public static double sin(double num){
        return Math.sin(num);

    };

    public static double cosine(double num) {
        return Math.cos(num);
    }

    public static double tan(double angle){
        return  Math.tan(angle);
    }

    public static double asin(double angle){
        return Math.asin(angle);
    }

    public static double acos(double a) {
        return Math.acos(a);

    }

    public static double atan(double a) {
        return Math.atan(a);
    }

    public double log(double a){
        return Math.log(a);

    }
    public static double inverseLog(double a) {
        return Math.pow(10, a);
    }

    public static double naturalLog(double a) {
        return Math.log(a);

    }

    public static double  inverseNatLog(double a){
        return Math.exp(a);
    }
}



