package exception_handling;

class NegativeDimensionException extends Exception {
    public String toString() {
        return "Dimensions of Rectangle cannot be negative";
    }
}

public class exception09 {
    static int area(int l, int b) throws Exception {
        if (l<=0 || b<=0) {
            throw new NegativeDimensionException();
        }
        return l*b;
    }

    static void function1() throws Exception {
        System.out.println(area(10, 0));
    }

    static void function2() throws Exception {
        function1();
    }

    static void function3() throws Exception {
        function2();
    }

    public static void main(String[] args) throws Exception {
        try {
            function3();
        }
        catch (NegativeDimensionException e) {
            System.out.println(e);
        }
    }

}
