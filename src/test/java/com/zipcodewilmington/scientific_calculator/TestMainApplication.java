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


}
