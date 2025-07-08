package solutions.first_java;

public class RupeesToUsd {
    private double inr;

    public double getInr() {
        return inr;
    }
    public void setInr(double inr) {
        this.inr = inr;
    }
    public RupeesToUsd(double inr) {
        this.inr = inr;
    }
    public void printRupeesToUsd() {
        System.out.printf("The %.2f rupees after converting to USD is %.2f%n", inr, inr / 85);
    }
}
