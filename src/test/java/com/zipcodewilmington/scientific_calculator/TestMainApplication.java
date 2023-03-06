package com.zipcodewilmington.scientific_calculator;

import com.zipcodewilmington.scientificcalculator.Calculator;
import com.zipcodewilmington.scientificcalculator.ScientificApplication;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by leon on 2/9/18.
 */

public class TestMainApplication {
    Calculator calculator = new Calculator();
    ScientificApplication sa = new ScientificApplication();
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
    public void testInverseSign(){
        double expected  = -123;
        double actual  = calculator.inverseSign(123.0);
        assertEquals(expected, actual, 0.001);
    }


    //tests for scientific application

    @Test
    public void testConvertToDisplayMode1(){
        sa.setCurrentMode(0);
        int expected  = 100;
        int actual  = Integer.parseInt(sa.convertToDisplayMode(100));
        assertEquals(expected, actual, 0.001);
    }

    @Test
    public void testConvertToDisplayMode2(){
        sa.setCurrentMode(1);
        double expected  = 1100100;
        int actual  = Integer.parseInt(sa.convertToDisplayMode(100));
        assertEquals(expected, actual, 0.001);
    }

    @Test
    public void testConvertToDisplayMode3(){
        sa.setCurrentMode(2);
        double expected  = 144;
        int actual  = Integer.parseInt(sa.convertToDisplayMode(100));
        assertEquals(expected, actual, 0.001);
    }
    @Test
    public void testConvertToDisplayMode4(){
        sa.setCurrentMode(3);
        double expected  = 64;
        int actual  = Integer.parseInt(sa.convertToDisplayMode(100));
        assertEquals(expected, actual, 0.001);
    }

    @Test
    public void testSine(){
        double expected  = -0.50636;
        double actual  = ScientificApplication.sine(100);
        assertEquals(expected, actual, 0.001);
    }

    @Test
    public void testCosine(){
        double expected  = 0.86231;
        double actual  = ScientificApplication.cosine(100);
        assertEquals(expected, actual, 0.001);
    }

    @Test
    public void testTangent(){
        double expected  = -0.58721;
        double actual  = ScientificApplication.tangent(100);
        assertEquals(expected, actual, 0.001);
    }

    @Test
    public void testInverseSine(){
        double expected  = 0.8947;
        double actual  = ScientificApplication.inverseSine(0.78);
        assertEquals(expected, actual, 0.001);
    }

    @Test
    public void testInverseCosine(){
        double expected  = 0.9764;
        double actual  = ScientificApplication.inverseCosine(0.56);
        assertEquals(expected, actual, 0.001);
    }

    @Test
    public void testInverseTangent(){
        double expected  = 0.9828;
        double actual  = ScientificApplication.inverseTangent(1.5);
        assertEquals(expected, actual, 0.001);
    }

    @Test
    public void testRadiansToDegrees(){
        double expected  = 143.239;
        double actual  = ScientificApplication.radiansToDegrees(2.5);
        assertEquals(expected, actual, 0.001);
    }

    @Test
    public void testDegreesToRadians(){
        double expected  = 1.74533;
        double actual  = ScientificApplication.degreesToRadians(100);
        assertEquals(expected, actual, 0.001);
    }

    @Test
    public void testLog(){
        double expected  = 2.0;
        double actual  = ScientificApplication.log(100);
        assertEquals(expected, actual, 0.001);
    }

    @Test
    public void testInverseLog(){
        double expected  = 7.38905;
        double actual  = ScientificApplication.inverseLog(2.0);
        assertEquals(expected, actual, 0.001);
    }

    @Test
    public void testLN(){
        double expected  = 2.3025;
        double actual  = ScientificApplication.ln(10);
        assertEquals(expected, actual, 0.001);
    }

    @Test
    public void testInverseNaturalLog(){
        double expected  = 1.001;
        double actual  = ScientificApplication.inverseNaturalLog(0.001);
        assertEquals(expected, actual, 0.001);
    }

    @Test
    public void testFactorial(){
        double expected  = 120.0;
        double actual  = ScientificApplication.factorial(5);
        assertEquals(expected, actual, 0.001);
    }

    @Test
    public void testGetPI(){
        double expected  = 3.1415;
        double actual  = ScientificApplication.getPi();
        assertEquals(expected, actual, 0.001);
    }

    @Test
    public void testGetE(){
        double expected  = 2.71828;
        double actual  = ScientificApplication.getE();
        assertEquals(expected, actual, 0.001);
    }
}
