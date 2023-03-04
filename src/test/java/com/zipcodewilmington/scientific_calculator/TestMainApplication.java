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
        MainApplication test = new MainApplication();
        Assert.assertEquals(4, test.addition(1,3));
    }

    @Test
    public void testSubtract(){
        MainApplication test = new MainApplication();
        Assert.assertEquals(2, test.subtraction(3,1));
    }

    @Test
    public void testMultiplication(){
        MainApplication test = new MainApplication();
        Assert.assertEquals(15, test.multiplication(3,5));
    }
    @Test
    public void testDivision(){
        MainApplication test = new MainApplication();
        Assert.assertEquals(2, test.divide(6,3));
    }
    @Test
    public void testSquare(){
        MainApplication test = new MainApplication();
        Assert.assertEquals(9, test.square(3));
    }
    @Test
    public void testSqRt(){
        MainApplication test = new MainApplication();
        Assert.assertEquals(3.0, test.squareRoot(9.0), 0);
        // delta: the maximum delta between expected and actual for which both numbers are still considered equal
    }
    @Test
    public void testInverse(){
        MainApplication test = new MainApplication();
        Assert.assertEquals(0.2, test.inverse(5), 0);
    }
    @Test
    public void testExponent(){
        MainApplication test = new MainApplication();
        Assert.assertEquals(81, test.exponent(3, 4), 0);
    }
    @Test
    public void testSwitchSign(){
        MainApplication test = new MainApplication();
        Assert.assertEquals(5.5, test.switchSign(-5.5), 0);
    }
    @Test
    public void testInverseNatLog(){
        MainApplication test = new MainApplication();
        Assert.assertEquals(403.4288, test.inverseNatLog(6), 0.001);
    }
    @Test
    public void testFactorial(){
        MainApplication test = new MainApplication();
        Assert.assertEquals(120, test.factorial(5));
    }


} // class
