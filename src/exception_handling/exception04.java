package exception_handling;

public class exception04 {
    public static void main(String[] args) {
        try {
            int arr[] = {10, 2, 0, 30, 40};
            int r;
            r = arr[0]/arr[2];
            System.out.println(r);
            System.out.println(arr[10]);
        }
        catch (ArithmeticException e) {
            System.out.println("Divison by zero not allowed");
        }
        catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Array Index out of Bounds Exception");
        }
        finally {
            System.out.println("This is from finaslly block");
        }
    }
}
