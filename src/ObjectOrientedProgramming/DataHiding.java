package ObjectOrientedProgramming;

class Rectangle01 {
    private double length;
    private double width;

    public double getLength() {
        return length;
    }

    public double getWidth() {
        return width;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double area() {
        return length*width;
    }

    public double perimeter() {
        return 2*(length+width);
    }
}

public class DataHiding {
    public static void main(String[] args) {
        Rectangle01 r1 = new Rectangle01();
        r1.setLength(10);
        r1.setWidth(10);
        System.out.println("Area      --> "+r1.area());
        System.out.println("Perimeter --> "+r1.perimeter());
    }
}
