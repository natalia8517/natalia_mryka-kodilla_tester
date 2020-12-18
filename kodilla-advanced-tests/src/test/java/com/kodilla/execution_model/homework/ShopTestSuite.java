package com.kodilla.execution_model.homework;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ShopTestSuite {

    Shop shop = new Shop();

    @Test
    public void ShouldAddOrderToList() {
        //when
        int numberOfOrders = shop.getNumberOfOrders();

        //then
        assertEquals(3, numberOfOrders);
    }

    @Test
    public void ShouldACalculateSumOfOrdersValue() {
        //when
        double sum = shop.getSumOfOrderValues();

        //then
        assertEquals(1400, sum);
    }

    @Test
    public void ShouldGetOrdersFromValueFrame() {
        //when
        int ordersNum = shop.getOrdersFromValueFrame(200, 5000).size();
        //then
        assertEquals(2, ordersNum);
    }

    @Test
    public void ShouldGetOrdersFromTimeFrame() {
        //when
        int ordersNum = shop.getOrdersFromTimePeriod(LocalDate.of(2020, 12, 01), LocalDate.now()).size();
        //then
        assertEquals(1, ordersNum);
    }

    @BeforeEach
    public void InitializeListOfOrders() {
        shop.addOrder(new Order(300, LocalDate.of(2020, 12, 02), "mary"));
        shop.addOrder(new Order(100, LocalDate.of(2020, 01, 15), "tom"));
        shop.addOrder(new Order(1000, LocalDate.of(2020, 10, 15), "john"));
    }
}