package Lesson13_StringManipulations_continued;

import java.util.Scanner;

public class L03_Question {

    public static void main(String[] args) {

        // Ask the user to enter a sentence and a text to search within the sentence
        // Based on the input sentence and text, print one of the following results:
        // 1- The sentence does NOT contain the searched text
        // 2- The sentence contains the searched text exactly once
        // 3- The sentence contains the searched text more than once

        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter a sentence...");
        String sentence = scanner.nextLine();

        System.out.println("Please enter the text to search for in the sentence...");
        String searchText = scanner.nextLine();

        int firstIndex = sentence.indexOf(searchText);
        int secondIndex = sentence.indexOf(searchText, firstIndex + 1);

        if (firstIndex == -1) {
            System.out.println("The text you are searching for is NOT found in the sentence.");
        } else if (secondIndex == -1) { // firstIndex != -1 implied here
            System.out.println("The text you are searching for appears only once in the sentence.");
        } else {
            System.out.println("The text you are searching for appears more than once in the sentence.");

        }
    }
}