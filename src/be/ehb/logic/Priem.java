package be.ehb.logic;

public class Priem {

    public static void priemgetallenTot100(){
        for(int getal = 1; getal <= 100; getal++) {
            int aantalDelers = 0;
            for (int deler = 1; deler <= getal; deler++) {
                if (getal % deler == 0) {
                    aantalDelers++;
                }
            }
            if (aantalDelers == 2) {
                System.out.println(getal + " is een priemgetal");
            }
        }
    }
}
