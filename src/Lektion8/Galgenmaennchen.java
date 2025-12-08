package Lektion8;

import java.util.*;

public class Galgenmaennchen {

    public static void main(String[] args) {
        String[] words = {"PROGRAMMIEREN", "ENDE", "SPIELEN", "HAUS", "ALGORITHMEN", "ENTWICKLUNG", "INFORMATIK", "JAVA", "OBJEKTORIENTIERUNG", "KONSTRUKTOR", "VARIABLE", "SCHNITTSTELLE", "DATENTYP", "VERERBUNG", "POLYMORPHISMUS", "FUNKTION", "METHODE", "KLASSE", "ARRAY", "KOMPILIERUNG"};

        Random rand = new Random();
        String word = words[rand.nextInt(words.length)];
        word = word.toUpperCase();

        char[] guessed = new char[word.length()];
        for (int i = 0; i < guessed.length; i++) {
            guessed[i] = '_';
        }
        int versuche = 0;
        Scanner sc = new Scanner(System.in);

        while (versuche < 15) {
            versuche++;

            System.out.println(versuche + " Versuch: ");
            for (char c : guessed) {
                System.out.print(c);
            }
            System.out.println();

            System.out.println("Buchstaben eingeben: ");
            char eingabe = sc.next().toUpperCase().charAt(0);

            boolean gefunden = false;

            for (int i = 0; i < word.length(); i++) {
                if (word.charAt(i) == eingabe) {
                    guessed[i] = eingabe;
                    gefunden = true;
                }
            }
            if (!gefunden) {
                System.out.println("Buchstabe nicht enthalten.");
            }

            if (new String(guessed).equals(word)) {
                System.out.println("Du hast das Wort erraten: " + word);
                return;
            }
        }

        System.out.println("15 Versuche erreicht. Das Wort war: " + word);
    }

}

    /*  -1. liste erstellen
        -2. rdm wort aus liste holen
        -3. Unterstriche ausgeben für die anzahl der wortlänge
        - 4. gescannten buchstaben mit dem wort vergleichen wenn gleich dann jeweiliges buchstabe an stelle n von _ zu buchstaben
            ändern und versuch erhöhen
        - 5. zwischenergebnis ausgeben
        - 6. falls nicht dann derzeitiges zwischenergebnis ausgeben und versuch erhöhen, versuch nummer n ausgeben solange boolen false ist
        - 7. wenn es gleich ist mit dem buchstaben boolen true setzen und wenn boolen true ist dann ersetzen
        - 8. boolen nutzen wenn ganzes wort erraten wurde nach 15 versuchen
        - 9. 15 versuche überschritten -> "das waren 15 versuche du hast das wort nicht erraten"
        - 10. wort erraten -> boolean true und somit dann schreiben "Wort erraten!" "Das wort war " + word
     */
