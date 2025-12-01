package Lektion3;

import java.util.Scanner;

public class Einzelzeichen {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Bitte ein einzelnes Zeichen eingeben: ");
        String line = scanner.nextLine();
        char c = line.charAt(0);

        boolean ZeichenPruefung = false;

        if (c >= 'A' && c <= 'Z') {
            System.out.println("Das Zeichen ist ein Großbuchstabe");
            ZeichenPruefung = true;
        }

        if (c >= '0' && c <= '9' || c >= 'a' && c <= 'f' || c >= 'A' && c <= 'F') {
            System.out.println("Das Zeichen ist eine hexadezimale Ziffer");
            ZeichenPruefung = true;
        }

        if (c >= '0' && c <= '1') {
            System.out.println("Das Zeichen ist eine binäre Ziffer");
            ZeichenPruefung = true;
        }

        if (c >= '0' && c <= '7'){
            System.out.println("Das Zeichen ist eine oktale Ziffer");
            ZeichenPruefung = true;
        }

        if (!ZeichenPruefung){
            System.out.println("Unbekannt");
        }

        scanner.close();
    }
}