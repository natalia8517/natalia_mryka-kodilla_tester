package com.kodilla.basic_assertion;

public class Application {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        int a = 5;
        int b = 8;
        int sumResult = calculator.sum(a,b);
        int substractResult = calculator.subtract(a,b);
        int raiseToSquareResult = calculator.raiseToSquare(a);
        boolean correct = ResultChecker.assertEquals(13, sumResult);
        boolean isSubtractResultCorrect = ResultChecker.assertEquals(-3, substractResult);
        boolean isSquareResultCorrect = ResultChecker.assertEquals(25, raiseToSquareResult);

        if (correct) {
            System.out.println("Metoda sum działa poprawnie dla liczb " + a + " i " + b);
        } else {
            System.out.println("Metoda sum nie działa poprawnie dla liczb " + a + " i " + b);
        }

        if (isSubtractResultCorrect) {
            System.out.println("Metoda subtract działa poprawnie dla liczb " + a + " i " + b);
        } else {
            System.out.println("Metoda subtract nie działa poprawnie dla liczb " + a + " i " + b);
        }

        if (isSquareResultCorrect) {
            System.out.println("Metoda raise to square działa poprawnie dla liczby " + a);
        } else {
            System.out.println("Metoda raise to square nie działa poprawnie dla liczby " + a );
        }
    }
}
