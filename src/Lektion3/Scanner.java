package Lektion3;

public class Scanner {

    public static void main(String[] args){
        java.util.Scanner scanner = new java.util.Scanner(System.in); //Objekt das in java die Standardeingabe (die eingabe vom Keyboard) repräsentiert
        // new Scanner belegt Speicherplatz für ein neues Objekt der Klasse Scanner und erstellt dieses
        // "scanner" ist eine objektreferenz die auf das Scanner-Objekt gespeichert wird

        System.out.print("Bitte gebe hier eine Zahl ein: ");
        int x = scanner.nextInt();
        System.out.print("Bitte geben Sie noch eine Zahl ein: ");
        int y = scanner.nextInt();
        System.out.print("Die Summe beider gennanten Zahlen ist: ");
        int summe = x + y;
        System.out.println (summe);

        float kapital; //Kommazahl deklarieren
        float zinssatz = 3.5f;
        float kapitalNachEinemJahr;
        System.out.println("Bitte geben Sie Ihr Grundkapital ein: ");
        kapital = scanner.nextFloat();
        kapitalNachEinemJahr = kapital * (1.0f+(zinssatz/100.0f));
        System.out.println("Verzinstes Kapital:" + kapitalNachEinemJahr);

        System.out.print("Bitte geben Sie Ihren Namen ein: ");
        String name = scanner.nextLine();
        System.out.println("Sie haben folgenden Namen eingegeben: " + name);

        String line = scanner.nextLine();
        char c = line.charAt(0);
        System.out.println(c);
        scanner.close();
    }
}
