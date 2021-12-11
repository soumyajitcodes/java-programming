package Loops;

import java.util.Scanner;

public class displayDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number : ");
        int num = sc.nextInt();

        while (num>0) {
            System.out.print("Digits are : "+num%10+" ");
            num = num/10;
        }
    }
}
