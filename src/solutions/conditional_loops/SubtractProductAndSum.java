package solutions.conditional_loops;

import java.util.Scanner;

public class SubtractProductAndSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a number");
        int n = sc.nextInt();
        int reminder;
        int sum = 0, product = 1;
        while(n>0){
            reminder = n%10;
            sum+=reminder;
            product *=reminder;
            n=n/10;
        }
        System.out.println("The difference between Products and Sum is: "+(product-sum));
    }
}
