package com.kodilla.basic_assertion;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class CalculatorTestSuite {

    @Test
    public void testSum() {
        Calculator calculator = new Calculator();
        int a = 5;
        int b = 8;
        int sumResult = calculator.sum(a, b);
        assertEquals(13, sumResult);
    }
    @Test
    public void testSubtraction() {
        Calculator calculator = new Calculator();
        int a = 5;
        int b = 8;
        int subtractResult = calculator.subtract(a,b);
        assertEquals(-3, subtractResult);
    }
    @Test
    public void testExponentiation() {
        Calculator calculator = new Calculator();
        int a = -2;
        int b = 0;
        int c = 4;
        assertEquals(4, calculator.raiseToSquare(a));
        assertEquals(0, calculator.raiseToSquare(b));
        assertEquals(16, calculator.raiseToSquare(c));
    }
}
