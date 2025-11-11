package solutions.funtions;

public class Factorial {
    /**
     * Calculates and prints the factorial of a given number with step-by-step breakdown.
     * Displays the multiplication process and final result.
     *
     * @param n the number to calculate factorial for (must be non-negative)
     */
    public static void factorial(int n) {
        // Base case: factorial of 0 and 1 is always 1
        if(n == 1 || n == 0) {
            System.out.println(n+"! = 1");
            return;
        }

        // Initialize result with the starting value n
        int result = n;

        // Print the beginning of the factorial expression (e.g., "4! = 4")
        System.out.print(n+"! = " + n);

        // Loop backward from n-1 down to 1, multiplying each number
        for(int i = n-1; i >= 1; i--) {
            // Multiply current result by i
            result  = result * i;

            // Print each multiplication step (e.g., " * 3", " * 2", " * 1")
            System.out.print(" * "+i);
        }

        // Print the final calculated result
        System.out.print(" = "+result);
    }

    /**
     * Main method to test the factorial calculation.
     */
    public static void main(String[] args) {
        // Calculate and display factorial of 4
        factorial(4);
    }
}
