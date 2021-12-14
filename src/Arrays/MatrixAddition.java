package Arrays;

public class MatrixAddition {
    public static void main(String[] args) {
        int matrixA[][] = {
                {3, 5, 9},
                {7, 6, 2},
                {4, 3, 5}
        };

        int matrixB[][] = {
                {1, 5, 2},
                {6, 8, 4},
                {3, 9, 7}
        };

        int matrixC[][] = new int[3][3];

        for (int i=0; i<3; i++) {
            for (int j=0; j<3; j++) {
                matrixC[i][j] = matrixA[i][j]+matrixB[i][j];
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
