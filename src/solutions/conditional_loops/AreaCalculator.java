package solutions.conditional_loops;

import java.util.Scanner;

public class AreaCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Press the number to find the area of the shape: \n 1.Circle, 2.Triangle, 3.Rectangle, 4.Isosceles Triangle, 5.Parallelogram, 6.Rhombus, 7.Equilateral Triangle");
        int  shape = scanner.nextInt();
        double area;
        switch (shape) {
            case 1:
                System.out.print("Enter the radius of the circle: ");
                double radius = scanner.nextDouble();
                area = Math.PI * radius * radius;
                System.out.println("The area of the Circle is: "+ area);
                break;
            case 2:
                System.out.print("Enter the base of the Triangle: ");
                double base = scanner.nextDouble();
                System.out.print("Enter the height of the Triangle: ");
                double height = scanner.nextDouble();
                area = 0.5 * base * height;
                System.out.println("The area of the Triangle is: "+ area);
                break;
            case 3:
                System.out.print("Enter the width of the rectangle: ");
                double width = scanner.nextDouble();
                System.out.print("Enter the length of the rectangle: ");
                double length = scanner.nextDouble();
                area = width * length;
                System.out.println("The area of the Rectangle is: "+ area);
                break;
            case 4:
                System.out.print("Enter the base of the Isosceles Triangle: ");
                double isoBase = scanner.nextDouble();
                System.out.print("Enter the height of the Isosceles Triangle: ");
                double isoHeight = scanner.nextDouble();
                area = 0.5 * isoBase * isoHeight;
                System.out.println("The area of the Triangle is: "+ area);
                break;
            case 5:
                System.out.print("Enter the base of the Parallelogram: ");
                double paraBase = scanner.nextDouble();
                System.out.print("Enter the height of the Parallelogram: ");
                double paraHeight = scanner.nextDouble();
                area = paraBase * paraHeight;
                System.out.println("The area of the Parallelogram is: "+ area);
                break;
            case 6:
                System.out.print("Enter the diagonal 1 of the Rhombus: ");
                double diagonal1 = scanner.nextDouble();
                System.out.print("Enter the diagonal 2 of the Rhombus: ");
                double diagonal2 = scanner.nextDouble();
                area = (diagonal1 * diagonal2)/2;
                System.out.println("The area of the Rhombus is: "+ area);
                break;
            case 7:
                System.out.print("Enter the side of the Equilateral Triangle: ");
                double side = scanner.nextDouble();
                area = (Math.sqrt(3) / 4) * side * side;
                System.out.println("The area of the Equilateral Triangle is: "+ area);
                break;
            default:
                System.out.println("Invalid option");
                break;
        }
    }
}
