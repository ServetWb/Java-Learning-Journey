package Lesson07_Operators_IfElse_Statements;

import java.util.Scanner;

public class L04_IndependentIfStatements {
    public static void main(String[] args) {


        // Ask the user for an integer
        // If the entered number is even, print "You entered an even number"

        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter an integer...");
        int number = scanner.nextInt();

        if (number % 2 == 0) {
            System.out.println("You entered an even number");
        }

        /*
            Independent if statements
            focus on the boolean condition.
            If the boolean condition evaluates to true for the given input, the IF BODY runs.
            If the boolean condition evaluates to false, the IF BODY does not run.

            The IF BODY not running
            does NOT mean the if statement itself did not work.

            As the name implies, independent if statements
            are INDEPENDENT from the rest of the code.
         */

        // If the entered integer is divisible by 5, print "The number is divisible by 5"
        if (number % 5 == 0) {
            System.out.println("The number is divisible by 5");
        }

        // If the number is greater than 100, print "You entered a large number"
        if (number > 100) {
            System.out.println("You entered a large number");
        }

        // If the number is less than 1000, print "Nice number"
        boolean result = number < 1000;

        if (result) {
            System.out.println("Nice number");
        }

        String str = "java is life";

//        if (str) {  // Required type: boolean   Provided: String
//            System.out.println("Only boolean variables or boolean values can be used inside the if parentheses");
    }
}
