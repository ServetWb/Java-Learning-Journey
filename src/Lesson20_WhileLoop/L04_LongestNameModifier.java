package Lesson20_WhileLoop;

public class L04_LongestNameModifier {

    public static void main(String[] args) {

        // Ask the user to enter as many names as they want
        // The user must press 'Q' to finish
        // Among the entered names, find the longest one and print it with the following transformation:

        // If the length of the string is even, insert :) in the exact middle
        // If the length of the string is odd, remove the middle character and insert :( instead

        String longestName = L03_LongestNameFinder.getLongestName(); // Reusing the method from the previous class

        int length = longestName.length();

        if (length % 2 == 0) {
            // If the name's length is even
            // Insert :) in the middle
            System.out.println(
                    longestName.substring(0, length / 2) +
                            ":)" +
                            longestName.substring(length / 2));}
        else {
            // If the name's length is odd
            // Replace the middle character with :(
            System.out.println(
                    longestName.substring(0, length / 2) +
                            ":(" +
                            longestName.substring(length / 2 + 1));
        }
    }
}

