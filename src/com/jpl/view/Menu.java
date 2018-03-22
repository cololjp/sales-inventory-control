package com.jpl.view;

import com.jpl.control.Controller;

import java.io.IOException;
import java.util.Scanner;

public class Menu {

    private String selection = "";
    private int amount;
    private Controller controller;

    public Menu(Controller controller) {
        this.controller = controller;
    }

    public void start(Scanner scanner) {

        while (!selection.equals("0")) {

            startMenu();

            selection = scanner.next();

            switch (selection) {
                case "1":
                    optionOne(scanner);

                    break;

                case "2":
                    optionTwo(scanner);

                    break;

                case "3":
                    optionThree(scanner);

                    break;

                case "0":
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

    private void optionOne(Scanner scanner) {
        System.out.print("\nAmount: ");
        amount = scanner.nextInt();

        controller.addSale("Normal", amount);

        clearScreen();
    }

    private void optionTwo(Scanner scanner) {
        String distributor;

        System.out.print("\nDistributor: ");
        distributor = scanner.next();

        System.out.print("\nAmount: ");
        amount = scanner.nextInt();

        controller.addPayment(distributor, amount);

        clearScreen();
    }

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
