package Loops;
import java.util.Scanner;

public class displayDigitsWords {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number : ");
        int num = sc.nextInt();

        while (num>0) {
            int digit = num%10;

            switch (digit)
            {
                case 0: System.out.print("zero"+" ");   break;
                case 1: System.out.print("one"+" ");   break;
                case 2: System.out.print("two"+" ");   break;
                case 3: System.out.print("three"+" ");   break;
                case 4: System.out.print("four"+" ");   break;
                case 5: System.out.print("five"+" ");   break;
                case 6: System.out.print("six"+" ");   break;
                case 7: System.out.print("seven"+" ");   break;
                case 8: System.out.print("eight"+" ");   break;
                case 9: System.out.print("nine"+" ");   break;
            }
            num = num/10;
        }
    }
}
