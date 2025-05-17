package Lesson09_ifElseIfStatements_nestedIfElse;

import java.util.Scanner;

public class L07_NestedIfElse_Retirement {
    public static void main(String[] args) {

        // Ask the user for their gender and age.
        // Women can retire at age 60 or older, Men can retire at age 65 or older.
        // Based on gender and age, print "You can retire" or
        // "You need to work for ... more years to retire".
        // If the user enters an age less than 15 or greater than 80,
        // or if the gender is anything other than K (for women) or E (for men), print an error message.

        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter your age...");
        double age = scanner.nextDouble();

        System.out.println("Please enter your gender... K : Female, E : Male");
        char gender = scanner.next().toUpperCase().charAt(0);

        /*
            If there are multiple variables in an if-else structure,
            Nested If Else can be used.

            For a nested if-else:
            1 - First, decide which variable will be the main variable.
            2 - Create an if-else structure assuming only the main variable exists.
            3 - Now that we have divided the cases, for each case, create an if-else structure based on the second variable.

         */

        // Gender will be the main variable.

        if (gender == 'K') {
            // In this block, ONLY women are considered.
            // Let's create an if-else based on age for women.
            if (age < 15 || age > 80) {
                System.out.println("The age you entered is not valid.");
            } else if (age >= 60) {
                System.out.println("Female and age is over 60, you can retire.");
            } else {
                System.out.println("Women retire at age 60, you need to work " + (60 - age) + " more years.");
            }

        } else if (gender == 'E') {
            // In this block, ONLY men are considered.
            // Let's create an if-else based on age for men.
            if (age < 15 || age > 80) {
                System.out.println("The age you entered is not valid.");
            } else if (age >= 65) {
                System.out.println("Male and age is over 65, you can retire.");
            } else {
                System.out.println("Men retire at age 65, you need to work " + (65 - age) + " more years.");
            }

        } else {
            System.out.println("The entered gender is incorrect.");

        }
    }
}
