package Lektion_10.Weltuhr;

public class Lieblingsuhren {

    public static void main(String[] args){
        Uhr[] weltzeit = createUhren();

        System.out.println("Weltuhren:");

        for (int i = 0; i < weltzeit.length; i++){
            System.out.println(weltzeit[i].getStd() + ":" + weltzeit[i].getMin() + ":" + weltzeit[i].getSek());
        }
        System.out.println();

        System.out.println("Nach einer Sekunde:");
        for (int i = 0; i < weltzeit.length; i++) {
            weltzeit[i].naechsteSek();
            System.out.println(weltzeit[i].getStd() + ":" + weltzeit[i].getMin() + ":" + weltzeit[i].getSek());
        }
    }

    public static Uhr[] createUhren(){
        Uhr uhr1 = new Uhr(0,23,7);
        Uhr uhr2 = new Uhr(1,23,7);
        Uhr uhr3 = new Uhr(2,23,7);
        Uhr uhr4  = new Uhr(3, 23, 7);
        Uhr uhr5  = new Uhr(4, 23, 7);
        Uhr uhr6  = new Uhr(5, 23, 7);
        Uhr uhr7  = new Uhr(6, 23, 7);
        Uhr uhr8  = new Uhr(7, 23, 7);
        Uhr uhr9  = new Uhr(8, 23, 7);
        Uhr uhr10 = new Uhr(9, 23, 7);
        Uhr uhr11 = new Uhr(10, 23, 7);
        Uhr uhr12 = new Uhr(11, 23, 7);
        Uhr uhr13 = new Uhr(12, 23, 7);
        Uhr uhr14 = new Uhr(13, 23, 7);
        Uhr uhr15 = new Uhr(14, 23, 7);
        Uhr uhr16 = new Uhr(15, 23, 7);
        Uhr uhr17 = new Uhr(16, 23, 7);
        Uhr uhr18 = new Uhr(17, 23, 7);
        Uhr uhr19 = new Uhr(18, 23, 7);
        Uhr uhr20 = new Uhr(19, 23, 7);
        Uhr uhr21 = new Uhr(20, 23, 7);
        Uhr uhr22 = new Uhr(21, 23, 7);
        Uhr uhr23 = new Uhr(22, 23, 7);
        Uhr uhr24 = new Uhr(23, 23, 7);

        return new Uhr[]{uhr1, uhr2, uhr3, uhr4, uhr5, uhr6, uhr7, uhr8, uhr9, uhr10, uhr11, uhr12, uhr13, uhr14, uhr15, uhr16, uhr17, uhr18, uhr19, uhr20, uhr21, uhr22, uhr23, uhr24};
    }
}
