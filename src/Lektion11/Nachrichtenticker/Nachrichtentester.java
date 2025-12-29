package Lektion11.Nachrichtenticker;

public class Nachrichtentester {

    public static void main(String[] args){

        Nachrichtenticker ticker = new Nachrichtenticker(45);

        char[] text = "Wettervorhersage: Schnee in Wuerzburg".toCharArray();
        ticker.setNachricht(text);

        System.out.println(String.valueOf(ticker.getNachricht()));

        // Rotation um 14 Stellen
        ticker.rotateNachricht(14);

        System.out.println(String.valueOf(ticker.getNachricht()));
    }
}
