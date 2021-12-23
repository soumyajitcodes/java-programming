package static_final;

class staticTest {
    static int x = 10;
    int y = 20;

    void show() {
        System.out.println(x+" "+y);
    }

    static void display() {
        System.out.println(x);
    }
}

public class staticDemo {
    public static void main(String[] args) {
        staticTest t1 = new staticTest();
        t1.show();
        t1.x = 30;
        t1.y = 40;

        staticTest t2 = new staticTest();
        t2.show();
    }
}
