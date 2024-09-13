package org.launchcode;

import java.util.ArrayList;
import java.util.Date;

public class Main {

    public static void main(String[] args) {

        Menu menu1 = new Menu(new ArrayList<MenuItem>(), new Date());

        ArrayList<MenuItem> temporary = new ArrayList<MenuItem>();

        MenuItem risotto = new MenuItem(19.00, "Asparagus and Mushroom Risotto", "Main", new Date());
        temporary.add(risotto);
        menu1.setFoods(temporary);
    }
}

