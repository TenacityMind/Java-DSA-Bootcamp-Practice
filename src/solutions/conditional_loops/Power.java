package solutions.conditional_loops;

public class Power {
    public static long power(int base, int exponent) {
        long result = 1;
        while (exponent > 0) {
            result *= base;
            exponent--;
        }
        return result;
    }
    public static void main(String[] args) {

        System.out.println(power(2, 3));
        System.out.println(power(5, 2));
        System.out.println(power(2, 5));

    }
}
