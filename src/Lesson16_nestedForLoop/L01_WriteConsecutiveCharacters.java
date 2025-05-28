package Lesson16_nestedForLoop;

import java.util.Scanner;

public class L01_WriteConsecutiveCharacters {
    public static void main(String[] args) {

        // Ask the user to enter a character
        // If the user enters a lowercase letter, print the entered character and the next 5 characters
        // If the user enters an uppercase letter, print the entered character and the next 4 characters
        // If the user enters another type of character, print the entered character and the next 3 characters

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter a character...");
        char character = scanner.next().charAt(0);

        if (Character.isLowerCase(character)) {
            // Lowercase letter section
            // Print the entered character and the next 5 characters
            for (char i = character; i <= character + 5; i++) {
                System.out.print(i + " ");
            }

        } else if (Character.isUpperCase(character)) {
            // Uppercase letter section
            // Print the entered character and the next 4 characters
            for (char i = character; i <= character + 4; i++) {
                System.out.print(i + " ");
            }

        } else {
            // Other characters section
            // Print the entered character and the next 3 characters
            for (char i = character; i <= character + 3; i++) {
                System.out.print(i + " ");
            }
        }
    }
}