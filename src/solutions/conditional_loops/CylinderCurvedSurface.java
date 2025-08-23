package solutions.conditional_loops;

import java.util.Scanner;

public class CylinderCurvedSurface {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the radius of the cylinder: ");
        double radius = sc.nextDouble();
        System.out.print("Enter the height of the cylinder: ");
        double height = sc.nextDouble();
        double area = 2 * Math.PI * radius * height;
        System.out.println("The Curved Surface area of the cylinder is: " + area);
    }
}
