package com.kodilla.collections.adv.exercises.homework;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class FlightFinderTestSuite {

    @Test
    public void testAddFlight() {
        FlightFinder finder = new FlightFinder();
        FlightRepository repo = new FlightRepository();
        Flight flight1 = new Flight("London", "Tokyo");
        repo.addFlight(flight1);

        assertEquals(1, FlightRepository.size());
    }

    @Test
    public void testFindCorrectFlightTo() {
        FlightFinder finder = new FlightFinder();
        FlightRepository repo = new FlightRepository();
        Flight flight1 = new Flight("London", "Tokyo");
        Flight flight2 = new Flight("Warsaw", "Berlin");
        Flight flight3 = new Flight("Warsaw", "New York");
        Flight flight4 = new Flight("Warsaw", "Tokyo");
        repo.addFlight(flight1);
        repo.addFlight(flight2);
        repo.addFlight(flight3);
        repo.addFlight(flight4);
        List<Flight> result = finder.findFlightsTo("Tokyo");
        List<Flight> expectedFlightList = new ArrayList<>();
        expectedFlightList.add(flight1);
        expectedFlightList.add(flight4);
        assertEquals(expectedFlightList, result);
    }
    @Test
    public void testFindCorrectFlightFrom() {
        FlightFinder finder = new FlightFinder();
        FlightRepository repo = new FlightRepository();
        Flight flight1 = new Flight("London", "Tokyo");
        Flight flight2 = new Flight("Warsaw", "Berlin");
        Flight flight3 = new Flight("Warsaw", "New York");
        Flight flight4 = new Flight("Warsaw", "Tokyo");
        repo.addFlight(flight1);
        repo.addFlight(flight2);
        repo.addFlight(flight3);
        repo.addFlight(flight4);
        List<Flight> result = finder.findFlightsFrom("London");
        List<Flight> expectedFlightList = new ArrayList<>();
        expectedFlightList.add(flight1);
        assertEquals(expectedFlightList, result);
    }
}