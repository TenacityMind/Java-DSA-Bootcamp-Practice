package solutions.conditional_loops;

import java.util.Scanner;

public class StringReversal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str;
        System.out.println("Enter a string to reverse (or 'quit' to exit):");
        str = sc.nextLine();

        if (str.equals("quit")) {
            System.out.println("Bye bye!");
        }else if (str.isEmpty()) {
            System.out.println("Empty string!");
        }else {
            for (int i = str.length() - 1; i >= 0; i--) {
                System.out.print(str.charAt(i));
            }
        }
    }
}
