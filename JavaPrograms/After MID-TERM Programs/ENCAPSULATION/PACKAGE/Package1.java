import converter.TemperatureConverter;

public class Package1 {
    public static void main(String[] args) {
        TemperatureConverter tc = new TemperatureConverter();
        System.out.println("25°C in Fahrenheit: " + tc.toFahrenheit(25));
        System.out.println("77°F in Celsius: " + tc.toCelsius(77));
    }
}
