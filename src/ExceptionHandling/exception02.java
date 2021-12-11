package ExceptionHandling;

public class exception02 {
    public static void main(String[] args) {
        try {
            int arr[] = {10, 2, 0, 30, 40};
            int r;
            r = arr[0]/arr[1];
            System.out.println(r);
            System.out.println(arr[10]);
        }
        catch (Exception e) {
            System.out.println(e);
        }
    }
}
