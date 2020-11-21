package com.kodilla.bank.homework;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import java.awt.*;

public class CashMachineTestSuite {

    @Test
    public void shoulCalculateNegativeBalancey(){
        CashMachine cash = new CashMachine();
        cash.changeBalance(-10);
        cash.changeBalance(5);
        cash.changeBalance(0);
        double balance = cash.getBalance();
        assertEquals(-5,balance);
    }

    @Test
    public void shouldCalculatePositiveBalance(){
        CashMachine cash = new CashMachine();
        cash.changeBalance(-15);
        cash.changeBalance(200);
        cash.changeBalance(0);
        double balance = cash.getBalance();
        assertEquals(185,balance);
    }

    @Test
    public void shouldCalculateZeroBalance(){
        CashMachine cash = new CashMachine();
        cash.changeBalance(-15);
        cash.changeBalance(15);
        double balance = cash.getBalance();
        assertEquals(0,balance);
    }

    @Test
    public void shouldCountCorrectNumberOfTransactions(){
        CashMachine cash = new CashMachine();
        cash.changeBalance(150);
        cash.changeBalance(- 200);
        double numberOfTransactions = cash.getNumberOfOperations();
        assertEquals(2,numberOfTransactions);
        }

    @Test
    public void shouldCountZeroNumberOfTransactions(){
        CashMachine cash = new CashMachine();
        double numberOfTransactions = cash.getNumberOfOperations();
        assertEquals(0,numberOfTransactions);
    }

    @Test
    public void shouldCalculateValueOfDeposits(){
        CashMachine cash = new CashMachine();
        cash.changeBalance(150);
        cash.changeBalance(150);
        cash.changeBalance(- 200);
        double valueOfDeposits = cash.getValueOfDeposits();
        assertEquals(300,valueOfDeposits);
    }

    @Test
    public void shouldCalculateValueOfWithdraws(){
        CashMachine cash = new CashMachine();
        cash.changeBalance(150);
        cash.changeBalance(- 200);
        cash.changeBalance(- 300);
        double valueOfWithdraws = cash.getValueOfWithdraws();
        assertEquals(-500,valueOfWithdraws);
    }
}
