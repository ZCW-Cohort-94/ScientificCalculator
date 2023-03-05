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
        Calculator calculator = new Calculator();
        double expected  = 5.0;
        double actual  = calculator.add(2.0,3.0);
        assertEquals(expected, actual, 0.001);
    }
}
