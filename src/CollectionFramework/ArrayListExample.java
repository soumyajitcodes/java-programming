package CollectionFramework;

import java.util.*;

public class ArrayListExample
{
    public static void main(String[] args)
    {
        ArrayList<Integer> al1 = new ArrayList<>(20);
        ArrayList<Integer> al2 = new ArrayList<>(List.of(60, 70, 80, 90, 100));

        al1.add(10);
        al1.add(20);
        al1.add(30);
        al1.add(40);
        al1.add(50);
        al1.addAll(al2);
        al1.forEach((x)-> System.out.print(x+" "));
        System.out.println();
        System.out.println(al1.contains(20));
        System.out.println(al1.isEmpty());
        System.out.println();
    }
}
