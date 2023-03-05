package com.zipcodewilmington.scientific_calculator;

import com.zipcodewilmington.scientificcalculator.MainApplication;
import org.junit.Assert;
import org.junit.Test;

/**
 * Created by leon on 2/9/18.
 */
public class TestMainApplication {

    @Test
    public void testAdd(){
        MainApplication.Calculator testCalc = new MainApplication.Calculator();
        testCalc.addition(3.0);
        Assert.assertEquals(3.0,testCalc.memoryValue, 0.0);
    }

    @Test
    public void testSubtract(){
        MainApplication.Calculator testCalc = new MainApplication.Calculator();
        testCalc.subtraction(3.0);
        Assert.assertEquals(-3.0, testCalc.memoryValue, 0.0);
    }

    @Test
    public void testMultiplication(){
        MainApplication.Calculator testCalc = new MainApplication.Calculator();
        testCalc.multiplication(3.0);
        Assert.assertEquals(0, testCalc.memoryValue, 0.0);
    }
    @Test
    public void testDivision(){
        MainApplication.Calculator testCalc = new MainApplication.Calculator();
        testCalc.division(2);
        Assert.assertEquals(0, testCalc.memoryValue, 0.0);
    }
//    @Test
//    public void testSquare(){
//        MainApplication.Calculator testCalc = new MainApplication.Calculator();
//        testCalc.square(2); // Make sure works
//        Assert.assertEquals(0, testCalc.memoryValue,0.0);
//    }
//    @Test
//    public void testSqRt(){
//        MainApplication.Calculator testCalc = new MainApplication.Calculator();
//        testCalc.squareRoot(2); // Make sure works
//        Assert.assertEquals(0, testCalc.memoryValue, 0.0);
//        // delta: the maximum delta between expected and actual for which both numbers are still considered equal
//    }
//    @Test
//    public void testInverse(){
//        MainApplication.Calculator testCalc = new MainApplication.Calculator();
//        testCalc.inverse(0); //make sure works
//        Assert.assertEquals(0, testCalc.memoryValue,0.0);
//    }
//    @Test
//    public void testExponent(){
//        MainApplication.Calculator testCalc = new MainApplication.Calculator();
//        testCalc.exponent(2); //make sure Expected is 1 value || is it 2
//        Assert.assertEquals(0, testCalc.memoryValue, 0);
//    }
//    @Test
//    public void testSwitchSign(){
//        MainApplication.Calculator testCalc = new MainApplication.Calculator();
//        testCalc.switchSign(2);
//        Assert.assertEquals(-0, testCalc.memoryValue, 0.0);
//    }
//
//    @Test
//    public void testSin(){
//        MainApplication.SciCalc testCalc = new MainApplication.SciCalc();
//        testCalc.sine(0); //make sure works
//        Assert.assertEquals(0, testCalc.memoryValue, 0);
//    }
//    @Test
//    public void testCos(){
//        MainApplication.SciCalc testCalc = new MainApplication.SciCalc();
//        testCalc.cosine(0);
//        Assert.assertEquals(0, testCalc.memoryValue, 0.000);
//    }
//    @Test
//    public void testTan(){
//        MainApplication.SciCalc testCalc = new MainApplication.SciCalc();
//        testCalc.tangent(0);
//        Assert.assertEquals(0, testCalc.memoryValue, 0.000);
//    }
//    @Test
//    public void testInverseSin(){
//        MainApplication.SciCalc testCalc = new MainApplication.SciCalc();
//        testCalc.inverseSine(0);
//        Assert.assertEquals(0, testCalc.memoryValue, 0.000);
//    }
//    @Test
//    public void testInverseCos(){
//        MainApplication.SciCalc testCalc = new MainApplication.SciCalc();
//        testCalc.inverseCosine(0);
//        Assert.assertEquals(0, testCalc.memoryValue, 0.001);
//    }
    @Test
    public void testInverseTan(){
        MainApplication.SciCalc testCalc = new MainApplication.SciCalc();
        testCalc.inverseTangent(0);
        Assert.assertEquals(0, testCalc.memoryValue, 0.001);
    }
    @Test
    public void testLog(){
        MainApplication.SciCalc testCalc = new MainApplication.SciCalc();
        testCalc.log(0);
        Assert.assertEquals(0, testCalc.memoryValue, 0.001);
    }
    @Test
    public void testInverseLog(){
        MainApplication.SciCalc testCalc = new MainApplication.SciCalc();
        testCalc.inverseLog(0);
        Assert.assertEquals(0, testCalc.memoryValue, 0.000);
    }
    @Test
    public void testNaturalLog(){
        MainApplication.SciCalc testCalc= new MainApplication.SciCalc();
        testCalc.naturalLog(0);
        Assert.assertEquals(0, testCalc.memoryValue, 0.001);
    }
    @Test
    public void testInverseNatLog(){
        MainApplication.SciCalc testCalc = new MainApplication.SciCalc();
        testCalc.inverseNatLog(0);
        Assert.assertEquals(0, testCalc.memoryValue, 0.000);
    }

    @Test
    public void testFactorial(){
        MainApplication.SciCalc testCalc = new MainApplication.SciCalc();
        testCalc.factorial(0);
        Assert.assertEquals(0, testCalc.memoryValue,0);
    }

    @Test
    public void testCubedRt(){
        MainApplication.SciCalc testCalc = new MainApplication.SciCalc();
        testCalc.cubed(0);
        Assert.assertEquals(0, testCalc.memoryValue, 0.000);
    }
//    @Test
//    public void testHello(){
//        MainApplication.Calculator testCalc = new MainApplication.Calculator();
//        testCalc.hello(01134);
//        Assert.assertEquals("Hello", testCalc.memoryValue, 0.00);
//    }


} // class

