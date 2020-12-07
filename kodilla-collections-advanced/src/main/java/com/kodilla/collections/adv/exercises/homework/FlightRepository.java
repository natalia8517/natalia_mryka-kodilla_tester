package com.kodilla.collections.adv.exercises.homework;

import java.util.ArrayList;
import java.util.List;

public class FlightRepository {
    static List<Flight> flightsTable = new ArrayList<>();

    public List<Flight> addFlight(Flight flight) {
        flightsTable.add(flight);
        return flightsTable;
    }

    public static List<Flight> getFlightsTable() {
        return flightsTable;
    }

    public static int size() {

        return flightsTable.size();
    }
}