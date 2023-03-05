package com.zipcodewilmington.scientific_calculator;
import com.zipcodewilmington.scientificcalculator.ScientificFeatures;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
public class ScientificFeaturesTest {
    enum TUnit {DEGREES, RADIANS}
    enum Display_Mode {BINARY , OCTAL, DECIMAL, HEX}
    static TUnit current_Unit = TUnit.DEGREES;
    static Display_Mode current_Mode = Display_Mode.DECIMAL;
    public ScientificFeatures scientificFeatures;
    @Before
    public void setup(){scientificFeatures = new ScientificFeatures();}
    @Test
    public void sinTest() {
        double expected = 0.773;
        double actual = scientificFeatures.getSin(70.0);
        Assert.assertEquals(expected, actual, 0.02);
    }

    @Test
    public void memoryTest() {
        double expected = 1;
        scientificFeatures.addToMemory(1);
        double actual = scientificFeatures.getMemory();
        Assert.assertEquals(expected, actual, 0.02);
    }

    /*@Test
    public void getMemoryTest() {
        double expected = ;
        String actual = scientificFeatures;
        Assert.assertEquals(expected, actual, 0.02);
    }*/

    /*@Test
    public void clearMemoryTest() {
        double expected = 0;
        double actual = scientificFeatures.clearMemory();
        Assert.assertEquals(expected, actual, 0.02);
    }*/

    /*@Test
    public void switchDisplayTest() {
        double expected = ;
        String actual = scientificFeatures;
        Assert.assertEquals(expected, actual, 0.02);
    }*/

    @Test
    public void cosinTest() {
        double expected = 0.862;
        double actual = scientificFeatures.getCos(100.0);
        Assert.assertEquals(expected, actual, 0.02);
    }
    @Test
    public void tanTest() {
        double expected = 11.877;
        double actual = scientificFeatures.getTan(856.0);
        Assert.assertEquals(expected, actual, 0.02);
    }
    @Test
    public void invSinTest() {
        double expected = 1.57;
        double actual = scientificFeatures.getInvSin(1.0);
        Assert.assertEquals(expected, actual, 0.02);
    }

    @Test
    public void invCosinTest() {
        double expected = 0.283;
        double actual = scientificFeatures.getInvCos(0.96);
        Assert.assertEquals(expected, actual, 0.02);
    }

    @Test
    public void invTanTest() {
        double expected = 0.785;
        double actual = scientificFeatures.getInvTan(1);
        Assert.assertEquals(expected, actual, 0.02);
    }

    @Test
    public void logTest() {
        double expected = 0.903;
        double actual = scientificFeatures.getLog(8.0);
        Assert.assertEquals(expected, actual, 0.02);
    }

    @Test
    public void invLogTest() {
        double expected = 100.0;
        double actual = scientificFeatures.invLog(2.0);
        Assert.assertEquals(expected, actual, 0.02);
    }

    @Test
    public void natLogTest() {
        double expected = 3.784;
        double actual = scientificFeatures.getNatLog(44.0);
        Assert.assertEquals(expected, actual, 0.02);
    }

    @Test
    public void invNatLogTest() {
        double expected = 4.0;
        double actual = scientificFeatures.getInvNatLog(2.0);
        Assert.assertEquals(expected, actual, 0.02);
    }

    @Test
    public void pythagTest() {
        double expected = 2.83;
        double actual = scientificFeatures.getPythagoreanTheorem(2.0, 2.0);
        Assert.assertEquals(expected, actual, 0.02);
    }

    @Test
    public void circleRadTest() {
        double expected = 50.265;
        double actual = scientificFeatures.getCircleFromRadius(4.0);
        Assert.assertEquals(expected, actual, 0.02);
    }
    @Test
    public void factorialTest() {
        double expected = 24.0;
        double actual = scientificFeatures.getFactorial(4.0);
        Assert.assertEquals(expected, actual, 0.02);
    }
}
