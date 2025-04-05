class Temperature {
    private double celsius;

    public void setCelsius(double c) {
        if (c >= -273.15) celsius = c;
    }

    public double getFahrenheit() {
        return (celsius * 9 / 5) + 32;
    }
}

public class EncapsulationTemperature {
    public static void main(String[] args) {
        Temperature t = new Temperature();
        t.setCelsius(25);

        System.out.println("Temperature in Fahrenheit: " + t.getFahrenheit());
    }
}
