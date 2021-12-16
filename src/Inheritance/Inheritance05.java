package Inheritance;

class Rectangle {
    int length;
    int breadth;

    Rectangle() {
        length = breadth = 1;
    }

    Rectangle(int l, int b) {
        length = l;
        breadth = b;
    }

    int area() {
        return length*breadth;
    }
}

class Cuboid extends Rectangle {
    int height;

    Cuboid() {
        height=1;
    }

    Cuboid(int h) {
        height = h;
    }

    Cuboid(int l, int b, int h) {
        super(l, b);
        height = h;
    }

    int volume() {
        return area()*height;
    }
}

public class Inheritance05 {
    public static void main(String[] args) {
        Cuboid c1 = new Cuboid();
        System.out.println(c1.volume());
        System.out.println();

        Cuboid c2 = new Cuboid(10);
        System.out.println(c2.volume());
        System.out.println();

        Cuboid c3 = new Cuboid(10, 10, 10);
        System.out.println(c3.volume());
        System.out.println();
    }
}
