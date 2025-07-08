package solutions.first_java;

public class ArmstrongNumber {
    private int lowerLimit;
    private int upperLimit;
    public ArmstrongNumber(int lowerLimit, int upperLimit) {
        this.lowerLimit = lowerLimit;
        this.upperLimit = upperLimit;
    }
    public int getLowerLimit() {
        return lowerLimit;
    }
    public void setLowerLimit(int lowerLimit) {
        this.lowerLimit = lowerLimit;
    }
    public int getUpperLimit() {
        return upperLimit;
    }
    public void setUpperLimit(int upperLimit) {
        this.upperLimit = upperLimit;
    }
    public void checkArmstrongNumber() {
        for(int i = lowerLimit; i <= this.upperLimit; i++) {
            int temp = i;
            int numDigits = String.valueOf(i).length();
            int sum = 0;
            while(temp != 0) {
                int remainder = temp % 10;
                sum+= (int) Math.pow(remainder,numDigits);
                temp /= 10;
            }
            if(sum == i) {
                System.out.println(i);
            }
        }
    }
}
