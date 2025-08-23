package solutions.conditional_loops;

import java.util.Scanner;

public class LCM {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // 1. Get user input
        System.out.print("Enter the first positive integer: ");
        int num1 = input.nextInt();

        System.out.print("Enter the second positive integer: ");
        int num2 = input.nextInt();

        // Handle the case where one of the numbers is 0
        if (num1 == 0 || num2 == 0) {
            System.out.println("The LCM is 0.");
        } else {
            int ans = Math.max(num1, num2);

            while (ans % num1 != 0 || ans % num2 != 0) {
                ans++;
            }

            // Printing the Result
            System.out.println("LCM of " + num1 + " and " + num2 + " is " + ans);

        }
    }
}
