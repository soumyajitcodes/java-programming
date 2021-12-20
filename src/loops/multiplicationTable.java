package loops;
import java.util.*;

public class multiplicationTable {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // Multiplication table
        System.out.println("Enter a number : ");
        int n = scan.nextInt();

        for (int i=1; i<=10; i++) {
            System.out.println(n+" x "+i+" = "+n*i);
        }
    }
}
