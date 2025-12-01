package Lektion2;

import java.time.LocalTime;

public class Uhrzeit {
    public static void main(String[] args){
        double Stunden;
        double Minuten;
        double Sekunden;
        LocalTime now = LocalTime.now();
        System.out.println("Jetzt: " + now);
        Stunden = now.getHour();
        Minuten = now.getMinute();
        Sekunden = now.getSecond();

        //Eine Stunde sind 60 min und 1 min sind 60 sek. Seit Mitternacht sind 16 Stunden
        // und 30 Minuten vergangen

        //a)
        double SekundenSeitMn = (16 * 3600) + (30 * 60);
        System.out.println(SekundenSeitMn + "Sekunden seit Mitternacht.");

        //b)
        double verbleibendeStunden = 23 - Stunden;
        double verbleibendeMinuten = 59 - Minuten;
        double verbleibendeSekunden = 60 - Sekunden;
        System.out.println("verbleibende Zeit: " + verbleibendeStunden + "h, "+ verbleibendeMinuten + "min, " + verbleibendeSekunden + "sek");
        double inSekunden = (verbleibendeStunden * 3600) + (verbleibendeMinuten * 60) + verbleibendeSekunden;
        System.out.println("verbleibende Zeit in Sekunden: " + inSekunden + "sek");

        //c)
        double vergangeneSekunden = (Stunden * 3600) + (Minuten * 60) + Sekunden;
        double prozentDesTages = (vergangeneSekunden / (24 * 3600)) * 100;
        System.out.println("So viel Prozent des Tages sind schon vergangen " + prozentDesTages + "%");

    }
}
