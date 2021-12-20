package methods;

public class SumArguments {
    static int max(int ...A) {
        if (A.length == 0) {
            return Integer.MIN_VALUE;
        }

        else {
            int sum=0;
            for (int X:A) {
                sum=sum+X;
                }
            return sum;
            }
    }

    public static void main(String[] args) {
        System.out.println(max());
        System.out.println(max(10));
        System.out.println(max(10, 20, 30, 40));
    }
}
