abstract class Vehicle {
    abstract void engine();
}

class Car extends Vehicle {
    void engine() {
        System.out.println("Car has good engine");
    }
}

class Truck extends Vehicle {
    void engine() {
        System.out.println("Truck has bad engine");
    }
}

public class AbstractClassExample {
    public static void main(String[] args) {
        Car c = new Car();
        c.engine();
        Truck t = new Truck();
        t.engine();
    }
}

