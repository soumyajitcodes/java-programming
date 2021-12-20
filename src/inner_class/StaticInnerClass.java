package inner_class;

class Outer04 {
    static int x=10;
    int y = 20;

    static class Inner {
        void display()
        {
            System.out.println(x);
//            System.out.println();
        }
    }
}

public class StaticInnerClass {
    public static void main(String[] args) {
        Outer04.Inner oi = new Outer04.Inner();
        oi.display();
    }
}
