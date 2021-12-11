package ExceptionHandling;

public class exception01 {
    public static void main(String[] args) {
        try {
            int a = 10;
            int b = 0;
            int c = a/b;

            System.out.println("Answer is "+c);
        }
        catch (ArithmeticException e)
        {
            System.out.println("Divison by zero not allowed");
        }

        System.out.println("bye");
    }
}
