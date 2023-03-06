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
        double expected = 0.773;
        double actual = scientificFeatures.getSin(70.0);
        Assert.assertEquals(expected, actual, 0.02);
    }

    @Test
    public void addMemoryTest() {
        double expected = 1;
        scientificFeatures.addToMemory(1);
        double actual = scientificFeatures.getMemory();
        Assert.assertEquals(expected, actual, 0.02);
    }

    /*@Test
    public void getMemoryTest() {
        double expected = 1.0;
        double actual = ScientificFeatures.getMemory();
        Assert.assertEquals(expected, actual, 0.0);
    }*/

    @Test
    public void clearMemoryTest() {
        double expected = 0;
        scientificFeatures.addToMemory(38.0);
        scientificFeatures.clearMemory();
        double actual = scientificFeatures.getMemory();
        Assert.assertEquals(expected, actual, 0.02);
    }

    @Test
    public void switchDisplayTest1() {
        ScientificFeatures.Display_Mode expected = ScientificFeatures.Display_Mode.BINARY;
        scientificFeatures.switchDisplayMode();
        ScientificFeatures.Display_Mode actual = scientificFeatures.switchDisplayMode();
        scientificFeatures.switchDisplayMode();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void switchDisplayTest2() {
        ScientificFeatures.Display_Mode expected = ScientificFeatures.Display_Mode.OCTAL;
        scientificFeatures.switchDisplayModeText("Octal");
        ScientificFeatures.Display_Mode actual = scientificFeatures.current_Mode;
        Assert.assertEquals(expected, actual);
    }
    @Test
    public void displayModeTest() {
        String expected = "1234";
        scientificFeatures.switchDisplayModeText("Octal");
        String actual = scientificFeatures.convert(4324);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void cosinTest() {
        double expected = 0.86;
        double actual = scientificFeatures.getCos(100.0);
        Assert.assertEquals(expected, actual, 0.02);
    }
    @Test
    public void tanTest() {
        double expected = 11.87;
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

    @Test
    public void switchUnitTest1() {
        ScientificFeatures.TUnit expected = ScientificFeatures.TUnit.RADIANS;
        scientificFeatures.switchUnitsMode();
        ScientificFeatures.TUnit actual = scientificFeatures.current_Unit;
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void switchUnitTest2() {
        ScientificFeatures.TUnit expected = ScientificFeatures.TUnit.RADIANS;
        scientificFeatures.switchUnitsModeText("Radians");
        ScientificFeatures.TUnit actual = scientificFeatures.current_Unit;
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void formatUnitsTest1() {
        double expected = 28.64;
        scientificFeatures.switchUnitsModeText("Degrees");
        double actual = scientificFeatures.formatUnitAnswer(.5);
        Assert.assertEquals(expected, actual, 0.02);
    }

    @Test
    public void formatUnitsTest2() {
        double expected = 0.78;
        scientificFeatures.switchUnitsModeText("Radians");
        double actual = scientificFeatures.formatUnitAnswer(45);
        Assert.assertEquals(expected, actual, 0.02);
    }

    @Test
    public void convertTestBinary() {
        String expected = "11000";
        scientificFeatures.switchDisplayModeText("Binary");
        String actual = scientificFeatures.convert(24);
        Assert.assertEquals(expected, actual);
    }
    @Test
    public void convertTestHex() {
        String expected = "18";
        scientificFeatures.switchDisplayModeText("Hex");
        String actual = scientificFeatures.convert(24);
        Assert.assertEquals(expected, actual);
    }
    @Test
    public void convertTestOctal2() {
        String expected = "9e6";
        scientificFeatures.switchDisplayModeText("Hex");
        String actual = scientificFeatures.convert(2534);
        Assert.assertEquals(expected, actual);
    }
    @Test
    public void convertTestOctal() {
        String expected = "4746";
        scientificFeatures.switchDisplayModeText("Octal");
        String actual = scientificFeatures.convert(2534);
        Assert.assertEquals(expected, actual);
    }
    @Test
    public void convertTest() {
        String expected = "24";
        scientificFeatures.switchDisplayModeText("Decimal");
        String actual = scientificFeatures.convert(24);
        Assert.assertEquals(expected, actual);
    }

    /*@Test
    public void getUnitModeTest() {
        double expected = 24.0;
        String actual = scientificFeatures.getUnitMode();
        Assert.assertEquals(expected, actual);
    }*/
}

