package Lektion12.Binaerbaum;

import java.util.Scanner;

public class Main {

    static Scanner sc = new Scanner(System.in);
    static boolean beendet = false;
    static Baum baum = new Baum();

    public static void main(String[] args) {
        while (!beendet) {
            System.out.println("Einfuegen |----------| Suchen |----------| Woerterbuch |----------| Loeschen |----------| Beenden");
            System.out.println("Wählen sie eine Option durch Eingabe in Textform: ");
            String Eingabe = sc.nextLine();
            Menu(Eingabe);
        }
    }

    public static void Menu(String Eingabe) {
        //Einfuegen in das Wörterbuch
        switch (Eingabe) {
            case ("Einfuegen"):
                System.out.println("Bitte gebe das Wort ein das du einfügen willst.");
                String wtemp = sc.nextLine();
                System.out.println("Bitte gebe nun die Bedeutung von " + wtemp + " ein.");
                String btemp = sc.nextLine();
                Knoten ktemp = new Knoten(wtemp, btemp);
                baum.insert(ktemp);
                baum.print();
                System.out.println();
                break;
            case ("Suchen"):
                System.out.println("Bitte gebe das Wort ein das du suchst.");
                String suchTemp = sc.nextLine();
                System.out.print("Bedeutung: ");
                baum.search(suchTemp);
                System.out.println();
                break;
            case("Woerterbuch"):
                System.out.println("Derzeitiges Woerterbuch: ");
                baum.print();
                System.out.println();
                break;
            case("Loeschen"):
                System.out.println("Derzeitig noch nicht implementiert!");
                System.out.println();
                break;
            case ("Beenden"):
                System.out.println("Anwendung wird beendet.");
                beendet = true;
                System.out.println();
                break;
            default:
                System.out.println("Bitte geben sie es richtig geschrieben ein!");
                System.out.println();
        }
    }
}
