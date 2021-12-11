package HackerRank.Introduction;

import java.util.Scanner;

public class Java_End_of_File {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int lineCounter = 0;

        while (sc.hasNext()) {
            lineCounter++;
            System.out.println(lineCounter+" "+sc.nextLine());
        }
    }
}
