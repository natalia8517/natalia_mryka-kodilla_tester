package com.kodilla.inheritance.homework;

public class OperatingSystem {
    private int yearOfSystemRelease;
    public OperatingSystem(int yearOfSystemRelease){
        this.yearOfSystemRelease = yearOfSystemRelease;
    }
    public int getYearOfSystemRelease(){
        return yearOfSystemRelease;
    }

    public void turnOn(){
        System.out.println("The system is On");
    }

    public void turnOff(){
        System.out.println("The system is Off");
    }

}
