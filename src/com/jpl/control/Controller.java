package com.jpl.control;

import com.jpl.model.*;

public class Controller {

    private Model model;

    public Controller(Model model) {
        this.model = model;
    }

    public void addSale(String type, int amount) {
        model.addSale(new Sale(type, amount));
    }

    public void addPayment(String distributor, int amount) {
        model.addPayment(new Payment(distributor, amount));
    }

    public void printSales() {
        model.printSales();
    }

    public void printPayments() {
        model.printPayments();
    }

}
