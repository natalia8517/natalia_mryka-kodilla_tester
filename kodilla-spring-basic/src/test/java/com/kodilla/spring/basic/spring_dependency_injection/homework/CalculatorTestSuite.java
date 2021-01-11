package com.kodilla.spring.basic.spring_dependency_injection.homework;

import org.junit.Test;
import org.junit.jupiter.api.Assertions;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@SpringBootTest
public class CalculatorTestSuite {

    @Test
    public void shouldReturnCorrectAddingResult() {
        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring.basic"); // [1]
        Calculator bean = context.getBean(Calculator.class);
        double result = bean.add(1, 2);
        Assertions.assertEquals(result,3);
    }
    @Test
    public void shouldReturnCorrectSubtractionResult() {
        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring.basic"); // [1]
        Calculator bean = context.getBean(Calculator.class);
        double result = bean.subtract(10, 2);
        Assertions.assertEquals(result,8);
    }
    @Test
    public void shouldReturnCorrectMultiplicationResult() {
        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring.basic"); // [1]
        Calculator bean = context.getBean(Calculator.class);
        double result = bean.multiply(5, 2);
        Assertions.assertEquals(result,10);
    }
    @Test
    public void shouldReturnCorrectDivisionResult() {
        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring.basic"); // [1]
        Calculator bean = context.getBean(Calculator.class);
        double result = bean.divide(20, 4);
        Assertions.assertEquals(result,5);
    }
}