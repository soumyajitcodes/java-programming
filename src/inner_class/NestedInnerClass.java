package inner_class;

class Outer {
    int x = 20;

    class Inner {
        int y = 20;

        public void innerDisplay() {
            System.out.println(x+" "+y);
        }
    }

    public void outerDisplay() {
        Inner i = new Inner();
        i.innerDisplay();
    }
}

public class NestedInnerClass {
    public static void main(String[] args) {
        Outer o = new Outer();
        o.outerDisplay();
    }
}
