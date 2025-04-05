package converter;

public class TemperatureConverter {
    public double toFahrenheit(double celsius) {
        return (celsius * 9/5) + 32;
    }

    public double toCelsius(double fahrenheit) {
        return (fahrenheit - 32) * 5/9;
    }
}
