package com.sanxynet.calculator.junit;

import com.sanxynet.calculator.unittesting.Calculator;

import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CalculatorTest {
    Calculator calculator;

    /* initialize before each test is done */
    @Before
    public void setup(){
        calculator = new Calculator();
    }

    @Test
    public void testAddingTwoPositiveNumbers(){
        assertEquals(50, calculator.add(20, 30));
    }

    @Test
    public void testSubtractionForTwoPositiveNumbers(){
        assertEquals(20, calculator.subtract(30, 10));
    }

    @Test
    public void testMultiplicationForTwoPositiveNumbers(){
        assertEquals(300, calculator.multiply(30, 10));
    }

    @Test
    public void testDivisionByNonZeroNumber(){
        assertEquals(3, calculator.divide(30, 10));
    }

    @Ignore
    @Test(expected = IllegalArgumentException.class)
    public void testDivisionByZeroNumber(){
        assertEquals(3, calculator.divide(30, 0));
    }

}
