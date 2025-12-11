package Lektion8.Auto;

public class Lieblingsautos {
    public static void main(String[] args){
        Auto auto1 = new Auto("Porsche 911 GT3RS", 3996, "weiß");
        Auto auto2 = new Auto("Corvette C5", 5665, "schwarz");
        Auto auto3 = new Auto("Porsche 944", 2479, "rot");

        Auto groesstes = auto1;
        if (auto2.Hubraum > groesstes.Hubraum){
            groesstes = auto2;
        }
        if (auto3.Hubraum > groesstes.Hubraum){
            groesstes = auto3;
        }
        System.out.println("Den größten Hubraum hat: ");
        groesstes.printDaten();

    }
}
