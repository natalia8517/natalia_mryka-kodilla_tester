package com.kodilla.execution_model.homework;

import java.time.LocalDate;

public class Order {

    double value;
    LocalDate date;
    String login;

    public double getValue() {
        return value;
    }

    public LocalDate getDate() {
        return date;
    }

    public String getLogin() {
        return login;
    }

    public Order(double value, LocalDate date, String login) {
        this.value = value;
        this.date = date;
        this.login = login;
    }
}