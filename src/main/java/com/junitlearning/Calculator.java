package com.junitlearning;

public class Calculator {

    private double result;

    public Calculator() {
        result = 0;
    }

    public Calculator(double number) {
        result = number;
    }

    public void add(double number) {
        result = result + number;
    }

    public void subtract(double number) {
        result = result - number;
    }

    public void multiply(double number) {
        result = result * number;
    }

    public void divide(double number) throws Exception {
        if (number == 0) {
            throw new Exception("number cannot be 0");
        }
        result = result / number;
    }

    public void clear() {
        result = 0;
    }

    public double getResult() {
        return result;
    }
}
