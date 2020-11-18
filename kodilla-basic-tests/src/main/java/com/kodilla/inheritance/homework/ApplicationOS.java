package com.kodilla.inheritance.homework;

public class ApplicationOS {
    public static void main(String[] args) {
        OperatingSystem win10 = new Windows10(2015);
        OperatingSystem winXp = new WindowsXp(2001);

        displaySystemInfo(win10);
        displaySystemInfo(winXp);
    }

    private static void displaySystemInfo(OperatingSystem operatingSystem) {
        System.out.println(operatingSystem.getYearOfSystemRelease());
        operatingSystem.turnOn();
        operatingSystem.turnOff();
    }
}
