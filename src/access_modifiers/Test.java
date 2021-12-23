package access_modifiers;
import access_modifiers.mypack1.Demo1;
import access_modifiers.mypack1.Demo2;
import access_modifiers.mypack1.Demo3;

public class Test {
    public static void main(String[] args) {
        Demo1 d1 = new Demo1();
        d1.display();
//        System.out.println(d1.a+d1.b+d1.c+d1.d);
        Demo2 d2 = new Demo2();
        d2.show();

        Demo3 d3 = new Demo3();
        d3.display();
    }
}
