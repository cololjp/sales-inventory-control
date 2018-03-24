package com.jpl.control;

import com.jpl.model.*;
import com.jpl.view.Menu;

public class Controller {

    private Model model;
    private Menu menu;

    public void initialize(Model model, Menu menu) {

        this.model = model;
        this.menu = menu;

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

    public void displayView() {
        menu.start();
    }

}
