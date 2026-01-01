package Lektion12.DoppelteVerketteteListe;

public class PersonenknotenTest {
    public static void main(String[] args) {
        Liste liste = new Liste();

        Personenknoten p1 = new Personenknoten(20, "Meier");
        Personenknoten p2 = new Personenknoten(17, "Walther");
        Personenknoten p3 = new Personenknoten(13, "Freilich");
        Personenknoten p4 = new Personenknoten(24, "Meier");
        Personenknoten p5 = new Personenknoten(60, "Feger");

        liste.sortiertEinfuegen(p1);
        liste.sortiertEinfuegen(p2);
        liste.sortiertEinfuegen(p3);
        liste.sortiertEinfuegen(p4);
        liste.sortiertEinfuegen(p5);

        System.out.println("Vorwärts: ");
        liste.ausgebenVorwaerts();
        System.out.println("Rückwärts: ");
        liste.ausgebenRueckwaerts();

        Personenknoten p = liste.sucheNachNachnamen("Meier");
        if (p != null) {
            System.out.println("Gefunden: " + p.getNachname());
        } else {
            System.out.println("Den Nachnamen gibt es nicht in der Liste!");
        }
        Personenknoten k = liste.sucheNachNachnamen("Wacker");
        if (k != null) {
            System.out.println("Gefunden: " + k.getNachname());
        } else {
            System.out.println("Den Nachnamen gibt es nicht in der Liste!");
        }
    }
}