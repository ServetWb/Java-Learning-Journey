package Lesson18_Methods_Creationusage;

import java.util.Scanner;

public class L02_NameFormatting {
     /*
        Create a method that:
        - Takes first name and last name from the user separately
        - If the first name is longer:
            → Print both names with the first letter uppercase, the rest lowercase
        - If the last name is longer:
            → Print the first name with the first letter uppercase, rest lowercase
            → Print the last name in all uppercase
    */

    public static void main(String[] args) {

        // We did this task earlier in day14 C06
        // But since we didn't create it as a method back then,
        // we can’t reuse that code here.
        // Now we’re creating it as a method
        // so we can reuse it anywhere in the project easily.

        formatAndPrintName();
    }

    public static void formatAndPrintName() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter your first name...");
        String firstName = scanner.nextLine();

        System.out.println("Please enter your last name...");
        String lastName = scanner.nextLine();

        if (firstName.length() > lastName.length()) {
            // If first name is longer:
            // → Print both first and last names with first letter uppercase and the rest lowercase

            System.out.println(
                    firstName.substring(0, 1).toUpperCase() +
                            firstName.substring(1).toLowerCase() + " " +
                            lastName.substring(0, 1).toUpperCase() +
                            lastName.substring(1).toLowerCase()
            );

        } else if (lastName.length() > firstName.length()) {
            // If last name is longer:
            // → Print the first name with first letter uppercase and rest lowercase
            // → Print the last name fully in uppercase

            System.out.println(
                    firstName.substring(0, 1).toUpperCase() +
                            firstName.substring(1).toLowerCase() + " " +
                            lastName.toUpperCase()
            );
        } else {
            // Optional: If both are equal length, format both normally
            System.out.println(
                    firstName.substring(0, 1).toUpperCase() +
                            firstName.substring(1).toLowerCase() + " " +
                            lastName.substring(0, 1).toUpperCase() +
                            lastName.substring(1).toLowerCase()
            );
        }
    }
}
