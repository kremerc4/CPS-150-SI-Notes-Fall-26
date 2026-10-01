import java.util.Scanner;

public class CountLowerUpperCase {
    public static void main(String[] args) {
		// Define Scanner for user input
		Scanner scan = new Scanner(System.in);
		String input;
		int uppercaseCount = 0;
		int lowercaseCount = 0;
		
		// Prompt user for input string
		System.out.print("Enter a string: ");
		input = scan.nextLine();
		
		// Iterate through each character in the input string and count lowercase and uppercase letters
		for (int i = 0; i < input.length(); i++) {
		    // Get the current character from the input string
			char currentChar = input.charAt(i);
			
		    if (Character.isLowerCase(currentChar)) { // Check if the current character is lowercase
		        lowercaseCount++; // Increment lowercase count
		    } else if (Character.isUpperCase(currentChar)) { // Check if the current character is uppercase
		        uppercaseCount++; // Increment uppercase count
		    }
		}
		
		// Print the counts of uppercase and lowercase letters
		System.out.println("The string contains " + uppercaseCount + " uppercase letters and "
            + lowercaseCount + " lowercase letters");
	}    
}
