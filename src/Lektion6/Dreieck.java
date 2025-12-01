package Lektion6;

public class Dreieck {
    public static void sterne(int n) {
        for (int i = 1; i <= n; i++) {
            for (int k = 1; k <= (n - i); k++) {
                System.out.print(" ");
            }
                for (int j = 1; j <= i; j++) {
                    System.out.print("* ");
                }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        sterne(15);
    }
}
