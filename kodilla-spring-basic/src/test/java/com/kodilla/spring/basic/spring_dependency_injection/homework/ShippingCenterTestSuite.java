package com.kodilla.spring.basic.spring_dependency_injection.homework;

import org.junit.Test;
import org.junit.jupiter.api.Assertions;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;


@SpringBootTest
public class ShippingCenterTestSuite {

    @Test
    public void shouldDeliverPackage() {
        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring.basic"); // [1]
        ShippingCenter bean = context.getBean(ShippingCenter.class);
        String result = bean.sendPackage("Warsaw", 12);
        Assertions.assertEquals(result,"Package delivered to: Warsaw");
    }
    @Test
    public void shouldNotDeliverToHeavyPackage() {
        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring.basic"); // [1]
        ShippingCenter bean = context.getBean(ShippingCenter.class);
        String result = bean.sendPackage("Krakow", 120);
        Assertions.assertEquals(result,"Package not delivered to: Krakow");
    }
}