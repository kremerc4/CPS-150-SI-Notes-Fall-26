import java.util.Scanner;

public class ReverseString {
    public static void main(String[] args) {
        // Define Scanner for user input
		Scanner scan = new Scanner(System.in);
		String input;
		
		// Prompt user for input string
		System.out.print("Enter a string: ");
		input = scan.nextLine();
		
		// Print the reversed string (start at end of string and move to the beginning, printing each character as you go)
		for (int i = input.length() - 1; i >= 0; i--) {
		    System.out.print(input.charAt(i) + "");
		} 

		// Print a newline after the reversed string for better formatting
		System.out.println();
    }
}