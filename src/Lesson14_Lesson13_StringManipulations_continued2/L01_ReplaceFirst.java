package Lesson14_Lesson13_StringManipulations_continued2;

import java.util.Scanner;

public class L01_ReplaceFirst {
    public static void main(String[] args) {


        // Example string to work on
        String str = "java is life, selenium is excitement";

        // Replace all occurrences of 'a' with uppercase 'A'
        System.out.println(str.replace("a", "A"));
        // Output: jAvA is life, selenium is excitement

        // Replace only the first occurrence of 'a' with uppercase 'A'
        System.out.println(str.replaceFirst("a", "A"));
        // Output: jAva is life, selenium is excitement

        // Note:
        // System.out.println(str.replaceFirst('a', 'A'));
        // replace() accepts char parameters,
        // BUT replaceFirst() does NOT accept char parameters (only String).

        // Ask the user to enter some text
        // If the text contains any digits,
        // replace the first digit with '*'
        // Example input: Hello 12345
        // Expected output: Hello *2345

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter a text...");
        String inputText = scanner.nextLine();

        /*
            Regex: regular expressions (predefined patterns for matching text)
         */

        // Replace the first digit (\\d) found in the input with '*'
        System.out.println(inputText.replaceFirst("\\d", "*"));

        // Replace the first space character in the input with 'X'
        System.out.println(inputText.replaceFirst(" ", "X"));

        // \\s matches any whitespace character (space, tab, etc.)
        System.out.println(inputText.replaceFirst("\\s", "X"));

    }
}