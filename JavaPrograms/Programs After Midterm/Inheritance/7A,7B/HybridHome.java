interface Internet {
    void connect();
}

class Device {
    void powerOn() {
        System.out.println("Device is powered on.");
    }
}

class SmartLight extends Device implements Internet {
    public void connect() {
        System.out.println("SmartLight connected to Wi-Fi.");
    }

    void setBrightness() {
        System.out.println("Brightness set to 75%");
    }
}

public class HybridHome {
    public static void main(String[] args) {
        SmartLight light = new SmartLight();
        light.powerOn();
        light.connect();
        light.setBrightness();
    }
}
