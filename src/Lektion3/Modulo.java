package Lektion3;

import java.util.Scanner;

public class Modulo {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        //a)
        System.out.print("Bitte gebe hier eine ganzzahlige Zahl ein: ");
        int x = scanner.nextInt();
        if ((x % 7) == 0) {
            System.out.println(x + " ist durch 7 ganzzahlig teilbar.");
        } else {
            System.out.println(x + " ist nicht durch 7 ganzzahlig teilbar.");
        }
        scanner.close();
    }
}

/*b)
- modulo auf negative operanden: ändert sich nix solange man als Rest wert 0 raus kriegt
egal ob -21 / 7 oder 21 / 7 oder 21 / -7 kommt überall 0 als rest raus
- modulo funktioniert nur auf ganzzahlige Werte*/

