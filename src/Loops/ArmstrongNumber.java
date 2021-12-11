package Loops;

import java.util.Scanner;

public class ArmstrongNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number : ");

        int num1 = sc.nextInt();
        String str = String.valueOf(num1);
        int num2 = num1;
        int sum = 0;

        while (num1!=0)
        {
            sum += Math.pow((num1%10), str.length());
            num1 = num1/10;
        }

        if (num2 == sum)
        {
            System.out.println("Armstrong Number");
        }
        else
        {
            System.out.println("Not an Armstrong Number");
        }
    }
}
