package Lektion11;

public class Zeilenmaxima {

    public static double[] zeilenMaxima(double[][] matrix) {

        double[] maxWerte = new double[matrix.length];

        for (int i = 0; i < matrix.length; i++) {
            double max = matrix[i][0];

            for (int j = 1; j < matrix[i].length; j++) {
                if (matrix[i][j] > max) {
                    max = matrix[i][j];
                }
            }

            maxWerte[i] = max;
        }

        return maxWerte;
    }

    public static void main(String[] args) {

        double[][] matrix = {
                {-2.3, 0.555, 2324, -0.4502},
                {3123, 453453, -23546, 23245, 3435}
        };

        double[] ergebnis = zeilenMaxima(matrix);

        for (int i = 0; i < ergebnis.length; i++) {
            System.out.println(ergebnis[i]);
        }
    }
}

