package Lesson12_StringManipulations;

public class L07_endsWith {


    public static void main(String[] args) {

        String str = "Java ahhh java";

        // Check if the string ends with "Java"
        System.out.println(str.endsWith("Java")); // Does the string end with "Java"? ==> false

        // Check if the string ends with "java"
        System.out.println(str.endsWith("java")); // Does the string end with "java"? ==> true

        // Check if the string ends with "ava"
        System.out.println(str.endsWith("ava")); // Does the string end with "ava"? ==> true

        // Check if the string ends with " ava"
        System.out.println(str.endsWith(" ava")); // Does the string end with " ava"? ==> false

        // Check if the string ends with an empty string ""
        System.out.println(str.endsWith("")); // Does the string end with an empty string? ==> true

        // Check if the string ends with the full string "Java ahhh java"
        System.out.println(str.endsWith("Java ahhh java")); // Does the string end with "Java ahhh java"? ==> true

        System.out.println("===============");

        // Check if the string is exactly equal to "Java ahhh java"
        System.out.println(str.equals("Java ahhh java")); // Does the string equal "Java ahhh java"? ==> true

        // Check if the string is equal to "Java ahhh java", ignoring case
        System.out.println(str.equalsIgnoreCase("Java ahhh java")); // Does the string equal "Java ahhh java" ignoring case? ==> true

        // Check if the string contains the substring "Java ahhh java"
        System.out.println(str.contains("Java ahhh java")); // Does the string contain "Java ahhh java"? ==> true

        // Check if the string starts with "Java ahhh java"
        System.out.println(str.startsWith("Java ahhh java")); // Does the string start with "Java ahhh java"? ==> true

        // Check if the string ends with "Java ahhh java"
        System.out.println(str.endsWith("Java ahhh java")); // Does the string end with "Java ahhh java"? ==> true

        System.out.println("===============");

        // "Java ahhh java"

        // Check if the string is exactly equal to "Java"
        System.out.println(str.equals("Java")); // Does the string equal "Java"? ==> false

        // Check if the string is equal to "Java", ignoring case
        System.out.println(str.equalsIgnoreCase("Java")); // Does the string equal "Java", ignoring case? ==> false

        // Check if the string contains the substring "Java"
        System.out.println(str.contains("Java")); // Does the string contain "Java"? ==> true

        // Check if the string starts with "Java"
        System.out.println(str.startsWith("Java")); // Does the string start with "Java"? ==> true

        // Check if the string ends with "Java"
        System.out.println(str.endsWith("Java")); // Does the string end with "Java"? ==> false

    }

}