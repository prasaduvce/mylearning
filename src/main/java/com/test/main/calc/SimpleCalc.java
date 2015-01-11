package com.test.main.calc;


//TODO: To test this with Fitnesse.
public class SimpleCalc {
    private double first, second;

    public void setFirst(double first) {
        this.first = first;
    }

    public void setSecond(double second) {
        this.second = second;
    }

    public double sum() {
        return first+second;
    }

    public double diff() {
        return first-second;
    }

    public double prod() {
        return first*second;
    }

    public double quotient() {
        return first/second;
    }
}
