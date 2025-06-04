package Lesson20_WhileLoop;

import java.util.Scanner;

public class L03_LongestNameFinder {

    public static void main(String[] args) {

        // Create a method that performs the following task:

        // Ask the user to enter as many names as they like
        // The user should press 'Q' to end the process (either 'q' or 'Q' is acceptable)
        // (The input must be exactly 'Q', not a word starting with 'Q')
        // Check the length of each entered name
        // When the process is finished, print the name with the most letters (i.e., the longest name)
        // If there is a tie, any of the longest names can be printed

        printLongestName();
    }

    public static void printLongestName() {
        Scanner scanner = new Scanner(System.in);

        String enteredName = "";
        String longestName = "";

        while (!enteredName.equalsIgnoreCase("q")) {

            System.out.println("Please enter a name... \nPress 'Q' to finish...");

            enteredName = scanner.nextLine();

            if (enteredName.length() > longestName.length()) {
                longestName = enteredName;
            }
        }

        System.out.println("The longest name entered: " + longestName);
    }

    // Create another method that performs the same task
    // but instead of printing the longest name, returns it

    public static String getLongestName() {
        Scanner scanner = new Scanner(System.in);

        String enteredName = "";
        String longestName = "";

        while (!enteredName.equalsIgnoreCase("q")) {

            System.out.println("Please enter a name... \nPress 'Q' to finish...");

            enteredName = scanner.nextLine();

            if (enteredName.length() > longestName.length()) {
                longestName = enteredName;
            }
        }

        return longestName;
    }
}
