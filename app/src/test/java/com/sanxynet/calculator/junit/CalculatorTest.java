package com.sanxynet.calculator.junit;

import com.sanxynet.calculator.unittesting.Calculator;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CalculatorTest {
    Calculator calculator;

    /* initialize once before any test is done */
    @BeforeClass
    public static void init(){
        System.out.println("@BeforeClass is called");
    }

    /* initialize before each test is done */
    @Before
    public void setup(){
        calculator = new Calculator();
        System.out.println("@Before is called");
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


    /* initialize after each test is done */
     @After
    public void tearDown(){
        calculator = null;
        System.out.println("@After is called");
    }

    /* initialize once at the end of all tests */
    @AfterClass
    public static void end(){
        System.out.println("@AfterClass is called");
    }
}
