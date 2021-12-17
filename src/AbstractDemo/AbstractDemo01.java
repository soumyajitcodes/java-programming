package AbstractDemo;

abstract class SuperClass {
    public void display() {
        System.out.println("SuperClass Display");
    }

    public abstract void method();
}

class SubClass extends SuperClass {
    public void display() {
        System.out.println("SubClass Display");
    }

    public void method() {
        System.out.println("Abstract Method Overridden");
    }
}

public class AbstractDemo01 {
    public static void main(String[] args) {
        SuperClass s1 = new SubClass();
        s1.display();
        s1.method();
        System.out.println();

        SubClass s2 = new SubClass();
        s2.display();
        s1.method();
        System.out.println();
    }
}
