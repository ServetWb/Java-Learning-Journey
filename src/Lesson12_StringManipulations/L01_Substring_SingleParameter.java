package Lesson12_StringManipulations;

public class L01_Substring_SingleParameter {
    public static void main(String[] args) {

        String str = "Java is great";

        // Prints the character at index 3
        System.out.println(str.charAt(3)); // a

        // Prints the substring starting from index 3
        System.out.println(str.substring(3)); // a is great

        // Prints the character that is 3rd from the end
        System.out.println(str.charAt(str.length() - 3)); // e

        // Prints the last 3 characters
        System.out.println(str.substring(str.length() - 3)); // eat

        // Prints the character 5th from the end
        System.out.println(str.charAt(str.length() - 5)); // g

        // Prints the last 5 characters
        System.out.println(str.substring(str.length() - 5)); // great

        // Print the last 4 characters of the string
        System.out.println(str.substring(str.length() - 4)); // reat

        // charAt() and substring() may behave differently

        // Prints the last character using charAt()
        System.out.println(str.charAt(str.length() - 1)); // t

        // Prints the last character using substring()
        System.out.println(str.substring(str.length() - 1)); // t

        // This line would throw StringIndexOutOfBoundsException
        // System.out.println(str.charAt(str.length()));

        // This line prints an empty string (no exception)
        System.out.println(str.substring(str.length())); // (prints an empty line)

        System.out.println("Hello world");

        // This line would throw StringIndexOutOfBoundsException
        // System.out.println(str.charAt(str.length() + 1));

        // This also throws StringIndexOutOfBoundsException
        System.out.println(str.substring(str.length() + 1)); // Exception
    }
}