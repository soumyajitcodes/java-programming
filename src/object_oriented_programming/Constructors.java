package object_oriented_programming;

class Rectangle02 {
    private double length;
    private double width;

    public Rectangle02() {
        length=1;
        width=1;
    }

    public Rectangle02(double l, double b) {
        setLength(l);
        setWidth(b);
    }

    public double getLength() {
        return length;
    }

    public double getWidth() {
        return width;
    }

    public void setLength(double length) {
        if (length>0)
            this.length = length;
        else
            this.length = 0;
    }

    public void setWidth(double width) {
        if (this.width>0)
            this.width = width;
        else
            this.width = 0;
    }

    public double area() {
        return length*width;
    }

    public double perimeter() {
        return 2*(length+width);
    }
}

public class Constructors {
    public static void main(String[] args) {
        Rectangle02 r1 = new Rectangle02();
        System.out.println("Area      --> "+r1.area());
        System.out.println("Perimeter --> "+r1.perimeter());

        Rectangle02 r2 = new Rectangle02(10, 10);
        System.out.println("Area      --> "+r2.area());
        System.out.println("Perimeter --> "+r2.perimeter());

        Rectangle02 r3 = new Rectangle02(-10, -10);
        System.out.println("Area      --> "+r3.area());
        System.out.println("Perimeter --> "+r3.perimeter());

    }
}
