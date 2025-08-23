package solutions.conditional_loops;

import java.util.Scanner;

public class VolumeCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Choose the number to calculate the volume of Shape:\n 1.Cone, 2.Prism, 3.Cylinder, 4.Sphere, 5.Pyramid");
        int choice = sc.nextInt();
        double volume = 0;
        switch (choice){
            case 1:
                System.out.print("Enter the radius of the cone: ");
                double coneRadius = sc.nextDouble();
                System.out.print("Enter the height of the cone: ");
                double coneHeight = sc.nextDouble();
                volume =  (Math.PI * coneRadius * coneRadius * coneHeight) / 3;
                System.out.print("The volume of the cone is: "+ volume);
                break;
            case 2:
                System.out.print("Enter the base length of the prism: ");
                double baseLength = sc.nextDouble();
                System.out.print("Enter the base width of the prism: ");
                double baseWidth = sc.nextDouble();
                System.out.print("Enter the height of the prism: ");
                double prismHeight = sc.nextDouble();
                volume = (baseLength * baseWidth) * prismHeight;
                System.out.print("The volume of the prism is: "+ volume);
                break;
            case 3:
                System.out.print("Enter the radius of the cylinder: ");
                double cylinderRadius = sc.nextDouble();
                System.out.print("Enter the height of the cylinder: ");
                double cylinderHeight = sc.nextDouble();
                volume = Math.PI * cylinderRadius *  cylinderRadius * cylinderHeight;
                System.out.print("The volume of the cylinder is: "+ volume);
                break;
            case 4:
                System.out.print("Enter the radius of the sphere: ");
                double sphereRadius = sc.nextDouble();
                volume = (4 * Math.PI * sphereRadius * sphereRadius * sphereRadius)/3;
                System.out.print("The volume of the sphere is: "+ volume);
                break;
            case 5:
                System.out.print("Enter the base side length of the pyramid: ");
                double baseSideLength = sc.nextDouble();
                System.out.print("Enter the base side width of the pyramid: ");
                double baseSideWidth = sc.nextDouble();
                System.out.print("Enter the height of the pyramid: ");
                double pyramidHeight = sc.nextDouble();
                volume = (pyramidHeight * baseSideLength * baseSideWidth)/3;
                System.out.print("The volume of the pyramid is: "+ volume);
                break;
            default:
                System.out.println("Invalid option");
        }
    }
}
