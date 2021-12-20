package methods;

public class ParameterPassing {
    static void add(int a) {
        a++;
        System.out.println(a);
    }

    public static void main(String[] args) {
        int X = 100;
        System.out.println("from function ");
        add(X);
        System.out.println("from local ");
        System.out.println(X);
    }
}
