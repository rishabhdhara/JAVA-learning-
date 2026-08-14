import java.util.Scanner;

public class TemperatureConverter {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("=================================");
        System.out.println("      TEMPERATURE CONVERTER");
        System.out.println("=================================");
        System.out.println("1. Celsius to Fahrenheit");
        System.out.println("2. Fahrenheit to Celsius");
        System.out.println("3. Celsius to Kelvin");
        System.out.println("4. Kelvin to Celsius");
        System.out.println("=================================");

        System.out.print("Enter your choice (1-4): ");
        int choice = input.nextInt();

        double result = 0;
        double temperature;
        if (choice == 1) {
            System.out.print("Enter temperature in Celsius: ");
            temperature = input.nextDouble();
            result = celsiusToFahrenheit(temperature);
            System.out.println(temperature + " Celsius = " + result + " Fahrenheit");

        } else if (choice == 2) {
            System.out.print("Enter temperature in Fahrenheit: ");
            temperature = input.nextDouble();
            result = fahrenheitToCelsius(temperature);
            System.out.println(temperature + " Fahrenheit = " + result + " Celsius");

        } else if (choice == 3) {
            System.out.print("Enter temperature in Celsius: ");
            temperature = input.nextDouble();
            result = celsiusToKelvin(temperature);
            System.out.println(temperature + " Celsius = " + result + " Kelvin");

        } else if (choice == 4) {
            System.out.print("Enter temperature in Kelvin: ");
            temperature = input.nextDouble();
            result = kelvinToCelsius(temperature);
            System.out.println(temperature + " Kelvin = " + result + " Celsius");

        } else {
            System.out.println("That is not a valid choice. Please run the program again.");
        }

        input.close();
    }

    // Converts Celsius to Fahrenheit
    public static double celsiusToFahrenheit(double celsius) {
        double fahrenheit = (celsius * 9 / 5) + 32;
        return fahrenheit;
    }

    // Converts Fahrenheit to Celsius
    public static double fahrenheitToCelsius(double fahrenheit) {
        double celsius = (fahrenheit - 32) * 5 / 9;
        return celsius;
    }

    // Converts Celsius to Kelvin
    public static double celsiusToKelvin(double celsius) {
        double kelvin = celsius + 273.15;
        return kelvin;
    }

    // Converts Kelvin to Celsius
    public static double kelvinToCelsius(double kelvin) {
        double celsius = kelvin - 273.15;
        return celsius;
    }
}
