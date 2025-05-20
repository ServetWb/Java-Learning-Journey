package Lesson11_switchStatement_stringManipulations;

import java.util.Scanner;

public class L03_ConvertDigitToWord {
    public static void main(String[] args) {

        // Ask the user to enter a digit
        // Print the digit as a word
        // Example input: 7, output: seven
        // If the entered number is not between 0 and 9, print an error message

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter a digit:");
        int digit = scanner.nextInt();
        String message = " ";

        switch (digit) {
            case 0:
                message = "zero";
                break;
            case 1:
                message = "one";
                break;
            case 2:
                message = "two";
                break;
            case 3:
                message = "three";
                break;
            case 4:
                message = "four";
                break;
            case 5:
                message = "five";
                break;
            case 6:
                message = "six";
                break;
            case 7:
                message = "seven";
                break;
            case 8:
                message = "eight";
                break;
            case 9:
                message = "nine";
                break;
            default:
                message = "The entered number must be a digit between 0 and 9.";
        }

        System.out.println(message);
    }
}
