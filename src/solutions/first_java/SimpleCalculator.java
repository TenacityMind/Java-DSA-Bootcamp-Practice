package solutions.first_java;

public class SimpleCalculator {
    private int a;
    private int b;
    private char operation;

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

    public char getOperation() {
        return operation;
    }

    public void setOperation(char operation) {
        this.operation = operation;
    }

    public SimpleCalculator(int a, int b, char operation) {
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
