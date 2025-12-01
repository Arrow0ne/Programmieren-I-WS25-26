package Lektion7;

import java.util.Scanner;

public class ArithmetischesMittel {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Anzahl der einzulesenden Werte: ");
        int anzahl = sc.nextInt();

        if (anzahl > 0) {
            double[] zahl = new double[anzahl];

            //Zahlen abspeichern
            for (int i = 0; i < zahl.length; i++) {
                System.out.println((i + 1) + ". Wert: ");
                zahl[i] = sc.nextDouble();
            }
            double minWert = zahl[0];
            double maxWert = zahl[0];
            double mittelWert = 0;

            //Minimum
            for (int i = 0; i < zahl.length; i++) {
                if (minWert >= zahl[i]) {
                    minWert = zahl[i];
                }
            }
            System.out.println("Kleinster Wert: " + minWert);

            //Maximum
            for (int i = 0; i < zahl.length; i++) {
                if (maxWert <= zahl[i]) {
                    maxWert = zahl[i];
                }
            }
            System.out.println("Größter Wert: " + maxWert);


            //Arithmetisches Mittel
            double summe = 0;
            for (int i = 0; i < zahl.length; i++) {
                summe = summe + zahl[i];
            }
            mittelWert = summe / zahl.length;
            System.out.println("Arithmetischer Mittelwert: " + mittelWert);

        } else {
            System.out.println("Die Anzahl der einzulesenden Werte muss über 0 sein bzw. gültig!");
        }
    }
}
