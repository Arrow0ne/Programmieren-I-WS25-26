package Lektion5;

import java.util.Scanner;

public class PiBerechnung {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Bitte gib die Anzahl der Rechtecke ein: ");
        int n = sc.nextInt();

        double breite = 1.0 / n; // Breite eines Rechtecks
        double summe = 0.0;

        // Schleife über die Rechtecke
        for (int i = 0; i < n; i++) {
            double x = i * breite; // linker Rand des Rechtecks
            double hoehe = Math.sqrt(1.0 - x * x);
            double flaeche = hoehe * breite;
            summe += flaeche;
        }

        double pi = summe * 4.0; // Viertelkreis mal 4 = ganzer Kreis
        System.out.println("Pi-Näherung mit " + n + " Rechtecken: " + pi);

        sc.close();
    }
}
