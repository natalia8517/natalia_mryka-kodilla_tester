package com.kodilla.execution_model.homework;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Shop {

    private List<Order> orders = new ArrayList<>();

    public void addOrder(Order order) {
        this.orders.add(order);
    }

    public int getNumberOfOrders() {
        return orders.size();
    }

    public List<Order> getOrdersFromTimePeriod(LocalDate startDate, LocalDate endDate) {
        List<Order> ordersFromTimeFrame = new ArrayList<>();
        for (Order order : orders) {
            if (order.getDate().isAfter(startDate) && order.getDate().isBefore(endDate)) {
                ordersFromTimeFrame.add(order);
            }
        }
        return ordersFromTimeFrame;
    }

    public List<Order> getOrdersFromValueFrame (double minValue, double maxValue) {
        List<Order> ordersFromValueFrame = new ArrayList<>();
        for (Order order : this.orders) {

            double value = order.getValue();

            if (value >= minValue && value <= maxValue) {
                ordersFromValueFrame.add(order);

            }

        }
       return ordersFromValueFrame;
    }

    public double getSumOfOrderValues(){
        double sum = 0;
        for (Order order : orders){
            sum = sum + order.getValue();
        }
        return sum;
    }
}
