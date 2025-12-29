package Lektion11;

public class UeberladenDerBetragsmethode {
    public static int betrag(int x) {
        if (x < 0) {
            return -x;
        }
        return x;
    }

    public static float betrag(float x) {
        if (x < 0) {
            return -x;
        }
        return x;
    }

    public static double betrag(double x) {
        if (x < 0) {
            return -x;
        }
        return x;
    }

    public static short betrag(short x) {
        if (x < 0) {
            return (short) -x;
        }
        return x;
    }

    public static long betrag(long x){
        if (x < 0){
            return -x;
        }
        return x;
    }

    public static void main(String[] args){
        System.out.println(betrag(-5));
        System.out.println(betrag(-10.5f));
        System.out.println(betrag(-7.843));
        System.out.println(betrag((short) -8));
        System.out.println(betrag(1000000L));
    }
}
