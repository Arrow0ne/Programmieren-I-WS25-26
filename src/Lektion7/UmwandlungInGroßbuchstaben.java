package Lektion7;

import java.util.Scanner;

public class UmwandlungInGroßbuchstaben {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Text eingeben: ");
        String Eingabe = sc.nextLine();
        char[] array = Eingabe.toCharArray();
        char[] result = inGrossbuchstaben(array);

        System.out.println("Die Umwandlung lautet: ");
        for (int i = 0; i < result.length; i++){
            System.out.print(result[i]);
        }
        System.out.println(" ");
    }

    public static char[] inGrossbuchstaben(char[] Arr){
        for (int i = 0; i < Arr.length; i++){
            Arr[i] = Character.toUpperCase(Arr[i]);
        }
        return Arr;
    }
}
