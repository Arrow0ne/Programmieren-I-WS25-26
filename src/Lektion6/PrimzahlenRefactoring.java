package Lektion6;

import java.util.Scanner;

public class PrimzahlenRefactoring {

    public static boolean Primzahl(int a) {
        boolean istPrim = true;

        for (int i = 2; i < (a / 2); i++) {
            if (a % i == 0) {
                istPrim = false;
                break;
            }
        }
        if (istPrim) {
            return istPrim = true;
        } else {
            return istPrim = false;
        }
    }

    public static void main(String[] args){
        System.out.println("Bitte gebe eine Zahl ein: ");
        Scanner sc = new Scanner(System.in);
        System.out.println(Primzahl(sc.nextInt()));
    }
}
