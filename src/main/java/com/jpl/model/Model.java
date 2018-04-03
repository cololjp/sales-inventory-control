package com.jpl.model;

import java.util.ArrayList;

public class Model {

    private ArrayList<Sale> sales;
    private ArrayList<Payment> payments;

    public Model() {
        this.sales = new ArrayList<>();
        this.payments = new ArrayList<>();
    }

    public void addSale(Sale newSale) {
        sales.add(newSale);
    }

    public void addPayment(Payment newPayment) {
        payments.add(newPayment);
    }

    public void printSales() {

        for (Sale i : sales) {
            System.out.println(i);
        }

    }

    public void printPayments() {

        for (Payment i : payments) {
            System.out.println(i);
        }

    }

}
