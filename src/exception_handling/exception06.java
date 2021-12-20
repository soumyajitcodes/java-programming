// Checked Exception

package exception_handling;
import java.io.*;

public class exception06 {

    static void fun1() {
        try {
            FileInputStream file = new FileInputStream("hello.txt");
//            System.out.println(10/0);
        }
        catch (Exception e) {
            System.out.println(e.getMessage());
//            System.out.println(e);
//            e.printStackTrace();
        }
    }

    static void fun2() {
        fun1();
    }

    static void fun3() {
        fun2();
    }

    public static void main(String[] args) {
        fun3();
    }
}
