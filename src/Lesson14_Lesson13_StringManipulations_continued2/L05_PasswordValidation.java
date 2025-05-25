package Lesson14_Lesson13_StringManipulations_continued2;

import java.util.Scanner;

public class L05_PasswordValidation {
    public static void main(String[] args) {


        // Question 4: Ask the user to enter a password,
        // check the following conditions,
        // inform the user of all the issues that need to be fixed,
        // if all conditions are met, print "Password successfully saved"
        // - The first character must be lowercase
        // - The last character must be a digit
        // - The password must not contain spaces
        // - The length must be at least 10 characters

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter your password...");
        String password = scanner.nextLine();

        int flag = 10;

        /*
            Since we want to print all errors,
            we should use independent if statements.

            In independent if statements,
            at the end, to check if all conditions are satisfied,
            we can use a flag or counter approach.

            We decided to use a flag.
         */

        // - The first character must be lowercase
        char firstChar = password.charAt(0);

        if (!Character.isLowerCase(firstChar)) {
            System.out.println("The first character must be lowercase");
            flag = 11;
        }

        // - The last character must be a digit
        char lastChar = password.charAt(password.length() - 1);

        if (lastChar < '0' || lastChar > '9') {
            System.out.println("The last character must be a digit");
            flag = 11;
        }

        // - The password must not contain spaces
        if (password.contains(" ")) {
            System.out.println("The password must not contain spaces");
            flag = 11;
        }

        // - The length must be at least 10 characters
        if (!(password.length() >= 10)) {
            System.out.println("The length must be at least 10 characters");
            flag = 11;
        }

        /*
            At the end, flag can have value 10 or 11
            flag == 10 ==> means no error messages were printed
            flag == 11 ==> means error messages were printed, but we don't know how many
         */

        if (flag == 10) {
            System.out.println("Password successfully saved");
        }
    }
}