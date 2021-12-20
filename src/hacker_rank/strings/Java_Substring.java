package hacker_rank.strings;

import java.util.Scanner;

public class Java_Substring {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String data = scan.next();
        int start = scan.nextInt();
        int end = scan.nextInt();
        scan.close();
        System.out.println(data.substring(start, end));
    }
}
