package com.junitlearning;

import org.junit.*;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThat;

public class CalculatorTest {

    private static Calculator calculator;

    @BeforeClass
    public static void init() {
        calculator = new Calculator(5);
    }

    @AfterClass
    public static void release() {
        calculator.clear();
    }

    @Before
    public void setUp() {
        calculator.add(1);
    }

    @After
    public void tearDown() {
        calculator.subtract(1);
    }

    @Test
    public void shouldReturn10WhenAdd4() throws Exception {
        double number = 4;
        calculator.add(number);
        assertEquals(10, calculator.getResult(), 0);
    }

    @Test
    public void shouldReturn2WhenSubtract4() throws Exception {
        double number = 4;
        calculator.subtract(number);
        Assert.assertEquals(2, calculator.getResult(), 0);
    }

    @Test
    public void shouldReturn12WhenMultiply2() throws Exception {
        double number = 2;
        calculator.multiply(number);
        Assert.assertEquals(12, calculator.getResult(), 0);
    }

    @Test
    public void shouldReturn3WhenDivide2() throws Exception {
        double number = 2;
        calculator.divide(number);
        Assert.assertEquals(3, calculator.getResult(), 0);
    }

    @Test(expected = Exception.class)
    public void shouldFailWhenDivide0() throws Exception {
        double number = 0;
        calculator.divide(number);
    }

    @Test
    public void shouldReturn6WhenGetDefaultResult() {
        double result = calculator.getResult();
        Assert.assertEquals(6, result, 0);
    }
}