class Vehicle {
    void type() {
        System.out.println("Vehicle Type: Transport");
    }
}

class Car extends Vehicle {
    void carDetails() {
        System.out.println("Car: Sedan, 5 Seater");
    }
}

class Bike extends Vehicle {
    void bikeDetails() {
        System.out.println("Bike: Sport, 2 Seater");
    }
}

public class VehicleHierarchy {
    public static void main(String[] args) {
        Car c = new Car();
        c.type();
        c.carDetails();

        Bike b = new Bike();
        b.type();
        b.bikeDetails();
    }
}
