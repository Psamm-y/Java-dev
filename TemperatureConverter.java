
    import java.util.Scanner;

    public class TemperatureConverter {
        public static void main(String[] args) {
            System.out.println("TEMPERATURE CONVERTER");
            System.out.println("1. CONVERT CELSIUS TO FAHRENHEIT");
            System.out.println("2. CONVERT FAHRENHEIT TO CELSIUS");
            System.out.print("ENTER YOUR CHOICE (1 OR 2): ");

            Scanner input = new Scanner(System.in);
            int choice = input.nextInt();

            if (choice == 1) {
                System.out.println("Enter temperature in Celsius: ");
                double tempCelsius = input.nextDouble();
                double tempFahrenheit = (tempCelsius * 9.0 / 5) + 32;
                System.out.println(tempCelsius + "°C is equal to " + tempFahrenheit + "°F");
            } else if (choice == 2) {
                System.out.println("Enter temperature in Fahrenheit: ");
                double tempFahrenheit = input.nextDouble();
                double tempCelsius = (tempFahrenheit - 32) * 5.0 / 9;
                System.out.println(tempFahrenheit + "°F is equal to " + tempCelsius + "°C");
            } else {
                System.out.println("Invalid choice! Please select 1 or 2.");
            }

            input.close();
        }
    }

