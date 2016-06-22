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

    public void divide(double number) {
        result = result / number;
    }

    public double getResult() {
        return result;
    }
}
