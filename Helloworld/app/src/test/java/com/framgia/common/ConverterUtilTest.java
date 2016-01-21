package com.framgia.common;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by FRAMGIA\pham.van.khac on 22/01/2016.
 */
public class ConverterUtilTest {

    @Test
    public void testConvertFahrenheitToCelsius() throws Exception {
        float actual = ConverterUtil.convertCelsiusToFahrenheit(100);
        // expected value is 212
        float expected = 212;
        // use this method because float is not precise
        assertEquals("Conversion from celsius to fahrenheit failed", expected, actual, 0.001);
    }

    @Test
    public void testConvertCelsiusToFahrenheit() throws Exception{
        float actual = ConverterUtil.convertFahrenheitToCelsius(212);
        // expected value is 100
        float expected = 100;
        // use this method because float is not precise
        assertEquals("Conversion from celsius to fahrenheit failed", expected, actual, 0.001);
    }
}
