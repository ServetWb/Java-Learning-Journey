package Lesson08_If_Else_Statements;

import java.util.Scanner;

public class L06_IfElse_Retirement {
    public static void main(String[] args) {
        // Ask the user for their age
        // If they are 65 or older, print "You can retire"
        // Otherwise, print how many more years they need to work to retire

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter your age...");
        int age = scanner.nextInt();

        if (age >= 65) {
            System.out.println("You can retire");
        } else {
            // Example: You need to work 12 more years to retire

            System.out.println("You need to work " + (65 - age) + " more years to retire");
        }
    }
}