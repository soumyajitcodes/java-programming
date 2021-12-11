package Loops;
import java.util.Scanner;

public class PalindromeNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number : ");
        int num = sc.nextInt();
        int temp = num;
        int revnum = 0;

        while(num!=0)
        {
            revnum = (revnum*10)+(num%10);
            num = num/10;
        }
        if (revnum==temp)
        {
            System.out.println("Palindrome");
        }
        else
        {
            System.out.println("not palindrome");
        }
    }
}
