package Lektion4;

//System.out.printf("%-10s %-5d %-10s%n", Fahrenheit, celsius
public class Temperaturtabelle {

    public static void main(String[] args) {

        System.out.printf("%-12s %-12s%n", "Fahrenheit", "Celsius");
        for(int i = 0; i <= 300; i++){
            float Celsius = (float) ((5.0/9.0) * (i - 32));
            System.out.printf("%-12d %-12.2f%n", i, Celsius);
        }
    }
}
