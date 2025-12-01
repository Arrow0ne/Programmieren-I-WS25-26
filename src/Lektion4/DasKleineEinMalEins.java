package Lektion4;

public class DasKleineEinMalEins {
    public static void main(String[] args) {

        for (int i = 1; i <= 10; i++) {        // erster Faktor //er macht die innere erstmal 10 mal druch und geht dann auf die äußere
            for (int a = 1; a <= 10; a++) {    // zweiter Faktor
                int produkt = i * a;
                System.out.println(i + " x " + a + " = " + produkt);
            }
            System.out.println(); // Leerzeile nach jeder 10er-Gruppe
        }
    }
}
