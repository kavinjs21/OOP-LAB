interface SmartDevice {
    void turnOn();
    void turnOff();
}

class SmartFan implements SmartDevice {
    public void turnOn() {
        System.out.println("Smart Fan turned ON.");
    }

    public void turnOff() {
        System.out.println("Smart Fan turned OFF.");
    }
}

class SmartBulb implements SmartDevice {
    public void turnOn() {
        System.out.println("Smart Bulb turned ON.");
    }

    public void turnOff() {
        System.out.println("Smart Bulb turned OFF.");
    }
}

public class SmartHome {
    public static void main(String[] args) {
        SmartDevice device1 = new SmartFan();
        SmartDevice device2 = new SmartBulb();

        device1.turnOn();
        device1.turnOff();

        device2.turnOn();
        device2.turnOff();
    }
}
