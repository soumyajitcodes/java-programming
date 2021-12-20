package arrays;

public class MatrixMultiplication {
    public static void main(String[] args) {
        int matrixA[][] = {
                {3, 5, 9},
                {7, 6, 2},
                {4, 3, 5}
        };

        int matrixB[][] = {
                {1, 0, 0},
                {0, 1, 0},
                {0, 0, 1}
        };

        int matrixC[][] = new int[3][3];

        for (int i=0; i<3; i++) {
            for (int j=0; j<3; j++) {
                matrixC[i][j] = 0;
                for (int k=0; k<3; k++) {
                    matrixC[i][j] += matrixA[i][k]*matrixB[k][j];
                }
            }
        }

//        Printing
        for (int X[]:matrixC) {
            for (int Y:X) {
                System.out.format("%02d ", Y);
            }
            System.out.println();
        }
    }
}
