package com.jpl;

import com.jpl.model.Model;
import com.jpl.control.Controller;
import com.jpl.view.Menu;

import java.util.Scanner;

public class Main {

    private static Model model = new Model();
    private static Controller controller = new Controller(model);

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Menu menu = new Menu(controller);

        menu.start(scanner);

        scanner.close();

        //System.out.println("Adding a line for testing Git.");
    }

}
