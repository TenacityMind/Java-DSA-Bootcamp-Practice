package solutions.conditional_loops;

import java.util.Scanner;

public class AverageMarks {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int validCourseCounter = 0;
        int totalMarks = 0;
        double averageMarks;
        while (true) {
            System.out.println("Would you like add a course marks? Y or N");
            char choice = input.next().charAt(0);

            if(Character.toUpperCase(choice) == 'Y') {

                System.out.println("Enter the marks for the course " + (validCourseCounter+1));
                int marks = input.nextInt();

                if(marks>=0 && marks<=100) {

                    totalMarks += marks;
                    validCourseCounter++;

                }else{

                    System.out.println("Invalid marks entered");

                }
            }else if(Character.toUpperCase(choice) == 'N') {
                break;
            }else{
                System.out.println("Invalid Choice");
            }

        }
        if(totalMarks!=0){
            averageMarks = (double)totalMarks/(validCourseCounter);
            System.out.println("The average marks of your course is " + averageMarks);
        }else{
            System.out.println("The average marks of your course is " + totalMarks);
        }


    }
}
