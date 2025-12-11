package Lektion9.Raum;

public class Raum {
    String Raum;
    int maxAnzahl;
    int[] Belegung;

    public int getMax() {
        return maxAnzahl;
    }

    public Raum(String Raum, int maxAnzahl) {
        this.Raum = Raum;
        this.maxAnzahl = maxAnzahl;
    }
}
