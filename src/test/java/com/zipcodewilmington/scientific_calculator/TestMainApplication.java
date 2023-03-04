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
}
