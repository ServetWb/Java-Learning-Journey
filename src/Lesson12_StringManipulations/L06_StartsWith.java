package Lesson12_StringManipulations;

public class L06_StartsWith {

    public static void main(String[] args) {

        String str = "Writing code is great";

        // Check if the string starts with the letter "W"
        System.out.println(str.startsWith("W"));
        // Is the first letter "W"? true

        // Check if the string starts with the letter "w"
        System.out.println(str.startsWith("w"));
        // Is the first letter "w"? false

        // Check if the string starts with the first two letters "Wr"
        System.out.println(str.startsWith("Wr"));
        // Do the first two letters start with "Wr"? true

        // Check if the string starts with the first five characters "Writ"
        System.out.println(str.startsWith("Writ"));
        // Do the first 4 letters start with "Writ"? true

        // Check if the string starts with the first six characters "Writing"
        System.out.println(str.startsWith("Writing"));
        // Do the first 6 letters start with "Writing"? true

        // Check if the string starts with an empty string ""
        System.out.println(str.startsWith(""));
        // Does the string start with an empty string? true

        // Check if the string starts with the full string "Writing code is great"
        System.out.println(str.startsWith("Writing code is great"));
        // Does the string start with "Writing code is great"? true


        // "Writing code is great"

        // Check if the string starts with the word "code"
        System.out.println(str.startsWith("code"));
        // Does the string start with "code"? false

        // Check if the string from index 4 onwards starts with "code"
        // Starting from "code is great"
        System.out.println(str.startsWith("code", 4)); // true
        // In the two-parameter usage, Java takes the substring starting from the index given as toffset
        // and checks if the substring starts with the specified string "code"

        // Check if the substring starting at index 10 onwards starts with "is"
        System.out.println(str.startsWith("is", 10));
        // Does the substring " is great" start with "is"? false

        // Check if the substring starting at index 11 onwards starts with "is"
        System.out.println(str.startsWith("is", 11));
        // Does the substring "is great" start with "is"? true

        // Check if the substring starting at index 10 onwards starts with an empty string
        System.out.println(str.startsWith("", 10));
        // Does the substring " is great" start with an empty string? true
    }
}