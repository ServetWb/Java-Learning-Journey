package Lesson08_If_Else_Statements;

import java.util.Scanner;

public class L05_IfElse_PassingGrade {
    public static void main(String[] args) {

        // Get the student's grade from the user
        // If the grade is 50 or higher, print "You passed the class"
        // If it's less than 50, print "Unfortunately, you failed"

        Scanner scanner = new Scanner(System.in);

        // Get grade input from user
        System.out.print("Please enter your grade: ");
        double grade = scanner.nextDouble();

        // Print the result based on the condition
        if (grade >= 50) {
            System.out.println("You passed the class 🎉");
        } else {
            System.out.println("Unfortunately, you failed ❌");
        }
    }
}