package solutions.conditional_loops;

import java.util.Scanner;

public class HCF {
    public static void main(String[] args) {
        // 1. Setup for user input
        Scanner input = new Scanner(System.in);

        // 2. Get the two numbers from the user
        System.out.print("Enter the first positive integer: ");
        int num1 = input.nextInt();

        System.out.print("Enter the second positive integer: ");
        int num2 = input.nextInt();

        // 3. Initialize HCF variable to a default of 1
        int hcf = 1;

        // 4. Determine the smaller of the two numbers to set the loop limit
        int smallerNumber = Math.min(num1, num2);

        // 5. Loop downwards from the smaller number to 1
        for (int i = smallerNumber; i >= 1; i--) {
            // Check if the current number 'i' divides both num1 and num2
            if (num1 % i == 0 && num2 % i == 0) {
                // If it does, this is the highest common factor
                hcf = i;
                // Exit the loop since we've found the highest factor
                break;
            }
        }

        // 6. Display the final result
        System.out.println("The HCF of " + num1 + " and " + num2 + " is " + hcf + ".");

        // 7. Close the scanner
        input.close();
    }
}
