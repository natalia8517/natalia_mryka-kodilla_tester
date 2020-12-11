package com.kodilla.exception.homework;

import com.kodilla.exception.AirportNotFoundException;

public class WarehouseApp {
    public static void main(String[] args) {
        Warehous warehous = new Warehous();
        warehous.addOrder(new Order("1"));
        warehous.addOrder(new Order("2"));
        warehous.addOrder(new Order("3"));

        try {
            String orderNum = warehous.getOrder("12").getNumber();
            System.out.println("Order num: " + orderNum + " is correct");
        } catch (OrderDoesntExistException e) {
            System.out.println("Sorry this order doesn't exist");
        } finally {
            System.out.println("Thanks for using Kodilla warehouse");
        }
    }
}