import java.util.*;

class MatrixMultiplication {
    public static void main(String[] args) {
        int rows1 = 2, cols1 = 3;
        int rows2 = 3, cols2 = 2;

        int[][] a = {
            {1, 2, 3},
            {4, 5, 6}
        };

        int[][] b = {
            {7, 8},
            {9, 10},
            {11, 12}
        };

        if (cols1 != rows2) {
            System.out.println("Matrix multiplication not possible");
            return;
        }

        int[][] product = new int[rows1][cols2];

        for (int i = 0; i < rows1; i++) {
            for (int j = 0; j < cols2; j++) {
                for (int k = 0; k < cols1; k++) {
                    product[i][j] += a[i][k] * b[k][j];
                }
            }
        }

        System.out.println("Product of matrices:");
        for (int i = 0; i < rows1; i++) {
            for (int j = 0; j < cols2; j++) {
                System.out.print(product[i][j] + " ");
            }
            System.out.println();
        }
    }
}
