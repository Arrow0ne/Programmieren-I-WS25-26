package Lektion9.Raum;

public class Raumbelegung {
    public static void main(String[] args) {
        Raum raum1 = new Raum("l.2.1", 200, false);
        Raum raum2 = new Raum("l.2.15", 250, false);

        raum1.druckeStatus();
        raum2.druckeStatus();

        raum1.belege();

        raum1.druckeStatus();
        raum2.druckeStatus();
    }
}
