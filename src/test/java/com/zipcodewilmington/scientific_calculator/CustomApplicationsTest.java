package com.zipcodewilmington.scientific_calculator;

import com.zipcodewilmington.scientificcalculator.CustomApplications;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CustomApplicationsTest{

    private CustomApplications customApplications;
    @Before
    public void setup() {
        customApplications = new CustomApplications();
    }

    @Test
    public void testLcm() {
        customApplications.operation = "lcm";
        customApplications.inputNumber1 = 6;
        customApplications.inputNumber2 = 9;
        assertEquals(18, customApplications.calculate());
    }

    @Test
    public void testGcd() {
        customApplications.operation = "gcd";
        customApplications.inputNumber1 = 3;
        customApplications.inputNumber2 = 9;
        assertEquals(3, customApplications.calculate());
    }
}
