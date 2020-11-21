package com.kodilla.bank.homework;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BankTestSuite {
    Bank bank = new Bank();
    CashMachine cashMachine1 = new CashMachine();
    CashMachine cashMachine2 = new CashMachine();
    CashMachine cashMachine3 = new CashMachine();

    @Test
    public void shouldCalculateTotalBalance(){

        cashMachine1.changeBalance(100);
        cashMachine1.changeBalance(150);
        cashMachine2.changeBalance(50);
        cashMachine2.changeBalance(50);
        cashMachine3.changeBalance(-100);

        bank.addCashMachine(cashMachine1);
        bank.addCashMachine(cashMachine2);
        bank.addCashMachine(cashMachine3);

        double totalBalance = bank.getTotalBalance();
        assertEquals(250,totalBalance);
    }

    @Test
    public void shouldCountTotalNumberOfDeposits(){
        cashMachine1.changeBalance(100);
        cashMachine1.changeBalance(150);
        cashMachine2.changeBalance(50);
        cashMachine2.changeBalance(50);
        cashMachine3.changeBalance(-100);

        bank.addCashMachine(cashMachine1);
        bank.addCashMachine(cashMachine2);
        bank.addCashMachine(cashMachine3);

        int totalNumberOfDeposits = bank.getTotalNumberOfDeposits();
        assertEquals(4, totalNumberOfDeposits);
    }

    @Test
    public void shouldCountTotalNumberOfWithdraws(){
        cashMachine1.changeBalance(100);
        cashMachine1.changeBalance(150);
        cashMachine2.changeBalance(50);
        cashMachine2.changeBalance(50);
        cashMachine3.changeBalance(-100);

        bank.addCashMachine(cashMachine1);
        bank.addCashMachine(cashMachine2);
        bank.addCashMachine(cashMachine3);

        int totalNumberOfWithdraws = bank.getTotalNumberOfWithdraws();
        assertEquals(1, totalNumberOfWithdraws);
    }

    @Test
    public void shouldCountZeroNumberOfWithdraws(){
        cashMachine1.changeBalance(100);
        cashMachine1.changeBalance(150);
        cashMachine2.changeBalance(50);
        cashMachine2.changeBalance(50);
        cashMachine3.changeBalance(100);

        bank.addCashMachine(cashMachine1);
        bank.addCashMachine(cashMachine2);
        bank.addCashMachine(cashMachine3);

        int totalNumberOfWithdraws = bank.getTotalNumberOfWithdraws();
        assertEquals(0, totalNumberOfWithdraws);
    }

    @Test
    public void shouldCalculateAverageValueOfDeposit(){

        cashMachine1.changeBalance(200);
        cashMachine1.changeBalance(400);
        cashMachine2.changeBalance(600);
        cashMachine3.changeBalance(0 );

        bank.addCashMachine(cashMachine1);
        bank.addCashMachine(cashMachine2);
        bank.addCashMachine(cashMachine3);

        double averageValueOfDeposit = bank.getAverageValueOfDeposit();
        assertEquals(400,averageValueOfDeposit);
    }

    @Test
    public void shouldCalculateAverageValueOfWithdraws(){

        cashMachine1.changeBalance(-2000000);
        cashMachine1.changeBalance(-20);
        cashMachine2.changeBalance(60);
        cashMachine3.changeBalance(0 );

        bank.addCashMachine(cashMachine1);
        bank.addCashMachine(cashMachine2);
        bank.addCashMachine(cashMachine3);

        double averageValueOfWithdraws = bank.getAverageValueOfWithdraws();
        assertEquals(-1000010,averageValueOfWithdraws);
    }
}
