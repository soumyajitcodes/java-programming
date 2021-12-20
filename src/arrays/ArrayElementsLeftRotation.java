package arrays;

import java.util.Scanner;

public class ArrayElementsLeftRotation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int array[] = new int[10];

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

//        Rotation starts here
        int tmp = array[0];

        for (int i = 1; i<array.length; i++) {
            array[i-1] = array[i];
        }
        array[array.length-1] = tmp;

//        Printing the array
        System.out.println("Array after element rotation : ");
        for (int X:array) {
            System.out.print(X+" ");
        }
        System.out.println();
    }
}
