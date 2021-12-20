package object_oriented_programming;

class Cylinder {
    public double radius;
    public double height;

    public double lidArea() {
        return Math.PI*Math.pow(radius, 2);
    }

    public double totalArea() {
        return 2*lidArea()+perimeter()*height;
    }

    public double perimeter() {
        return 2*Math.PI*radius;
    }

    public double volume() {
        return lidArea()*height;
    }
}

public class OOPS03 {
    public static void main(String[] args) {
        Cylinder c1 = new Cylinder();
        c1.radius = 10;
        c1.height = 5;

        System.out.format("Lid Area   --> %.2f units.\n", c1.lidArea());
        System.out.format("Total Area --> %.2f units.\n", c1.totalArea());
        System.out.format("Volume     --> %.2f units", c1.volume());
    }
}
