package Inheritance;

class Rectangle02 {
    int length;
    int breadth;
    int x=10;

    Rectangle02(int i, int j) {
        this.length = length;
        this.breadth = breadth;
    }

    void display() {
        System.out.println("Length  : "+this.length);
        System.out.println("Breadth : "+this.breadth);
    }

}

class Cuboid02 extends Rectangle02 {
    int height;
    int x=20;

    Cuboid02(int a, int b, int c) {
        super(a, b);
        this.height = c;
    }

    @Override
    void display() {
        System.out.println("Height  : "+this.height);
        System.out.println("Local x : "+this.x);
        System.out.println("Super x : "+super.x);
    }
}

public class Inheritance07 {
    public static void main(String[] args) {
        Cuboid02 c = new Cuboid02(10, 20, 30);
        c.display();
    }
}
