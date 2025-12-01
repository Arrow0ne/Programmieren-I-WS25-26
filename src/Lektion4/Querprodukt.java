package Lektion4;

import java.util.Date;
import java.util.Scanner;

public class Querprodukt {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean gueltig = false;
        while (!gueltig) {

            System.out.println(" Bitte gib eine Zahl ein: ");

            String Zahl = sc.nextLine();
            int Summe = 1;
            gueltig = true;
            for (int i = 0; i < Zahl.length(); i++) {
                char stelle = Zahl.charAt(i);
                int Ziffer = Character.getNumericValue(stelle);
                Summe *= Ziffer;
            }
            if (Summe < 1 || Summe > 1000000) {
                gueltig = false;
            }

            if (!gueltig) {
                System.out.print("Die Zahl ist ungueltig bitte gib eine neue Zahl ein.");
            } else {
                System.out.println("Das Querprodukt ist: " + Summe);
            }
        }
        sc.close();
    }
}