package Arrays;

public class Array1D {
    public static void main(String[] args) {

//        Decleration
        int A[] = new int[10];
        int B[] = {1, 2, 3, 4, 5};
        int C[];
        C = new int[10];
        int[] D = new int[10];

        B[2] = 15;

//        Accessing Array Elements
        for (int i=0; i<A.length; i++) {
            System.out.print(A[i]+" ");
        }
        System.out.println();

        for (int i=0; i<B.length; i++) {
            System.out.print(B[i]++ +" ");
        }
        System.out.println();

        for (int X:B) {
            System.out.print(X+" ");
        }
    }
}
