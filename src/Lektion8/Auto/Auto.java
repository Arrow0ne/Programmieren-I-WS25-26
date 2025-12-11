package Lektion8.Auto;

public class Auto {
    String Marke;
    int Hubraum;
    String Farbe;

    public Auto(String Marke, int Hubraum, String Farbe) {
        this.Marke = Marke;
        this.Farbe = Farbe;
        if (Hubraum <= 0) {
            this.Hubraum = 1600;
        }
    }

    public String getMarke() {
        return Marke;
    }

    public void setMarke(String Marke) {
        this.Marke = Marke;
    }

    public int getHubraum() {
        return Hubraum;
    }

    public void setHubraum(int Hubraum) {
        if (Hubraum > 0) {
            this.Hubraum = Hubraum;
        }
    }

    public String getFarbe() {
        return Farbe;
    }

    public void setFarbe(String Farbe) {
        this.Farbe = Farbe;
    }

    public void printDaten() {
        System.out.println("Marke: " + Marke);
        System.out.println("Hubraum: " + Hubraum + " ccm");
        System.out.println("Farbe: " + Farbe);
        System.out.println();
    }
}
