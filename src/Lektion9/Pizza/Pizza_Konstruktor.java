package Lektion9.Pizza;

public class Pizza_Konstruktor {
    String Pizza;
    int[] Durchmesser;
    float[] Preis;

    public Pizza_Konstruktor(String Pizza, int[] Durchmesser,float[] Preis){
        this.Pizza = Pizza;
        this.Durchmesser = Durchmesser;
        this.Preis = Preis;
    }

    private float flaeche(int Durchmesser){
        return (float) (Math.PI * Math.pow(Durchmesser / 2.0 , 2));
    }
    private float preisLeistung(float Preis, int Durchmesser){
        return Preis / flaeche(Durchmesser);
    }

    public String besteKombination() { //Damit als String ausgabe möglich
        int besteKombi = 0;
        float beste = preisLeistung(Preis[0], Durchmesser[0]);

        for (int i = 1; i < Durchmesser.length; i++) {
            float aktuell = preisLeistung(Preis[i], Durchmesser[i]);
            if (aktuell < beste) {
                beste = aktuell;
                besteKombi = i;
            }
        }
        return Durchmesser[besteKombi] + " cm  für " + Preis[besteKombi] + " € (Preis/Leistung: " + String.format("%.5f", beste) + ")";
    }
}