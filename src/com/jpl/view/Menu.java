package com.jpl.view;

import com.jpl.control.Controller;

import java.io.IOException;
import java.util.Scanner;

public class Menu {

    private Controller controller;
    private Scanner reader;

    public Menu(Controller controller) {

        this.controller = controller;
        this.reader = new Scanner(System.in);

    }

    public void start() {

        String selection = "";

        while (!selection.equals("0")) {

            startMenu();

            selection = reader.next();

            switch (selection) {
                case "1":
                    optionOne(reader);
                    break;

                case "2":
                    optionTwo(reader);
                    break;

                case "3":
                    optionThree(reader);
                    break;

                case "4":
                    optionFour(reader);
                    break;

                case "0":
                    reader.close();
                    break;

                default:
                    notValidSelection();
                    break;
            }
        }
    }

    private void startMenu() {

        System.out.println("\t\tMENU\n");
        System.out.println("1. NEW SALE");
        System.out.println("2. NEW PAYMENT");
        System.out.println("3. PRINT SALES");
        System.out.println("4. PRINT PAYMENTS");
        System.out.println("0. EXIT");

        System.out.print("\nSelection: ");

    }

    private void optionOne(Scanner reader) {

        String type;
        double amount;

        System.out.print("\nType -> N/Normal - C/Credit Card: ");
        type = reader.next();

        System.out.print("\nAmount: ");
        amount = reader.nextDouble();

        controller.addSale(type, amount);

        clearScreen();

    }

    private void optionTwo(Scanner reader) {

        String distributor;
        double amount;

        System.out.print("\nDistributor: ");
        distributor = reader.next();

        System.out.print("\nAmount: ");
        amount = reader.nextDouble();

        controller.addPayment(distributor, amount);

        clearScreen();

    }


    @SuppressWarnings("ResultOfMethodCallIgnored")
    private void optionThree(Scanner scanner) {

        clearScreen();

        controller.printSales();

        System.out.print("\nPress Enter to continue...");

        try {
            System.in.read();
        } catch (IOException e) {
            e.printStackTrace();
        }

        clearScreen();

    }

    @SuppressWarnings("ResultOfMethodCallIgnored")
    private void optionFour(Scanner scanner) {

        clearScreen();

        controller.printPayments();

        System.out.print("\nPress Enter to continue...");

        try {
            System.in.read();
        } catch (IOException e) {
            e.printStackTrace();
        }

        clearScreen();

    }

    private void notValidSelection() {

        System.out.println("Not a valid option.");
        System.out.println("Try again.");

    }

    private void clearScreen() {

        for (int i = 0; i < 13; i++) {
            System.out.println();
        }

    }

}
