package loops;

import java.util.Scanner;

public class digitsCounter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number : ");
        int num = sc.nextInt();
        int counter = 0;

        while (num>0) {
            counter += 1;
            num = num/10;
        }
        System.out.println(counter);
    }
}
