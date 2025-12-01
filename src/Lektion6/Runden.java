package Lektion6;

public class Runden {

    public static double runden(double a) {

        String s = String.valueOf(a);

        int punkt = s.indexOf('.');
        String teil = s.substring(punkt + 1, punkt + 2);

        int nachkomma = Integer.parseInt(teil);
        int ganz = (int) a;

        if (nachkomma >= 5) {
            return ganz + 1;
        } else {
            return ganz;
        }
    }
    public static double rundeAufNachkommastellen(double a, int n) {

        String s = String.valueOf(a);

        int punkt = s.indexOf('.');
        if (n == 0) {
            return runden(a);
        }
        while (s.length() < punkt + 1 + n + 1) {
            s = s + "0";
        }
        char entscheidung = s.charAt(punkt + 1 + n);
        int rundZahl = entscheidung - '0';
        String behalten = s.substring(punkt + 1, punkt + 1 + n);
        int ganz = (int) a;
        if (rundZahl >= 5) {
            int behaltenInt = Integer.parseInt(behalten);
            behaltenInt++;

            if (behaltenInt >= Math.pow(10, n)) {
                ganz += 1;
                behaltenInt = 0;
            }
            return Double.parseDouble(ganz + "." + String.format("%0" + n + "d", behaltenInt));
        }
        return Double.parseDouble(ganz + "." + behalten);
    }
    public static void main(String[] args) {
        System.out.println(rundeAufNachkommastellen(3.14159, 2));  // 3.14
        System.out.println(rundeAufNachkommastellen(3.14159, 3));  // 3.142
        System.out.println(rundeAufNachkommastellen(9.9999, 2));   // 10.00
        System.out.println(rundeAufNachkommastellen(3.5, 0));      // 4  (deine alte Logik)
    }
}
