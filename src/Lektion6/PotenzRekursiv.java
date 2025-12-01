package Lektion6;

public class PotenzRekursiv {
    public static int potenz(int x, int n) {
        int ergebnis = 1;
        for (int i = 1; i <= n; i++) {
            ergebnis = ergebnis * x;
        }
        return ergebnis;
    }

    public static void main(String[] args){
        System.out.println(potenz(5,2));
        System.out.println(potenz(10,2));
        System.out.println(potenz(5,5));
    }
}
