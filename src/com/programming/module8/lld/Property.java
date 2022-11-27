package com.programming.module8.lld;

public class Property {
    private final double investments;
    private final double bankbalance;

    public Property(double investments, double bankbalance) {
        this.investments = investments;
        this.bankbalance = bankbalance;
    }

    public double getInvestments() {
        return investments;
    }

    public double getBankbalance() {
        return bankbalance;
    }
}
