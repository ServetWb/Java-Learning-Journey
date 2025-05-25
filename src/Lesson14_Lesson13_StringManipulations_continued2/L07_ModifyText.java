package Lesson14_Lesson13_StringManipulations_continued2;

import java.util.Scanner;

public class L07_ModifyText {

    public static void main(String[] args) {

        // Ask the user to enter a String.
        // If the length of the String is even,
        // insert ":)" exactly in the middle.
        // If the length of the String is odd,
        // remove the middle character and replace it with ":(".

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter a text...");
        String text = scanner.nextLine();

        int length = text.length();

        if (length % 2 == 0) {
            // If the length of the text is even,
            // insert ":)" in the middle.

            System.out.println(
                    text.substring(0, length / 2) +  // characters before the middle
                            ":)" +                          // insert smiley face
                            text.substring(length / 2)      // characters after the middle
            );

            // Example:
            // Input: "JAVA"
            // Output: "JA:)VA"

        } else {
            // If the length of the text is odd,
            // remove the middle character and replace it with ":(".

            System.out.println(
                    text.substring(0, length / 2) +      // characters before the middle
                            ":(" +                               // insert sad face
                            text.substring(length / 2 + 1) // characters after the middle (skipping the middle char)
            );

            // Example:
            // Input: "HELLO"
            // Output: "HE:(LO"
        }

    }
}