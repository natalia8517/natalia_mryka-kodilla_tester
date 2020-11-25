package com.kodilla.collections.interfaces.homework;

public class CarRace {

    public static void main(String[] args) {
        Car ford = new Ford(0);
        Opel opel = new Opel(0);
        Audi audi = new Audi(0);
        doRace(ford);
        doRace(opel);
        doRace(audi);
    }

    public static void doRace(Car car){
        for (int i =0; i<3; i++){
            car.increaseSpeed();
        }
        for (int i =0; i<2; i++){
            car.decreaseSpeed();
        }
        System.out.println(car.getSpeed());
    }
}
