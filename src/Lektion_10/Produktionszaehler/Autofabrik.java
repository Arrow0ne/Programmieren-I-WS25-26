package Lektion_10.Produktionszaehler;
//non_static_loesung
public class Autofabrik {
    int zaehler = 0;

    public Auto produzieren(String marke, int hubraum, String farbe){
        zaehler++;
        return new Auto (marke, hubraum, farbe);
    }

    public static void main(String[] args){
        Autofabrik autofabrik = new Autofabrik();
        Auto meinAuto = autofabrik.produzieren("VW",2000,"blau");
        Auto meinAuto2 = autofabrik.produzieren("Audi",2300,"blau");
        Auto meinAuto3 = autofabrik.produzieren("BMW",2600,"blau");

        Auto anderesAuto = new Auto("Mercedes",2200,"blau"); //Auto wird nicht mitgezählt, ist schwarz gebaut
        System.out.println(autofabrik.zaehler);
    }
}
