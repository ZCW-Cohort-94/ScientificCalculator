package com.zipcodewilmington.scientific_calculator;

import com.zipcodewilmington.scientificcalculator.Calculator;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by leon on 2/9/18.
 */

public class TestMainApplication {
    Calculator calculator = new Calculator();
    public TestMainApplication(){

    }
    @Before
    public void setUp()
    {
    }

    /**
     * Tears down the test fixture.
     *
     * Called after every test case method.
     */
    @After
    public void tearDown()
    {
    }

    @Test
    public void testAdd(){
        double expected  = 5.0;
        double actual  = calculator.add(2.0,3.0);
        assertEquals(expected, actual, 0.001);
    }

    @Test
    public void testSubtract(){
        double expected  = 10.0;
        double actual  = calculator.subtract(20.0,10.0);
        assertEquals(expected, actual, 0.001);
    }

    @Test
    public void testMultiply(){
        double expected  = 100.0;
        double actual  = calculator.multiply(10.0,10.0);
        assertEquals(expected, actual, 0.001);
    }

    @Test
    public void testDivide(){
        double expected  = 10.0;
        double actual  = calculator.divide(100.0,10.0);
        assertEquals(expected, actual, 0.001);
    }

    @Test
    public void testSqrt(){
        double expected  = 10.0;
        double actual  = calculator.sqrt(100.0);
        assertEquals(expected, actual, 0.001);
    }

    @Test
    public void testSquare(){
        double expected  = 100.0;
        double actual  = calculator.square(10.0);
        assertEquals(expected, actual, 0.001);
    }

    @Test
    public void testPower() {
        double expected = 100.0;
        double actual = calculator.power(10.0, 2.0);
        assertEquals(expected, actual, 0.001);
    }

    @Test
    public void testInverse(){
        double expected  = 0.1;
        double actual  = calculator.inverse(10.0);
        assertEquals(expected, actual, 0.001);
    }

    @Test
    public void inverseSign(){
        double expected  = -123;
        double actual  = calculator.inverseSign(123.0);
        assertEquals(expected, actual, 0.001);
    }


}
