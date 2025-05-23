package Lesson13_StringManipulations_continued;

public class L02_IndexOfMultipleOccurrences {

    public static void main(String[] args) {

        String str = "Ali throws the ball, throw Ali throw";

        // If the string contains 2 occurrences of "Ali"
        // Find the index of the 2nd occurrence

        int firstAliIndex = str.indexOf("Ali");  // 0
        System.out.println("First occurrence index of 'Ali': " + firstAliIndex); // 0

        int secondAliIndex = str.indexOf("Ali", firstAliIndex + 1);
        System.out.println("Second occurrence index of 'Ali': " + secondAliIndex); // 23

        // If there are 3 occurrences of the word "throw"
        // Print the index of the 3rd occurrence

        int firstThrowIndex = str.indexOf("throw");
        int secondThrowIndex = str.indexOf("throw", firstThrowIndex + 1);
        int thirdThrowIndex = str.indexOf("throw", secondThrowIndex + 1);

        System.out.println("Third occurrence index of 'throw': " + thirdThrowIndex);

        // Print the indexes of the 1st, 2nd, and 3rd occurrences of the word "ball"

        int firstBallIndex = str.indexOf("ball");
        int secondBallIndex = str.indexOf("ball", firstBallIndex + 1);
        int thirdBallIndex = str.indexOf("ball", secondBallIndex + 1);

        System.out.println("First occurrence index of 'ball': " + firstBallIndex);     // 15
        System.out.println("Second occurrence index of 'ball': " + secondBallIndex);   // -1 (not found)
        System.out.println("Third occurrence index of 'ball': " + thirdBallIndex);     // -1 (not found)

    }
}