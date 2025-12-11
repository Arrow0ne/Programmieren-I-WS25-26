package Lektion8.Auto;

public class Auto {
    String Marke;
    int Hubraum;
    String Farbe;

    public Auto(String Marke, int Hubraum, String Farbe) {
        this.Marke = Marke;
        this.Hubraum = Hubraum;
        this.Farbe = Farbe;
    }

    public void printDaten(){
        System.out.println("Marke: " + Marke);
        System.out.println("Hubraum: " + Hubraum + " ccm");
        System.out.println("Farbe: " + Farbe);
        System.out.println();

    }

}
