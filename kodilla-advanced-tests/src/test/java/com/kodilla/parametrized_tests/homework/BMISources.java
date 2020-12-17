package com.kodilla.parametrized_tests.homework;

import org.junit.jupiter.params.provider.Arguments;

import java.util.stream.Stream;

public class BMISources {

    static Stream<Arguments> provideBMI() {
        return Stream.of(
                Arguments.of(2, 56, "Very severely underweight"),
                Arguments.of(1.8, 59, "Underweight"),
                Arguments.of(1.72, 80, "Overweight")
        );
    }
}