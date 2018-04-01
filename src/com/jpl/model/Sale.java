package com.jpl.model;

public class Sale implements Comparable<Sale> {

    private double amount;
    private String type;

    public Sale(String type, double amount) {
        this.type = type;
        this.amount = amount;
    }

    public double getAmount() {
        return amount;
    }

    public String getType() {
        return type;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "Type: " + type + " - Amount: " + amount;
    }

    @Override
    public int compareTo(Sale compareSale) {

        // Ascending order comparison
        int result = (int) (this.amount - compareSale.amount);

        // Descending order comparison
        // int result = (int) (this.amount - compareSale.amount);

        return result;

    }
}
