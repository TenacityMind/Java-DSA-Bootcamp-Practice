package solutions.conditional_loops;

import java.util.Scanner;

public class PerimeterCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Press the number to find the Perimeter of the shape: \n 1.Circle, 2.Equilateral Triangle, 3.Parallelogram, 4.Rectangle, 5.Square ,6.Rhombus");
        int  shape = scanner.nextInt();
        double perimeter;
        switch (shape) {
            case 1:
                System.out.print("Enter the radius of the circle: ");
                double radius = scanner.nextDouble();
                perimeter = 2 * Math.PI * radius;
                System.out.println("The Perimeter of the Circle is: "+ perimeter);
                break;
            case 2:
                System.out.print("Enter the side of the Equilateral Triangle: ");
                double side = scanner.nextDouble();
                perimeter = 3 * side;
                System.out.println("The Perimeter of the Equilateral Triangle is: "+ perimeter);
                break;
            case 3:
                System.out.print("Enter the base of the Parallelogram: ");
                double paraBase = scanner.nextDouble();
                System.out.print("Enter the adjacent side of the Parallelogram: ");
                double paraAdjSide = scanner.nextDouble();
                perimeter = 2 * (paraBase + paraAdjSide);
                System.out.println("The Perimeter of the Parallelogram is: "+ perimeter);
                break;
            case 4:
                System.out.print("Enter the width of the rectangle: ");
                double width = scanner.nextDouble();
                System.out.print("Enter the length of the rectangle: ");
                double length = scanner.nextDouble();
                perimeter = 2* (width + length);
                System.out.println("The perimeter of the Rectangle is: "+ perimeter);
                break;
            case 5:
                System.out.print("Enter the side of the Square: ");
                double squareSide = scanner.nextDouble();
                perimeter = 4 * squareSide;
                System.out.println("The perimeter of the Square is: "+ perimeter);
                break;
            case 6:
                System.out.print("Enter the side of the Rhombus: ");
                double rhombusSide = scanner.nextDouble();
                perimeter = 4 * rhombusSide;
                System.out.println("The perimeter of the Rhombus is: "+ perimeter);
            default:
                System.out.println("Invalid option");
                break;
        }
    }
}
