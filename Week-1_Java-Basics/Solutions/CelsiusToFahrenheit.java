import java.util.Scanner;

public class CelsiusToFahrenheit {
    public static void main(String[] args) {
        // Define scanner and variables
        Scanner input = new Scanner(System.in);
        double celsius;
        double fahrenheit;

        // Get celsius from user (input)
        System.out.print("Enter a temperature in degrees Celsius: ");
        celsius = input.nextDouble();

        // Calculation (process)
        fahrenheit = (9.0 / 5.0) * celsius + 32;

        // Print conversion (output)
        System.out.println("The temperature in Fahrenheit is " + fahrenheit + "F");
    }
}
