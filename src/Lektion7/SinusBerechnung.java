package Lektion7;

import java.util.Scanner;

public class SinusBerechnung {

    public static double sin(double x) {
        double summe = 0;
        double term;
        int k = 0;

        do {
            term = potenz(-1, k) * (potenz(x, 2*k + 1) / fak(2*k + 1));
            summe += term;
            k++;
        } while (term > 1E-15 || term < -1E-15);

        return summe;
    }

    // Fakultät
    public static long fak(int k) {
        long ergebnis = 1;
        for (int i = 1; i <= k; i++) {
            ergebnis *= i;
        }
        return ergebnis;
    }

    // Potenzfunktion
    public static double potenz(double x, int n) {
        double ergebnis = 1;
        for (int i = 1; i <= n; i++) {
            ergebnis *= x;
        }
        return ergebnis;
    }
    public static void main(String[] args){
        System.out.println("Bitte gib hier eine Zahl ein um den Sinus zu berechnen: ");
        Scanner sc = new Scanner(System.in);
        double x = sc.nextDouble();
        System.out.println("Der Sinus von " + x + " ist: " + sin(x));

    }
}
