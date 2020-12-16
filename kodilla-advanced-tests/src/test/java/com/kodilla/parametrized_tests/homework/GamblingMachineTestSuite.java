package com.kodilla.parametrized_tests.homework;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;

import java.util.HashSet;
import java.util.Set;

import static org.junit.jupiter.api.Assertions.*;

class GamblingMachineTestSuite {

    GamblingMachine machine = new GamblingMachine();

    @ParameterizedTest
    @CsvFileSource(resources = "/Numbers.csv", numLinesToSkip = 0)
    public void ShouldPassIfNumbersAreCorrect(String number) throws InvalidNumbersException {
        Set<Integer> nums = new HashSet<>();
        String[] newNumList = number.split(":");
        for (String numi : newNumList) {
            int parse = Integer.parseInt(numi);
            System.out.println(parse);
            nums.add(parse);
        }
        int result = machine.howManyWins(nums);
        assertTrue(result >= 0);
    }

    @ParameterizedTest
    @CsvFileSource(resources = "/WrongNumbers.csv", numLinesToSkip = 0)
    public void ShouldThrowExceptionIfNumbersAreWrong(String number) throws InvalidNumbersException {

        Set<Integer> nums = new HashSet<>();
        String[] newNumList = number.split(":");

        for (String numi : newNumList) {
            int parse = Integer.parseInt(numi);
            System.out.println(parse);
            nums.add(parse);
        }
        try {
            int result = machine.howManyWins(nums);
            assertFalse(result >= 0);
        } catch (InvalidNumbersException exception) {
            assertEquals("Wrong numbers provided", exception.getMessage());
        }

    }
}