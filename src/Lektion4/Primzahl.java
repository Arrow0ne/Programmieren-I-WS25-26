package Lektion4;

    import java.util.Scanner;

    public class Primzahl {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.print("Bitte gib hier eine ganzzahlige Zahl ein: ");
            int Primzahl = sc.nextInt();
            boolean istPrim = true;

            for (int i = 2; i < (Primzahl / 2); i++) {
                if (Primzahl % i == 0) {
                    istPrim = false;
                    break;
                }
            }
            if (istPrim) {
                System.out.println("Die Zahl ist eine Primzahl.");
            }else {
                System.out.println("Die Zahl ist keine Primzahl.");
            }
            sc.close();
        }
    }
