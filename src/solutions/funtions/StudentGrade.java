package solutions.funtions;

import java.util.Scanner;

public class StudentGrade {
    static String grade(int n){
        if(n>=91 && n<=100){
            return "AA";
        }else if(n>=81 && n<=90){
            return "AB";
        }else if(n>=71 && n<=80){
            return "BB";
        }else if(n>=61 && n<=70){
            return "BC";
        }else if(n>=51 && n<=60){
            return "CD";
        }else if(n>=41 && n<=50){
            return "DD";
        }else if(n<=40 && n>=0){
            return "Fail";
        }else{
            return "Invalid Input";
        }
    }

    public static void main(String[] args) {
        int marks;
        Scanner sc=new Scanner(System.in);

        while(true){
            System.out.println("Enter the marks of student grades: ");
            marks=sc.nextInt();
            System.out.println(grade(marks));

            System.out.println("Would you like to continue? [Y/N]");
            String s=sc.next();
            if(s.equalsIgnoreCase("N")){
                break;
            }
        }
    }
}
