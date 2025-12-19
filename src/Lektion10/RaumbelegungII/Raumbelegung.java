package Lektion10.RaumbelegungII;

public class Raumbelegung {

    public static void main(String[] args) {
        Raum raum1 = new Raum("i.2.18", 10, false);
        raum1.betreteRaum(new Student("John", 1234567));
        raum1.betreteRaum(new Student("Leo", 4567894));
        raum1.druckeStatus();
        raum1.verlasseRaum(new Student("John", 1234567));
        raum1.druckeStatus();
        raum1.betreteRaum(new Student("David", 4347894));
        raum1.betreteRaum(new Student("Alex", 45674564));
        raum1.betreteRaum(new Student("Manuel", 4274094));
        raum1.druckeStatus();
        raum1.clearRaum();
        raum1.druckeStatus();

    }
}
