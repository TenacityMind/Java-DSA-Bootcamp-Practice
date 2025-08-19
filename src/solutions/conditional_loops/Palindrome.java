package solutions.conditional_loops;

import java.util.Scanner;

public class Palindrome {
    public boolean isPalindrome(int number) {
        int reversedNumber = 0;

        int temp = number;
        while (temp!=0) {
        reversedNumber = reversedNumber*10 + temp%10;
        temp /= 10;
       }
        return reversedNumber == number;

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Palindrome palindrome = new Palindrome();

        System.out.println("Enter a number: ");
        int number = sc.nextInt();
        System.out.println(palindrome.isPalindrome(number));

        System.out.println("Enter a number: ");
        int number2 = sc.nextInt();
        System.out.println(palindrome.isPalindrome(number2));

    }
}
