package solutions.first_java;

public class LargestNumber {
    private int a;
    private int b;

    public LargestNumber(int a, int b) {
        this.a = a;
        this.b = b;
    }

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public int getB() {
        return b;
    }

    public void setB(int b) {
        this.b = b;
    }

    public void printLargestNumber() {
        System.out.println((a>b)?a:b);
    }
}
