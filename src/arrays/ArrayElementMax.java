package arrays;

import java.util.Scanner;

public class ArrayElementMax {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int array[] = new int[5];
        int max = 0;

        for (int i=0; i<array.length; i++) {
            System.out.println("Enter element "+(i+1)+" : ");
            array[i] = scanner.nextInt();
        }
        scanner.close();

        System.out.println("Array after element insertion : ");
        for (int X:array) {
            System.out.print(X+" ");
        }
        System.out.println();

        for (int X:array) {
            if (X>max) {
                max = X;
            }
        }
        System.out.println("Max : "+max);
    }
}
