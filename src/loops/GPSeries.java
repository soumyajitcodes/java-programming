package loops;
import java.util.Scanner;

public class GPSeries {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a, cr, and n : ");
        int a = sc.nextInt();
        int cr = sc.nextInt();
        int n = sc.nextInt();

        for (int i = 0; i<n-1; i++)
        {
            System.out.print(a+" ");
            a = a*cr;
        }
    }
}
