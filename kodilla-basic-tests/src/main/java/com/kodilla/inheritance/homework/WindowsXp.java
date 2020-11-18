package com.kodilla.inheritance.homework;

public class WindowsXp extends OperatingSystem {

    public WindowsXp(int yearOfSystemRelease) {
        super(yearOfSystemRelease);
    }

    @Override
    public void turnOn(){
        System.out.println("The Windows XP system is On");
    }

    @Override
    public void turnOff(){
        System.out.println("The Windows XP system is Off");
    }
}
