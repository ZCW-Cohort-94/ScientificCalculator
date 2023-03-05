package com.zipcodewilmington.scientific_calculator;
import com.zipcodewilmington.scientificcalculator.CoreFeatures;
import com.zipcodewilmington.scientificcalculator.ScientificFeatures;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class CoreFeaturesTest {

    public CoreFeatures coreFeatures;

    @Before
    public void setup(){coreFeatures = new CoreFeatures();}

    @Test
    public void addTest() {
        double expected = 110.0;
        double actual = coreFeatures.add(70.0, 40.0);
        Assert.assertEquals(expected, actual, 0.02);
    }

    @Test
    public void subtractTest() {
        double expected = 50.0;
        double actual = coreFeatures.subtract(100.0, 50.0);
        Assert.assertEquals(expected, actual, 0.02);
    }
    @Test
    public void multiplyTest() {
        double expected = 24.0;
        double actual = coreFeatures.multiply(2.0, 12.0);
        Assert.assertEquals(expected, actual, 0.02);
    }
    @Test
    public void divideTest() {
        double expected = 7.0;
        double actual = coreFeatures.divide(56.0, 8.0);
        Assert.assertEquals(expected, actual, 0.02);
    }

    @Test
    public void squareTest() {
        double expected = 9.0;
        double actual = coreFeatures.square(3.0);
        Assert.assertEquals(expected, actual, 0.02);
    }

    @Test
    public void squareRootTest() {
        double expected = 8.0;
        double actual = coreFeatures.sqrt(64.0);
        Assert.assertEquals(expected, actual, 0.02);
    }

    @Test
    public void exponentTest() {
        double expected = 9.0;
        double actual = coreFeatures.exponent(3.0, 2.0);
        Assert.assertEquals(expected, actual, 0.02);
    }

    @Test
    public void inverseTest() {
        double expected = 0.5;
        double actual = coreFeatures.inverse(2.0);
        Assert.assertEquals(expected, actual, 0.02);
    }

    @Test
    public void invertTest() {
        double expected = -1.0;
        double actual = coreFeatures.invert(1);
        Assert.assertEquals(expected, actual, 0.02);
    }
    @Test
    public void getCurrentTest() {
        double expected = coreFeatures.getCurrent();
        double actual = coreFeatures.getCurrent();
        Assert.assertEquals(expected, actual, 0.02);
    }

    /*@Test
    public void clearCurrentTest() {
        double expected = 0;
        double actual = coreFeatures.getCurrent(coreFeatures.clearCurrent());
        Assert.assertEquals(expected, actual, 0.02);
    }*/

    @Test
    public void changeNumTest() {
        double expected = 0;
        double actual = coreFeatures.changeNumber(0);
        Assert.assertEquals(expected, actual, 0.02);
    }
}
