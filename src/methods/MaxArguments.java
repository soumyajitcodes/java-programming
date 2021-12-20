package methods;

public class MaxArguments {
    static int max(int ...A) {
        if (A.length == 0) {
            return Integer.MIN_VALUE;
        }
        else if (A.length == 1) {
            return A[0];
        }
        else {
            int max=A[0];
            for (int X:A) {
                if (X>max) {
                    max = X;
                }
            }
            return max;
        }
    }

    public static void main(String[] args) {
        System.out.println(max(10));
        System.out.println(max(10, 20, 30, 40));
    }
}
