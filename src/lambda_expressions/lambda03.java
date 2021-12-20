package lambda_expressions;

interface MyLambda03 {
    public void display();
}

class useLambda {
    public void callLambda(MyLambda03 m1) {
        m1.display();
    }
}

class Demo {
    public void method() {
        useLambda u1 = new useLambda();
        u1.callLambda(()->{
            System.out.println("Hello");
        });
    }
}

public class lambda03 {
    public static void main(String[] args) {
        Demo d1 = new Demo();
        d1.method();
    }
}
