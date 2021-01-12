package com.kodilla.spring.basic.spring_configuration.homework;

public class Cabrio implements Car {

    @Override
    public boolean hasHeadlightsTurnedOn(int hour) {
        if (hour > 20 || hour < 6) {
            return true;
        } else {
            return false;
        }
    }

    @Override
    public String getCarType() {
        return "Cabrio";
    }
}
