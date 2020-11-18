package com.kodilla.inheritance.homework;

public class Windows10 extends OperatingSystem {
    public Windows10(int yearOfSystemRelease) {
        super(yearOfSystemRelease);
    }

    @Override
    public void turnOn(){
        System.out.println("The Windows 10 system is On");
    }

    @Override
    public void turnOff(){
        System.out.println("The Windows 10 system is Off");
    }
}
