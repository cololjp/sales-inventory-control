package com.jpl.model;

public class Payment {

    private double amount;
    private String distributor;

    public Payment(String distributor, int amount) {
        this.amount = amount;
        this.distributor = distributor;
    }

    public double getAmount() {
        return amount;
    }

    public String getDistributor() {
        return distributor;
    }

    @Override
    public String toString() {
        return "Distributor: " + distributor + " - Amount: " + amount;
    }

}
