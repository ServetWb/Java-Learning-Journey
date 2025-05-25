package Lesson14_Lesson13_StringManipulations_continued2;

import java.util.Scanner;

public class L03_ChangeNameExample {

    public static void main(String[] args) {
        // Ask the user to enter their first name, last name, and 16-digit credit card number
        // Then print the information as follows:
        // Entered first-last name: J** D****
        // Credit card number     : **** **** **** 1234

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter your first name...");
        String firstName = scanner.nextLine();

        System.out.println("Enter your last name...");
        String lastName = scanner.nextLine();

        System.out.println("Enter your 16-digit credit card number...");
        String creditCardNumber = scanner.nextLine();

        System.out.println(
                "Entered first-last name: " +
                        firstName.substring(0, 1).toUpperCase() +  // Take the first letter of the first name and convert to uppercase
                        firstName.substring(1).replaceAll("\\w", "*") +  // Replace all letters after the first with '*'
                        " " +                                               // Space between first and last name
                        lastName.substring(0, 1).toUpperCase() +         // Take the first letter of the last name and convert to uppercase
                        lastName.substring(1).replaceAll("\\w", "*") +          // Replace all letters after the first with '*'
                        ",\n" +                                            // Comma and newline character for formatting
                        "Credit card number     : **** **** **** " +
                        creditCardNumber.substring(creditCardNumber.length() - 4) // Show only the last 4 digits of the credit card number
        );
    }
}

