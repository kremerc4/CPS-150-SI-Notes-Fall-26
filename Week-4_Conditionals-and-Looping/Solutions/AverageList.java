import java.util.Scanner;

public class AverageList {
    public static void main(String[] args) {
        // Define Scanner and variables for user input and calculations
        Scanner scan = new Scanner(System.in);
        int userInput = 0;
        int sum = 0;
        int count = 0;

        // Prompt user for list of numbers
        System.out.println("Enter a list of numbers to be averaged. A negative number will stop input");

        // Read numbers from user until a negative number is entered
        while (userInput >= 0) {
            userInput = scan.nextInt();
            if (userInput >= 0) { // Only add non-negative numbers to sum and count
                sum += userInput;
                count++;
            }
        }

        // Calculate the average of the entered numbers
        double average = (double) sum / (double) count;

        // Print the calculated average
        System.out.println("The average is " + average);
    }
}
