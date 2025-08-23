package solutions.conditional_loops;

import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the year: ");
        int year = sc.nextInt();
        if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
            System.out.printf("The year %d is a Leap Year.", year);
        }else{
            System.out.printf("The year %d is not a Leap Year.", year);
        }
    }
}
