package Lesson13_StringManipulations_continued;

import java.util.Scanner;

public class L05_Question {
    // Ask the user to enter a sentence and a substring to search for in the sentence
    // Based on the input sentence and substring, print one of the following results:
    // 1- The sentence does not contain the searched substring
    // 2- The sentence contains the searched substring only once
    // 3- The sentence contains the searched substring more than once
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter a sentence:");
        String sentence = scanner.nextLine();

        System.out.println("Please enter the substring to search for:");
        String searchText = scanner.nextLine();

        int firstIndex = sentence.indexOf(searchText);
        int lastIndex = sentence.lastIndexOf(searchText);

        if (firstIndex == -1) {
            System.out.println("The searched substring is not found in the sentence.");
        } else if (firstIndex == lastIndex) {
            System.out.println("The searched substring appears only once in the sentence.");
        } else {
            System.out.println("The searched substring appears more than once in the sentence.");
        }


    }
}