package java_lang;

public class objectDemo01 {
    public static void main(String[] args) {
        Object o1 = new Object();
        Object o2 = new Object();

        System.out.println("getClass()    --> "+o1.getClass());
        System.out.println("toString()    --> "+o1.toString());
        System.out.println("hashCode()    --> "+o1.hashCode());
        System.out.println("o1.equals(o2) --> "+o1.equals(o2));
        System.out.println("o1.equals(o1) --> "+o1.equals(o1));
    }
}
