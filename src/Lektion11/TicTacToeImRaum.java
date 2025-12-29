package Lektion11;

import java.util.Random;

public class TicTacToeImRaum {

    public static void main(String[] args) {

        boolean[][][] felder = new boolean[3][3][3];

        for (int x = 0; x < 3; x++) {
            for (int y = 0; y < 3; y++) {
                for (int z = 0; z < 3; z++) {
                    felder[x][y][z] = Math.random() < 0.5;
                }
            }
        }

        for (int z = 0; z < 3; z++) {
            System.out.println("Ebene " + z + ":");

            for (int y = 0; y < 3; y++) {
                for (int x = 0; x < 3; x++) {

                    if (felder[z][y][x]) {
                        System.out.print("x ");
                    } else {
                        System.out.print("o ");
                    }
                }
                System.out.println();
            }
            System.out.println();
        }
    }
}
