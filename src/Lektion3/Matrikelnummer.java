package Lektion3;

import java.util.Scanner;

public class Matrikelnummer {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Bitte geben sie hier ihre Matrikelnummer ein: ");
        String Matrikelnummer = scanner.next();
        if (Matrikelnummer.length() != 7) {
            System.out.println("Matrikelnummer muss genau 7 Ziffern haben.");
            return;
        }
        String c = Matrikelnummer.substring(0, 2);

        int a = Integer.parseInt(c);
        boolean richtigeMat = false;

        if (a == 50 || a == 51 || a == 61){
            System.out.println("Ist ein Student im Studiengang " + c);
            richtigeMat = true;
        }

        if (!richtigeMat){
           System.out.println("Ist in keinem Studiengang oder keien wahre Matrikelnummer");
        }

        scanner.close();
    }

}