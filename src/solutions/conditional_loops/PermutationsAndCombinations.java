package solutions.conditional_loops;

import java.util.Scanner;

public class PermutationsAndCombinations {
    public static int factorial(int n){
        if(n==1 || n==0){
            return 1;
        }
        int factorial = 1;
        for(int i=2; i<=n; i++){
            factorial = factorial * i;
        }
        return factorial;
    }
    public static void main(String[] args) {

        int n;
        int r;
        int choice;
        int result;

        Scanner sc = new Scanner(System.in);

        do{
            System.out.println("--- Calculator Menu ---");
            System.out.println("1. Calculate Permutations (P(n, r))");
            System.out.println("2. Calculate Combinations (C(n, r))");
            System.out.println("3. Exit Program");

            choice = sc.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("Enter the total number of items (n):");
                    n = sc.nextInt();
                    System.out.println("Enter the total number of items to arrange (r):");
                    r = sc.nextInt();
                    if (r > n) {
                        System.out.println("Error: k cannot be greater than n. Please try again.\n");
                        break;
                    }
                    result = factorial(n) / factorial(n - r);
                    System.out.printf("Result of P(%d, %d): %d%n \n", n, r, result);
                    break;
                case 2:
                    System.out.println("Enter the total number of items (n):");
                    n = sc.nextInt();
                    System.out.println("Enter the number of items to choose (r):");
                    r = sc.nextInt();
                    if (r > n) {
                        System.out.println("Error: k cannot be greater than n. Please try again.\n");
                        break;
                    }
                    result = factorial(n) / (factorial(r) * factorial(n - r));
                    System.out.printf("Result of C(%d, %d): %d%n \n", n, r, result);
                    break;
                case 3:
                    System.out.println("Exiting program. Goodbye!");
                default:
                    System.out.println("Invalid choice \n");

            }
        }while(choice != 3);

    }
}
