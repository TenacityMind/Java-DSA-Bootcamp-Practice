package solutions.conditional_loops;

import java.util.Scanner;

public class SumAndLargestOfAllNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number=1;
        int sum=0;
        int largest=0;
        System.out.println("Enter a number :[0 to exit]");
        while(number!=0){
            number=sc.nextInt();
            sum+=number;
            if(number>largest){
                largest=number;
            }
        }
        System.out.println("The sum is : "+ sum);
        System.out.println("The largest is : "+ largest);
    }
}
