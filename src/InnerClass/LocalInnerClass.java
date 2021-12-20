package InnerClass;

class Outer02 {
    void outerDisplay() {
        class Inner {
            void innerDisplay() {
                System.out.println("Hello");
            }
        }
        Inner i = new Inner();
        i.innerDisplay();
    }
}

public class LocalInnerClass {
    public static void main(String[] args) {
        Outer02 o = new Outer02();
        o.outerDisplay();
    }
}
