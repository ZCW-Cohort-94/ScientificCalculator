package com.zipcodewilmington.scientific_calculator;

import com.zipcodewilmington.scientificcalculator.BasicCalculator;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by leon on 2/9/18.
 */
public class TestMainApplication {




  /* public void additionTest(){
        Int input = (x, y);
        Integer expected = 2;
        Integer actual = stringsAndThings.countYZ(input);
        Assert.assertEquals(expected, actual);
*/

    // sum method
    // public int add (int x, int y) {
    //return x + y;
    // public int subtract (int x, int y) {
    //   return x - y;


    // instead of using class name for local
    // variable we can just say "Var"
    // (TestMainApplication ) - class name
    // TestMainApplication is an object
    // void is a return type
    // assertEquals( 4, calculator ("add" 2, 2)); // calling add method, testing 2+2
    // we need to verify that it's = 4
    // for verification 'assert statement'
    // two parameters in it
    // first we expect it's = 4, second is result
    // assertNull/true/noEqual/notNull
    @Test
    public void testSum() {
        BasicCalculator calculator = new BasicCalculator();
        int result = BasicCalculator.addition(2, 2);
        int expectedResult = 4;
        Assert.assertEquals(expectedResult, result);
    }
    @Test
    public void testMultiply() {
        int result = BasicCalculator.multiplication(2, 2);
        int expectedResult = 4;
        Assert.assertEquals(expectedResult, result);
    }

    @Test
    public void testDivide() {
        int result = BasicCalculator.division(2, 2);
        int expectedResult = 1;
        Assert.assertEquals(expectedResult, result);

    }

    @Test
    public void testSubtract() {
        int result = BasicCalculator.subtraction(2, 2);
        int expectedResult = 0;
        Assert.assertEquals(expectedResult, result);
    }
    @Test
    public void testSquare() {
        int result = BasicCalculator.square(2);
        int expectedResult = 4;
        Assert.assertEquals(expectedResult, result);
    }

    @Test
    public void testSquareRoot() {
        int result = BasicCalculator.squareRoot(81);
        int expectedResult = 9;
        Assert.assertEquals(expectedResult, result);
    }

    @Test
    public void testExponentiation() {
        int result = BasicCalculator.exponentiation(2, 2);
        int expectedResult = 4;

        Assert.assertEquals(expectedResult, result);
    }
}







