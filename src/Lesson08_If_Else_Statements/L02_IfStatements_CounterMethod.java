package Lesson08_If_Else_Statements;

import java.util.Scanner;

public class L02_IfStatements_CounterMethod {
    public static void main(String[] args) {

         /*
            Ask the user to enter an integer
            Check the following 4 conditions
            and print the corresponding messages

            If NONE of the 4 conditions are met
            and none of the if blocks execute, print:
            "What a number you picked, it doesn't meet any condition"

            If ALL 4 conditions are met
            and all if blocks execute, print:
            "Well done, you picked a very nice number"
         */

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter an integer...");
        int number = scanner.nextInt();
        int counter = 0;

        // If the entered number is a multiple of 5, print "The number is divisible by 5"
        if (number % 5 == 0) {
            System.out.println("The number is divisible by 5");
            counter++;
        }

        // If the number is greater than 100, print "You entered a large number"
        if (number > 100) {
            System.out.println("You entered a large number");
            counter++;
        }

        // If the number is greater than 1000, print "Nice number"
        boolean result = number > 1000;
        if (result) {
            System.out.println("Nice number");
            counter++;
        }

        // If the number is even, print "I like even numbers"
        if (number % 2 == 0) {
            System.out.println("I like even numbers");
            counter++;
        }

        /*
         Method 2: The counter method
         Initially, we assign the value 0 to the counter variable
         By the end, the counter can be 0, 1, 2, 3, or 4
         If the counter is 0 at the end => none of the if blocks executed
         If the counter is 4 at the end => all if blocks executed

         At the end, based on the value of the counter,
         we can determine how many if blocks were triggered
         */

        // If NONE of the 4 conditions are met
        // Print: "What a number you picked, it doesn't meet any condition"
        if (counter == 0) System.out.println("What a number you picked, it doesn't meet any condition");

        // If ALL 4 conditions are met
        // Print: "Well done, you picked a very nice number"
        if (counter == 4) System.out.println("Well done, you picked a very nice number");
    }
    }

