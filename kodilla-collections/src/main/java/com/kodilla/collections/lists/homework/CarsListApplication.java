package com.kodilla.collections.lists.homework;
import com.kodilla.collections.arrays.homework.CarUtils;
import com.kodilla.collections.interfaces.homework.Audi;
import com.kodilla.collections.interfaces.homework.Car;
import com.kodilla.collections.interfaces.homework.Ford;
import com.kodilla.collections.interfaces.homework.Opel;

import java.util.ArrayList;
import java.util.List;

public class CarsListApplication {
    public static void main(String[] args) {
        List<Car> cars = new ArrayList<>();
        cars.add(new Audi(100));
        cars.add(new Ford(20));
        cars.add(new Opel(50));

        for (Car car : cars) {
            CarUtils.describeCar(car);
        }
        System.out.println(cars.size());

        cars.remove(1);
        cars.remove(new Opel(50));

        for (Car car : cars) {
            CarUtils.describeCar(car);
        }
        System.out.println(cars.size());
    }
}
