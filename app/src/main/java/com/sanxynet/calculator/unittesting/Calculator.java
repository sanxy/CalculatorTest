package com.sanxynet.calculator.unittesting;

public class Calculator {

    public int add(int a, int b) {
        return a+b;
    }

    public int subtract(int a, int b) {
        return a-b;
    }

    public int multiply(int a, int b) {
        return a*b;
    }

    public int divide(int a, int b) {
        if (b==0) throw new IllegalArgumentException("This can not be divide by Zero number");
        return a/b;
    }
}
