package Lektion6;

import java.util.Scanner;

public class Fakultaet {
    public static long fak(int a){
        long ergebnis = 1;
        int b = a + 1 - a;
        for(int i = 1; i <= a; i++)
        {
            ergebnis = b * ergebnis;
            b++;
        }
        return ergebnis;
    }

    public static void main(String[] args){
        System.out.println("Bitte gebe eine ganzzahlige Zahl ein: ");
        Scanner sc = new Scanner (System.in);
        System.out.println(fak(sc.nextInt()));
        sc.close();
    }
}
