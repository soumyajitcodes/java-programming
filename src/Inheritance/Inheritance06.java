package Inheritance;

class Rectangle01 {
    int length;
    int breadth;

    Rectangle01 (int i, int j) {
        this.length = i;
        this.breadth = j;
    }

    void display() {
        System.out.println("length : "+this.length);
        System.out.println("breadth : "+this.breadth);
    }
}

public class Inheritance06 {
    public static void main(String[] args) {
        Rectangle01 r = new Rectangle01(10, 20);
        r.display();
    }
}
