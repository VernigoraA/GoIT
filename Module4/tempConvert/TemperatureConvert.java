package ua.goit.andrey.module4.tempConvert;

public class TemperatureConvert {

    public static double convertCelsiusToFahrenheit(double t) {
        return 1.8 * t + 32;
    }

    public static double convertFahrenheitToCelsius(double t) {
        return (t - 32) * 5 / 9;
    }
}
