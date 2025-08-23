package solutions.conditional_loops;

import java.util.Scanner;

public class CompoundInterest {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter the initial principal amount: ");
        double principalAmount = input.nextDouble();

        System.out.print("Enter the annual interest rate (e.g., 5 for 5%): ");
        double annualInterestRate = input.nextDouble();

        System.out.print("Enter the number of years: ");
        int years = input.nextInt();

        double currentBalance = principalAmount;

            // Loop through each year of the investment
        for (int i = 1; i <= years; i++) {

            // Show the user the balance at the START of the year
            System.out.printf("\n--- Year %d ---\n", i);
            System.out.printf("Start of year balance: $%.2f\n", currentBalance);

            char option;
            // --- Nested loop for input validation ---
            while (true) {
                System.out.print("Would you like to make an additional contribution? (Y/N): ");
                // Get the first character and convert to uppercase
                option = input.next().toUpperCase().charAt(0);

                if (option == 'Y' || option == 'N') {
                    break; // Exit the loop if input is valid
                } else {
                    System.out.println("Invalid option. Please enter 'Y' or 'N'.");
                }
            }

            if (option == 'Y') {
                System.out.print("Enter contribution amount: ");
                double additionalInvestment = input.nextDouble();
                currentBalance += additionalInvestment;
            }

            // Calculate the new balance after interest
            currentBalance = currentBalance * (1 + (annualInterestRate / 100));

            System.out.printf("End of Year %d Balance: $%.2f\n", i, currentBalance);

        }

        input.close();

        System.out.println("\n=================================");
        System.out.printf("After %d years, your investment is worth $%.2f\n", years, currentBalance);

    }

}