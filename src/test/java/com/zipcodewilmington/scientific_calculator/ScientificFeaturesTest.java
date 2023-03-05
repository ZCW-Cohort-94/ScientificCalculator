package com.zipcodewilmington.scientific_calculator;
import com.zipcodewilmington.scientificcalculator.ScientificFeatures;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
public class ScientificFeaturesTest {
    public ScientificFeatures scientificFeatures;
    @Before
    public void setup(){scientificFeatures = new ScientificFeatures();}
    @Test
    public void sinTest() {
        double expected = 0.77;
        double actual = scientificFeatures.getSin(70);
        Assert.assertEquals(expected, actual, 0.02);
        System.out.println(Math.sin(70));
    }

    @Test
    public void cosinTest() {
        double expected = 0.862;
        double actual = scientificFeatures.getCos(100);
        Assert.assertEquals(expected, actual, 0.02);
    }
    @Test
    public void tanTest() {
        double expected = 11.87;
        double actual = scientificFeatures.getTan(856);
        Assert.assertEquals(expected, actual, 0.02);
    }
    @Test
    public void invSinTest() {
        double expected = -0.53;
        double actual = scientificFeatures.getInvSin(34);
        Assert.assertEquals(expected, actual, 0.02);
    }

    @Test
    public void invCosinTest() {
        double expected = 0.633;
        double actual = scientificFeatures.getInvCos(100);
        Assert.assertEquals(expected, actual, 0.02);
    }

    @Test
    public void invTanTest() {
        double expected = 0.633;
        double actual = scientificFeatures.getInvTan(100);
        Assert.assertEquals(expected, actual, 0.02);
    }

}
