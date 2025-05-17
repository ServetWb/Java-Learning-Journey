package Lesson09_ifElseIfStatements_nestedIfElse;

import java.util.Scanner;

public class L04_IfElseWithoutFinalElse {
    public static void main(String[] args) {

        /*
            IMPORTANT NOTES:

            1- In a filtering (sieve) system, if the order of conditions is incorrect,
               the result can also be incorrect.
               When designing filters, we should start from the narrowest condition first.

            2- In a group of if-else if statements that are chained together with else,
               only one of the conditions will execute.
               (A fruit can only fall through one sieve.)

            3- if - else if ... statements do NOT have to end with an else block.
               HOOOOWEVERRR, if there's no final else,
               you must REMEMBER that some inputs may produce NO OUTPUT.
         */

        // Ask the user to enter a positive integer
        // If the number is divisible by both 3 and 5 → print "super"
        // If the number is divisible only by 3       → print "multiple of 3"
        // If the number is divisible only by 5       → print "multiple of 5"
        // (Note: Numbers like 23, which are divisible by neither 3 nor 5, will not produce any output)

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter a positive integer...");
        int number = scanner.nextInt();

        if (number % 5 == 0 && number % 3 == 0) {
            System.out.println("super");
        } else if (number % 5 == 0) {
            System.out.println("multiple of 5");
        } else if (number % 3 == 0) {
            System.out.println("multiple of 3");
        }
        // If the number is not divisible by 3 or 5, no message will be printed


    }
}
