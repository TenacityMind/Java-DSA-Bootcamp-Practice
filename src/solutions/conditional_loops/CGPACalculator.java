package solutions.conditional_loops;

import java.util.Scanner;

public class CGPACalculator {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Use doubles from the start for precision
        double totalQualityPoints = 0.0;
        int totalCreditHours = 0;

        while (true) { // Use a while(true) loop and break out explicitly
            System.out.print("\nEnter grade for the course (A, B, C, D, F) or 'Q' to quit: ");
            char grade = sc.next().toUpperCase().charAt(0);

            if (grade == 'Q') {
                break; // Exit the loop if user wants to quit
            }

            double currentGradePoint;
            switch (grade) {
                case 'A': currentGradePoint = 4.0; break;
                case 'B': currentGradePoint = 3.0; break;
                case 'C': currentGradePoint = 2.0; break;
                case 'D': currentGradePoint = 1.0; break;
                case 'F': currentGradePoint = 0.0; break;
                default:
                    System.out.println("Invalid grade entered. Please try again.");
                    continue; // Skip the rest of this loop iteration
            }

            System.out.print("Enter the credit hours for this course: ");
            int creditHours = sc.nextInt();

            // Simplified validation and calculation
            if (creditHours > 0) {
                totalQualityPoints += currentGradePoint * creditHours;
                totalCreditHours += creditHours;
            } else {
                System.out.println("Invalid credit hours. This course will be skipped.");
            }
        }

        // Close the scanner resource
        sc.close();

        System.out.println("\n--- Calculation Complete ---");
        System.out.println("Total Quality Points: " + totalQualityPoints);
        System.out.println("Total Credit Hours: " + totalCreditHours);

        // Prevent division by zero error
        if (totalCreditHours > 0) {
            double finalCGPA = totalQualityPoints / totalCreditHours;
            // Use printf for nice formatting to two decimal places
            System.out.printf("Final CGPA: %.1f\n", finalCGPA);
        } else {
            System.out.println("No courses entered. Cannot calculate CGPA.");
        }
    }
}