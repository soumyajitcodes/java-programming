package loops;
import java.util.Scanner;

public class APSeries {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a, d, and n : ");
        int a = sc.nextInt();
        int d = sc.nextInt();
        int n = sc.nextInt();
        System.out.print(a+" ");
        for (int i = 0; i<n-1; i++)
        {
            a = a+d;
            System.out.print(a+" ");
        }
    }
}
