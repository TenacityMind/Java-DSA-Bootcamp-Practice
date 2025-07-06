package solutions.first_java;
import java.util.Scanner;
public class EvenOrOdd {
    public boolean isEven(int number) {
        return number % 2 == 0;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        EvenOrOdd evenOrOdd = new EvenOrOdd();
        int number = scanner.nextInt();
        if (evenOrOdd.isEven(number)) {
            System.out.println("Even");
        }  else {
            System.out.println("Odd");
        }
    }
}
