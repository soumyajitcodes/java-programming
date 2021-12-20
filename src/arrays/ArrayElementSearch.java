package arrays;

import java.util.Scanner;

public class ArrayElementSearch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int array[] = new int[5];

        for (int i=0; i<array.length; i++) {
            System.out.println("Enter element "+(i+1)+" : ");
            array[i] = scanner.nextInt();
        }
        System.out.println("Enter the element you want to search: ");
        int ele = scanner.nextInt();
        scanner.close();

        System.out.println("Array after element insertion : ");
        for (int X:array) {
            System.out.print(X+" ");
        }
        System.out.println();

        for (int i=0; i<array.length; i++) {
            if (array[i]==ele) {
                System.out.println("Element found at index of "+i);
            }
        }

//        System.out.println("Max : "+max);
    }
}
