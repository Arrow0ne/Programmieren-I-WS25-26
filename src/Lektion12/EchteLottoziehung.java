package Lektion12;

import java.util.Random;

public class EchteLottoziehung {
    String zahl;
    EchteLottoziehung next;

    public EchteLottoziehung(String zahl) {
        this.zahl = zahl;
        this.next = null;
    }

    public String getZahl() {
        return zahl;
    }

    public static void main(String[] args) {

        Random rand = new Random();

        EchteLottoziehung start = null;

        int count = 0;
        while (count < 6) {
            int hilfzahl = rand.nextInt(49) + 1;

            if (!enthaelt(start, hilfzahl)) {
                start = einfuegenSortiert(start, hilfzahl);
                count++;
            }
        }
        ausgabe(start);
    }

    public static boolean enthaelt(EchteLottoziehung start, int zahl) {
        EchteLottoziehung temp = start;
        while (temp != null) {
            if (temp.zahl.equals(String.valueOf(zahl))) {
                return true;
            }
            temp = temp.next;
        }
        return false;
    }

    public static void ausgabe(EchteLottoziehung start) {
        EchteLottoziehung temp = start;
        while (temp != null) {
            System.out.print(temp.getZahl() + " ");
            temp = temp.next;
        }
    }

    public static EchteLottoziehung einfuegenSortiert(EchteLottoziehung start, int zahl) {

        EchteLottoziehung neu = new EchteLottoziehung(String.valueOf(zahl));

        // FALL 1: Liste leer ODER neuer Anfang
        if (start == null || Integer.parseInt(neu.getZahl()) < Integer.parseInt(start.getZahl())) {

            neu.next = start;
            return neu;          // ← GANZ WICHTIG
        }

        // FALL 2: Mitte oder Ende
        EchteLottoziehung temp = start;

        while (temp.next != null &&
                Integer.parseInt(temp.next.getZahl()) < Integer.parseInt(neu.getZahl())) {

            temp = temp.next;
        }

        // Einfügen NACH temp
        neu.next = temp.next;
        temp.next = neu;

        return start;
    }
}
