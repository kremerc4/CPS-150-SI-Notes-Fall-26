import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args) {
        // Define Scanner for user input
        Scanner scan = new Scanner(System.in);

        // Prompt user for year input
        System.out.print("Enter a year for the leap year to be calculated: ");
        int year = scan.nextInt();

        // Determine if the year is a leap year
        if (year % 400 == 0) { // Leap year if divisible by 400 and 100
            System.out.println(year + " is a leap year");
        } else if (year % 100 == 0) { // Not a leap year if divisible by 100 but not 400
            System.out.println(year + " is not a leap year");
        } else if (year % 4 == 0) { // Leap year if divisible by 4 but not 100
            System.out.println(year + " is a leap year");
        } else { // Not a leap year if not divisible by 4
            System.out.println(year + " is not a leap year");
        }
    }
}