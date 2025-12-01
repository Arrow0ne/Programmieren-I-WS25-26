package Lektion7;

import java.util.Scanner;

public class BSprachenSpiel {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Text eingeben: ");
        String eingabe = sc.nextLine();
        String ergebnis = spielen(eingabe);
        System.out.println("B-Sprache: " + ergebnis);
    }

    public static String spielen(String wort) {
        char[] original = wort.toCharArray();

        // 1. Länge des neuen Arrays berechnen
        int neueLaenge = 0;
        for (int i = 0; i < original.length; i++) {
            if (istVokal(original[i])) {
                neueLaenge += 3;       // V + b + V
            } else {
                neueLaenge += 1;       // nur der Konsonant
            }
        }

        // 2. neues Array erzeugen
        char[] bsprache = new char[neueLaenge];

        // 3. B-Sprache füllen
        int j = 0; // Zielindex
        for (int i = 0; i < original.length; i++) {
            char c = original[i];

            if (istVokal(c)) {
                bsprache[j++] = c;                    // Vokal
                bsprache[j++] = 'b';                  // b
                bsprache[j++] = c;                    // Vokal nochmal
            } else {
                bsprache[j++] = c;                    // Konsonant
            }
        }

        // 4. char[] zurück in String
        return String.valueOf(bsprache);
    }

    // Hilfsmethode zur Vokalerkennung
    public static boolean istVokal(char c) {
        c = Character.toLowerCase(c);
        return (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u');
    }
}
