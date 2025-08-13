package solutions.conditional_loops;

import java.util.Scanner;

public class SumOfN_Numbers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Please enter the number values would you like to enter: ");
        int N = input.nextInt();
        int sum =0;

        System.out.println("Please enter the N numbers: ");
        for (int i = 1; i <= N; i++) {
            int num = input.nextInt();
            sum = sum + num;
        }
        System.out.println("The sum is " + sum);
    }
}
