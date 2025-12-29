package Lektion11;

import java.util.Scanner;

public class TageImMonat {
    public static int tageImMonat(String monat) {
        {
            int tage = switch (monat) {
                case "Februar" -> 28;
                case "April", "Juni", "September", "November" -> 30;
                case "Januar", "März", "Mai", "Juli", "August", "Oktober",
                     "Dezember" -> 31;
                default -> throw new RuntimeException("falscher Monatsname");
            };
            return tage;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean fehlerGefunden = false;
        do{
            try{
                System.out.println("Bitte gebe einen gültigen Monat an: ");
                String Eingabe = scanner.nextLine();
                tageImMonat(Eingabe);
                fehlerGefunden = false;
                System.out.println(tageImMonat(Eingabe));
            }
            catch (RuntimeException e){
                System.out.println("Fehler beim Einlesen des Monats!");
                fehlerGefunden = true;
            }
        }while(fehlerGefunden);
        scanner.close();
    }
}
