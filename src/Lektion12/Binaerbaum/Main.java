package Lektion12.Binaerbaum;

import java.util.Scanner;

public class Main {

    static Scanner sc = new Scanner(System.in);
    static boolean beendet = false;
    static Baum baum = new Baum();

    public static void main(String[] args) {
        while (!beendet) {
            System.out.println("Einfuegen |----------| Suchen |----------| Beenden");
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
                break;
            case ("Suchen"):
                System.out.println("Bitte gebe das Wort ein das du suchst.");
                String suchTemp = sc.nextLine();
                System.out.print("Bedeutung: ");
                baum.search(suchTemp);
                break;
            case ("Beenden"):
                System.out.println("Anwendung wird beendet.");
                beendet = true;
                break;
            default:
                System.out.println("Bitte geben Sie entweder Einfuegen oder Suchen ein!");
        }
    }
}
