package Arrays;

import java.util.Scanner;

public class ArrayElementsReverseCopy {
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
        int j = array2.length;

        for (int i=0; i<array1.length; i++) {
            array2[j-1] = array1[i];
            j -= 1;
        }


//        Printing the array
        System.out.print("Array 2 : ");
        for (int X:array2) {
            System.out.print(X+" ");
        }
        System.out.println();
    }
}
