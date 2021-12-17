package Inheritance;

class Super {
    void meth1() {
        System.out.println("Super Meth1");
    }

    void meth2() {
        System.out.println("Super Meth2");
    }
}

class Sub extends Super {
    void meth2() {
        System.out.println("Sub Meth2");
    }

    void meth3() {
        System.out.println("Sub Meth3");
    }
}

public class DynamicMethodDispatch {
    public static void main(String[] args) {
        Super s = new Sub();
        s.meth1();
        s.meth2();
//        s.meth3();
    }
}
