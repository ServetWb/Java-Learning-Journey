package Lesson08_If_Else_Statements;

import java.util.Scanner;

public class L01_IndependentIfStatements_Result {
    public static void main(String[] args) {

        /*
            Ask the user to enter an integer
            Check the following 4 conditions
            and print the relevant messages

            If NONE of the 4 conditions are met
            and no message is printed inside any if block,
            print "What a number you picked, it doesn't meet any condition"
         */

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter an integer...");
        int number = scanner.nextInt();

        // If the entered number is a multiple of 5, print "The number is divisible by 5"
        if (number % 5 == 0) {
            System.out.println("The number is divisible by 5");
        }

        // If the number is greater than 100, print "You entered a large number"
        if (number > 100) {
            System.out.println("You entered a large number");
        }

        // If the number is greater than 1000, print "Nice number"
        boolean result = number > 1000;
        if (result) {
            System.out.println("Nice number");
        }

        // If the number is even, print "I like even numbers"
        if (number % 2 == 0) {
            System.out.println("I like even numbers");
        }

        // Method 1: We can check the opposite (!not) of ALL the conditions in a single if statement
        if (!(number % 5 == 0) && !(number > 100) && !result && !(number % 2 == 0)) {
            System.out.println("What a number you picked, it doesn't meet any condition");

        }
    }
}