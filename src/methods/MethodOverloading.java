package methods;

public class MethodOverloading {

    static byte max(byte x, byte y) {
        return x>y?x:y;
    }

    static int max(int x, int y) {
        return x>y?x:y;
    }

    static float max(float x, float y) {
        return x>y?x:y;
    }

    static double max(double x, double y) {
        return x>y?x:y;
    }

    static int max(int x, int y, int z) {
        return x>y && x>z?x:(y>z && y>x)?y:z;
    }

    public static void main(String[] args) {
        System.out.println(max(10, 20));
        System.out.println(max(10.5f, 20.3f));
        System.out.println(max(10.0, 20.0));
        System.out.println(max(10, 20, 30));
    }
}
