package Lesson09_ifElseIfStatements_nestedIfElse;

import java.util.Scanner;

public class L01_NumberAnalysis {
    public static void main(String[] args) {
        // Ask the user to enter a positive integer
        // If the user enters a negative number, warn them
        // If the user enters a single-digit number, print "The number you entered is a digit"
        // If the user enters a number between 10 and 99 (inclusive), print "Two-digit number"
        // If the user enters a number between 100 and 999 (inclusive), print "Three-digit number"
        // If the user enters a number 1000 or greater, print "Very large number"

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter a positive integer...");
        int number = scanner.nextInt();

        if (number < 0) {
            System.out.println("You must enter a positive number...");
        } else if (number < 10) {
            System.out.println("The number you entered is a digit");
        } else if (number < 100) {
            System.out.println("Two-digit number");
        } else if (number < 1000) {
            System.out.println("Three-digit number");
        } else {
            System.out.println("Very large number");

        }
    }
}