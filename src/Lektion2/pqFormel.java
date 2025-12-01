package Lektion2;

public class pqFormel {
    public static void main(String[] args){

    double p;
    double q;
    p = 5;
    q = 5;
    double x1;
    double x2;

    x1 = (-p/2) + (Math.sqrt((Math.pow((p/2), 2) - q)));
    x2 = (-p/2) - (Math.sqrt((Math.pow((p/2), 2) - q)));

    System.out.println((Math.round(x1 * 100.0) / 100.0) + " " + Math.round(x2 * 100.0) / 100.0);

}
}
