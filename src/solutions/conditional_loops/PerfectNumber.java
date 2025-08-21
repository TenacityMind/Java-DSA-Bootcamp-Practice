package solutions.conditional_loops;

import java.util.Scanner;

public class PerfectNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a positive integer to check: ");
        int number = input.nextInt();

        if (number < 2) {
            System.out.println(number + " is not a perfect number.");
        } else {
            int sumOfDivisors = 0;

            for (int i = 1; i <= number / 2; i++) {
                if (number % i == 0) {
                    sumOfDivisors += i;
                }
            }

            if (sumOfDivisors == number) {
                System.out.println(number + " is a perfect number. ✅");
            } else {
                System.out.println(number + " is not a perfect number.");
            }
        }
    }
}
