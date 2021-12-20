package lambda_expressions;

interface MyLambda01 {
    public int add(int a, int b);
}

public class lambda02 {
    public static void main(String[] args) {
        MyLambda01 m = (a, b)->a+b;
        int r = m.add(10, 20);
        System.out.println(r);
    }
}
