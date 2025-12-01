package Lektion5;

public class ReihenwertBerechnung {
    public static void main(String[] args) {
        int k = 1;
        double summe = 0;
        double summand;
        int schritte = 1;
        /*Die Glieder wären (1.0)6.0/k^1, (1.0)6.0/k^2, (1.0)6.0/k^3....
        Durch die 6 ist der Anfangswert schon höhrer statt 1.0 6.0 plus es werden mehr
        Schritte benötigt bis die Abbruchbedingung erreicht wird*/
        do {
            summand = (6.0 / (Math.pow(k, 2)));
            summe = summe + summand;
            k++;
            schritte++;
            System.out.println(summand);
        } while (summand > 1E-5);
        System.out.println(schritte);
    }
}
