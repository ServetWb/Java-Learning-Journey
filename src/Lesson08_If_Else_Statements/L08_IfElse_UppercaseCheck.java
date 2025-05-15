package Lesson08_If_Else_Statements;

import java.util.Scanner;

public class L08_IfElse_UppercaseCheck {
    public static void main(String[] args) {

        // Ask the user to enter a character,
        // Print whether the entered character is an uppercase letter

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter a character...");
        char character = scanner.nextLine().charAt(0);

        // Method 1: Using ASCII table

        if (character >= 'A' && character <= 'Z') {
            System.out.println("Uppercase letter");
        } else {
            System.out.println("Not an uppercase letter");
        }

        // Method 2: Using Character Wrapper Class

        if (Character.isUpperCase(character)) {
            System.out.println("Uppercase letter");
        } else {
            System.out.println("Not an uppercase letter");

        }
    }
}