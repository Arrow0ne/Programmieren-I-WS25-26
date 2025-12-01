package Lektion3;

import java.util.Scanner;

public class Schaltjahr {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Bitte schreibe ein Jahr: ");
        int schaltjahr = sc.nextInt();
        if ((schaltjahr % 4) == 0 && (schaltjahr % 100) != 0 || (schaltjahr % 400) == 0) {
            System.out.println("Das angegebene Jahr ist ein Schaltjahr");
        } else {
            System.out.println("Das angegebene Jahr ist kein Schaltjahr");
        }
        sc.close();
    }
}

