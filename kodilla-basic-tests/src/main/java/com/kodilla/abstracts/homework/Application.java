package com.kodilla.abstracts.homework;

public class Application {
    public static void main(String[] args) {

        Circle circle = new Circle(6);
        Square square = new Square(2);
        Rectangle rectangle = new Rectangle(3,5);

        CalculateAndDisplay(circle);
        CalculateAndDisplay(square);
        CalculateAndDisplay(rectangle);
    }

    private static void CalculateAndDisplay(Shape shape) {
        System.out.println("Pole = " + shape.calculateArea());
        System.out.println("Obwód = " + shape.calculatePerimeter());
    }
}