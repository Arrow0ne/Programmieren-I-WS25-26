package Lektion3;

import java.util.Scanner;

public class GültigeUhrzeit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Bitte gib hier eine Uhrzeit an (hh:mm:ss): ");
        String Uhrzeit = sc.next();
        if(Uhrzeit.length() !=8 || Uhrzeit.charAt(2) != ':' || Uhrzeit.charAt(5) != ':'){
            System.out.println("Ungültiges Format!");
            return;
        }
        String Stunden = Uhrzeit.substring(0, 2);
        String Minuten = Uhrzeit.substring(3, 5);
        String Sekunden = Uhrzeit.substring(6, 8);

        int stunden = Integer.parseInt(Stunden);
        int minuten = Integer.parseInt(Minuten);
        int sekunden = Integer.parseInt(Sekunden);

        boolean gültigeUhrzeit = true;

        if (stunden < 0 || stunden > 23) gültigeUhrzeit = false;
        if (minuten < 0 || minuten > 59) gültigeUhrzeit = false;
        if (sekunden < 0 || sekunden > 59) gültigeUhrzeit = false;

        if(!gültigeUhrzeit){
            System.out.println("Die angegeben Uhrzeit ist nicht gültig");
        }else{
            System.out.println("Die Uhrzeit ist gültig");
        }

    sc.close();
    }
}
