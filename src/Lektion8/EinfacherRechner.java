package Lektion8;

public class EinfacherRechner {
    public static void main(String[] args) {

        double sum = 0;
        // wenn plus
        if (args[args.length - 1].equals("+")) {
            System.out.print("Es ist eine Addition und das Ergebnis lautet: ");
            for (int i = 0; i < args.length - 1; i++) {
                    sum += Double.parseDouble(args[i]);
            }
            System.out.print(sum);
        } else {
            double sub = Double.parseDouble(args[0]);
            if (args[args.length - 1].equals("-")) {
                System.out.print("Es ist eine Division und das Ergebnis lautet: ");
                for (int i = 1; i < args.length - 1; i++) {
                        sub -= Double.parseDouble(args[i]);
                }
                System.out.print(sub);
            }
        }
    }
}
/*  1. in schleife jedes i prüfen, alles in einem array speichern?
    2. jedes Element im Array durchgehen und bei plus summe machen und bei minus
        die erste Zahl minus die summe der restlichen
 */
