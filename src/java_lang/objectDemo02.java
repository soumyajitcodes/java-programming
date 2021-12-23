package java_lang;

class MyObject {
    public String toString() {
        return "Hello from MyObject";
    }

    public int hashCode() {
        return 100;
    }

    public boolean equals(Object o) {
        return this.hashCode() == o.hashCode();
    }
}

public class objectDemo02 {
    public static void main(String[] args) {
        MyObject o1 = new MyObject();
        MyObject o2 = new MyObject();

        System.out.println("getClass()    --> "+o1.getClass());
        System.out.println("toString()    --> "+o1.toString());
        System.out.println("hashCode()    --> "+o1.hashCode());
        System.out.println("o1.equals(o2) --> "+o1.equals(o2));
        System.out.println("o1.equals(o1) --> "+o1.equals(o1));
    }
}
