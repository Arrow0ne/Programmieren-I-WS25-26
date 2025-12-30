package Lektion7;
import java.util.Random;

public class EuroStueck {
    public static void main(String[] args){

    Random rand = new Random();
    int hit = 0;
    double Wahrscheinlichkeit = 0;

    for(int i = 0; i < 10000; i++){
        boolean euro = rand.nextBoolean();

        int schublade = 0;
        if(euro){
           schublade = rand.nextInt(3);
        }

        if (schublade != 0 && schublade != 1){
            hit++;
        }
    }
    Wahrscheinlichkeit = ((double) hit / 10000) * 100;
    System.out.println("Wahrscheinlichkeit das es in der dritten Schublade liegt: " + Wahrscheinlichkeit + "%");
    }
}
