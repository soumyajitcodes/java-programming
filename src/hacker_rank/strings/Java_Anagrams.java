package hacker_rank.strings;

import java.util.Arrays;
import java.util.Locale;
import java.util.Scanner;

public class Java_Anagrams {
    public static boolean isAnagram(String a, String b) {
        char arrayA[] = (a.toLowerCase()).toCharArray();
        char arrayB[] = (b.toLowerCase()).toCharArray();

        java.util.Arrays.sort(arrayA);
        java.util.Arrays.sort(arrayB);
        return java.util.Arrays.equals(arrayA, arrayB);
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String a = scan.next();
        String b = scan.next();
        scan.close();
        boolean ret = isAnagram(a, b);
        System.out.println( (ret) ? "Anagrams" : "Not Anagrams" );
    }
}
