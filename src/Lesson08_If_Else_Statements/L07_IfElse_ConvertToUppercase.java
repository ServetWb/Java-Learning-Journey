package Lesson08_If_Else_Statements;

import java.util.Scanner;

public class L07_IfElse_ConvertToUppercase {
    public static void main(String[] args) {


        // Ask the user to enter a character,
        // If the entered character is a lowercase letter, convert it to uppercase and print it,
        // Otherwise, print the character as it was entered

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter a character...");
        char character = scanner.nextLine().charAt(0);

        // Method 1: Using ASCII table

        if (character >= 'a' && character <= 'z') {
            // If the character is a lowercase letter
            System.out.println((char) (character - 32));
        } else {
            // If the character is not a lowercase letter
            System.out.println(character);
        }

        // Method 2: Using Character Wrapper Class

        if (Character.isLowerCase(character)) {
            // If the character is a lowercase letter
            System.out.println(Character.toUpperCase(character));
        } else {
            // If the character is not a lowercase letter
            System.out.println(character);
        }
    }
}