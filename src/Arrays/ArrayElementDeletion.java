package Arrays;

import java.util.Scanner;

public class ArrayElementDeletion {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int array[] = new int[10];

        for (int i=0; i<array.length; i++) {
            System.out.println("Enter element "+(i+1)+" : ");
            array[i] = scanner.nextInt();
        }
        System.out.println("Enter the element you want to delete");
        int ele = scanner.nextInt();
        scanner.close();

        System.out.println("Array after element insertion : ");
        for (int X:array) {
            System.out.print(X+" ");
        }
        System.out.println();

        for (int i =0; i< array.length; i++)
        {
            if (array[i] == ele) {
                array[i] = 0;
            }
        }

        System.out.println("Array after element deletion : ");
        for (int X:array) {
            System.out.print(X+" ");
        }
        System.out.println();

    }
}
