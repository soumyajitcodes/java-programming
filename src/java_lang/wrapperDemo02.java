package java_lang;

public class wrapperDemo02 {
    public static void main(String[] args) {
        Integer i1 = 15;
        Integer i2 = i1;
        System.out.println(i1.equals(i2));

        Integer i3 = 15;
        System.out.println(i3.equals(i2));

        Integer i4 = Integer.valueOf("123");
        System.out.println(i4);

        Integer i5 = Integer.valueOf("1010", 2);
        System.out.println(i5);

        Integer i6 = Integer.valueOf("A7", 16);
        System.out.println(i6);

        Integer i7 = Integer.bitCount(10);
        System.out.println(i7);

        Integer i8 = Integer.decode("0xA7");
        System.out.println(i8);

        System.out.println(Integer.parseInt("123"));
        System.out.println(Integer.toBinaryString(10));

    }
}
