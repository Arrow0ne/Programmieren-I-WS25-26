package Lektion11.Nachrichtenticker;

public class Nachrichtenticker {

    private char[] nachricht;

    public Nachrichtenticker(int groesse) {
        if (groesse < 0) {
            groesse = 200;
        }

        nachricht = new char[groesse];

        for (int i = 0; i < nachricht.length; i++) {
            nachricht[i] = ' ';
        }
    }

    public int getGroesse() {
        return nachricht.length;
    }

    public void setNachricht(char[] message) {
        for (int i = 0; i < nachricht.length; i++) {
            if (i >= message.length) {
                nachricht[i] = '+';
            } else {
                nachricht[i] = message[i];
            }
        }
    }

    public char[] getNachricht() {
        char[] copy = new char[nachricht.length];

        for (int i = 0; i < nachricht.length; i++) {
            copy[i] = nachricht[i];
        }
        return copy;
    }

    public void resetNachricht(char zeichen) {
        for (int i = 0; i < nachricht.length; i++) {
            nachricht[i] = zeichen;
        }
    }

    public void resetNachricht() {
        for (int i = 0; i < nachricht.length; i++) {
            nachricht[i] = '+';
        }
    }

    public char[] rotateNachricht(int distance) {
        char[] rotierteNachricht = new char[nachricht.length];

        if (distance <= 0 || distance >= nachricht.length) {
            return nachricht;
        } else {
            for(int i = distance; i < nachricht.length; i++){
                rotierteNachricht[i - distance] = nachricht[i];
            }
            for(int i = 0; i < distance; i++){
                rotierteNachricht[rotierteNachricht.length - distance + i] = nachricht[i];
            }
        }
        nachricht = rotierteNachricht;
        return rotierteNachricht;
    }
}
