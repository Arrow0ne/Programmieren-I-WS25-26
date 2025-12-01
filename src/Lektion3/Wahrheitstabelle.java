package Lektion3;/*import java.util.Scanner;

public class Wahrheitstabelle {
    public static void main(String[] args) {
        System.out.println("Bitte gebe hier den Fall ein(ff, ft ,tf ,tt :");
        Scanner sc = new Scanner(System.in);
        String Zeichen = sc.nextLine();
        if (Zeichen.length() != 2) {
            System.out.println("Ungülige Angaben");
            return;
        }

        boolean gueltig = true;

        char Zeichen1 = Zeichen.charAt(0);
        char Zeichen2 = Zeichen.charAt(1);

        if (Zeichen1 != 'f' && Zeichen1 != 't' || Zeichen2 != 'f' && Zeichen2 != 't') {
            gueltig = false;
        }

        //false-false
        if (Zeichen1 == 'f' && Zeichen2 == 'f') {
            System.out.println("0");
        }

        //false-true
        if (Zeichen1 == 'f' && Zeichen2 == 't') {
            System.out.println("1");
        }

        //true-false
        if (Zeichen1 == 't' && Zeichen2 == 'f') {
            System.out.println("2");
        }
        //true-true
        if (Zeichen1 == 't' && Zeichen2 == 't') {
            System.out.println("3");
        }

        if(!gueltig){
            System.out.println("Ungültige Angaben");
        }
    }
} */ //Oben war meine erste Lösung unten verbesserte und verkürzte
import java.util.Scanner;

public class Wahrheitstabelle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Bitte gebe hier den Fall ein (ff, ft, tf, tt): ");
        String eingabe = sc.nextLine();

        if (eingabe.length() != 2) {
            System.out.println("Ungültige Eingabe (Länge muss 2 sein)");
            return;
        }

        char a = eingabe.charAt(0);
        char b = eingabe.charAt(1);

        // prüfen ob beide Zeichen entweder f oder t sind
        if ((a != 'f' && a != 't') || (b != 'f' && b != 't')) {
            System.out.println("Ungültige Eingabe (nur 'f' oder 't' erlaubt)");
            return;
        }

        // Jetzt ist die Eingabe gültig → direkt entscheiden
        if (a == 'f' && b == 'f') System.out.println("0");
        else if (a == 'f' && b == 't') System.out.println("1");
        else if (a == 't' && b == 'f') System.out.println("2");
        else System.out.println("3"); // letzter möglicher Fall: tt
        sc.close();
    }
}
