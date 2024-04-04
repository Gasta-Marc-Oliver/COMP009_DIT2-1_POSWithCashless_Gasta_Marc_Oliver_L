package COMP009;

import java.util.Scanner;

public class POSWithCashless {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double totalAmount = 0;

        System.out.println("Welcome to the Point of Sale System");

        while (true) {
            System.out.println("\nSelect an option:");
            System.out.println("1. Add item");
            System.out.println("2. Calculate total");
            System.out.println("3. Make payment");
            System.out.println("4. Exit");

            int option = scanner.nextInt();

            switch (option) {
                case 1:
                    System.out.print("Enter item price: ");
                    double price = scanner.nextDouble();
                    totalAmount += price;
                    System.out.println("Item added successfully!");
                    break;
                case 2:
                    System.out.println("Total amount: $" + totalAmount);
                    break;
                case 3:
                    System.out.println("Making cashless payment...");
                    // Simulate payment process (replace this with actual payment integration)
                    System.out.println("Payment successful! Thank you for your purchase.");
                    totalAmount = 0; // Reset total amount after payment
                    break;
                case 4:
                    System.out.println("Exiting program. Thank you!");
                    System.exit(0);
                default:
                    System.out.println("Invalid option. Please try again.");
            }
        }
    }
}
