package Lektion3;

import java.util.Scanner;

public class Pizzarechner {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Bitte gebe hier den Durchmesser in cm für die 1.Pizza ein: ");
        int durchmesserp1 = scanner.nextInt();
        System.out.println("Bitte gebe hier den Preis in Euro für die 1.Pizza ein: ");
        int preisp1 = scanner.nextInt();
        System.out.print("Bitte gebe hier den Durchmesser für die 2.Pizza ein: ");
        int durchmesserp2 = scanner.nextInt();
        System.out.println("Bitte gebe hier den Preis für die 2.Pizza ein: ");
        int preisp2 = scanner.nextInt();

        double FlaechePizza1 = (((Math.pow((durchmesserp1 / 2), 2)) * Math.PI));
        double FlaechePizza2 = (((Math.pow((durchmesserp2 / 2), 2)) * Math.PI));

        if ((preisp1 / FlaechePizza1) > (preisp2 / FlaechePizza2)) {
            System.out.println("Die 1.Pizza ist im Größen- / Preisverhältnis besser");
        } else {
            System.out.println("Die 2.Pizza ist im Größen- / Preisverhältnis besser");
        }
        scanner.close();
    }
}

