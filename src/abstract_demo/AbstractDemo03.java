package abstract_demo;

abstract class Shape {
    abstract void area();
    abstract void perimeter();
}

class Rectangle extends Shape {
    private int length;
    private int breadth;

    Rectangle (int l, int b) {
        this.length = l;
        this.breadth = b;
    }

    void perimeter() {
        System.out.println("Perimeter of Rectangle : "+(2*(this.length+this.breadth))+" units.");
    }

    void area() {
        System.out.println("Area of Rectangle      : "+(this.length*this.breadth)+" sq. units.");
    }
}

class Circle extends Shape {
    private double radius;

    Circle(double r) {
        this.radius = r;
    }

    double circumference() {
        return 2*Math.PI*this.radius;
    }

    void perimeter() {
        System.out.format("Perimeter of Circle : %.02f units. \n", circumference());
    }

    void area() {
        System.out.format("Area of Circle      : %.02f sq. units\n", Math.PI*Math.pow(this.radius,2));
    }
}

public class AbstractDemo03 {
    public static void main(String[] args) {
        Shape s1 = new Rectangle(10, 20);
        s1.perimeter();
        s1.area();

        Shape s2 = new Circle(10);
        s2.perimeter();
        s2.area();
    }
}
