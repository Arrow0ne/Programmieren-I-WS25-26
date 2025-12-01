package Lektion5;

import java.util.Scanner;

public class Potenz {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Bitte geben sie hier eine Basis 'b' ein: ");
        double b = sc.nextDouble();
        System.out.println("Bitte geben sie nun einen Exponenten 'n' ein: ");
        int n = sc.nextInt();

        if (n == 0) {
            System.out.println("Das Ergebnis der Potenz lautet: 1");
        }

        if (n > 0) {
            double Summe = 1;
            for (int i = 1; i < n; i++) {
                Summe *= b;
            }
            System.out.println("Das Ergebnis der Potenz lautet: " + Summe);
        }
        if (n < 0) {
            double Summe = 1;

            for (int i = 0; i > n; i--) {
                Summe *= b;
            }
            double Ergebnis = (1/Summe);
            System.out.println("Das Ergebnis der Potenz lautet: " + Ergebnis);
        }

        sc.close();
    }
}
