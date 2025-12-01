package Lektion5;

import java.util.Scanner;

public class Quadratwurzel {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Bitte geben sie eine Zahl ein von der die Quadratwurzel berechnet werden soll :");
        double x = sc.nextDouble();

        if (x == 0) System.out.println("Das Ergebnis für die Quadratwurzel von " + x + " ist 0");
        if (x < 0) System.out.println("Ungültige Zahl");
        double y = 1;
        double yhilfe;
        double genauigkeit;
        int i = 0;
        do {
            yhilfe = (((x / y) + y) / 2);
            y = yhilfe;
            i++;
        } while (i < 10000);
        System.out.println("Das Ergebnis für die Quadratwurzel von " + x + " ist " + yhilfe);

        //Vergleich
        System.out.println("---Vergleich---");
        System.out.println("Das ist das Ergebnis von Math.sqrt(x): " + Math.sqrt(x));

        sc.close();
    }
}
