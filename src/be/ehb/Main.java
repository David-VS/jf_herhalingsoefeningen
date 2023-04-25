package be.ehb;

import be.ehb.entities.Snack;
import be.ehb.entities.SnackBeheer;
import be.ehb.logic.Priem;

public class Main {

    public static void main(String[] args) {
        Priem.priemgetallenTot100();

        Snack boulet = new Snack(123, "Boelet", 2.5);
        Snack frikandel = new Snack(124, "Frikadel", 2);

        SnackBeheer.addSnack(boulet);
        SnackBeheer.addSnack(frikandel);

        System.out.println(SnackBeheer.getSnackArrayList());
    }
}
