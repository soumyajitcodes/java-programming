package Inheritance;

class SuperClass {
    public void display() {
        System.out.println("SuperClass Display");
    }
}

class SubClass {
    public void display() {
        System.out.println("SubClass Display");
    }
}

public class MethodOverriding01 {
    public static void main(String[] args) {
        SuperClass s1 = new SuperClass();
        s1.display();
        System.out.println();

        SubClass s2 = new SubClass();
        s2.display();
        System.out.println();
    }
}
