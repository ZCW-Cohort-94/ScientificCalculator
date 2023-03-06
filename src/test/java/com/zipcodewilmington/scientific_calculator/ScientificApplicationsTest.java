package com.zipcodewilmington.scientific_calculator;

import com.zipcodewilmington.scientificcalculator.MainApplication;
import com.zipcodewilmington.scientificcalculator.ScientificApplications;
import junit.framework.TestCase;
import junit.framework.TestResult;
import org.junit.Assert;
import org.junit.Test;


public class ScientificApplicationsTest extends TestCase {

//    @Test
//    void checkDrawingCalculatorString(){
//        var string1 = new String();
//    }
//
//    @Test
//    public void doAgain() {
//
//    }
//
//    @Test
//    public void saveMeme() {
//    }
//
//    @Test
//    public void callMeme() {
//    }
//
////    @Test
////    public void scientificFunc() {
////    }
//
    @Test
    public void factorialFunction() {
        int actual = ScientificApplications.factorialFunction(3);
        Assert.assertEquals(6, actual);
    }
}