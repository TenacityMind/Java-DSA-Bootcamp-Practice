package solutions.conditional_loops;

import java.util.Scanner;

public class ArmstrongNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the lower Limit: ");
        int lowerLimit = sc.nextInt();
        System.out.println("Enter the upper Limit: ");
        int upperLimit = sc.nextInt();

        for(int i = lowerLimit; i <= upperLimit; i++) {
            int temp = i;
            int numDigits = String.valueOf(i).length();
            int sum = 0;
            while(temp != 0) {
                int remainder = temp % 10;
                sum+= (int) Math.pow(remainder,numDigits);
                temp /= 10;
            }
            if(sum == i) {
                System.out.println(i);
            }
        }
    }
}
