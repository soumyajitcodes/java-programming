package static_final;

class finalMethodsSuper {
    final void method1() {
        System.out.println("Hello");
    }

    void method2() {
        System.out.println("Hi");
    }
}

class finalMethodsSub extends finalMethodsSuper{
//    void method1() { // not allowed
//        System.out.println("Hi");
//    }

    void method2() {
        System.out.println("Hiii");
    }
}

public class finalMethods {
    public static void main(String[] args) {
        finalMethodsSub fs = new finalMethodsSub();
        fs.method1();
        fs.method2();
    }
}
