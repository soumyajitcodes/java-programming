package InnerClass;

abstract class My {
    abstract void display();
}

class Outer03 {
    public void meth() {
        My m = new My() {
            @Override
            void display() {
                System.out.println("Hello");
            }
        };
        m.display();
    }
}

public class AnonymusInnerClass {
    public static void main(String[] args) {
        Outer03 o = new Outer03();
        o.meth();
    }
}
