package Lesson13_StringManipulations_continued;

import java.util.Scanner;

public class L01_indexOf {
    public static void main(String[] args) {

        /*
            In the given string:
            - Finds the index of a specified character or substring.
            - If the character or substring occurs more than once,
              it returns the index of the **first occurrence**.
         */

        String str = "Java is beautiful";

        System.out.println(str.contains("is"));         // true
        System.out.println(str.startsWith("is"));       // false
        System.out.println(str.endsWith("is"));         // false
        System.out.println(str.equals("is"));           // false

        // So, where exactly is the word "is"?
        System.out.println(str.indexOf("is"));          // 5
        // The word "is" starts at index 5 in the string

        System.out.println(str.indexOf('a'));           // 1

        // Let's use a different string
        str = "Ali throws the ball, throw Ali throw";

        System.out.println(str.indexOf("throw"));       // 9
        System.out.println(str.indexOf("Ali"));         // 0
        System.out.println(str.indexOf('a'));           // 9

        // indexOf() returns an int.
        // If the character or substring is not found, it returns -1
        System.out.println(str.indexOf("k"));           // -1

        System.out.println(str.contains("k"));          // false

        // contains() returning false means the same as indexOf() returning -1

        // Now let's take input from the user
        // and check whether the input contains the word "Java" using indexOf()

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter a sentence...");
        String inputText = scanner.nextLine();

        if (inputText.indexOf("Java") != -1) {
            System.out.println("The entered text contains Java...");
        } else {
            System.out.println("The entered text does NOT contain Java...");

        }
    }
}