package Arrays;

import java.util.Scanner;

public class ArrayElementMax2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int array[] = new int[5];
        int max1 = array[0];
        int max2 = array[0];

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

        for(int i=0;i<array.length;i++)
        {
            if(array[i]>max1)
            {
                max2=max1;
                max1=array[i];

            }
            else if(array[i]>max2)
            {
                max2=array[i];
            }
        }

        System.out.println("Second Largest is "+max2);
    }
}
