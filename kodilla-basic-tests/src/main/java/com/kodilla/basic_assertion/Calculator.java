package com.kodilla.basic_assertion;

public class Calculator {
    public int sum (int a, int b) {
        return a + b;
    }

    public int subtract(int a, int b){
        return a - b;
    }

    public int raiseToSquare(int a){
        return (int) Math.round(Math.pow(a,2));
    }
}
