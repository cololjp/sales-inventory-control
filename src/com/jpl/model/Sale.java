package com.jpl.model;

public class Sale {

    private double amount;
    private String type;
    //private String colour;

    public Sale(float amount) {
        this.type = "Normal";
        this.amount = amount;
        //this.colour = "white";
    }

    public Sale(String type, float amount) {
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

    //public void setColour(String colour) {
    //    this.colour = colour;
    //}

    @Override
    public String toString() {
        return "Type: " + type + " - Amount: " + amount;
    }
}
