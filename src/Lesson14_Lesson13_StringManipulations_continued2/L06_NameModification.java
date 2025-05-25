package Lesson14_Lesson13_StringManipulations_continued2;

import java.util.Scanner;

public class L06_NameModification {

    public static void main(String[] args) {

        // Get the user's first name and last name separately.
        // - If the first name is longer,
        //   print both first and last names with only the first letter uppercase and the rest lowercase.
        // - If the last name is longer,
        //   print the first name with only the first letter uppercase and the rest lowercase,
        //   and print the entire last name in uppercase letters.

        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter your first name...");
        String firstName = scanner.nextLine();

        System.out.println("Please enter your last name...");
        String lastName = scanner.nextLine();

        if (firstName.length() > lastName.length()) {
            // If the first name is longer,
            // print both names with the first letter uppercase and the rest lowercase

            System.out.println(
                    firstName.substring(0, 1).toUpperCase() +
                            firstName.substring(1).toLowerCase() +
                            " " +
                            lastName.substring(0, 1).toUpperCase() +
                            lastName.substring(1).toLowerCase()
            );

        } else if (lastName.length() > firstName.length()) {
            // If the last name is longer,
            // print the first name with only the first letter uppercase and the rest lowercase,
            // and the last name in all uppercase letters

            System.out.println(
                    firstName.substring(0, 1).toUpperCase() +
                            firstName.substring(1).toLowerCase() +
                            " " +
                            lastName.toUpperCase()
            );

        } else {
            // If both names have the same length, just print them normally (optional)
            System.out.println(
                    firstName.substring(0, 1).toUpperCase() +
                            firstName.substring(1).toLowerCase() +
                            " " +
                            lastName.substring(0, 1).toUpperCase() +
                            lastName.substring(1).toLowerCase()
            );
        }
    }
}