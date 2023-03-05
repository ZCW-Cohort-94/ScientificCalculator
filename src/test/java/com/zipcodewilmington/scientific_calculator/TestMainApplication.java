package com.zipcodewilmington.scientific_calculator;

import com.zipcodewilmington.scientificcalculator.MainApplication;
import org.junit.Assert;
import org.junit.Test;
import org.sonatype.guice.bean.containers.Main;

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
//    @Test
//    public void testDivision(){
//        MainApplication test = new MainApplication();
//        Assert.assertEquals(2, test.division(6,3));
//    }
//    @Test
//    public void testSquare(){
//        MainApplication test = new MainApplication();
//        Assert.assertEquals(9, test.square(3));
//    }
//    @Test
//    public void testSqRt(){
//        MainApplication test = new MainApplication();
//        Assert.assertEquals(3.0, test.squareRoot(9.0), 0);
//        // delta: the maximum delta between expected and actual for which both numbers are still considered equal
//    }
//    @Test
//    public void testInverse(){
//        MainApplication test = new MainApplication();
//        Assert.assertEquals(0.2, test.inverse(5), 0);
//    }
//    @Test
//    public void testExponent(){
//        MainApplication test = new MainApplication();
//        Assert.assertEquals(81, test.exponent(3, 4), 0);
//    }
//    @Test
//    public void testSwitchSign(){
//        MainApplication test = new MainApplication();
//        Assert.assertEquals(5.5, test.switchSign(-5.5), 0);
//    }
//
//    @Test
//    public void testSin(){
//        MainApplication test = new MainApplication();
//        Assert.assertEquals(0.199, test.sine(0.2), 0.001);
//    }
//    @Test
//    public void testCos(){
//        MainApplication test = new MainApplication();
//        Assert.assertEquals(1, test.cosine(0), 0.001);
//    }
//    @Test
//    public void testTan(){
//        MainApplication test = new MainApplication();
//        Assert.assertEquals(0.309, test.tangent(0.3), 0.001);
//    }
//    @Test
//    public void testInverseSin(){
//        MainApplication test = new MainApplication();
//        Assert.assertEquals(1.571, test.inverseSine(1), 0.001);
//    }
//    @Test
//    public void testInverseCos(){
//        MainApplication test = new MainApplication();
//        Assert.assertEquals(1.266, test.inverseCosine(0.3), 0.001);
//    }
//    @Test
//    public void testInverseTan(){
//        MainApplication test = new MainApplication();
//        Assert.assertEquals(0.464, test.inverseTangent(0.5), 0.001);
//    }
//    @Test
//    public void testLog(){
//        MainApplication test = new MainApplication();
//        Assert.assertEquals(0.699, test.log(5), 0.001);
//    }
//    @Test
//    public void testInverseLog(){
//        MainApplication test = new MainApplication();
//        Assert.assertEquals(100, test.inverseLog(2), 0.001);
//    }
//    @Test
//    public void testNaturalLog(){
//        MainApplication test = new MainApplication();
//        Assert.assertEquals(1.609, test.naturalLog(5), 0.001);
//    }
//    @Test
//    public void testInverseNatLog(){
//        MainApplication test = new MainApplication();
//        Assert.assertEquals(403.4288, test.inverseNatLog(6), 0.001);
//    }
//
//    @Test
//    public void testFactorial(){
//        MainApplication test = new MainApplication();
//        Assert.assertEquals(120, test.factorial(5));
//    }
//
//    @Test
//    public void testCubedRt(){
//        MainApplication test = new MainApplication();
//        Assert.assertEquals(4, test.cubed(64), 0.001);
//    }
//    @Test
//    public void testHello(){
//        MainApplication test = new MainApplication();
//        Assert.assertEquals("01134", test.hello());
//    }
//

} // class
