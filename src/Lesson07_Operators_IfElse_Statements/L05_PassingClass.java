package Lesson07_Operators_IfElse_Statements;

import java.util.Scanner;

public class L05_PassingClass {
    public static void main(String[] args) {

        // Get the grade from the user
        // If the grade is 50 or higher, print "You passed the class"

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter your grade...");
        double grade = scanner.nextDouble();

        if (grade >= 50) {
            System.out.println("You passed the class");
    }
}
    }
