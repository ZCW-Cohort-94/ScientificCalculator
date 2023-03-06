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
        coreApplications.num1 = 8;
        coreApplications.num2 = 7;

    }

    @Test
    public void testAddition(){
        coreApplications.operator = '+';
        assertEquals(new Integer(15), coreApplications.calculate());
    }
}
