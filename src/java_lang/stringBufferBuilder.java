package java_lang;

public class stringBufferBuilder {
    public static void main(String[] args) {
        String s1 = "Hello";
        StringBuffer s2 = new StringBuffer("Hello");
        StringBuilder s3 = new StringBuilder("Hello");

        System.out.println(s1.length());
//        System.out.println(s1.());
        System.out.println(s2.length());
        System.out.println(s3.length());

        s1.concat("World");
        s2.append("World");
        s3.append("World");

        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);
    }
}
