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
    @Test
    public void testSquare(){
        MainApplication.Calculator testCalc = new MainApplication.Calculator();
        testCalc.square(); // Make sure works
        Assert.assertEquals(0, testCalc.memoryValue,0.0);
    }
    @Test
    public void testSqRt(){
        MainApplication.Calculator testCalc = new MainApplication.Calculator();
        testCalc.squareRoot(); // Make sure works
        Assert.assertEquals(0, testCalc.memoryValue, 0.0);
        // delta: the maximum delta between expected and actual for which both numbers are still considered equal
    }


    @Test
    public void testExponent(){
        MainApplication.Calculator testCalc = new MainApplication.Calculator();
        testCalc.exponent(2); //make sure Expected is 1 value || is it 2
        Assert.assertEquals(0, testCalc.memoryValue, 0);
    }
    @Test
    public void testSwitchSign(){
        MainApplication.Calculator testCalc = new MainApplication.Calculator();
        testCalc.switchSign();
        Assert.assertEquals(-0, testCalc.memoryValue, 0.0);
    }

    @Test
    public void testFactorial(){
        MainApplication.Calculator testCalc = new MainApplication.Calculator();
        testCalc.factorial();
        Assert.assertEquals(1, testCalc.memoryValue,0.0);
    }

    // SCI CALC SCI START
    // Delta out 4 decimals 0.0001

    @Test
    public void testInverse() {
        MainApplication.SciCalcSci testCalc = new MainApplication.SciCalcSci();
        testCalc.inverse(1); //make sure works
        Assert.assertEquals(1.0204, testCalc.testValue, 0.0001);
    }
    @Test
    public void testSin(){
        MainApplication.SciCalcSci testCalc = new MainApplication.SciCalcSci();
        testCalc.sine(); //make sure works
        Assert.assertEquals(0.8304, testCalc.testValue, 0.0001);
    }
    @Test
    public void testCos(){
        MainApplication.SciCalcSci testCalc = new MainApplication.SciCalcSci();
        testCalc.cosine();
        Assert.assertEquals(0.5570, testCalc.testValue, 0.0001);
    }
    @Test
    public void testTan(){
        MainApplication.SciCalcSci testCalc = new MainApplication.SciCalcSci();
        testCalc.tangent();
        Assert.assertEquals(1.4909, testCalc.testValue, 0.0001);
    }
    @Test
    public void testInverseSin(){
        MainApplication.SciCalcSci testCalc = new MainApplication.SciCalcSci();
        testCalc.inverseSine();
        Assert.assertEquals(1.3704, testCalc.testValue, 0.0001);
    }
    @Test
    public void testInverseCos(){
        MainApplication.SciCalcSci testCalc = new MainApplication.SciCalcSci();
        testCalc.inverseCosine();
        Assert.assertEquals(0.2003, testCalc.testValue, 0.0001);
    }
    @Test
    public void testInverseTan(){
        MainApplication.SciCalcSci testCalc = new MainApplication.SciCalcSci();
        testCalc.inverseTangent();
        Assert.assertEquals(0.7752, testCalc.testValue, 0.0001);
    }
    @Test
    public void testLog(){
        MainApplication.SciCalcSci testCalc = new MainApplication.SciCalcSci();
        testCalc.log();
        Assert.assertEquals(-0.0087, testCalc.testValue, 0.0001);
    }
    @Test
    public void testInverseLog(){
        MainApplication.SciCalcSci testCalc = new MainApplication.SciCalcSci();
        testCalc.inverseLog();
        Assert.assertEquals(9.5499, testCalc.testValue, 0.0001);
    }
    @Test
    public void testNaturalLog(){
        MainApplication.SciCalcSci testCalc= new MainApplication.SciCalcSci();
        testCalc.naturalLog();
        Assert.assertEquals(-0.0202, testCalc.testValue, 0.0001);
    }
    @Test
    public void testInverseNatLog(){
        MainApplication.SciCalcSci testCalc = new MainApplication.SciCalcSci();
        testCalc.inverseNatLog();
        Assert.assertEquals(2.6644, testCalc.testValue, 0.0001);
    }

    @Test
    public void testCubedRt(){
        MainApplication.SciCalcSci testCalc = new MainApplication.SciCalcSci();
        testCalc.cubed();
        Assert.assertEquals(0.9932, testCalc.testValue, 0.0001);
    }
//    @Test
//    public void testSecret(){
//        MainApplication.Calculator testCalc = new MainApplication.Calculator();
//        testCalc.hello("01134");
//        Assert.assertEquals("Hello! 🙋‍♀️", "Hello! 🙋‍♀️", 0.00);
//    }


} // class

