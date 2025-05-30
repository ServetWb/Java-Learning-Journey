package Lesson17_Methods_Creationusage;

public class L01_CustomSubstringMethods {

    public static void main(String[] args) {

        String text = "Coding is fun";

        int startIndex = 2;
        int endIndex = 8;

    /*
        From a user-provided string,
        print the part between the user-defined start and end indexes.

        Rules:
        1 - If the start or end index is negative, or outside the string's bounds, display an error.
        2 - If the start index is greater than the end index, display an error message.
        3 - The character at the start index is included, the character at the end index is excluded.
     */

        if (startIndex < 0 || endIndex < 0 || startIndex >= text.length() || endIndex > text.length()) {
            System.out.println("Invalid index entered. The length of the string is " + text.length());
        } else if (startIndex > endIndex) {
            System.out.println("Start index cannot be greater than end index.");
        } else {
            for (int i = startIndex; i < endIndex; i++) {
                System.out.print(text.charAt(i));
            }
        }

        System.out.println();

        // Is the manual loop above easier,
        // or is it easier to use Java’s built-in substring method?

        System.out.println(text.substring(startIndex, endIndex));

        // contains() method returns a boolean, but we don't have to print it.
        text.contains("i");

        // This will return false, but since we didn’t store or print it, it's gone.
        // The delivery guy brought the pizza, but we didn’t take it from him.
        text.contains("z");

        // This will return true and we print it, so we see it in the console.
        // But we didn’t store the result, so we can’t reuse it later.
        // We ate the pizza right away — nothing left for dinner.
        System.out.println(text.contains("Coding"));

        // This returns true and stores it in a variable.
        // We didn’t print it, but we can reuse it later if needed.
        // The delivery guy brought the pizza, we took it and put it in the fridge.
        boolean result = text.contains(" ");

        // Optional: we can print the result
        System.out.println("Contains space? " + result);
}
