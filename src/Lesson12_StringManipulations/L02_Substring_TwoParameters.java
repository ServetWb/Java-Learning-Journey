package Lesson12_StringManipulations;

public class L02_Substring_TwoParameters {
    public static void main(String[] args) {

        String str = "Java is beautiful";

        // Prints the substring from index 1 to index 3 (exclusive)
        System.out.println(str.substring(1, 3));  // beginIndex , endIndex   av

        /*
            A general rule in Java:
            The starting index is inclusive (included),
            and the ending index is exclusive (excluded).

            In str.substring(1, 3):
            - The character at index 1 is included
            - The character at index 3 is excluded
            - It gives the characters between indexes 1 and 3, which are "av"

            Alternatively, you can think of it as:
            - Start from index 1
            - Get (3-1) characters.
         */

        // Prints the substring from index 6 to index 10 (exclusive)
        System.out.println(str.substring(6, 10)); // s be

        // Print the first 4 characters from the string
        System.out.println(str.charAt(3)); // a
        System.out.println(str.substring(3)); // a is beautiful
        System.out.println(str.substring(0, 4)); // Java

        str = "Java is very beautiful";

        // Print only the second word
        System.out.println(str.substring(5, 8)); // is

        // Print the text between the 2nd character from the beginning and 2nd character from the end (inclusive)
        // va is very beautifu
        System.out.println(str.substring(1, str.length() - 1));

        // Print the characters between the 5th character from the start and 5th character from the end (exclusive)
        System.out.println(str.substring(4, str.length() - 5)); // " is very "

        // Prints the first character "J"
        System.out.println(str.substring(0, 1)); // J
        System.out.println(str.substring(1, 2)); // a
        System.out.println(str.substring(2, 3)); // v
        System.out.println(str.substring(3, 4)); // a

        // Prints the character "J" using charAt()
        System.out.println(str.charAt(0)); // J

        /*
            str.charAt(0) and str.substring(0, 1)
            both give the character at index 0 ("J").

            The difference is:
            - charAt() returns a char, so you cannot use String methods after it.
            - substring() returns a String, so you can apply String methods after it.
         */

        // Print the 7th character as an uppercase letter
        // "Java is very beautiful" ==> o
        System.out.println(str.substring(6, 7).toUpperCase()); // O

        // Convert the whole string to uppercase, then get the character at the 7th position
        System.out.println(str.toUpperCase().charAt(6)); // O

        // Prints an empty string because the start and end indices are the same
        System.out.println(str.substring(3, 3)); // empty string
        System.out.println(str.substring(7, 7)); // empty string

        // If the starting and ending indices are the same, the result will be an empty string

        // Uncommenting the following line will result in an exception:
        // System.out.println(str.substring(5, 2)); // StringIndexOutOfBoundsException: begin 5, end 2, length 17
    }
}