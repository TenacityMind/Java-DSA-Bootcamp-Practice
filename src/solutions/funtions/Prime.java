package solutions.funtions;

public class Prime {
    static boolean isPrime(int n){
        if (n == 1) return false;

        for (int i = 2; i * i <= n; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        int n = 5;
        System.out.println(isPrime(n));

        n=2;
        System.out.println(isPrime(n));

        n=10;
        System.out.println(isPrime(n));

        n=11;
        System.out.println(isPrime(n));

        n=6;
        System.out.println(isPrime(n));
    }
}
