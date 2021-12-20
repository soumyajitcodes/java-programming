package lambda_expressions;

interface MyLambda {
    public void display();
}

public class lambda01 {
    public static void main(String[] args) {
        MyLambda m = ()-> {
            System.out.println("Hello Lambda");
        };
        m.display();
    }
}
