package solutions.conditional_loops;

public class ValueDepreciation {

    public static void displayDepreciationSchedule(double assetCost, double salvageValue, int usefulLifeYears) {

        if (assetCost < 0 || salvageValue < 0 || usefulLifeYears <= 0 || assetCost < salvageValue) {
            System.out.println("Invalid input. Please check your values.");
            System.out.println("Asset cost must be greater than or equal to salvage value, and years must be positive.");
            return;
        }

        // --- Step 1: Calculate the fixed annual depreciation amount ---
        double totalDepreciableValue = assetCost - salvageValue;
        double annualDepreciation = totalDepreciableValue / usefulLifeYears;

        // --- Print a header for our schedule ---
        System.out.printf("Original Asset Cost: $%.2f\n", assetCost);
        System.out.printf("Salvage Value: $%.2f\n", salvageValue);
        System.out.printf("Useful Life: %d years\n", usefulLifeYears);
        System.out.printf("Annual Depreciation: $%.2f\n", annualDepreciation);
        System.out.println("=========================================");
        System.out.println("Year\t | \tEnd of Year Value");
        System.out.println("-----------------------------------------");

        // --- Step 2: Loop through each year to show the declining value ---
        double currentBookValue = assetCost;
        System.out.printf(" 0\t | \t$%.2f (Initial Value)\n", currentBookValue);

        for (int year = 1; year <= usefulLifeYears; year++) {
            // Subtract one year's worth of depreciation
            currentBookValue -= annualDepreciation;

            // Print the current year and the new book value
            System.out.printf(" %d\t | \t$%.2f\n", year, currentBookValue);
        }

        System.out.println("=========================================");
    }

    // The main method is where the program starts. It's used here to run an example.
    public static void main(String[] args) {
        // --- Example ---
        // A company buys a machine for $50,000.
        // It has a useful life of 10 years.
        // After 10 years, its salvage value will be $2,000.

        double cost = 50000.00;
        double salvage = 2000.00;
        int lifeInYears = 10;

        // Call the method to display the full schedule.
        displayDepreciationSchedule(cost, salvage, lifeInYears);

        double cost2 = 4000.00;
        double salvage2 = 400.00;
        int lifeInYears2 = 3;

        // Call the method to display the full schedule.
        displayDepreciationSchedule(cost2, salvage2, lifeInYears2);

        double cost3 = 1500.00;
        double salvage3 = 0;
        int lifeInYears3 = 5;

        // Call the method to display the full schedule.
        displayDepreciationSchedule(cost3, salvage3, lifeInYears3);
    }
}