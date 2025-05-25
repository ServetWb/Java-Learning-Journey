package Lesson14_Lesson13_StringManipulations_continued2;

import java.util.Scanner;

public class L08_NameFormatter {

    public static void main(String[] args) {


        // Ask the user to enter their full name.
        // Even if the user has 3 names,
        // print the first letter of each name uppercase,
        // and replace the remaining letters with '*'.
        // Example inputs  : "ali mert can", "aysel yilmaz", "Kemal"
        // Expected outputs: "A** M*** C**", "A**** Y*****", "K****"

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter your full name...");
        String fullName = scanner.nextLine();

        // First, analyze the name to determine how many words it contains

        int firstSpaceIndex = fullName.indexOf(" ");
        int secondSpaceIndex = fullName.indexOf(" ", firstSpaceIndex + 1);

        if (firstSpaceIndex == -1) {
            // Name is a single word
            System.out.println(
                    fullName.substring(0, 1).toUpperCase() +  // first letter uppercase
                            fullName.substring(1).replaceAll("\\w", "*")   // replace remaining letters with '*'
            );

        } else if (secondSpaceIndex == -1) {
            // Name has two words

            System.out.println(
                    fullName.substring(0, 1).toUpperCase() +     // first letter of first name
                            fullName.substring(1, firstSpaceIndex).replaceAll("\\w", "*") +  // rest of first name replaced by '*'
                            " " +
                            fullName.substring(firstSpaceIndex + 1, firstSpaceIndex + 2).toUpperCase() +  // first letter of second name
                            fullName.substring(firstSpaceIndex + 2).replaceAll("\\w", "*")   // rest of second name replaced by '*'
            );

        } else {
            // Name has more than two words (3 or more)

            System.out.println(
                    fullName.substring(0, 1).toUpperCase() +      // first letter of first name
                            fullName.substring(1, firstSpaceIndex).replaceAll("\\w", "*") +  // rest of first name replaced by '*'
                            " " +
                            fullName.substring(firstSpaceIndex + 1, firstSpaceIndex + 2).toUpperCase() +  // first letter of second name
                            fullName.substring(firstSpaceIndex + 2, secondSpaceIndex).replaceAll("\\w", "*") +  // rest of second name replaced by '*'
                            " " +
                            fullName.substring(secondSpaceIndex + 1, secondSpaceIndex + 2).toUpperCase() +    // first letter of third name
                            fullName.substring(secondSpaceIndex + 2).replaceAll("\\w", "*")    // rest of third name replaced by '*'
            );
        }
    }
}