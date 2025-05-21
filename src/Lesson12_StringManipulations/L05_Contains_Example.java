package Lesson12_StringManipulations;

import java.util.Scanner;

public class L05_Contains_Example {

    public static void main(String[] args) {

        // Ask the user to input a text
        // If the text contains "house", print "Is there anything better than home?",
        // If the text contains "work", print "How great is working!",
        // If the text contains both "house" and "work", print "There's nothing better than working from home"
        // If the text contains neither of these two words, print "You need to work more, a lot more"

        Scanner input = new Scanner(System.in);
        System.out.print("Please enter a text: ");
        String text = input.nextLine();

        if (text.contains("house") && text.contains("work")) {
            System.out.println("There's nothing better than working from home");
        } else if (text.contains("house")) {
            System.out.println("Is there anything better than home?");
        } else if (text.contains("work")) {
            System.out.println("How great is working!");
        } else {
            System.out.println("You need to work more, a lot more");
        }
    }

}
