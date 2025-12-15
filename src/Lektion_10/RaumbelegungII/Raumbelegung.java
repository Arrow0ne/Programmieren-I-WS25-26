package Lektion_10.RaumbelegungII;

public class Raumbelegung {

    public static void main(String[] args) {
        Raum raum1 = new Raum("i.2.18", 250, false);
        raum1.betreteRaum(new Student("John", 1234567));
        raum1.betreteRaum(new Student("Leo", 4567894));
        raum1.druckeStatus();
        raum1.verlasseRaum(new Student("John", 1234567));
        raum1.druckeStatus();
    }
}
