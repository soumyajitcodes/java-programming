package HackerRank.Introduction;

import java.util.Scanner;

public class Java_Loops_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();

        for (int i=1; i<=10; i++) {
            System.out.println(num+" x "+i+" = "+num*i);
        }
    }
}
