package com.kodilla.parametrized_tests.homework;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.*;

class UserValidatorTestSuite {

    UserValidator validator = new UserValidator();

    @ParameterizedTest
    @ValueSource(strings = {"aBC99910._-3", "abc"})
    public void ShouldReturnTrueIfUserNameIsCorrect(String value) {
        boolean result = validator.validateUsername(value);
        assertTrue(result);
    }

    @ParameterizedTest
    @ValueSource(strings = {"aBC99910._-3,", "Ab"})
    public void ShouldReturnFalseIfUserNameIsNotCorrect(String value) {
        boolean result = validator.validateUsername(value);
        assertFalse(result);
    }

    @ParameterizedTest
    @ValueSource(strings = {"email_@test.com", "123email-TEST@com.org"})
    public void ShouldReturnTrueIfEmailIsCorrect(String value) {
        boolean result = validator.validateEmail(value);
        assertTrue(result);
    }

    @ParameterizedTest
    @ValueSource(strings = {"test@@@asda.com", "Sdasdad", "123z@assd", ",@a.22", "123email-TEST@com.ppppppporg", "amam@,,.pl", "."})
    public void ShouldReturnFalseIfEmailIsNotCorrect(String value) {
        boolean result = validator.validateEmail(value);
        assertFalse(result);
    }
}