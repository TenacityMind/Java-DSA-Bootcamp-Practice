package solutions.funtions;

import java.util.Scanner;

public class Sum {
    static int sumOfTwo(int a, int b) {
        return a + b;
    }

    public static void main(String[] args) {
        int a;
        int b;
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the first number: ");
        a = sc.nextInt();

        System.out.println("Enter the second number: ");
        b = sc.nextInt();

        System.out.println(sumOfTwo(a, b));
    }
}
