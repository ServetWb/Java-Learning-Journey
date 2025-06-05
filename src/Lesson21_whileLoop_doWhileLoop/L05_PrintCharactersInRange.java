package Lesson21_whileLoop_doWhileLoop;

import java.util.Scanner;

public class L05_PrintCharactersInRange {


    public static void main(String[] args) {

        // Question 1:
        // Ask the user to enter a starting and ending character.
        // Print the characters in that range, including both start and end.
        // If the user enters more than one character (i.e., a string),
        // show a warning and ask again.
        // Keep asking until both inputs are single characters.

        Scanner scanner = new Scanner(System.in);
        char startChar = 'a';
        char endChar = 'c';
        String inputStart;
        String inputEnd;

        do {
            System.out.println("Please enter a single character as the starting value:");
            inputStart = scanner.nextLine();

            if (inputStart.length() == 1) {
                startChar = inputStart.charAt(0);
            } else {
                System.out.println("You must enter only one character as the starting value.");
            }

            System.out.println("Please enter a single character as the ending value:");
            inputEnd = scanner.nextLine();

            if (inputEnd.length() == 1) {
                endChar = inputEnd.charAt(0);
            } else {
                System.out.println("You must enter only one character as the ending value.");
            }

        } while (inputStart.length() != 1 || inputEnd.length() != 1);
        // Loop continues until both inputs are single characters

        // If the loop finishes, the user has entered two valid characters.
        // Now we can print all characters between them, inclusive.

        if (startChar < endChar) {
            for (char i = startChar; i <= endChar; i++) {
                System.out.print(i + " ");
            }
        } else { // endChar <= startChar
            for (char i = startChar; i >= endChar; i--) {
                System.out.print(i + " ");
            }
        }
    }
}