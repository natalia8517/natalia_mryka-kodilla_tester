package com.kodilla.spring.basic.spring_configuration.homework;

public class Sedan implements Car {
   // Calendar calendar = Calendar.getInstance();
    //int hour = calendar.get(Calendar.HOUR_OF_DAY);

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
        return "Sedan";
    }
}
