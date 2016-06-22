package com.junitlearning;

import org.junit.*;

import static org.junit.Assert.*;

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
    public void add() throws Exception {
        calculator.add(4);
        Assert.assertEquals(10, calculator.getResult(), 0);
    }

    @Test
    public void subtract() throws Exception {
        calculator.subtract(4);
        Assert.assertEquals(2, calculator.getResult(), 0);
    }

    @Test
    public void multiply() throws Exception {

    }

    @Test
    public void divide() throws Exception {

    }

    @Test
    public void getResult() throws Exception {

    }
}