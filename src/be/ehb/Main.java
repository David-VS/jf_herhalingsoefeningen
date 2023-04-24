package be.ehb;

import be.ehb.entities.Snack;
import be.ehb.entities.SnackBeheer;

public class Main {

    public static void main(String[] args) {
        // write your code here
        System.out.println("Hello world");

        Snack boulet = new Snack(123, "Boelet", 2.5);
        Snack frikandel = new Snack(124, "Frikadel", 2);

        SnackBeheer.addSnack(boulet);
        SnackBeheer.addSnack(frikandel);

        System.out.println(SnackBeheer.getSnackArrayList());
    }
}
