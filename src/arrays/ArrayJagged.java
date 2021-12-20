package arrays;

public class ArrayJagged {
    public static void main(String[] args) {
        int ARRAY[][] = new int[3][];

        ARRAY[0] = new int[3];
        ARRAY[1] = new int[5];
        ARRAY[2] = new int[7];

        for (int X[]:ARRAY) {
            for (int Y:X) {
                System.out.print(Y+" ");
            }
            System.out.println();
        }
    }
}
