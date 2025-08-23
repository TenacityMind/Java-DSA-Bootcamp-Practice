package solutions.conditional_loops;

import java.util.Scanner;

public class FibonacciSeries {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of fibonacci series :");
        int n = sc.nextInt();
        int a = 0;
        int b = 1;
        System.out.println("The "+n+" numbers in the fibonacci series are: ");
        int nextFibonacci;
        System.out.print(a+" "+b);
        for (int i = 2; i <= n; i++) {
            nextFibonacci = a + b;
            a = b;
            b = nextFibonacci;
            System.out.print(" "+nextFibonacci);
        }

    }
}
