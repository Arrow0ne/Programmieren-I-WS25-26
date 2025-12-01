package Lektion2;

public class Kreis_und_Kugel {
        public static void main(String[] args)
        {
            double r;
            r = 10;
            double Kreisflaeche = Math.PI * Math.pow(r, 2);
            double Kreisumfang = (2 * Math.PI * r);

            System.out.println(Math.round(Kreisflaeche * 100.0) / 100.0);
            System.out.println(Math.round(Kreisumfang * 100.0) / 100.0);

            double Kugelvolumen= ((4/3) * Math.PI * Math.pow(r, 3));

            System.out.println(Math.round(Kugelvolumen * 100.0) / 100.0);
        }
    }
