package solutions.conditional_loops;

import java.util.Scanner;

public class FutureInvestmentValue {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char continueChoice = 'y';

        // Main do-while loop to allow for multiple calculations.
        do {
            // --- 1. Get User Inputs ---
            System.out.print("Enter initial investment amount: ");
            double investmentAmount = scanner.nextDouble();

            System.out.print("Enter annual interest rate (e.g., 7.5): ");
            double annualRate = scanner.nextDouble();

            System.out.print("Enter number of years: ");
            int years = scanner.nextInt();

            // --- 2. Input Validation ---
            if (investmentAmount <= 0 || annualRate < 0 || years <= 0) {
                System.out.println("\nError: All inputs must be positive numbers. Please try again.\n");
                continue; // Skip the rest of this loop iteration and start over.
            }

            // --- 3. Get Compounding Choice ---
            System.out.println("\nSelect a compounding period:");
            System.out.println("1. Yearly (compounded once per year)");
            System.out.println("2. Half-Yearly (compounded twice per year)");
            System.out.println("3. Quarterly (compounded 4 times per year)");
            System.out.println("4. Monthly (compounded 12 times per year)");
            System.out.print("Enter your choice: ");
            int compoundingChoice = scanner.nextInt();

            // --- 4. Call Calculation Method ---
            double futureValue = calculateFutureValue(investmentAmount, annualRate, years, compoundingChoice);

            // --- 5. Display Result ---
            if (futureValue != -1) {
                // Use printf for clean, formatted currency output (e.g., $15,193.34)
                System.out.printf("\nThe future value of your investment is: $%,.2f%n%n", futureValue);
            } else {
                System.out.println("\nInvalid compounding choice. Please try again.\n");
            }

            // --- 6. Ask to Continue ---
            System.out.print("Would you like to perform another calculation? (Y/N): ");
            continueChoice = scanner.next().charAt(0);
            System.out.println(); // Add a newline for spacing

        } while (Character.toUpperCase(continueChoice) == 'Y');

        System.out.println("Exiting program. Goodbye!");
        scanner.close(); // Close the scanner to prevent resource leaks.
    }

    /**
     * Calculates the future value of an investment using the general compound interest formula.
     *
     * @param presentValue The initial amount of the investment.
     * @param annualRate The annual interest rate as a percentage (e.g., 7.5).
     * @param years The total number of years for the investment.
     * @param compoundingChoice An integer representing the compounding period.
     * @return The calculated future value, or -1 if the choice is invalid.
     */
    public static double calculateFutureValue(double presentValue, double annualRate, int years, int compoundingChoice) {
        // 'c' is the compounding frequency (number of times compounded per year)
        int c;

        // Use a switch statement to set the compounding frequency based on user choice
        switch (compoundingChoice) {
            case 1:
                c = 1;  // Yearly
                break;
            case 2:
                c = 2;  // Half-Yearly
                break;
            case 3:
                c = 4;  // Quarterly
                break;
            case 4:
                c = 12; // Monthly
                break;
            default:
                return -1; // Return an error code for an invalid choice
        }

        // Convert the annual rate from a percentage to a decimal
        double r = annualRate / 100.0;

        // Apply the formula: FV = PV * (1 + r/c)^(n*c)
        return presentValue * Math.pow(1 + r / c, (double) years * c);
    }
}