package Lektion9.Pizza;

public class Lieblingspizzen {
    public static void main(String[] args){
        Pizza_Konstruktor[] pizzen = createPizzen();

        System.out.println("Pizza Preisleistungsrechner ");

        for (int i = 0; i<pizzen.length;i++){
            System.out.println(pizzen[i].Pizza + ": " + pizzen[i].besteKombination());
        }
    }

    public static Pizza_Konstruktor[] createPizzen(){
        Pizza_Konstruktor Kaese = new Pizza_Konstruktor(
                "Kaese",
                new int[]{20, 30},
                new float[]{8.50F, 12.90F}
        );

        Pizza_Konstruktor Salami = new Pizza_Konstruktor(
                "Salami",
                new int[]{25, 30},
                new float[]{9.90F, 13.34F}
        );

        Pizza_Konstruktor Margherita = new Pizza_Konstruktor(
                "Margherita",
                new int[]{20, 30},
                new float[]{10.20F, 14.80F}
        );

        Pizza_Konstruktor Diavola = new Pizza_Konstruktor(
                "Diavola",
                new int[]{24, 34},
                new float[]{11.90F, 16.40F}
        );

        Pizza_Konstruktor Thunfisch = new Pizza_Konstruktor(
                "Thunfisch",
                new int[]{18, 28},
                new float[]{8.10F, 12.30F}
        );

        return new Pizza_Konstruktor[]{Kaese, Salami, Margherita, Diavola, Thunfisch};
    }
}

