package Lektion7;
import java.util.Random;

import java.util.Random;

public class Lottoziehung {

    public static void main(String[] args) {

        int[] lotto = new int[6];
        Random rand = new Random();

        // Lottozahlen ziehen (ohne Duplikate)
        int count = 0;
        while (count < lotto.length) {
            int zahl = rand.nextInt(49) + 1;

            if (!enthaelt(lotto, count, zahl)) {
                lotto[count] = zahl;
                count++;
            }
        }

        // Sortieren (Selection Sort)
        sortiere(lotto);

        // Ausgabe
        System.out.println("Gezogene Lottozahlen:");
        for (int i = 0; i < lotto.length; i++) {
            System.out.print(lotto[i] + " ");
        }
    }

    // Prüft, ob Zahl bereits im Feld ist
    private static boolean enthaelt(int[] feld, int bis, int zahl) {
        for (int i = 0; i < bis; i++) {
            if (feld[i] == zahl) {
                return true;
            }
        }
        return false;
    }

    // Selection Sort
    private static void sortiere(int[] feld) {
        for (int i = 0; i < feld.length - 1; i++) {

            int minIndex = i;

            for (int j = i + 1; j < feld.length; j++) {
                if (feld[j] < feld[minIndex]) {
                    minIndex = j;
                }
            }

            int temp = feld[i];
            feld[i] = feld[minIndex];
            feld[minIndex] = temp;
        }
    }
}

