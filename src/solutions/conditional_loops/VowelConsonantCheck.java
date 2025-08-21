package solutions.conditional_loops;

import java.util.Scanner;

public class VowelConsonantCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.print("Enter a character to check (or '0' to exit): ");
            char ch = sc.next().charAt(0);

            if (ch == '0') break;

            if (!Character.isLetter(ch)) {
                System.out.println("Error: Input is not a letter. Please try again.");
                continue;
            }

            char lowerCh = Character.toLowerCase(ch);

            if (lowerCh == 'a' || lowerCh == 'e' || lowerCh == 'i' || lowerCh == 'o' || lowerCh == 'u') {
                System.out.println("'" + ch + "' is a Vowel.");
            } else {
                System.out.println("'" + ch + "' is a Consonant.");
            }
            System.out.println(); // Add a blank line for readability
        }

        System.out.println("Program terminated. Goodbye!");
    }
}
