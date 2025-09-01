package solutions.funtions;

public class MaximumAndMinimum {
    static int minimum(int a, int b, int c) {
        int min;

        if (a < b && a < c) {
            min = a;
        }  else if (b < a && b < c) {
            min = b;
        } else min = c;

        return min;

    }
    static int maximum(int a, int b, int c) {
        int max;

        if (a > b && a > c) {
            max = a;
        }  else if (b > a && b > c) {
            max = b;
        } else max = c;

        return max;


    }
    public static void main(String[] args) {
    int a,b,c;
    a=10;
    b=20;
    c=30;

    System.out.printf("The maximum of %d, %d, %d is: %d \n", a, b, c, maximum(a, b, c) );

    System.out.printf("The minimum of %d, %d, %d is: %d", a, b, c, minimum(a, b, c) );

    }
}
