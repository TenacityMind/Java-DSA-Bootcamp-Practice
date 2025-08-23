package solutions.conditional_loops;

import java.util.Scanner;

public class CubeTotalSurfaceArea {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the side length of the cube: ");
        double cubeSideLength = sc.nextDouble();
        double totalSurfaceArea = 6 * cubeSideLength;
        System.out.println("The Surface area of the cube is: " + totalSurfaceArea);
    }
}
