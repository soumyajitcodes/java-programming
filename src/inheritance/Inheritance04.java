package inheritance;

class parent01 {
    parent01() {
        System.out.println("NO PARAM parent01");
    }
    parent01(int x) {
        System.out.println("PARAM parent01 "+x);
    }
}

class child01 extends parent01 {
    child01() {
        System.out.println("NO PARAM child01");
    }
    child01(int y) {
        System.out.println("PARAM child01"+y);
    }
    child01 (int x, int y) {
        super(x);
        System.out.println("2 PARAM child01"+y);
    }
}

public class Inheritance04 {
    public static void main(String[] args) {
        child01 c1 = new child01();
        System.out.println();

        child01 c2 = new child01(10);
        System.out.println();

        child01 c3 = new child01(5, 10);
        System.out.println();
    }
}
