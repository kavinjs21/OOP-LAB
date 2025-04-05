interface Vehicle {
    void start();
    void stop();
}

class ElectricCar implements Vehicle {
    public void start() {
        System.out.println("Electric Car is starting silently.");
    }

    public void stop() {
        System.out.println("Electric Car is stopping.");
    }
}

class PetrolBike implements Vehicle {
    public void start() {
        System.out.println("Petrol Bike is starting with engine roar.");
    }

    public void stop() {
        System.out.println("Petrol Bike is stopping.");
    }
}

public class VehicleDemo {
    public static void main(String[] args) {
        Vehicle v1 = new ElectricCar();
        Vehicle v2 = new PetrolBike();

        v1.start();
        v1.stop();

        v2.start();
        v2.stop();
    }
}
