package solutions.funtions;

import java.util.Scanner;

public class Circle {
    static double circumference(double radius) {
        return 2*Math.PI*radius;
    }
    static double area(double radius) {
        return Math.PI*radius*radius;
    }

    public static void main(String[] args) {
        double radius;

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter radius: ");
        radius = sc.nextDouble();

        System.out.println("The area of the circle is "+area(radius));

        System.out.println("The circumference of the circle is "+circumference(radius));
    }
}
