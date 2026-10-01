import java.util.Scanner;

public class MovieReceipt {
    public static void main(String[] args) {
        // Define Scanner and variables
        Scanner scan = new Scanner(System.in);
        String name;
        String movieName;
        int adultTickets;
        int kidsTickets;

        // Get user name
        System.out.print("Enter your name: ");
        name = scan.nextLine();
        
        // Get movie name
        System.out.print("Enter your movie name: ");
        movieName = scan.nextLine();

        // Get number of adult tickets
        System.out.print("Enter number of adult tickets: ");
        adultTickets = scan.nextInt();

        // Get number of kid tickets
        System.out.print("Enter number of kid tickets: ");
        kidsTickets = scan.nextInt();

        // Calculate totals for adult and kid tickets and overall total
        double adultFinal = adultTickets * 10.99;
        double kidsFinal = kidsTickets * 6.99;
        double total = adultFinal + kidsFinal;

        // Print formatted receipt
        System.out.println("Your receipt:");
        System.out.println(movieName + " --- " + name);
        System.out.println("Adult tickets x" + adultTickets + " - $" + adultFinal);
        System.out.println("Kids tickets x" + kidsTickets + " - $" + kidsFinal);
        System.out.println("Total - $" + total);
    }
}