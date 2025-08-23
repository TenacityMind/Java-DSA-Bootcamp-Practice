package solutions.conditional_loops;

import java.util.Scanner;

public class SumCategorizer {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int sumNegative = 0;
        int sumPositiveEven = 0;
        int sumPositiveOdd = 0;

        System.out.println("Enter numbers one by one. Enter 0 to stop.");

        while (true) {
            System.out.print("Enter a number: ");
            int number = input.nextInt();

            if (number == 0) {
                break;
            }

            if (number < 0) {
                sumNegative += number;
            } else {
                if (number % 2 == 0) {
                    sumPositiveEven += number;
                } else {
                    sumPositiveOdd += number;
                }
            }
        }

        System.out.println("\n--- Results ---");
        System.out.println("Sum of negative numbers: " + sumNegative);
        System.out.println("Sum of positive even numbers: " + sumPositiveEven);
        System.out.println("Sum of positive odd numbers: " + sumPositiveOdd);
    }
}
