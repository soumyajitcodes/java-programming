package Loops;

import java.util.*;

public class factorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number : ");
        int num = sc.nextInt();
        int fact = 1;

        if (num == 0)
        {
            System.out.println("factorial = "+fact);
        }
        else if (num>0)
        {
            for (int i = 1; i<=num; i++)
            {
                fact = fact*i;
            }
            System.out.println(fact);
        }
        else
        {
            System.out.println("No factorial exists for negative number");
        }
    }
}
