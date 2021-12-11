package CollectionFramework;

import java.util.LinkedList;
import java.util.List;

public class LinkedListExample {
    public static void main(String[] args) {
        LinkedList<Integer> ll1 = new LinkedList<>();
        LinkedList<Integer> ll2 = new LinkedList<>(List.of(50, 60, 70, 80, 90));

        // Adding Elements
        ll1.add(10);
        ll1.add(20);
        ll1.add(30);
        ll1.add(40);
        ll1.addAll(ll2);
        ll1.addFirst(5);
        ll1.addLast(100);

        ll1.forEach((x)-> System.out.println(x));
    }
}
