package Lektion8;

public class ArgumentenuebergabeBeiProgrammstart {

    public static void main(String[] args) {
        if (args.length > 2) {
            System.out.println("Es sind zu viele Parameter übergeben worden! Maximal 2!");
        } else {
            int a = Integer.parseInt(args[0]);
            int b = Integer.parseInt(args[1]);
            System.out.println(args[0]);
            System.out.println(args[1]);
            System.out.println(a * b);
        }
    }
}
