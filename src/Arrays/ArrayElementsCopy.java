package Arrays;

import java.util.Scanner;

public class ArrayElementsCopy {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int array1[] = new int[10];
        int array2[] = new int[10];

        for (int i=0; i<array1.length; i++) {
            System.out.println("Enter element "+(i+1)+" : ");
            array1[i] = scanner.nextInt();
        }
        scanner.close();

        System.out.print("Array 1 : ");
        for (int X:array1) {
            System.out.print(X+" ");
        }
        System.out.println();

        for (int i=0; i<array1.length; i++) {
            array2[i] = array1[i];
        }


//        Printing the array
        System.out.print("Array 2 : ");
        for (int X:array2) {
            System.out.print(X+" ");
        }
        System.out.println();
    }
}
