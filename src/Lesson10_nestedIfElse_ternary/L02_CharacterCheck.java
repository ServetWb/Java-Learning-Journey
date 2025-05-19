package Lesson10_nestedIfElse_ternary;

import java.util.Scanner;

public class L02_CharacterCheck {

    public static void main(String[] args) {

        /* Ask the user to enter a character
           If the user enters a lowercase letter:
                - if it's 'a': print "nice letter"
                - if it's 'b', 'c', or 'd': print "acceptable"
                - for other lowercase letters: print "I don't like the entered lowercase letter"
           If the user enters an uppercase letter:
                - if it's 'K': print "nice letter"
                - if it's 'L', 'V', or 'Z': print "acceptable"
                - for other uppercase letters: print "I don't like the entered uppercase letter"
           If the user enters a non-English letter character:
                - print "Undefined character"
         */

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter a character...");
        char character = scanner.next().charAt(0);

        // We chose the main variable as whether the entered character is lowercase or uppercase

        if (character >= 'a' && character <= 'z') {
            // lowercase letter section
            if (character == 'a') {
                System.out.println("nice letter");
            } else if (character == 'b' || character == 'c' || character == 'd') {
                System.out.println("acceptable");
            } else {
                System.out.println("I don't like the entered lowercase letter");
            }

        } else if (character >= 'A' && character <= 'Z') {
            // uppercase letter section
            if (character == 'K') {
                System.out.println("nice letter");
            } else if (character == 'L' || character == 'V' || character == 'Z') {
                System.out.println("acceptable");
            } else {
                System.out.println("I don't like the entered uppercase letter");
            }

        } else {
            // characters other than lowercase/uppercase English letters
            System.out.println("Undefined character");
        }
    }
}