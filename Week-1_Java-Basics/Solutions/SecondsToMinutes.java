import java.util.Scanner;

public class SecondsToMinutes {
    public static void main(String[] args) {
        // Define Scanner for user input
        Scanner scan = new Scanner(System.in);

        // Define variables for input seconds,and calculate minutes and remaining seconds
        int inputSeconds;
        int minutes;
        int seconds;

        // Prompt user for input seconds
        System.out.print("Enter a number of seconds: ");
        inputSeconds = scan.nextInt();

        // Calculate minutes and remaining seconds
        minutes = inputSeconds / 60;
        seconds = inputSeconds % 60;

        // Print the result
        System.out.println(inputSeconds + " seconds is " + minutes + " minutes and " + seconds + " seconds");
    }
}
