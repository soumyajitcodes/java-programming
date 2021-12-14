package Methods;

public class MethodDemo {
    static int max (int a, int b) {
        if (a>b)
            return a;
        else
            return b;
    }

    public static void main(String[] args) {
        int X = 10;
        int Y = 20;
        System.out.println(max(X, Y));

        MethodDemo md = new MethodDemo();
        System.out.println(md.max(X, Y));
    }
}
