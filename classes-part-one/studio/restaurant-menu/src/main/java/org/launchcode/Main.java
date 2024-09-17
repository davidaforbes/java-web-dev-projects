package org.launchcode;

import java.time.LocalDate;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        Menu menu1 = new Menu(new ArrayList<MenuItem>(), LocalDate.now());

        MenuItem risotto = new MenuItem("Risotto", 19.00, "Asparagus and Mushroom Risotto", "Main", LocalDate.now());
        MenuItem betterRisotto = new MenuItem("Risotto", 390.00, "Asparagus and Mushroom Risotto", "Main", LocalDate.now());
        MenuItem mushyRice = new MenuItem("Risotto", 19.00, " Mushy Asparagus and Mushroom Risotto", "Main", LocalDate.now());
        menu1.addMenuItem(risotto);
        menu1.addMenuItem(betterRisotto);
        menu1.addMenuItem(mushyRice);
        System.out.println(betterRisotto.equals(risotto));
    }
}

