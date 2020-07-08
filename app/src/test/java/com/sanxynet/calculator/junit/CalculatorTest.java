package com.sanxynet.calculator.junit;

import com.sanxynet.calculator.unittesting.Calculator;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CalculatorTest {


    @Test
    public void testAddingTwoPositiveNumbers(){
        Calculator calculator = new Calculator();
        int result = calculator.add(20, 30);
        assertEquals(50, result);
    }

}
