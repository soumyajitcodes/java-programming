package Methods;

public class Recursion {
    static void fun(int n) {
        if (n>0) {
            System.out.print(n+" ");
            fun(n-1);
        }
    }

    public static void main(String[] args) {
        fun(5);
    }
}
