class Vehicle {
    Vehicle() {
        System.out.println("Vehicle is created");
    }
}

class Car extends Vehicle {
    Car() {
        System.out.println("Car is created");
    }
}

public class SingleInheritanceConstructor {
    public static void main(String[] args) {
        Car c = new Car();
    }
}
