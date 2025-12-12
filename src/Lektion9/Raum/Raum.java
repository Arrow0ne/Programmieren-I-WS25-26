package Lektion9.Raum;

public class Raum {
    private String Raum;
    private int maxAnzahl;
    private boolean belegt;

    public Raum(String Raum, int maxAnzahl, boolean belegt) {
        this.Raum = Raum;
        this.maxAnzahl = maxAnzahl;
        this.belegt = belegt;
    }

    public void belege(){
        this.belegt = true;
    }
    public void gebeFrei(){
        this.belegt = false;
    }

    public void druckeStatus() {
        if (!belegt) {
            System.out.println("Der Raum " + Raum +
                    " ist nicht belegt und kann maximal " +
                    maxAnzahl + " Studenten haben.");
        } else {
            System.out.println("Der Raum " + Raum + " ist belegt.");
        }
    }
}
