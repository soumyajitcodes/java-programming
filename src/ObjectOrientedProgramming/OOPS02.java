package ObjectOrientedProgramming;

class Rectangle {
    public double length;
    public double width;

    public double area() {
        return length*width;
    }

    public double perimeter() {
        return 2*(length+width);
    }
}

public class OOPS02 {
    public static void main(String[] args) {
        Rectangle r1 = new Rectangle();
        r1.length=10;
        r1.width=10;
        System.out.println("Area      --> "+r1.area());
        System.out.println("Perimeter --> "+r1.perimeter());
    }
}
