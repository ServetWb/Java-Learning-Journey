package Lesson08_If_Else_Statements;

import java.util.Scanner;

public class L03_IfStatements_FlagMethod {
    public static void main(String[] args) {

        /*
            Ask the user to enter an integer
            Check the following 4 conditions
            and print the relevant messages

            If NONE of the 4 conditions are met
            and no if block executes, print:
            "What a number you picked, it doesn't meet any condition"
         */

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter an integer...");
        int number = scanner.nextInt();

        int flag = 20;

        // If the entered number is a multiple of 5, print "The number is divisible by 5"
        if (number % 5 == 0) {
            System.out.println("The number is divisible by 5");
            flag = 40;
        }

        // If the number is greater than 100, print "You entered a large number"
        if (number > 100) {
            System.out.println("You entered a large number");
            flag = 40;
        }

        // If the number is greater than 1000, print "Nice number"
        boolean result = number > 1000;
        if (result) {
            System.out.println("Nice number");
            flag = 40;
        }

        // If the number is even, print "I like even numbers"
        if (number % 2 == 0) {
            System.out.println("I like even numbers");
            flag = 40;
        }

        /*
            At the beginning, we assigned the value 20 to the flag variable
            In each if block, we assigned the value 40 to the flag

            At the end, flag will be either 20 or 40

            flag == 20 => none of the if blocks were executed
            flag == 40 => at least one if block was executed, BUT we don’t know how many
         */

        // If NONE of the 4 conditions are met
        // Print: "What a number you picked, it doesn't meet any condition"
        if (flag == 20) System.out.println("What a number you picked, it doesn't meet any condition");
    }
}
