package ObjectOrientedProgramming;

class Circle {
    public double radius;

    public double area() {
        return Math.PI*Math.pow(radius, 2);
    }

    public double perimeter() {
        return 2*Math.PI*radius;
    }

    public double circumference() {
        return perimeter();
    }
}

public class OOPS01 {
    public static void main(String[] args) {
        Circle c1 = new Circle();
        c1.radius = 10;
        System.out.println("C1 Area          --> "+c1.area());
        System.out.println("C1 Perimeter     --> "+c1.perimeter());
        System.out.println("C1 Circumference --> "+c1.circumference());

        Circle c2 = new Circle();
        c2.radius = 1000;
        System.out.println("C2 Area          --> "+c2.area());
        System.out.println("C2 Perimeter     --> "+c2.perimeter());
        System.out.println("C2 Circumference --> "+c2.circumference());
    }
}
