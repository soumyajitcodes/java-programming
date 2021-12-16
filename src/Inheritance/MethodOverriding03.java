package Inheritance;

class Car {
    public void startCar() {
        System.out.println("Car Started");
    }
    public void accelarate() {
        System.out.println("car is accelrating");
    }
    public void gear() {
        System.out.println("Gear Changed");
    }
}

class LuxuryCar extends Car {
    @Override
    public void gear() {
        System.out.println("Automatic Gear");
    }
    public void sunroof() {
        System.out.println("Sunroof opened");
    }
}

public class MethodOverriding03 {
    public static void main(String[] args) {
        Car c = new Car();
        c.startCar();
        c.accelarate();
        c.gear();
        System.out.println();

        LuxuryCar lc = new LuxuryCar();
        lc.gear();
        lc.sunroof();

    }
}
