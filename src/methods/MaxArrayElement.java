package methods;

public class MaxArrayElement {

    static int maxElement(int A[]) {
        int max = A[0];
        for (int X:A) {
            if (X>max) {
                max=X;
            }
        }

        return max;
    }

    public static void main(String[] args) {
        int ARRAY[] = {10, 50, 2, 500, 40, 100, 589, 569};
        System.out.println(maxElement(ARRAY));
    }
}
