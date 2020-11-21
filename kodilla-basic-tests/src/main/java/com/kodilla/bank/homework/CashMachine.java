package com.kodilla.bank.homework;

public class CashMachine {
    double [] transactions;
    private int numberOfWithdraws;
    private int numberOfDeposits =0;
    private double valueOfDeposits=0;
    private double valueOfWithdraws=0;
    private int size;
    private double balance = 0;

    public CashMachine(){
        this.transactions = new double[0];
        this.size = 0;
    }

    public void changeBalance(double amount){
        if (amount ==0){
            return;
        }
        if (amount>0){
            numberOfDeposits +=1;
            valueOfDeposits = valueOfDeposits + amount;
        }
        if (amount<0){
            this.numberOfWithdraws +=1;
            this.valueOfWithdraws = valueOfWithdraws + amount;
        }
        this.size++;
        double[] newTransactions = new double[this.size];
        System.arraycopy(transactions, 0, newTransactions, 0, transactions.length);
        newTransactions[this.size - 1] = amount;
        this.transactions = newTransactions;
    }
    public double getValueOfDeposits(){
        return valueOfDeposits;
    }
    public double getValueOfWithdraws(){
        return valueOfWithdraws;
    }
    public double getNumberOfWithdraws(){
        return numberOfWithdraws;
    }
    public double getNumberOfDeposits(){
        return numberOfDeposits;
    }

    public double getBalance(){
        for (int i =0; i<this.transactions.length; i++){
            balance = balance + this.transactions[i];
        }
        return balance;
    }

    public int getNumberOfOperations(){
        return this.transactions.length;
    }
}
