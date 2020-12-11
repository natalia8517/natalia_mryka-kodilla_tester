package com.kodilla.exception.homework;

import java.util.ArrayList;
import java.util.List;

public class Warehous {
    List<Order> orderList = new ArrayList<>();

    public void addOrder(Order order) {
        orderList.add(order);
    }

    public Order getOrder(String number) throws OrderDoesntExistException {
        Order order = orderList
                .stream()
                .filter(o -> o.getNumber().equals(number))
                .findAny()
                .orElseThrow(OrderDoesntExistException::new);
        return order;
    }
}