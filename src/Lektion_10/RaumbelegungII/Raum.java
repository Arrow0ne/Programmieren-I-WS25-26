package Lektion_10.RaumbelegungII;

public class Raum {
    private String Raum;
    private int maxAnzahl;
    private boolean belegt;
    private int[] Studenten;

    public Raum(String Raum, int maxAnzahl, boolean belegt, int[] Studenten) {
        this.Raum = Raum;
        this.maxAnzahl = maxAnzahl;
        this.belegt = belegt;
        this.Studenten = Studenten;
    }


    public void betreteRaum(){

    }

    public void verlasseRaum(){

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
