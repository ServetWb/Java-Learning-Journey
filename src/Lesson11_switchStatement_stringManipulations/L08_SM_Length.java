package Lesson11_switchStatement_stringManipulations;

import java.util.Scanner;

public class L08_SM_Length {
    public static void main(String[] args) {
  /*
            If we write our code in a way that
            uses values derived from the given string
            instead of directly hardcoding index numbers,
            we make our code DYNAMIC.

            This way, no matter what the value of 'str' is,
            our code will work without issues.
         */

        String str = "istanbul is the most beautiful city";

        System.out.println(str.length()); // gives us the number of characters in 'str' → 37

        // Print the last character
        System.out.println(str.charAt(str.length() - 1)); // 'y'

        // Ask the user to enter their name
        // Print the first and last characters of the name side by side

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter your name...");
        String name = scanner.nextLine();

        System.out.println("" + name.charAt(0) + name.charAt(name.length() - 1)); // e.g. 'm' + 'n' → mn

        // The following lines would throw an exception:
        // System.out.println(name.charAt(name.length()));       // StringIndexOutOfBoundsException
        // System.out.println(name.charAt(name.length() + 1));   // StringIndexOutOfBoundsException
        // System.out.println(name.charAt(name.length() + 5));   // StringIndexOutOfBoundsException

    }
}
