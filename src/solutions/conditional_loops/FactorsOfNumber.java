package solutions.conditional_loops;

import java.util.Scanner;

public class FactorsOfNumber {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number");
        int n=sc.nextInt();
        // Since all divisors for any number can be found in the range 1 to n/2 we need to iterate between [ 1, n/2 ]
        for(int i=1;i<=n/2;i++){
            if(n%i==0){
                System.out.print(i+" ");
            }
        }
        System.out.print(n);
    }
}
