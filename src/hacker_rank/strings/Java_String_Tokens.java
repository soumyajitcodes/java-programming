package hacker_rank.strings;

import java.io.*;
import java.util.*;
import java.util.stream.Collectors;

public class Java_String_Tokens {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();
        // Write your code here.
        scan.close();
        String splits[] = s.split("[!,?._'@ ]");
        splits = Arrays.asList(splits).stream().filter(str -> !str.isEmpty()).collect(Collectors.toList()).toArray(new String[0]);
        System.out.println(splits.length);
    }
}
