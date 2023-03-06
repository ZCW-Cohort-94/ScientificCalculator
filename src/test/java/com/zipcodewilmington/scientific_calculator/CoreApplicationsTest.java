package com.zipcodewilmington.scientific_calculator;
import com.zipcodewilmington.scientificcalculator.CoreApplications;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CoreApplicationsTest {

    private CoreApplications   coreApplications;
    @Before
    public void setup(){
        coreApplications = new CoreApplications();
        coreApplications.num1 = 20;
        coreApplications.num2 = 10;

    }

    @Test
    public void testAddition(){
        coreApplications.operator = '+';
        assertEquals(new Integer(30), coreApplications.calculate());
    }

    @Test
    public void testSubtraction(){
        coreApplications.operator = '-';
        assertEquals(new Integer(10), coreApplications.calculate());
    }

    @Test
    public void testMultiplication(){
        coreApplications.operator = '*';
        assertEquals(new Integer(200), coreApplications.calculate());
    }

    @Test
    public void testDivision(){
        coreApplications.operator = '/';
        assertEquals(new Integer(2), coreApplications.calculate());
    }
}
