package arrays;



public class Array2D {
    public static void main(String[] args) {
        int A[][] = new int[5][5];
        int B[][] = {
                {1, 2, 3},
                {2, 3, 4},
                {3, 4, 5}
        };



        for (int i=0; i<A.length; i++) {
            for (int j=0; j<A[0].length; j++) {
                System.out.print(A[i][j]+" ");
            }
            System.out.println();
        }

        for (int X[]: B) {
            for (int Y:X) {
                System.out.print(Y+" ");
            }
            System.out.println();
        }
    }
}
