package solutions.first_java;

public class SimpleCalculator {
    private double a;
    private double b;
    private char operation;

    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }

    public double getB() {
        return b;
    }

    public void setB(double b) {
        this.b = b;
    }

    public char getOperation() {
        return operation;
    }

    public void setOperation(char operation) {
        this.operation = operation;
    }

    public SimpleCalculator(double a, double b, char operation) {
        this.a = a;
        this.b = b;
        this.operation = operation;
    }
    public void calculate() {
        double sum = 0;
        if (operation == '+') {
            sum = a + b;
        }
        else if (operation == '-') {
            sum = a - b;
        }
        else if (operation == '*') {
            sum = a * b;
        }
        else if (operation == '/') {
            sum = a / b;
        }
        System.out.println("The sum is: " + sum);
    }

} 
