package Lesson09_ifElseIfStatements_nestedIfElse;

import java.util.Scanner;

public class L05_MultipleVariables {

    public static void main(String[] args) {
        // Ask the user for their gender and age.
        // Women can retire at 60 years old and above, and men can retire at 65 years old and above.
        // Based on gender and age, print "You can retire" or "You need to work X more years to retire."
        // If the user enters an age less than 15 or greater than 80, or a gender other than "K" or "E",
        // print an error message.

        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter your age...");
        double age = scanner.nextDouble();

        System.out.println("Please enter your gender... K: female, E: male");
        char gender = scanner.next().toUpperCase().charAt(0);
        // We can convert the entered gender to either lowercase or uppercase to ensure case-insensitivity

        if (age < 15 || age > 80 || !(gender == 'E' || gender == 'K')) {
            System.out.println("The values you entered are not valid.");
        } else if (gender == 'K' && age >= 60) {
            System.out.println("Female and age is 60 or above, you can retire.");
        } else if (gender == 'K' && age < 60) {
            System.out.println("Women retire at the age of 60, you need to work " + (60 - age) + " more years.");
        } else if (gender == 'E' && age >= 65) {
            System.out.println("Male and age is 65 or above, you can retire.");
        } else if (gender == 'E' && age < 65) {
            System.out.println("Men retire at the age of 65, you need to work " + (65 - age) + " more years.");
        }
    }
}