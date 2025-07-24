package solutions.first_java;

public class FibonacciSeries {
    private int n;
    public FibonacciSeries(int n) {
        this.n = n;
    }
    public int getN() {
        return n;
    }
    public void setN(int n) {
        this.n = n;
    }

    public void calculateFibonacciSeries() {
        if (n <= 0) {
            System.out.println("Please enter a positive integer");
            return;
        }
        int first=0, second=1;
        System.out.print("Fibonacci series upto " + n + " numbers is: ");
        for (int i = 0; i < n; i++) {
            System.out.print(first+" ");
            int next = first + second;
            first = second;
            second =next;
        }
    }
}
