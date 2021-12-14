package Methods;

public class AreaOverloading {

    static double area(double side1, double side2) {
        return side1*side2;
    }

    static double area(double side1) {
        return Math.PI*Math.pow(side1, 2);
    }

    static double area (double side1, double side2, double side3) {
        return (side1*side2*side3)/2;
    }

    public static void main(String[] args) {
        System.out.println(area(10.0, 20.0));
        System.out.println(area(10.0));
        System.out.println(area(10.0, 20.0));
    }
}
