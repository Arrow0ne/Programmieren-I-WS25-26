package Lektion4;

import java.util.Scanner;

public class FreierFall {
    public static void main(String[] args) throws InterruptedException {
        Scanner sc = new Scanner(System.in);
        System.out.println("Bitte gib hier die Falldauer ein: ");
        int falltime = sc.nextInt();
        double g = 9.80665;
        for(int i = 0; i <= falltime ; i++){
            double s = Math.round(((1.0/2.0) * g * (Math.pow(i, 2))) * 100.0 / 100.0);
            System.out.println("Er ist " + s +  "m" + " gefallen in " + i + " Sekunden.");
            Thread.sleep(1000);
        }
        sc.close();
    }
}