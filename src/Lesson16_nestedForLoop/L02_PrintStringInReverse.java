package Lesson16_nestedForLoop;

import java.util.Scanner;

public class L02_PrintStringInReverse {

    public static void main(String[] args) {

        // Ask the user to enter a String and print the String in reverse.
        // Example: input → Karen, output → neraK

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter a text...");
        String text = scanner.nextLine();  // User input "Karen"

        System.out.print("The reversed version of the entered text: ");

        for (int i = text.length() - 1; i >= 0; i--) {
            System.out.print(text.charAt(i));
        }
    }

}
