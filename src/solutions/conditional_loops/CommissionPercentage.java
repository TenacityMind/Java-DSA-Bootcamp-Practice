package solutions.conditional_loops;

import java.text.NumberFormat;

public class CommissionPercentage {
    public static double calculateCommission(double totalSales) {
        double commission = 0.0;
        if (totalSales > 50000.00) {

            // First, calculate the commission for the amount ABOVE $50,000 at 15%
            double amountInHighestTier = totalSales - 50000.00;
            commission += amountInHighestTier * 0.15; // 15% rate

            // Next, add the commission for the amount between $10,000 and $50,000.
            // This entire tier is worth $40,000. We calculate its commission at 10%.
            commission += 40000.00 * 0.10; // 10% rate

            // Finally, add the commission for the first $10,000, which is at 5%.
            commission += 10000.00 * 0.05; // 5% rate

            // --- Case 2: The sales amount is in the middle tier ($10,001 to $50,000) ---
        } else if (totalSales > 10000.00) {

            // First, calculate the commission for the amount ABOVE $10,000 at 10%
            double amountInMiddleTier = totalSales - 10000.00;
            commission += amountInMiddleTier * 0.10; // 10% rate

            // Finally, add the commission for the first $10,000, which is at 5%.
            commission += 10000.00 * 0.05; // 5% rate

            // --- Case 3: The sales amount is in the lowest tier ($0 to $10,000) ---
        } else if (totalSales > 0) {

            // If sales are $10,000 or less, the calculation is simple: 5% of the total.
            commission = totalSales * 0.05; // 5% rate
        }

        // Return the final total commission. If sales were 0 or less, it will be 0.
        return commission;
    }

    // The main method is where the program starts. We use it to test our function.
    public static void main(String[] args) {

        // Let's test with a sample sales amount.
        double sales = 65000.00;

        // Call our function to get the commission.
        double commissionResult = calculateCommission(sales);

        // Print the results to the screen in a friendly message.
        System.out.println("For total sales of $" + sales);
        System.out.println("The calculated commission is $" + commissionResult);

        System.out.println("------------------------------------");

        // Let's test another amount.
        sales = 45000.00;
        commissionResult = calculateCommission(sales);
        System.out.println("For total sales of $" + sales);
        System.out.println("The calculated commission is $" + commissionResult);
    }
}
