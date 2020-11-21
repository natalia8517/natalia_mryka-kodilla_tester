package com.kodilla.bank.homework;

public class Bank {

    CashMachine[] cashMachines;
    int size;

    public Bank() {
        this.cashMachines = new CashMachine[0];
        this.size = 0;
    }

    public void addCashMachine(CashMachine cashMachine){
        this.size++;
        CashMachine[] newCashMachines = new CashMachine[this.size];
        System.arraycopy(cashMachines, 0, newCashMachines,0, cashMachines.length);
        newCashMachines[this.size - 1] = cashMachine;
        this.cashMachines = newCashMachines;
    }

    public double getTotalBalance(){
        if (this.cashMachines.length == 0) {
            return 0;
        }

        double totalBalance = 0;
        for (int i =0; i<this.cashMachines.length ; i++){
            totalBalance+= cashMachines[i].getBalance();
        }
        return totalBalance;
    }

    public int getTotalNumberOfWithdraws(){
        if (this.cashMachines.length==0){
            return  0;
        }

        int totalNumberOfWithdraws = 0;
        for (int i =0; i<this.cashMachines.length ; i++){
            totalNumberOfWithdraws += cashMachines[i].getNumberOfWithdraws();
        }
        return totalNumberOfWithdraws;
    }

    public int getTotalNumberOfDeposits(){
        if (this.cashMachines.length==0){
            return  0;
        }

        int totalNumberOfDeposits = 0;
        for (int i =0; i<this.cashMachines.length ; i++){
            totalNumberOfDeposits += cashMachines[i].getNumberOfDeposits();
        }
        return totalNumberOfDeposits;
    }

    public double getAverageValueOfDeposit(){
        int totalNumberOfDeposits = getTotalNumberOfDeposits();
        if (totalNumberOfDeposits == 0){
            return  0;
        }
        double totalValueOfDeposits = 0;
        for (int i =0; i<this.cashMachines.length ; i++){
            totalValueOfDeposits += cashMachines[i].getValueOfDeposits();
        }
        return totalValueOfDeposits/totalNumberOfDeposits;
    }

    public double getAverageValueOfWithdraws(){
        int totalNumberOfWithdraws = getTotalNumberOfWithdraws();
        if (totalNumberOfWithdraws == 0){
            return  0;
        }
        double totalValueOfWithdraws = 0;
        for (int i =0; i<this.cashMachines.length ; i++){
            totalValueOfWithdraws += cashMachines[i].getValueOfWithdraws();
        }
        return totalValueOfWithdraws/totalNumberOfWithdraws;
    }
}

