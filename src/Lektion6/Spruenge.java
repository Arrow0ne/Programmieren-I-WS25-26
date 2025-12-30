package Lektion6;

public class Spruenge {

    public static int springeInMehrerenSpruengen(int distanz, int sprung1, int sprung2) {

        if (distanz == 0) {
            return 1;
        }

        if (distanz < 0) {
            return 0;
        }

        return springeInMehrerenSpruengen(distanz - sprung1, sprung1, sprung2)
                + springeInMehrerenSpruengen(distanz - sprung2, sprung1, sprung2);
    }


    public static void main(String[] args){
        System.out.println(springeInMehrerenSpruengen(4,1,2));
        System.out.println(springeInMehrerenSpruengen(5,2,3));
    }
}
