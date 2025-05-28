package Lesson16_nestedForLoop;

import java.util.Scanner;

public class L03_ReverseStringCheckPalindrome {

    public static void main(String[] args) {


        // Ask the user to enter a string,
        // then reverse the string and save it in a variable called reversedText.

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter a text...");
        String originalText = scanner.nextLine();

        String reversedText = "";

        for (int i = originalText.length() - 1; i >= 0; i--) {
            reversedText += originalText.charAt(i);
        }

        System.out.println("The reverse of the entered text: " + reversedText);

        // Check if the entered text is a palindrome
        // Palindrome: A text that reads the same forward and backward (case-insensitive)

        if (originalText.equalsIgnoreCase(reversedText)) {
            System.out.println("The entered text is a Palindrome.");
        } else {
            System.out.println("The entered text is not a Palindrome.");

        }
    }
}
