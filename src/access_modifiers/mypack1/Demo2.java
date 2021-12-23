package access_modifiers.mypack1;

public class Demo2 {
    Demo1 d = new Demo1();

    public void show() {
        System.out.println("a --> "+d.a);
//        System.out.println("b --> "+d.b); // PRIVATE MEMBER NOT ACCESSIBLE
        System.out.println("c --> "+d.c);
        System.out.println("d --> "+d.d);
    }
}
