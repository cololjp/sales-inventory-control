package com.jpl;

import com.jpl.model.Model;
import com.jpl.control.Controller;
import com.jpl.view.Menu;

class Main {

    public static void main(String[] args) {

        Model model = new Model();
        Controller controller = new Controller();
        Menu menu = new Menu(controller);

        controller.initialize(model, menu);
        controller.displayView();

    }

}
